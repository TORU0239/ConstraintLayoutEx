package my.com.toru.constraintlayoutex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.elements_for_constraint.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.elements_for_constraint)
        btn_chain.setOnClickListener {
            startActivity(Intent(this@MainActivity, ChainEx::class.java))
        }

        btn_guide.setOnClickListener {

        }

        btn_dimension.setOnClickListener {
        }
    }
}
