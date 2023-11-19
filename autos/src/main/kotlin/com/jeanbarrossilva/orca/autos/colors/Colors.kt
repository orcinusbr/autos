package com.jeanbarrossilva.orca.autos.colors

import com.jeanbarrossilva.orca.autos.colors.contrast.Contrast
import com.jeanbarrossilva.orca.autos.colors.contrast.on

/** [Contrast]s and colors that compose the palette to be used by the application. */
enum class Colors {
  LIGHT {
    override val activation = Activation.default
    override val background = 0xFF000000 on 0xFFFFFFFF
    override val disabled = 0xFF050505 on 0xFFEDEDED
    override val error = 0xFFFFFFFF on 0xFFE15050
    override val link = 0xFF10A9FF
    override val placeholder = 0xFFF5F5F5
    override val primary = 0xFFFFFFFF on 0xFF000000
    override val secondary = 0xFF5B5B5B
    override val surface = secondary on 0xFFFFFFFF
    override val tertiary = 0xFFAFAFAF
  },
  DARK {
    override val activation = Activation.default
    override val background = 0xFFFFFFFF on 0xFF0B0B0B
    override val disabled = 0xFFE5E5E5 on 0xFF3E3E3E
    override val error = 0xFFFFFFFF on 0xFFE15050
    override val link = 0xFF10A9FF
    override val placeholder = 0xFF3E3E3E
    override val primary = 0xFF000000 on 0xFFFFFFFF
    override val secondary = 0xFFA0A0A0
    override val surface = secondary on 0xFF1A1A1A
    override val tertiary = 0xFF757575
  };

  /** [Activation] for representing various activation states. */
  abstract val activation: Activation

  /** [Contrast] for the overall background. */
  abstract val background: Contrast

  /** [Contrast] for components in a disabled state. */
  abstract val disabled: Contrast

  /** [Contrast] for error states. */
  abstract val error: Contrast

  /** Color for links. */
  abstract val link: Long

  /** Color for components that indicate loading content. */
  abstract val placeholder: Long

  /** [Contrast] for primary components. */
  abstract val primary: Contrast

  /** Color for secondary components. */
  abstract val secondary: Long

  /** [Contrast] for on-background or nested containers. */
  abstract val surface: Contrast

  /** Color for tertiary components. */
  abstract val tertiary: Long
}
