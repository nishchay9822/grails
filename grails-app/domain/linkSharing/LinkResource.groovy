package linkSharing

class LinkResource extends Resource {

        String url
        static constraints = {
            url(url: true, nullable: false, blank: false)
        }
    static mapping={
        table: 'LINKRESOURCE_INFO'
    }
}
