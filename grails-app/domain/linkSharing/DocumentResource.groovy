package linkSharing

class DocumentResource extends Resource {

    String filePath
    static constraints = {
        filePath(nullable: false, blank: false)
    }
    static mapping={
        table: 'DOCUMENTRESOURCE_INFO'
    }
}
