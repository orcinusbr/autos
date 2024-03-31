package br.com.orcinus.autos.forms

/**
 * [Form]s by which UI components throughout the application are shaped.
 *
 * @param large [Form] for large components.
 * @param medium [Form] for medium-sized components
 * @param small [Form] for small components.
 */
data class Forms internal constructor(val large: Form, val medium: Form, val small: Form) {
  companion object {
    /** [Forms] that should be provided by default. */
    val default =
      Forms(
        large = Form.PerCorner.all(12f),
        medium = Form.PerCorner.all(24f),
        small = Form.Percent(1f)
      )
  }
}
