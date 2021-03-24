package cbfg.ratingbar

import android.animation.ValueAnimator
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val srbHRating = findViewById<SmartRatingBar>(R.id.srbHRating)

        val valueAnimator = ValueAnimator
            .ofFloat(0.0f, 5.0f, 0f, 5.0f)
            .setDuration(1600L)
        valueAnimator.addUpdateListener { animation ->
            srbHRating.ratingNum = animation.animatedValue as Float
        }
        valueAnimator.start()


        findViewById<SmartRatingBar>(R.id.srbVRating).setOnRatingBarChangeListener { ratingBar, rating ->
            Toast.makeText(this, "rating = $rating", Toast.LENGTH_SHORT).show()
        }
    }
}