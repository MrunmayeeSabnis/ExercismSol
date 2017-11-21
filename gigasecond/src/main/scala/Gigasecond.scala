import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime, ZoneId, ZoneOffset}

object Gigasecond {

  val gigSeconds = 1000000000L

  def addGigaseconds(startDate: LocalDate): LocalDateTime = startDate.atStartOfDay().plusSeconds(gigSeconds)

  def addGigaseconds(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(gigSeconds)

}
