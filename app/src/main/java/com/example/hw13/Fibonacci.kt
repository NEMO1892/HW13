package com.example.hw13

import java.util.*
import kotlin.collections.ArrayList

fun fibonacci() {
    println("Если вы хотите посчитать через массивы - нажмите 1, если через рекурсию - нажмите 2")
    val scanner = Scanner(System.`in`)
    while (true) {
        when (scanner.nextInt()) {
            1 -> {
                val arr: Array<Int?> = arrayOfNulls(30)
                arr[0] = 0
                arr[1] = 1
                println("${arr[0]}  \n${arr[1]}")
                for (i in 2..arr.size) {
                    arr[i] = arr[i - 1]!! + arr[i - 2]!!
                    println("${arr[i]} ")
                    if (i == 19) return
                }
            }
            2 -> {
                for (i in 1..19) {
                    println((getFibonacci(i)))
                }
                return
            }
            else -> {
               println("Ты выбрал что-то не то! \n попробуй ещё раз: ")
            }
        }
    }
}

fun getFibonacci(n: Int): Int {
    return if (n == 0) {
        0
    } else if (n == 1 || n == 2) {
        1
    } else {
        getFibonacci(n - 1) + getFibonacci(n - 2)
    }
}