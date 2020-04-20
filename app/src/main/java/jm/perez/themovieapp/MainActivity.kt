package jm.perez.themovieapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
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
        val tabLayoutMediator : TabLayoutMediator = TabLayoutMediator(tabLayout, viewPager) {
                tab: TabLayout.Tab, i: Int ->
                when(i) {
                    0 ->
                        tab.setIcon(R.drawable.ic_action_favorite).setText("Favorite")
                    1 ->
                        tab.setText("Recommendations").setIcon(R.drawable.ic_action_recomendation)
                    2 ->
                        tab.setText("Rated").setIcon(R.drawable.ic_action_rated)
                }
        }
        tabLayoutMediator.attach()
    }
}
