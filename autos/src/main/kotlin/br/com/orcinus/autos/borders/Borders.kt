package br.com.orcinus.autos.borders

import br.com.orcinus.autos.colors.Colors

/**
 * [Border]s by which components are bordered.
 *
 * @param default [Border] that's the default one.
 */
data class Borders internal constructor(val default: Border) {
  companion object {
    /**
     * Gets the [Borders] that should be provided by default.
     *
     * @param colors [Colors] by which they can be colored.
     */
    fun getDefault(colors: Colors): Borders {
      return Borders(default = Border(width = 2f, colors.placeholder))
    }
  }
}
