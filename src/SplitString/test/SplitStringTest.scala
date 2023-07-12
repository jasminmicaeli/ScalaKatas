import org.scalatest.funsuite.AnyFunSuite

class SplitStringTest extends AnyFunSuite {

  val ss = new SplitString()

  test("solution should split string into two-letter substrings") {
    val inputString = "asdfadsf"
    val expected = List("as", "df", "ad", "sf")
    val actual = ss.solution(inputString)
    assert(actual == expected)
  }

  test("solution should handle odd-length input string") {
    val inputString = "abcde"
    val expected = List("ab", "cd", "e_")
    val actual = ss.solution(inputString)
    assert(actual == expected)
  }
}