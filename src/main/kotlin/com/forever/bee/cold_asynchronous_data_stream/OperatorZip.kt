/**
 * Operators in Flow: zip
 * @author Nguyen Truong Thinh
 * @since Kotlin 1.6 - Java 1.8 (Java 8)
 * Contact me: nguyentruongthinhvn2020@gmail.com || +84393280504
 * */
package com.forever.bee.cold_asynchronous_data_stream

import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = launch {
        getUnitValues().zip(getIngredients()) { unit, ingredient ->
            "+ $unit: $ingredient"
        }
            .collect {
                println(it)
            }
    }
    job.join()
}