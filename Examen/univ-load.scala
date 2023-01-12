//==========================================Declaration des classes==========================================
//Universite
class Universite(id:Int, ville:String, nombre:Int)
{
    val univId=id
    var nomVille=ville
    var nombreEtu=nombre
    override def toString():String = {
    "[univId:"+id + "]," + "[nomVille:"+ville+ "]," +"[nombreEtu:"+nombre+ "]"
    }
}

//Eleve
class Eleve(id:Int, prenom:String, moyenne:Float, nombre:Int)
{
    val eleveId=id
    val prenomEleve=prenom
    val moyenneEleve=moyenne
    val nombreEleve=nombre
    override def toString():String = {
    "[eleveId:"+id + "]," + "[prenomEleve:"+prenom+ "]," +"[moyenneEleve:"+moyenne+ "]," + "[nombreEleve:"+nombre+ "]"
    }
}

//Candidature
class Candidature(eId:Int, uId:Int, domaine:String, reponse:String)
{
    val eleveId=eId
    val univId=uId
    val domaineEtu=domaine
    val reponseCandid=reponse
    override def toString():String = {
    "[eleveId:"+eId + "]," + "[univId:"+uId+ "]," +"[domaineEtu:"+domaine+ "]," + "[reponseCandid:"+reponse+ "]"
    }
}

//==========================================Fonction de chargement des donnees==========================================
object programmePrincipal{
    //Universite
    def loadUniversite(path:String):Array[Universite]=
    {
        var universite:Array[Universite] =Array.empty
            val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val univ=new Universite(values(0).toInt, values(1).substring(1, values(1).length()-1), values(2).toInt)

        universite = universite :+ univ
        }
        bufferedSource.close
        return universite;
    }

    //Eleve
    def loadEleve(path:String):Array[Eleve]=
    {
        var eleve:Array[Eleve] =Array.empty
            val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val elev=new Eleve(values(0).toInt, values(1).substring(1, values(1).length()-1), values(2).toFloat, values(3).toInt)

        eleve = eleve :+ elev
        }
        bufferedSource.close
        return eleve;
    }

    //Candidature
    def loadCandidature(path:String):Array[Candidature]=
    {
        var candidature:Array[Candidature] =Array.empty
            val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val candid=new Candidature(values(0).toInt, values(1).toInt, values(2).substring(1, values(3).length()-1), values(3).substring(1, values(3).length()-1))

        candidature = candidature :+ candid
        }
        bufferedSource.close
        return candidature;
    }

//==========================================FONCTION MAIN==========================================
def main(args: Array[String]) 
    {
        var universite:Array[Universite] =loadUniversite("data/universite.csv")
        var eleve:Array[Eleve] =loadEleve("data/eleve.csv")
        var candidature:Array[Candidature] =loadCandidature("data/candidature.csv")

        println(universite.count)
    }
}