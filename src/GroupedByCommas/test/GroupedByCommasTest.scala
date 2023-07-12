import org.scalatest.funsuite.AnyFunSuite

class GroupedByCommasTest extends AnyFunSuite {

  test("must not add comma if n < 10.000") {
    val kata = new GroupedByCommas
    val n = 100
    val actual = kata.groupByCommas(n)
    val expected = "100"

    assert(expected == actual)
  }
  test("adds one comma") {
    val kata = new GroupedByCommas
    val n = 98765
    val actual = kata.groupByCommas(n)
    val expected = "98,765"

    assert(actual == expected)
  }
  test("adds multiple commas") {
    val kata = new GroupedByCommas
    val n = 987654321
    val actual = kata.groupByCommas(n)
    val expected = "987,654,321"

    assert(actual == expected)
  }

}
