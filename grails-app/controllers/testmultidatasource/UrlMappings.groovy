package testmultidatasource

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/user/getall(.$format)?"(controller: 'UserRegistration') {
            action = "getAll"
        }


        "/visit/getall(.$format)?"(controller: 'VisitManagement') {
            action = "getAll"
        }

    }
}
