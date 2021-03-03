package linkSharing

import linkSharing.ReadingItem

class Resource {

    Topic topic
    String description

    Date dateCreated
    Date lastUpdated
    static belongsTo = [createdBy:User, Topics:Topic]
    static hasMany = [readingItems: ReadingItem, resourceRatings: ResourceRating]
    static constraints = {

        createdBy(nullable: false)
        topic(nullable: false, maxSize: 100)
        description(nullable: false, maxSize: 255)
    }
    static mapping ={
        table: 'RESOURCE_INFO'
    }
}