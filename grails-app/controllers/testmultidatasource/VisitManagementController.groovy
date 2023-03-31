package testmultidatasource


import grails.gorm.transactions.Transactional
import grails.converters.*
import grails.web.servlet.mvc.GrailsParameterMap
import org.grails.web.json.JSONObject
import org.springframework.boot.context.config.ResourceNotFoundException
import testmultidatasource.BadRequestException

import java.text.SimpleDateFormat

class VisitManagementController {

    static responseFormats = ['json', 'xml']
    static allowedMethods = [index: "GET", show: "GET", save: "POST", update: "PUT", delete: "DELETE", dataTable: "GET"]

    VisitManagementService visitManagementService

    def getAll(){
        try {
            JSONObject jsonObject = new JSONObject(params)
            def entityId = Long.parseLong(jsonObject.get("entityId").toString())
            def results = visitManagementService.getAll(entityId)
            def responseData = [
                    'results': results
            ]
            render responseData as JSON

        }
        catch (ResourceNotFoundException ex)
        {
            System.err.println('Controller :' + controllerName + ', action :' + actionName + ', Ex:' + ex)
            response.status = 404
        }
        catch (BadRequestException ex)
        {
            System.err.println('Controller :' + controllerName + ', action :' + actionName + ', Ex:' + ex)
            response.status = 400
        }
        catch (Exception ex) {
            System.err.println('Controller :' + controllerName + ', action :' + actionName + ', Ex:' + ex)
        }
    }



}
