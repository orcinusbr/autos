package com.jeanbarrossilva.orca.autos.iconography

/**
 * [Icon]s and IDs of icons that can be used throughout the app within various contexts.
 *
 * @param add ID of the icon that conveys the idea of addition or concatenation.
 * @param back ID of the icon that represents back navigation.
 * @param comment [Icon] of a comment.
 * @param compose [Icon] for creation scenarios.
 * @param edit [Icon] that implies editing.
 * @param empty ID of the icon that characterizes emptiness.
 * @param expand ID of the icon for communicating possibility of expansion.
 * @param delete [Icon] that suggests deletion.
 * @param favorite [Icon] that signalizes a single or various "like" demonstrations.
 * @param forward ID of the icon that represents forward navigation.
 * @param home [Icon] that portrays the start page.
 * @param link ID of the icon for representing links.
 * @param login ID of the icon that resembles a login action.
 * @param mute [Icon] that refers to a muted notifications.
 * @param profile [Icon] that symbolizes the user's or someone else's account.
 * @param repost ID of the icon for a single or various reposts.
 * @param search ID of the icon that indicates the ability to search or the performance of such
 *   operation for elements in a given context.
 * @param selected ID of the icon for selected states.
 * @param send ID of the icon that denotes a send operation.
 * @param settings [Icon] for configurations.
 * @param share [Icon] for sharing.
 * @param unavailable [Icon] for unavailable resources.
 */
data class Iconography
internal constructor(
  val add: String,
  val back: String,
  val comment: Icon,
  val compose: Icon,
  val delete: Icon,
  val edit: Icon,
  val empty: String,
  val expand: String,
  val favorite: Icon,
  val forward: String,
  val home: Icon,
  val link: String,
  val login: String,
  val mute: Icon,
  val profile: Icon,
  val repost: String,
  val search: String,
  val selected: String,
  val send: String,
  val settings: Icon,
  val share: Icon,
  val unavailable: Icon
) {
  companion object {
    /** [Iconography] that's provided by default. */
    val default =
      Iconography(
        "add",
        "back",
        Icon("comment-outlined", "comment-filled"),
        Icon("compose-outlined", "compose-filled"),
        Icon("delete-outlined", "delete-filled"),
        Icon("edit-outlined", "edit-filled"),
        "empty",
        "expand",
        Icon("favorite-outlined", "favorite-filled"),
        "forward",
        Icon("home-outlined", "home-filled"),
        "link",
        "login",
        Icon("mute-outlined", "mute-filled"),
        Icon("profile-outlined", "profile-filled"),
        "repost",
        "search",
        "selected",
        "send",
        Icon("settings_outlined", "settings_filled"),
        Icon("share_outlined", "share_filled"),
        Icon("unavailable_outlined", "unavailable_filled")
      )
  }
}
