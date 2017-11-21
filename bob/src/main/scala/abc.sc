

val b = ", "

b.matches("(^(\\d*)((,\\s){0,1}))*")

val c = "4?"

c.matches("^((\\d)((,\\s){0,1}))*")

val d = "2, 3, 4"

d == d.toUpperCase

val e = ""

e.isEmpty || e.trim.isEmpty

(1 until 10).toList.filter(x => x % 3 == 0)



def multiples(num: Int, limit: Int): List[Int] = {
  (0 until limit).toList.filter(x => x % num == 0)
}

multiples(3, 100).foldLeft(0)(_ + _)

multiples(5, 100).foldLeft(0)(_ + _)

1683 + 950


case class Year(year: Int){
  def isLeap: Boolean = {
    if(year % 4 == 0 )
      if(!(year % 100 == 0))
        year % 400 == 0
  }
}


Year(1996).isLeap
