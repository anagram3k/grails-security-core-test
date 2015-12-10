package test.anon

import grails.plugin.springsecurity.annotation.Secured;

class HelloController {

    static namespace='rest_anon'

    @Secured(['permitAll'])
    def index() { 
        render "Hello Anon\n"
    }
}
