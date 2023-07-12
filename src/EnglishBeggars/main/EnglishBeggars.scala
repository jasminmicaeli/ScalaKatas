class EnglishBeggars {
  def beggars(values: List[Int], n: Int): List[Int] = {
    if (values.isEmpty || n == 0) List.empty
    else {
      val beggarSums = Array.fill(n)(0)
      values.zipWithIndex.foreach { case (value, index) =>
        beggarSums(index % n) += value
      }
      beggarSums.toList
    }
  }
}
