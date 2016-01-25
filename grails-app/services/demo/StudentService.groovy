package demo

import grails.transaction.Transactional

@Transactional
class StudentService {

    def fetchStudentsWithAge(Integer requiredAge) {
        //Student.findAllByAge(requiredAge)
        Student.where {
            age == requiredAge
        }.list()

        def criteria = Student.createCriteria()
        criteria.list {
            eq 'age', requiredAge
        }

    }
}
