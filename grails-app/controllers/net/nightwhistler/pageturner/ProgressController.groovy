package net.nightwhistler.pageturner

import grails.converters.JSON

class ProgressController {

    def index = { }

    def show = {         
        
        log.info "Query for: ${params.progressKey} with access key ${params.accessKey}"

        if ( ! getAccessKey(params.accessKey) ) {
            response.status = 403
            render "Invalid access key."
        } else {
        
            def progress = Progress.findAllByProgressKey( params.progressKey,
                [max: 5, sort: "storedOn", order: "desc"] )

            if ( progress.size > 5 ) {
                progress = progress[0..4]
            }

            if ( progress.size > 0 ) {    
                render progress as JSON
            } else {
                response.status = 404
                render "Key ${params.progressKey} not found."
            }
        }
    }

    private def getAccessKey( keyString ) {
        def key = params.accessKey ? AccessKey.findByKeyCode( params.accessKey ) : null;
        
        if ( key?.expiresOn && key?.expiresOn < new Date() ) {
            return null
        } 
        return key
    }

    def save = {

        log.debug "Saving values: ${params}"
        
        if ( ! getAccessKey(params.accessKey) ) {
            response.status = 403
            render "Invalid or expired access key."
        } else {
        

            def progress = new Progress( params)
        
            def oldProgress = Progress.find(progress)

            progress.storedOn = new Date()
        
            if ( oldProgress ) {
                render oldProgress as JSON
            } else if ( progress.save() ) {
                render progress as JSON
            } else {
                response.status = 500
                render progress.errors
                println "Errors: ${progress.errors}"
            }
        }
    }

    def update = { save(params) }
    
}
