//==================================PROGRAMME N°1==================================
//On test une egalite

//object Hello {
//    def main(args: Array[String]) = {
//        println("Hello, world")
//	var var3=2
//	if(var3==1)
//	{
//		println("True")
//	}
//	else
//	{
//		println("False")
//	}
//
//    }
//
//}

//(14/11/22)
//==================================PROGRAMME N°2==================================
//On demande a l'utilisateur de saisir une valeur

//object Geeks
//{
//	//Main methods
//	def main(args: Array[String])
//	{
//		//Prints Hello world
//		println("Hello world by "+args(0))
//	}
//}

//scalac geeks.scala
//Lancer le programme avec scala geeks.scala 'argument string a entrer'

//scalac hello.scala

//==================================PROGRAMME N°3==================================
//object Geeks
//{
//	//Main methods
//	def main(args: Array[String])
//	{
//		for(a<-1 to 10)
//			println("Valeur de a :"+a)
//
//		//Prints Hello world
//		println("Hello world by "+args(0))
//	}
//}

//==================================PROGRAMME N°4==================================
//object Geeks
//{
//	//Main methods
//	def main(args: Array[String])
//	{
//		var iteration = args(0).toInt
//		for(a<-1 to iteration)
//			println("Valeur de a :"+a)
//	}
//}

//==================================PROGRAMME N°5==================================
//object Geeks
//{
//	def multi10(m:Int):Int=m*10
//
//	def main(args: Array[String])
//	{
//		println(multi10(2))
//	}
//		
//}

//==================================PROGRAMME N°6==================================
//object Geeks
//{
//	def multi(m:Int,n:Int):Int=m*n
//
//	def main(args: Array[String])
//	{
//		println(multi(5,5))
//	}
//		
//}

//==================================PROGRAMME N°7==================================
//On cree des listes

//bject Geeks
//
//	def main(args: Array[String])
//	{
//		//val fruits : List[String] = List("Bananes", "oranges", "pommes")
//		//val chiffres : List[Int] = List(1, 3, 9, 7)
//		//val listeDeListes : List[List[Int]] = List(List(1, 3), List(2,5,7))
//
//		val fruits = List("Bananes", "Oranges", "Pommes")
//		val chiffres = List(1,3,9,7)
//		val listeDeListes = List(List(1,3), List(2,5,7))
//
//		println(fruits)
//		println(chiffres)
//		println(listeDeListes)
//	}
//

//Version courte / optimisee

//object Geeks
//{
//	def exercice1()
//	{
//		val chiffres = List(1,3,9,7)
//
//		println("============1ere methode============")
//
//		chiffres.foreach{println}
//
//		//le _ est l'element que l'on compare
//		val chiffres2 = chiffres.filter(_ <= 3)
//
//		println("- Liste des chiffres inferieur ou egal a 3 :")
//		println(chiffres2)
//	}
//
//	def exercice2()
//	{
//		val chiffres : List[Int] = List(1,3,9,7)
//
//		println("============2eme methode============")
//
//		for(element<-chiffres) println(element)
//
//		val chiffres2 = chiffres.filter(_ <= 3)
//
//		println("- Liste des chiffres inferieur ou egal a 3 :")
//		println(chiffres2)
//	}
//
//	def main(args: Array[String])
//	{
//		exercice1()
//		exercice2()
//	}
//}

//==================================PROGRAMME N°8==================================
//object Geeks
//{
//	def main(args: Array[String])
//	{
//		val lettres = List("AA", "BBB", "C", "DDDD")
//
//		lettres.map(ele=>(ele,ele.length)).foreach(println)
//	}
//}

//==================================PROGRAMME N°9==================================
object Geeks
{
	def main(args: Array[String])
	{
		//val lettres = List("AA", "BBB", "C", "DDDD")

		//lettres.map(ele=>(ele,ele.length)).foreach(println)

		//val chiffres = List(1,1,2,3,2,4,5)

		//chiffres.map(ele=>(ele,ele.length)).foreach(println)
		//chiffres.groupBy(ele=>ele).map(ele=>(ele._1,ele._2.length)).foreach(println)

		val lettreChiffres = List(("A",4),("B",5),("C",5),("A",5),("C",4))
		lettreChiffres.groupBy(ele=>ele).map(ele=>(ele._1,ele._2.length)).foreach(println)
	}
}