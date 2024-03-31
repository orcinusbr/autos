package br.com.orcinus.orca.autos.overlays

/**
 * Portions of the UI taken by an element that's hierarchically higher.
 *
 * @param fab [Margins] consumed by the FAB.
 */
data class Overlays internal constructor(val fab: Margins) {
  companion object {
    /** [Overlays] that should be provided by default. */
    val default = Overlays(fab = Margins(bottom = 16f))
  }
}
