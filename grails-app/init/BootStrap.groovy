import demo.Student
import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
        if(Environment.current == Environment.DEVELOPMENT) {
            Student student = new Student(
                    rollNumber: '1234',
                    name: 'Raj',
                    age: 20
            ).save(flush: true)
            new Student(
                    rollNumber: '1235',
                    name: 'Reena',
                    age: 21
            ).save(flush: true)
            new Student(
                    rollNumber: '1236',
                    name: 'Arjun',
                    age: 20
            ).save(flush: true)
        }
    }
    def destroy = {
    }
}
