package com.jeanbarrossilva.orca.autos.colors

/**
 * Colors representing activation states.
 *
 * @param favorite Color for an active "favorite" state.
 * @param reposted Color for an active "repost" state.
 */
data class Activation internal constructor(val favorite: Long?, val reposted: Long?) {
  companion object {
    /** [Activation] that's provided by default. */
    val default = Activation(favorite = 0xFFD32F2F, reposted = 0xFF81C784)
  }
}
