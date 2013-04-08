import net.nightwhistler.pageturner.Progress
import net.nightwhistler.pageturner.AccessKey

import org.codehaus.groovy.runtime.TimeCategory

class BootStrap {

    def init = { servletContext ->
 
        new Progress( 
            progressKey: "myKey",
            title: "A book",
            bookIndex: 88,
            progress: 55 ).save()
            
            use(TimeCategory) {
                new AccessKey( keyCode: "AlexKey", keyOwner: "Alex", expiresOn: new Date() + 1.hours ).save()
            }

    }
    def destroy = {
    }
}
