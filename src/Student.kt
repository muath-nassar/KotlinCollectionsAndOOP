class Student(val name: String, val year: String) {
    companion object{
        var studentNumbers = 0
    }

    var number = 0


    init {
        println("The object has initialized")
        ++studentNumbers
    }

    constructor(name: String, year: String, number: Int) : this(name, year) {
        this.number = number
    }

    override fun toString(): String {
        return "Student(name='$name', year='$year', number=$number)"
    }

}