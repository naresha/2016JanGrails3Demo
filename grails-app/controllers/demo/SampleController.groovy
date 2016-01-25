package demo

import grails.converters.JSON

class SampleController {

    def studentService

    def index() {
    }

    def show(){
        Student student = new Student(
                rollNumber: '1234',
                name: 'Raj',
                age: 20
        )
        render view: 'student', model: [student: student]
    }

    def listByAge(Integer age)
    {
        def students = studentService.fetchStudentsWithAge(age)
        def model = [students: students]
        //render model: model, view: 'students'
        render students as JSON
    }


}
