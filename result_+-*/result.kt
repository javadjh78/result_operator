fun main(javad:Array<String>){
    var input = readLine()!!.toString()
    if (input.contains("+")){
        var t1 = input.substring(0,input.indexOf("+")).toInt()
        var t2 = input.substring(input.indexOf("+")+1,input.length).toInt()
        println(t1+t2)
    }
    else if (input.contains("-")){
        var t1 = input.substring(0,input.indexOf("-")).toInt()
        var t2 = input.substring(input.indexOf("-")+1,input.length).toInt()
        println(t1-t2)
    }
    else if (input.contains("*")){
        var t1 = input.substring(0,input.indexOf("*")).toInt()
        var t2 = input.substring(input.indexOf("*")+1,input.length).toInt()
        println(t1*t2)
    }
    else if (input.contains("/")){
        var t1 = input.substring(0,input.indexOf("/")).toInt()
        var t2 = input.substring(input.indexOf("/")+1,input.length).toInt()
        println(t1/t2)
    }
    else if (input.contains("%")){
        var t1 = input.substring(0,input.indexOf("%")).toInt()
        var t2 = input.substring(input.indexOf("%")+1,input.length).toInt()
        println(t1%t2)
    }
}
