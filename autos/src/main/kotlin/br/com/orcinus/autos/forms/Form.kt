package br.com.orcinus.autos.forms

/** Form by which a UI component is shaped. */
sealed interface Form {
  /**
   * Indicates that each corner should be rounded individually.
   *
   * @param topStart Amount of rounding to be applied to the top start.
   * @param topEnd Amount of rounding to be applied to the top end.
   * @param bottomEnd Amount of rounding to be applied to the bottom end.
   * @param bottomStart Amount of rounding to be applied to the bottom start.
   */
  data class PerCorner(
    val topStart: Float,
    val topEnd: Float,
    val bottomEnd: Float,
    val bottomStart: Float
  ) : Form {
    companion object {
      /**
       * Creates a [Form] that indicates that all corners should have the given [amount] of
       * rounding.
       *
       * @param amount Amount of rounding to be applied to all corners.
       */
      internal fun all(amount: Float): PerCorner {
        return PerCorner(
          topStart = amount,
          topEnd = amount,
          bottomEnd = amount,
          bottomStart = amount
        )
      }
    }
  }

  /**
   * Indicates that all four corners should be rounded by [percentage]%.
   *
   * @param percentage Percentage by which the corners should be rounded.
   * @throws IllegalArgumentException If the [percentage] is negative or greater than 1.
   */
  data class Percent @Throws(IllegalArgumentException::class) constructor(val percentage: Float) :
    Form {
    init {
      require(percentage >= 0f) { "Percentage cannot be negative." }
      require(percentage <= 1f) { "Percentage cannot be greater than 1 (100%)." }
    }
  }
}
