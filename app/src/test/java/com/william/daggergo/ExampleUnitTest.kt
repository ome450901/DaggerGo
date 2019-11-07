package com.william.daggergo

import com.william.daggergo.model.DaggerCarGraph
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testSingleton() {
        val carGraph = DaggerCarGraph.create()
        val car = carGraph.car()
        val car2 = carGraph.car()

        assert(car == car2)
    }
}
