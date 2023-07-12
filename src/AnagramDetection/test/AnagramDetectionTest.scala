import org.scalatest.funsuite.AnyFunSuite

class AnagramDetectionTest extends AnyFunSuite {

  test("test1") {
    val ad = new AnagramDetection()
    val actual = ad.isAnagram("jmnsai", "jasmin")

    assert(actual)
  }

  test("test2") {
    val ad = new AnagramDetection()
    val actual = ad.isAnagram("eHlol", "hello")

    assert(actual)
  }

}
