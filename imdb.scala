class Movie (id:Int, mTitle:String, mYear:Int,mDirector:String)
    {
    val mid=id
    var title=mTitle
    var year=mYear
    var director=mDirector
    override def toString():String = {
    "[Mid:"+mid + "]," + "[Title:"+title+ "]," +"[Year:"+year+ "]," + "[Director:"+director+ "]"
    }
}

// Rating(rID, mID, stars, ratingDate)
class Rating(p_rId:Int, p_mId:Int, p_stars:Int, p_ratingDate:String)
{
    val rID=p_rId
    val mId=p_mId
    val stars=p_stars
    val ratingDate=p_ratingDate
    override def toString():String = {
    "[Rid:"+rID + "]," + "[Mid:"+mId+ "]," +"[stars:"+stars+ "]," + "[ratingDate:"+ratingDate+ "]"
    }
}

// Reviewer(rID, name)
class Reviewer(p_rID:Int, p_name:String)
{
    val rId=p_rID
    val name=p_name
    override def toString():String = {
    "[Rid:"+rId + "]," + "[Name:"+name+ "]"
    }
}

object Geeks 
{
    def loadMovieData(path:String):Array[Movie]=
    {
        var movies:Array[Movie] =Array.empty
            val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val movie=new Movie(values(0).toInt, values(1).substring(1, values(1).length()-1), values(2).toInt, values(3).substring(1, values(3).length()-1))

        movies = movies :+ movie
        }
        bufferedSource.close
        return movies;
    }

    def loadRatingData(path:String):Array[Rating]=
    {
        var ratings:Array[Rating] =Array.empty
        val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val rating=new Rating(values(0).toInt, values(1).toInt, values(2).toInt, values(3))

        ratings = ratings :+ rating
        }
        bufferedSource.close
        return ratings;
    }

    def loadReviewerData(path:String):Array[Reviewer]=
    {
        var reviewers:Array[Reviewer] =Array.empty
        val bufferedSource = io.Source.fromFile(path)
        for (line <- bufferedSource.getLines) {
        val values = line.split(",").map(_.trim)
        val reviewer=new Reviewer(values(0).toInt, values(1))

        reviewers = reviewers :+ reviewer
        }
        bufferedSource.close
        return reviewers;
    }

    def f_filter1(ratings:Array[Rating]):Array[Rating]=
    {
        return ratings.filter(_.stars>=4)
    }

    def getMovieFromMid(p_mid:Int,movies:Array[Movie]):Array[Movie]=
    {
        return movies.filter(_.mid==p_mid)
    }

    def f_filter2(movies:Array[Movie]):Array[Movie]=
    {
        return movies.filter(_.title=="Gone with the Wind")
    }

    def getRatingFromMid(p_mid:Int,ratings:Array[Rating]):Array[Rating]=
    {
        return ratings.filter(_.mId==p_mid)
    }

    def getReviewerFromRid(p_rid:Int, reviewers:Array[Reviewer]):Array[Reviewer]=
    {
        return reviewers.filter(_.rId==p_rid)
    }

    def getReviewerFromDirector(p_director:String, movies:Array[Reviewer]):Array[Reviewer]=
    {
        return reviewers.filter(_.rId==p_rid)
    }

    def getRatingFromMid_Rid(p_mid:Int, p_rid:Int, ratingStars:Array[Reviewer]):Array[Reviewer]=
    {
        return reviewers.filter(_.rId==p_rid)
    }

    def main(args: Array[String]) 
    {
        var movies:Array[Movie] =loadMovieData("data/movie.csv")
        var ratings:Array[Rating] =loadRatingData("data/rating.csv")
        var reviewers:Array[Reviewer] =loadReviewerData("data/reviewer.csv")

        //f_filter2(movies).foreach(println)
        //getRatingFromMid(101,ratings).foreach(println)
        //getReviewerFromRid(201,reviewers).foreach(println)

        f_filter2(movies).flatMap(x=>getRatingFromMid(x.mid,ratings)).map(x=>getReviewerFromRid(x.rID,reviewers)(0).name).distinct.foreach(println)

        //.map(x=>getReviewerFromRid(x.rID,reviewers)(0).name).distinct.foreach(println)
        //f_filter1(ratings).map(x=>getMovieFromMid(x.mId,movies)(0).year).distinct.sorted.foreach(println)



        //f_filter1(ratings).map(x=>getMovieFromMid(x.mId,movies)(0).year).distinct.foreach(println)
    }
}
