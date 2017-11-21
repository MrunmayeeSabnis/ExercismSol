case class SpaceAge(val seconds: Long) {

  lazy val EARTH_YEAR = 31557600
  lazy val MERCURY_YEAR = 0.2408467 * 31557600
  lazy val VENUS_YEAR = 0.61519726 * 31557600
  lazy val MARS_YEAR = 1.8808158 * 31557600
  lazy val JUPITER_YEAR = 11.862615 * 31557600
  lazy val SATURN_YEAR = 29.447498 * 31557600
  lazy val URANUS_YEAR = 84.016846 * 31557600
  lazy val NEPTUNE_YEAR = 164.79132 * 31557600

  val onEarth: Double = getPreciseAge(EARTH_YEAR)

  val onMercury: Double = getPreciseAge(MERCURY_YEAR)

  val onVenus: Double = getPreciseAge(VENUS_YEAR)

  val onMars: Double = getPreciseAge(MARS_YEAR)

  val onJupiter: Double = getPreciseAge(JUPITER_YEAR)

  val onSaturn: Double = getPreciseAge(SATURN_YEAR)

  val onUranus: Double = getPreciseAge(URANUS_YEAR)

  val onNeptune: Double = getPreciseAge(NEPTUNE_YEAR)


  def getPreciseAge(planetYear: Double): Double = {
    val age: Double = scala.math.abs(seconds.toDouble / planetYear)
    BigDecimal(age).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }
}
