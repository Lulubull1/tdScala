//class Etudiant(nomEtu:String, prenomEtu:String, ageEtu:Int, adresseEtu:String){
//
//    var nom: String=nomEtu
//    var prenom: String=prenomEtu
//    var age: Int=ageEtu
//    var adresse: String=adresseEtu
//
//    def changeAge(newAge: Int)
//    {
//        age=newAge
//    }
//    def changeAdresse(newAdresse: String)
//    {
//        adresse=newAdresse
//    }
//    override def toString():String=nom+" "+prenom+" "+age+" "+adresse
//}
//
//
//object STID2{
//    def main(args: Array[String])
//    {
//        val etudiant1 = new Etudiant("le Jossec", "Lukas", 20, "95 Boulevard de l'atlantique, 79000")
//
//        println(etudiant1.nom+" "+etudiant1.age)
//        etudiant1.changeAge(21);
//
//        println(etudiant1.nom+" "+etudiant1.age)
//        etudiant1.changeAge(22);
//
//        println(etudiant1.nom+" "+etudiant1.age)
//        etudiant1.changeAdresse("14 Rue de Poitiers");
//
//        println(etudiant1.nom+" "+etudiant1.age)
//        println(etudiant1.toString())
//    }
//}

class note(numEtu:Int, nomModule:String, laNote:Int){
    var numeroEtudiant: Int=numEtu
    var module: String=nomModule
    var note: Int=laNote

    def changeNote(newNote: Int)
    {
        note=newNote
    }
    override def toString():String=numeroEtudiant+" "+module+" "+note
}


object STID2{
    def main(args: Array[String])
    {
        val etudiant2 = new note(22009533, "Scala", 5)

        println(etudiant2.numeroEtudiant+" a eu "+etudiant2.note+" en "+etudiant2.module)
        etudiant2.changeNote(19);

        println(etudiant2.numeroEtudiant+" a eu "+etudiant2.note+" en "+etudiant2.module)
        println(etudiant2.toString())
    }
}