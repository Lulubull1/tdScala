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

//class note (numero etudiant,nom module,la note)

object STID2{
    def main(args: Array[String])
    {
        val etudiant1 = new Etudiant("Jean", "Philippe", 20, "15 Rue de Niort, 79000")

        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(21);

        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAge(22);

        println(etudiant1.nom+" "+etudiant1.age)
        etudiant1.changeAdresse("14 Rue de Poitiers");

        println(etudiant1.nom+" "+etudiant1.age)
        println(etudiant1.toString())
    }
}