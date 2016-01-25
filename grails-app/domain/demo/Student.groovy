package demo

class Student {

    String rollNumber
    Integer age
    String name


    static constraints = {
        rollNumber()
        name size: 3..20
        age min: 18
    }
}
