class GroupedByCommas {
  def groupByCommas(n: Int): String = n.toString.reverse.grouped(3).mkString(",").reverse
}
