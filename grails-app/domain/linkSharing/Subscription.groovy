package linkSharing

class Subscription {
    Topic topic;
    User user;
    static belongsTo = [users:User, topics:Topic]
    enum Seriousness{
        CASUAL,SERIOUS,VERY_SERIOUS;
    }
    Seriousness seriousness;
    Date dateCreated;
    Date lastUpdated;
    static constraints = {
        user unique: 'topic'
    }
}