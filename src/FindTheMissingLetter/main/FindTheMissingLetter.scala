import scala.annotation.tailrec

class FindTheMissingLetter {
  def findMissingLetter(chars: Array[Char]): Char = {
    val isUpperCase = chars(0).isUpper
    val alphabet = if (isUpperCase) 'A' to 'Z' else 'a' to 'z'

    @tailrec
    def helperFunc(alphIndex: Int, wordIndex: Int): Char = {
      if (alphabet(alphIndex) != chars(wordIndex)) {
        alphabet(alphIndex)
      } else {
        helperFunc(alphIndex + 1, wordIndex + 1)
      }
    }
    val alphabetIndex = alphabet.indexOf(chars(0))
    helperFunc(alphabetIndex, 0)
  }
}