import org.scalatest.funsuite.AnyFunSuite

class TwoToOneTest extends AnyFunSuite {

  test("test1") {
    val tto = new TwoToOne()
    val first = "xyaabbbccccdefww"
    val second = "xxxxyyyyabklmopq"
    val actual = tto.longest(first, second)

    assert("abcdefklmopqwxy" == actual)
  }
}