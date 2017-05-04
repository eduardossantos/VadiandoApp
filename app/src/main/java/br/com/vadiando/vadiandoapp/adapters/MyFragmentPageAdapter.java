package br.com.vadiando.vadiandoapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import br.com.vadiando.vadiandoapp.fragments.fragment_a;
import br.com.vadiando.vadiandoapp.fragments.fragment_b;
import br.com.vadiando.vadiandoapp.fragments.fragment_c;

/**
 * Created by Icons4u TI on 04/05/2017.
 */

public class MyFragmentPageAdapter extends FragmentPagerAdapter {

    private String [] mTabTitles;
    public MyFragmentPageAdapter(FragmentManager fm, String[] mTabTitles ) {
        super(fm);
        this.mTabTitles = mTabTitles;

    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new fragment_a();
            case 1:
                return new fragment_b();
            case 2:
                return new fragment_c();
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.mTabTitles[position];
    }
}