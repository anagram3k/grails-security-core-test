package test.secure

import grails.plugin.springsecurity.annotation.Secured;

class HelloController {

    static namespace='rest_secure'

    @Secured(['ROLE_ADMIN'])
    def index() {
        render "Hello Secure\n"
    }
}
