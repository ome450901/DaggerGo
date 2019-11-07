package com.william.daggergo.model

import javax.inject.Inject

/**
 * @author WeiYi Yu
 * @date 2019-11-07
 */
@CustomScope
class Car @Inject constructor(val engine: Engine, val tire: Tire)