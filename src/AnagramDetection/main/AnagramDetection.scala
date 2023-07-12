class AnagramDetection {
  def isAnagram(a: String, b: String): Boolean = a.toLowerCase.sorted == b.toLowerCase.sorted
}
