case class Year(year: Int){

  def isLeap: Boolean = {
    (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))
  }

}


