class DisemvowelTrolls {
  def removeVowels(given: String) : String = given.filterNot("aeiouAEIOU".toCharArray.contains).mkString
}
