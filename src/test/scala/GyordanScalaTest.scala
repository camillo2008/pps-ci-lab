class GyordanScalaTest{

	import org.junit.jupiter.api.Assertions.assertEquals

	import org.junit.jupiter.api.Test

	@Test
	def getStringFromGyordanJavaTest(): Unit = {
		assertEquals("1",GyordanScala.getStringFromGyordanJava())
	}	
}

