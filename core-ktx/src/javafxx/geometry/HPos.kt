@file:Suppress("NOTHING_TO_INLINE")

package javafxx.geometry

import javafx.geometry.HPos
import javafx.geometry.Pos
import javafx.geometry.VPos
import javafxx.internal.Internals

/** Construct a new position given the added vertical position. */
inline operator fun HPos.plus(vpos: VPos): Pos = Internals.posOf(vpos, this)