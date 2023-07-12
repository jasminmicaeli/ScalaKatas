import org.scalatest.funsuite.AnyFunSuite

class EnglishBeggarsTest extends AnyFunSuite {

  test("test 1") {
    val kata = new EnglishBeggars()
    val values = List(1, 2, 3, 4, 5)
    val n = 1
    val actual = kata.beggars(values, n)
    val expected = List(15)
    assert(expected == actual)
  }
  test("test 2") {
    val kata = new EnglishBeggars()
    val values = List(1, 2, 3, 4, 5)
    val n = 2
    val actual = kata.beggars(values, n)
    val expected = List(9, 6)
    assert(expected == actual)
  }
  test("test 3") {
    val kata = new EnglishBeggars()
    val values = List(1, 2, 3, 4, 5)
    val n = 0
    val actual = kata.beggars(values, n)
    val expected = List.empty
    assert(expected == actual)
  }
}
