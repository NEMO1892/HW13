package com.example.hw13

import kotlin.random.Random

open class Task2(
    private var age: Int,
    private var weight : Int
    ) {
    fun setAge(){
        this.age = Random.nextInt(0, 100)
    }
    fun setWeight(){
        this.weight = Random.nextInt(0,300)
    }
    fun getAge(): Int{
        return age
    }
    fun getWeight(): Int{
        return weight
    }
}

