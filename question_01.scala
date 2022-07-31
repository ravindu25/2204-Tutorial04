object Q1 extends App{
    def get_interest(value:Double):Double={
        if(value>=2000000){
            value*0.065
        }
        else if(value>=200000){
            value*0.035
        }
        else if(value>=20000){
            value*0.04
        }
        else{
            value*0.02
        }
    }
    //get user input for value
    println("Enter the value of the deposit: ")
    val value = scala.io.StdIn.readDouble()
    println("The interest is: " + get_interest(value))
}