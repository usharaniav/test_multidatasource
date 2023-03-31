package testmultidatasource


import grails.gorm.transactions.Transactional
import groovy.sql.Sql
import org.grails.web.json.JSONObject
import testmultidatasource.BadRequestException

import javax.sql.DataSource
import java.sql.SQLException
import java.sql.Timestamp
import java.text.SimpleDateFormat

class VisitManagementService {

//    def datasource

    static datasource = 'phitf_visits'

//    DataSource 'phitf_visits'

    def getAll(long entityId)  {
        try {
            final String query = '''\
              select *
              from visit_management 
               WHERE ur.entity_id = :entityId  and id = 5;
             '''

            final Sql sql = new Sql(datasource)

            final results = sql.rows(query, [entityId:entityId])

            return results
        }
        catch (SQLException ex) {

        }
    }
    }

