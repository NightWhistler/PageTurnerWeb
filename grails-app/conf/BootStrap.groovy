import net.nightwhistler.pageturner.Progress

class BootStrap {

    def init = { servletContext ->
        
        new Progress( 
            progressKey: "myKey",
            title: "A book",
            bookIndex: 88,
            progress: 55 ).save()

    }
    def destroy = {
    }
}
