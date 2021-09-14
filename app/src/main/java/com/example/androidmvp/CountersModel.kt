package com.example.androidmvp

data class CountersModel(
    var first: Int,
    var second: Int,
    var third: Int
) {
    fun incFirst() = ++first
    fun incSecond() = ++second
    fun incThird() = ++third
}