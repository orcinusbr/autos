package br.com.orcinus.autos.overlays

/**
 * Additional space added to a UI component.
 *
 * @param start Amount at either the left (RTL) or the right (LTR).
 * @param top Amount at the top.
 * @param end Amount at the right (RTL) or the left (LTR).
 * @param bottom Amount at the bottom.
 */
data class Margins
internal constructor(
  val start: Float = 0f,
  val top: Float = 0f,
  val end: Float = 0f,
  val bottom: Float = 0f
)
