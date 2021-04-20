fun main() {
    println(isEven(9))
    println(isEven(4))
    var x=Product("sweetpotato",45,200,"groceries")
    println(x.category("groceries"))

    var k="Kemumu"
    println(k[2])
    println(k[4])

}
fun isEven(num:Int):Boolean{
    if (num%2==0) {
        return true
    }
    else {
        return false
    }}

data class Product(var name:String,var weight:Int,var price:Int,var category:String){
    fun category(category: String){
        when (category){
            "hygiene"->println("I love clean environment ")
            "groceries"->println("I need sweetpotato")
            "other"-> println("I have so many groceries")
        }
    }
fun school(school:String):String{
    var k="Kemunu"
    return k
}




}
