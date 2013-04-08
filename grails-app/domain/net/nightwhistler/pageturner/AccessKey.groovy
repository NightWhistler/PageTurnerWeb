package net.nightwhistler.pageturner

class AccessKey {

    static constraints = {
        expiresOn nullable: true
    }

    String keyCode
    String keyOwner

    Date createdOn = new Date()
    Date expiresOn
}
