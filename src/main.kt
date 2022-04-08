fun main(){
    var person = Human("Timcy",20,55)
    person.eat(4)
    println(person.weight)
    person.speak("Japanese")
    person.birthday()
    println(person.age)
    var man = User("Shaina","Ngina","shainangina@gmail.com","0748383345",39101014)
    println(man.lastName)
    println(man.password)



}

//create a class called Human with these attributes:name,age,weight.It has the following functions:
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating ${foodweight} kgs of food")
        weight +=foodweight

    }
    //speak
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }
}
//create a data class User with these fields:firstName,latName,email,PhoneNumber,password.create an instance of user and print out any attributes.
data class User(var firstName:String,var lastName:String,var email:String,var phonenumber:String,var password:Int)

