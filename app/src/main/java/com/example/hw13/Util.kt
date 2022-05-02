package com.example.hw13

class Util(
    private var man : HeirOfTask2
) {
    fun sumOfAgeAndWeight(man: HeirOfTask2) : Int = man.getAge() + man.getWeight()
}