import java.lang.Exception

class Account(accountNumber:String, balance :Double, branch :Branch ) {



    var accountNumber:String=accountNumber

    println("salam")

    set(value) {
        if (value.trim().isEmpty()) throw Exception()

        field = value
    }
    var balance :Double =balance
    set(value) {
        if (value < 0) field = 0.0
        field = value
    }
    var branch :Branch = branch
}
