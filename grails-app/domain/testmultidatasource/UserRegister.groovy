package testmultidatasource


import java.sql.Time

class UserRegister {
    String userName
    long entityTypeId
    long entityId
    long  billingUserId
    String imei
    String employeeCode
    String mobileNo
    String email
    String gender
    String photo
    String bloodGroup
    long aadharId
    String panId
    String address
    long countryId
    long stateId
    long cityId
    String pinCode
    String nationality
    String professionalId
    long roleId
    String loginId
    String password
    String bankAccountNumber
    String ifscCode
    Date dob
    String accountStatus
    String reasonForResignation
    String lockUnlockStatus
    String registrationFees
    long division
    String qualification
    Date joiningDate
    Date reportingDate
    String landline
    String allowDCRDeviation
    String updateTimeLimit
    String dcrApproval24HrLimit
    String accompanyRoleIds
    String masterPassword
    String masterLogin
    Date dateOfResignation
    long holidayId

    long createdUser
    long modifiedUser
    Date createdDate
    Date modifiedDate

    static constraints = {

        userName blank: false, nullable: false
        roleId blank: false, nullable: false
        gender blank: false, nullable: false
        aadharId blank: false, nullable: false
        panId blank: false, nullable: false
        bloodGroup blank: false, nullable: false
        dob blank: false, nullable: false
        division blank: false, nullable: false
        joiningDate blank: false, nullable: false
        reportingDate blank: false, nullable: false
        updateTimeLimit blank: false, nullable: false
        dcrApproval24HrLimit blank: false, nullable: false
        mobileNo  blank: false, nullable: false
        countryId blank: false, nullable: false
        stateId blank: false, nullable: false
        cityId blank: false, nullable: false

        modifiedUser nullable: true
        modifiedDate nullable: true
        createdDate nullable: true
        createdUser nullable: true
        billingUserId nullable: true
        email nullable: true
        photo nullable: true
        bloodGroup nullable: true
        nationality nullable: true
        professionalId nullable: true
        bankAccountNumber nullable: true
        ifscCode nullable: true
        reasonForResignation nullable: true
        lockUnlockStatus nullable: true
        registrationFees nullable: true
        qualification nullable: true
        landline nullable: true
        allowDCRDeviation nullable: true
        accompanyRoleIds nullable: true
        masterPassword nullable: true
        masterLogin nullable: true
        dateOfResignation nullable: true
        password nullable: true,  maxSize: 500
        imei nullable: true
        employeeCode nullable: true
        holidayId nullable: true
    }
    static mapping = {

        updateTimeLimit  sqlType: "VARCHAR(10)"
    }
    boolean isUpdatable
    static transients = ['isUpdatable']

    def beforeUpdate() {
        if (!this.isUpdatable) {
            System.out.println("UserRegistration Domain update Prevented " + new Date().toString() + " ,id: " + this.id)
            return false
        } else {
            System.out.println("UserRegistration domain Updated " + new Date().toString() + " ,id: " + this.id)
        }

    }

}
