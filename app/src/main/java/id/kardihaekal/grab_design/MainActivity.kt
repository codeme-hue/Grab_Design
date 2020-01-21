package id.kardihaekal.grab_design

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greeting()
    }

    @SuppressLint("SetTextI18n")
    private fun greeting() {

        val calender:Calendar = Calendar.getInstance()
        val timeOfDay:Int = calender.get(Calendar.HOUR_OF_DAY)
        val greetImg = findViewById<ImageView>(R.id.greeting_img)
        val greetText = findViewById<TextView>(R.id.greeting_text)

        /**
         * the key is here
         * */
        if (timeOfDay >= 0 && timeOfDay < 12){
            greetText.setText("Selamat Pagi\nKardi")
            greetImg.setImageResource(R.drawable.img_default_half_morning)
        } else if (timeOfDay >= 12 && timeOfDay < 15) {
            greetText.setText("Selamat Siang\nKardi")
            greetImg.setImageResource(R.drawable.img_default_half_afternoon)
        } else if (timeOfDay >= 15 && timeOfDay < 18) {
            greetText.setText("Selamat Sore\nKardi")
            greetImg.setImageResource(R.drawable.img_default_half_without_sun)
        } else if (timeOfDay >= 18 && timeOfDay < 24) {
            greetText.setText("Selamat Malam\nKardi")
            greetText.setTextColor(Color.WHITE)
            greetImg.setImageResource(R.drawable.img_default_half_night)
        }
    }

}
