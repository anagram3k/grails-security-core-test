# grails-security-core-test


$ curl http://localhost:8080/grails-security-core-test/hello

Hello without namespace

$ curl http://localhost:8080/grails-security-core-test/rest/anon/v1/hello/

Hello Anon

$ curl http://localhost:8080/grails-security-core-test/rest/secure/v1/hello/

Hello Secure
 
(should redirect to /login/auth, but doesn't work)
 
