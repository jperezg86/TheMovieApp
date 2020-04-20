package jm.perez.themovieapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import jm.perez.themovieapp.FavoriteFragment
import jm.perez.themovieapp.RatedFragment
import jm.perez.themovieapp.RecomendationFragment

class MoviesPageAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3;
    }

    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment;
        when (position) {
            0 ->
                fragment =  FavoriteFragment()
            1 ->
                fragment = RecomendationFragment()
            else -> {
                fragment =  RatedFragment()
            }
        }
        return fragment;
    }
}