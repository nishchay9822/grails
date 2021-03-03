package linkSharing

import linkSharing.Resource

class ResourceRating {
    User user
    static belongsTo = [user: User, resource:Resource]
    Integer score

    static constraints = {
        user (unique: 'resource')
    }
 }
