package com.jeanbarrossilva.orca.autos.borders

/**
 * Stroke around a UI element.
 *
 * @param width Indicates how thick it is.
 * @param color Color by which this [Border] is colored.
 */
data class Border internal constructor(val width: Float, val color: Long?)
