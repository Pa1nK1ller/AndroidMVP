package com.example.androidmvp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidmvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)
    private var _vb: ActivityMainBinding? = null
    private val vb get() = _vb!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)
        presenter.initButtons()
        vb.btnCounter1.setOnClickListener { presenter.clickFirstCounter() }
        vb.btnCounter2.setOnClickListener { presenter.clickSecondCounter() }
        vb.btnCounter3.setOnClickListener { presenter.clickThirdCounter() }
    }

    override fun setTextFirstButton(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setTextSecondButton(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setTextThirdButton(text: String) {
        vb.btnCounter3.text = text
    }

    override fun onDestroy() {
        super.onDestroy()
        _vb = null
    }
}