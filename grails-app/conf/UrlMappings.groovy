class UrlMappings {

	static mappings = {
    	"/rest/anon/v1/$controller/$action?/$id?(.$format)?"(namespace:'rest_anon'){
			constraints {
				// apply constraints here
			}
		}
		
		"/rest/secure/v1/$controller/$action?/$id?(.$format)?"(namespace:'rest_secure'){
			constraints {
				// apply constraints here
			}
		}
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

	}
}
