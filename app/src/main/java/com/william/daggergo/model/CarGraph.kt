package com.william.daggergo.model

import dagger.Component

/**
 * @author WeiYi Yu
 * @date 2019-11-07
 */
@CustomScope
@Component
interface CarGraph {
    fun car(): Car
}