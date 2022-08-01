object Q5 extends App{
    def toUpper(s: String): String = {
        s.toUpperCase()
    }

    def toLower(s: String): String = {
        s.toLowerCase()
    }

    def formatNames (name: String) (id_list: Int*) (func: String => String): String={
        if(id_list.isEmpty){
            return func (name)
        }
        var temp = ""
        var i = 0

        while(i < name.length()){
            if(id_list.contains(i)){
                temp += func(name.charAt(i).toString)
            }
            else{
                temp += name.charAt(i).toString
            }
            i += 1
        }
        return temp
    }
        println(formatNames("Benny")()(toUpper))
        println(formatNames("Niroshan")(0,1)(toUpper))
        println(formatNames("Saman")()(toLower))
        println(formatNames("Kumara")(5)(toUpper))


}