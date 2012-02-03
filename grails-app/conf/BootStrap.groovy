import net.nightwhistler.pageturner.Progress
import net.nightwhistler.pageturner.AccessKey

class BootStrap {

    def init = { servletContext ->
        
        new Progress( 
            progressKey: "myKey",
            title: "A book",
            bookIndex: 88,
            progress: 55 ).save()

            new AccessKey( keyCode: "AlexKey", keyOwner: "Alex" ).save()

    }
    def destroy = {
    }
}
