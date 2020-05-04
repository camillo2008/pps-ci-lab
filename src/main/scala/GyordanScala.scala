 object GyordanScala {
    def main(args: Array[String]):Unit = {
        println("Ciao ma in scala")
	   new GyordanJava()
	}
    def getStringFromGyordanJava():String = {
	   new GyordanJava().getString()
	}
}
