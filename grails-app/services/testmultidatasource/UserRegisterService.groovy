package testmultidatasource


import grails.gorm.transactions.Transactional
import groovy.sql.Sql
import org.grails.web.json.JSONObject
import testmultidatasource.UserRegister

import java.sql.Timestamp
import java.text.SimpleDateFormat
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.PBEKeySpec
import javax.xml.bind.DatatypeConverter
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.security.spec.InvalidKeySpecException
import java.time.LocalDate
class UserRegistrationService {

    def dataSource

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
    SimpleDateFormat timeSdf = new SimpleDateFormat("HH:mm");
    private static final Random RANDOM = new SecureRandom()
    private static final int ITERATIONS = 10000
    private static final int KEY_LENGTH = 256

    def getAll(long entityId) {

        final String query = '''\
                   SELECT *
                    FROM user_register ur
                    WHERE ur.entity_id = :entityId  and id = 4;
        '''
        final Sql sql = new Sql(dataSource)

        final results = sql.rows(query, [entityId: entityId])

        return results

    }
}
