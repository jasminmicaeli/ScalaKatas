import org.scalatest.funsuite.AnyFunSuite

class SumOfTheFirstNthTermOfSeriesTest extends AnyFunSuite {

  test("test1") {
    val kata = new SumOfTheFirstNthTermOfSeries()
    val n = 5
    val actual = kata.seriesSum(n)

    assert("1.57" == actual)
  }

  test("test2") {
    val kata = new SumOfTheFirstNthTermOfSeries()
    val n = 10
    val actual = kata.seriesSum(n)

    assert("1.81" == actual)
  }
}
