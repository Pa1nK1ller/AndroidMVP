package com.example.androidmvp

class MainPresenter(
    private val view: MainView,
) {
    private val model = CountersModel(0, 0, 0)

    fun clickFirstCounter() {
        view.setTextFirstButton(model.incFirst().toString())
    }

    fun clickSecondCounter() {
        view.setTextSecondButton(model.incSecond().toString())
    }

    fun clickThirdCounter() {
        view.setTextThirdButton(model.incThird().toString())
    }

    fun initButtons() {
        view.setTextFirstButton(model.first.toString())
        view.setTextSecondButton(model.second.toString())
        view.setTextThirdButton(model.third.toString())
    }
}