package raum.muchbeer.kotbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

 private val mOnNavigationItemItemListener= BottomNavigationView.OnNavigationItemSelectedListener {
     item ->
     when (item.itemId) {
         R.id.home -> {
             message.setText("Home")
             return@OnNavigationItemSelectedListener true
         }

         R.id.dashboard -> {
             message.setText("Dashboard")
             return@OnNavigationItemSelectedListener true
         }

         R.id.notification -> {
             message.setText("Notification")
             return@OnNavigationItemSelectedListener true
         }
     }
     false
 }
      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        message.setOnClickListener { _->
            startActivity(Intent(this, SearchActivity::class.java))
        }

     bottom_nav.setOnNavigationItemSelectedListener(mOnNavigationItemItemListener)
    }
}
