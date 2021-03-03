package linkSharing


class User {
    String firstName
    String lastName
    String userName
    String email
    String password
    Boolean active
    Boolean admin
    Date dateCreated
    Date lastUpdated
    Byte[] photo
    static hasMany = [
            subscriptions: Subscription, resources: Resource, resourceRatings: ResourceRating,
            readingItems : ReadingItem, Topics: Topic
    ];

    static constraints = {
        email(nullable: false,email: true,unique: true,blank: false);
        lastName(nullable: true);
        userName(nullable: false, unique: true);
        password(nullable: false);
        firstName(nullable: false);
        photo(nullable: true);
        admin(nullable: false);
        active(nullable: false);
        subscriptions(nullable: true);
        resources(nullable: true);
        resourceRatings(nullable: true);
        readingItems(nullable: true);
        Topics(nullable: true);

    }
    static mapping =
            {
                table: 'USER_INFO'
            }

}