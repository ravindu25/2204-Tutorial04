object Q4 extends App{
    def PatternMatching(n:Int):Unit={
        n match{
            case n if n<=0 => println("Negative/Zero")
            case n if n%2==0 => println("Even number")
            case n if n%2!=0 => println("Odd number")
        }
    }
    PatternMatching(scala.io.StdIn.readInt())


}