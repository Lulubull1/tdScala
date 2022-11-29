import java.text.SimpleDateFormat
import java.util.Date

class Etudiant(nomEtu:String, prenomEtu:String, ageEtu:Int, adresseEtu:String){

    var nom: String=nomEtu
    var prenom: String=prenomEtu
    var age: Int=ageEtu
    var adresse: String=adresseEtu

    def changeAge(newAge: Int)
    {
        age=newAge
    }
    def changeAdresse(newAdresse: String)
    {
        adresse=newAdresse
    }
    override def toString():String=nom+" "+prenom+" "+age+" "+adresse
}


object STID2{
    def main(args: Array[String])
    {
        val format = new SimpleDateFormat("yyyy-MM-dd")
        val date = format.parse("2018-03-03")
        println(date)
    }
}