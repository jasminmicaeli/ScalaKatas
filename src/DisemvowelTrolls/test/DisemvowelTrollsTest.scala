import org.scalatest.funsuite.AnyFunSuite

class DisemvowelTrollsTest extends AnyFunSuite {

  test("test 1") {
    val dt = new DisemvowelTrolls()
    val given = "Jasmin"
    val actual = dt.removeVowels(given)

    assert("Jsmn" == actual)
  }

  test("test 2") {
    val dt = new DisemvowelTrolls()
    val given = "aAeEiIoOuU"
    val actual = dt.removeVowels(given)

    assert("" == actual)
  }
}
