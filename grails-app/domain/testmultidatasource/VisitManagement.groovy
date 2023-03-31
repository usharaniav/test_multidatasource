package testmultidatasource

class VisitManagement {

    long tpId
    long entityId
    long empId
    String visitDate
    long visitCity
    long customerTypeId
    long customerId
    long accompanyId

    String remarks
    String latitude
    String longitude
    String support
    String reportType
    String status
    String deviceUUID
    long workTypeId
    long createdUser
    long modifiedUser
    Date createdDate
    Date modifiedDate
    boolean isUpdatable
    String clientType

    static constraints = {

        clientType blank: false, nullable: false

        support nullable: true
        modifiedUser nullable: true
        modifiedDate nullable: true
        createdDate nullable: true
        createdUser nullable: true
    }

    static mapping = {

        remarks sqlType: 'longText'

//        datasource 'phitf_visits'

    }
    static transients = ['isUpdatable']
    def beforeUpdate()
    {

        if (!this.isUpdatable)
        {
            System.out.println("VisitManagement Domain update Prevented " + new Date().toString() + " ,id: " + this.id)
            return false
        }
        else
        {
            System.out.println("VisitManagement domain Updated " + new Date().toString() + " ,id: " + this.id)
        }
    }
}




