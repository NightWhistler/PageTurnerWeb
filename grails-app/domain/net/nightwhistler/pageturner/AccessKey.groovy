package net.nightwhistler.pageturner

class AccessKey {

    static constraints = {
        expiresOn nullable: true
        ownerEmail nullable: true
        keyOwner nullable: true
    }

    String keyCode
    String keyOwner
    String ownerEmail

    Date createdOn = new Date()
    Date expiresOn
}
