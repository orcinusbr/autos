package com.jeanbarrossilva.orca.autos.colors.contrast

/**
 * Holds two contrasting colors, one for a background and the other for the content over it.
 *
 * @param container Color to color a container with.
 * @param content Color to color the content with.
 */
data class Contrast internal constructor(val container: Long?, val content: Long?)
