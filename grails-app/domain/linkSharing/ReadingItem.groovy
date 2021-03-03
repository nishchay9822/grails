package linkSharing

class ReadingItem {
    Resource resource
    User user
    Boolean isRead
    static hasMany=[users:User, resource:Resource]


    static constraint={
         resource (nullable: true,maxSize: 255)
         user (nullable: true,maxSize: 255)
         isRead (nullable: true)
    }
    static mapping={
        table: 'READINGITEM_INFO'
    }
    }
