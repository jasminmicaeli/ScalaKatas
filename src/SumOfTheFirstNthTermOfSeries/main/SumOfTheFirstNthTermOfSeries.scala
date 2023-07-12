class SumOfTheFirstNthTermOfSeries {
  def seriesSum(n: Int) : String = {
    def seriesHelper(index: Int, sum: Double): Double = {
      if (index > n) {
        sum
      } else {
        val term = 1.0 / (1 + (index - 1) * 3)
        seriesHelper(index + 1, sum + term)
      }
    }
    val sum : Double = seriesHelper(1, 0.00)
    f"$sum%.2f".replace(",", ".")
  }
}
