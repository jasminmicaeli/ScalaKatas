class SplitString {
  def solution(s: String): List[String] = {
    var word = s
    if (s.length % 2 != 0) {
      word = word + "_"
    }
    word.sliding(2, 2).toList
  }
}
