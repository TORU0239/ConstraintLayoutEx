package my.com.toru.constraintlayoutex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_second)

        Log.w("Toru", "ProxyTest result : ${ProxyTest().testRunProxy()}")
    }
}
