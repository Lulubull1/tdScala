class Movie(mID:Int, title:String, year:Date, director:String){
    var filmID: Int=mID
    var titre: String=title
    var annee: Int=year
    var directeur: String=director
}

class Rating(rID:Int, name:String){
    var critiqueID: Int=rID
    var name: String=name
}

class Reviewer(rID:Int, mID:Int, stars:Int, ratingDate:Date){
    var critiqueID: Int=rID
    var filmID: String=mID
    var stars: Int=stars
    var dateNote: String=direcratingDatetor
}

object csv{

    
    def loadMovieData(args: Array[String])
    {
        var movies:Array[Movie] = loadMovieData("data/movie.csv")
        println(movies[0])

        val bufferedSource = io.Source.fromFile("data/movie.csv")
            
            for (line <- bufferedSource.getLines) {
                val cols = line.split(",").map(_.trim)
                val movie = new Movie(cols(0).toInt, cols(1).substring(1, cols(1).length()-1), cols(2).toInt, cols(3).substring(1, cols(3).length()-1))
                movies = movies :+ movie
            }
            bufferedSource.close
            return movies
    }

    def main(args: Array[String])
    {
        movies.filter(_.director=="Steven Spielberg")
            foreach(println)

    }

}