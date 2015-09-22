package sample

import org.junit.Test
import sample.Stuff

/**
 * Created by Rodrigo Quesada on 02/10/15.
 */
class StuffTest {

    @Test
    fun testDoSomething() {
        val stuff: Stuff = Stuff()
        stuff.doSomething()
    }
}