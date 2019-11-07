package com.william.daggergo.model

import javax.inject.Scope

/**
 * @author WeiYi Yu
 * @date 2019-11-07
 */

/**
 * Create a custom scope
 * objects in the same scope would be created only once (to achieve singleton)
 */
@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class CustomScope
