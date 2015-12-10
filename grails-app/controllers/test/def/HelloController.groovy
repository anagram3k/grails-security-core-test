package test.def

import grails.plugin.springsecurity.annotation.Secured;

class HelloController {

	@Secured(['permitAll'])
    def index() {
        render "Hello without namespace\n"
    }
}
