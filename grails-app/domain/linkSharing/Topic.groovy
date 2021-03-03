package linkSharing

import linkSharing.Resource
import linkSharing.Subscription


class Topic {
    String name
    Date dateCreated
    Date lastUpdated

    enum Visibility {PUBLIC , PRIVATE}

    Visibility visibility;
    static belongsTo = [createdBy: User];
    static hasMany = [resources: Resource, subscriptions: Subscription]

static constraints={
    name (unique: 'createdBy')
    name(nullable: false)
    visibility(nullable: false)

}
    static mapping={

    }
    }