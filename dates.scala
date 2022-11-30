import java.text.SimpleDateFormat
import java.util.Date


object STID2 {
    def main(args: Array[String]) {
    val format = new SimpleDateFormat("yyyy-MM-dd")
    val date = format.parse("2018-03-03")
    println(date)
    }
}
