package net.robomix.learn.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import butterknife.bindOptionalView

class MainActivity : AppCompatActivity() {

    val tvTitle: TextView? by bindOptionalView(R.id.tvTitle)
    val tvOtherTitle: TextView? by bindOptionalView(R.id.tvOtherTitle)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle?.text = "Test text"
        tvOtherTitle?.text = "Other text"
    }
}
