//Write a Scala program and use a case class to define a shopping cart item. Each shopping cart item should have the following properties, namely, a name, a price, and a quantity bought. Create three shopping cart items for the following items:
//13 vanilla ice cream at Rs3.99 each
//6 chocolate biscuits at Rs 4 each
//7 cupcakes at Rs 7.77 each
//Use an appropriate data structure to store the above-mentioned shopping cart items. Thereafter, define and use a method that will print out all items from a given shopping cart.

object Q2 extends App{
    case class Item(name:String,price:Double,quantity:Int)
    val item1=Item("vanilla ice cream",3.99,13)
    val item2=Item("chocolate biscuits",4,6)
    val item3=Item("cupcakes",7.77,7)
    val items=List(item1,item2,item3)
    def printItems(items:List[Item]):Unit={
        for(item<-items){
        println(item.quantity+" "+item.name+" at Rs. "+item.price+" each")
        
        }
    }

    def printVanillaIceCream(items:List[Item]):Unit={
        for(item<-items){
        if(item.name=="vanilla ice cream"){
            println(item.quantity+" "+item.name+" at Rs. "+item.price+" each")
        }
        else{
            println("Found another item")
        }
        
        }
    }
    printItems(items)
    println("\n")
    printVanillaIceCream(items)
}