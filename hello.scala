//==================================PROGRAMME N°1==================================
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
object Geeks
{
	//Main methods
	def main(args: Array[String])
	{
		var iteration = args(0).toInt
		for(a<-1 to iteration)
			println("Valeur de a :"+a)
	}
}

//By Lulubull
//Test