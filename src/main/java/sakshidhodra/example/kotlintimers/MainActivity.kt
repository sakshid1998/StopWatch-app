package sakshidhodra.example.kotlintimers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object: CountDownTimer(10000,1000)
        {
            override fun onFinish() {
                Toast.makeText(applicationContext, "Time is Off", Toast.LENGTH_SHORT).show()
                textView.text="Left: 0"

            }

            override fun onTick(p0: Long) {
                textView.text="Left: "+p0/1000

            }

        }
            .start()
    }
}