package AngelDabnee.com

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val logo = findViewById<ImageView>(R.id.imagenLogo)

        logo.setOnClickListener()
        {
            var i = Intent(this,AuthActivity::class.java)
            startActivity(i)
            finish()
            //Toast.makeText(this,"Pique al logo",Toast.LENGTH_SHORT).show()
        }
    }
}