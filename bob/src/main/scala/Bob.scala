
class Bob {

  lazy val YELLED_AT_RESPONSE = "Whoa, chill out!"
  lazy val QUESTION_RESPONSE = "Sure."
  lazy val SILENCE_RESPONSE = "Fine. Be that way!"
  lazy val ANYTHING_ELSE_RESPONSE = "Whatever."

  def hey1(statement: String): String = statement match {
    case a if(isSilent(a)) => SILENCE_RESPONSE
    case a if(question(a)) => QUESTION_RESPONSE
    case a if(yelledAt(a)) => YELLED_AT_RESPONSE
    case _ => ANYTHING_ELSE_RESPONSE
  }

  def question(statement: String) = statement.toCharArray.last == '?' && (!yelledAt(statement))

  def isSilent(statement: String) = statement.isEmpty || statement.trim.isEmpty

  def yelledAt(statement: String) = (statement == statement.toUpperCase) && (statement != statement.toLowerCase)

}
