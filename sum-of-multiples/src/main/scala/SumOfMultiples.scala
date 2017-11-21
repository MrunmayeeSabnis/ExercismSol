object SumOfMultiples {

  def sumOfMultiples(factors: Set[Int], limit: Int): Int = {
    val factorsList: Set[List[Int]] = factors.map(x => multiples(x, limit)).toSet
    factorsList.flatten.foldLeft(0)(_ + _)
  }

  def multiples(num: Int, limit: Int): List[Int] = {
    (0 until limit).toList.filter(x => x % num == 0)
  }

}

