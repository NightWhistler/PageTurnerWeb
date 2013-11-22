class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

        "/progress/$progressKey?"(resource:"progress")
        "/progress//$progressKey?"(resource:"progress")

		"/"(view:"/index")
		"500"(view:'/error')
	}
}
