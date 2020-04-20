package jm.perez.themovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jm.perez.themovieapp.adapters.MoviesPageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.configureFragments()
    }

    fun configureFragments()  {
        viewPager.adapter = MoviesPageAdapter(this)
    }
}
