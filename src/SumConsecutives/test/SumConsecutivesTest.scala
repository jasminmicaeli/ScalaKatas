import org.scalatest.funsuite.AnyFunSuite

class SumConsecutivesTest extends AnyFunSuite {
  test("test 1"){
    val sct = new SumConsecutives()
    val given = List(1, 1, 2, 2, 3)
    val expected = List(2, 4, 3)
    val actual = sct.sumConsecutives(given)
    assert(expected == actual)
  }
  test("test 2"){
    val sct = new SumConsecutives()
    val given = List(1, 1, 7, 7, 3)
    val expected = List(2, 14, 3)
    val actual = sct.sumConsecutives(given)
    assert(expected == actual)
  }
  test("test 3"){
    val sct = new SumConsecutives()
    val given = List(-5,-5,7,7,12,0)
    val expected = List(-10,14,12,0)
    val actual = sct.sumConsecutives(given)
    assert(expected == actual)
  }
}
