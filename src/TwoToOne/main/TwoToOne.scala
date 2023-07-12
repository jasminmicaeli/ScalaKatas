class TwoToOne {
  def longest(first: String, second: String): String = (first + second).sorted.distinct
}
