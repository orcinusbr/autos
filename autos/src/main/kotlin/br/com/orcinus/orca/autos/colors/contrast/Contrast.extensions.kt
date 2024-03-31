package br.com.orcinus.orca.autos.colors.contrast

/**
 * Creates a [Contrast] with the two contrasting colors, with the receiver being the content one.
 *
 * @param containerColor Color to color the container with.
 */
internal infix fun Long?.on(containerColor: Long?): Contrast {
  return Contrast(containerColor, this)
}
