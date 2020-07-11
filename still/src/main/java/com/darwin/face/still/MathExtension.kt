package com.darwin.face.still

import kotlin.math.roundToInt

/**
 * The class MathExtension
 *
 * @author Darwin Francis
 * @version 1.0
 * @since 09 Jul 2020
 */
internal fun Double.roundDouble(): Double {
    return (this * 1000.0).roundToInt() / 1000.0
}

internal fun Float.roundFloat(): Float {
    return (this * 1000.0).roundToInt() / 1000.0f
}