import org.scalatest.funsuite.AnyFunSuite

class FindTheMissingLetterTest extends AnyFunSuite {

  test("test 1") {
    val ftml = new FindTheMissingLetter()
    val chars = Array('a', 'c', 'd', 'e', 'f')
    val actual = ftml.findMissingLetter(chars)

    assert('b' == actual)
  }

  test("test 2") {
    val ftml = new FindTheMissingLetter()
    val chars = Array('A', 'B', 'D', 'E', 'F')
    val actual = ftml.findMissingLetter(chars)

    assert('C' == actual)
  }
}
