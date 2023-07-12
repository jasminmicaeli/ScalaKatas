class SumConsecutives {

  def sumConsecutives(xs: List[Int]): List[Int] = {
    def helper(list: List[Int]): List[Int] = list match {
      case Nil => Nil
      case x :: Nil => List(x)
      case x :: y :: tail if x == y =>
        val updatedList = helper(y :: tail)
        (x + updatedList.head) :: updatedList.tail
      case x :: tail => x :: helper(tail)
    }
    helper(xs)
  }
}
