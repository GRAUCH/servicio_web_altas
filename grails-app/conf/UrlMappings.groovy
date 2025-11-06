class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "citas", action: "indexGeneral")
        "/ama/"(controller: "busquedaAma", action: "index")
        "/nn/"(controller: "busquedaNn", action: "index")
        "500"(view: '/error')
    }
}