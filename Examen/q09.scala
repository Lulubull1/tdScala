//Universite(nomU, ville, effectif)
class Universite (p_nomU:String, p_ville:String, p_effectif:Int)
{
    val nomU=p_nomU
    var ville=p_ville
    var effectif=p_effectif
    override def toString():String = {
    "[nomU:"+nomU + "]," + "[ville:"+ville+ "]," +"[effectif:"+effectif+ "]"
    }
}

//Eleve(idE, nomE, moyenneLycee, effectifLycee)
class Eleve (p_idE:Int, p_nomE:String, p_moyenneLycee:Double,p_effectifLycee:Int)
{
    val idE=p_idE
    var nomE=p_nomE
    var moyenneLycee=p_moyenneLycee
    var effectifLycee=p_effectifLycee
    override def toString():String = {
    "[idE:"+idE + "]," + "[nomE:"+nomE+ "]," +"[moyenneLycee:"+moyenneLycee+ "],"+"[effectifLycee:"+effectifLycee+ "]"
    }
}

//Candidature(idE, nomU, departement, decision)
class Candidature (p_idE:Int, p_nomU:String, p_departement:String, p_decision:Char)
{
    val idE=p_idE
    var nomU=p_nomU
    var departement=p_departement
    var decision=p_decision
    override def toString():String = {
    "[idE:"+idE + "]," + "[nomU:"+nomU+ "]," +"[departement:"+departement+ "],"+"[decision:"+decision+ "]"
    }
}

object Main 
{
    def loadUniversiteData(path:String):Array[Universite]=
    {
        var universites:Array[Universite] =Array.empty
        val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val universite=new Universite(values(0).substring(1, values(0).length()-1), values(1).substring(1, values(1).length()-1), values(2).toInt)
        universites = universites :+ universite
        }
        bufferedSource.close
        return universites;
    }

    def loadEleveData(path:String):Array[Eleve]=
    {
        var eleves:Array[Eleve] =Array.empty
        val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val eleve=new Eleve(values(0).toInt, values(1).substring(1, values(1).length()-1), values(2).toDouble,values(3).toInt)
        eleves = eleves :+ eleve
        }
        bufferedSource.close
        return eleves;
    }

    def loadCandidatureData(path:String):Array[Candidature]=
    {
        var candidatures:Array[Candidature] =Array.empty
        val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val candidature=new Candidature(values(0).toInt, values(1).substring(1, values(1).length()-1), values(2).substring(1, values(2).length()-1),values(3)(1))
        candidatures = candidatures :+ candidature
        }
        bufferedSource.close
        return candidatures;
    }

    def main(args: Array[String]) 
    {
        var universites:Array[Universite] =loadUniversiteData("data/universite.csv")
        var eleves:Array[Eleve] =loadEleveData("data/eleve.csv")
        var candidatures:Array[Candidature] =loadCandidatureData("data/candidature.csv")

        //Extraire le nombre d'eleves avec un nom different
        candidatures.filter(x=>get_nomU(x.nomU,universites)=="Grenoble").foreach(println)
    }
}