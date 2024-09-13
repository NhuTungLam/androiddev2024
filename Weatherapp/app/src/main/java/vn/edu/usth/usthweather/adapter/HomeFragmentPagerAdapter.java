package vn.edu.usth.usthweather.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import vn.edu.usth.usthweather.ForecastFragment;
import vn.edu.usth.usthweather.WeatherAndForecastFragment;
import vn.edu.usth.usthweather.WeatherFragment;

public class HomeFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public int getCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Trả về một WeatherAndForecastFragment cho mỗi tab
        return WeatherAndForecastFragment.newInstance();
    }
    @Override
    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }
}
