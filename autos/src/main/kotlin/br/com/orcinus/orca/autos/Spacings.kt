package br.com.orcinus.orca.autos

/**
 * Sizes for spacing, such as the distance between one component and another or padding.
 *
 * @param extraLarge Greatest possible size.
 * @param large Smaller than [extraLarge], greater than [medium].
 * @param medium Smaller than [large], greater than [small].
 * @param small Smaller than [medium], greater than [extraSmall].
 * @param extraSmall Smallest possible size.
 */
data class Spacings
internal constructor(
  val extraLarge: Float,
  val large: Float,
  val medium: Float,
  val small: Float,
  val extraSmall: Float
) {
  companion object {
    /** [Spacings] that should be provided by default. */
    val default = Spacings(extraLarge = 32f, large = 24f, medium = 16f, small = 8f, extraSmall = 4f)
  }
}
