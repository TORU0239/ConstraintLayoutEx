package my.com.toru.constraintlayoutex

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.elements_for_constraint.*

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        btn_chain.setOnClickListener{

        }

        btn_guide.setOnClickListener {

        }

        btn_dimension.setOnClickListener {
        }
    }
}
