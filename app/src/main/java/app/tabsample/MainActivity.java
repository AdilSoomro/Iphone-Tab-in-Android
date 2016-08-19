package app.tabsample;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import app.tabsample.fragments.HomeFragment;
import app.tabsample.fragments.SearchFragment;
import app.tabsample.legacy.TabSample;


/**
 * @author Adil Soomro
 *
 */
public class MainActivity extends AppCompatActivity {
	/** Called when the activity is first created. */
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		int[] icons = {R.drawable.tab_home,
				R.drawable.tab_search,
				R.drawable.tab_home,
				R.drawable.tab_search
		};
		TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
		ViewPager viewPager = (ViewPager) findViewById(R.id.main_tab_content);

		setupViewPager(viewPager);


		tabLayout.setupWithViewPager(viewPager);

		for (int i = 0; i < icons.length; i++) {
			tabLayout.getTabAt(i).setIcon(icons[i]);
		}
		tabLayout.getTabAt(0).select();
	}

	private void setupViewPager(ViewPager viewPager) {
		ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
		adapter.insertNewFragment(new HomeFragment());
		adapter.insertNewFragment(new SearchFragment());
		adapter.insertNewFragment(new HomeFragment());
		adapter.insertNewFragment(new SearchFragment());
		viewPager.setAdapter(adapter);
	}

	class ViewPagerAdapter extends FragmentPagerAdapter {
		private final List<Fragment> mFragmentList = new ArrayList<>();
		public ViewPagerAdapter(FragmentManager manager) {
			super(manager);
		}

		@Override
		public Fragment getItem(int position) {
			return mFragmentList.get(position);
		}

		@Override
		public int getCount() {
			return mFragmentList.size();
		}

		public void insertNewFragment(Fragment fragment) {
			mFragmentList.add(fragment);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = this.getMenuInflater();
		inflater.inflate(R.menu.main_activity, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {

			case R.id.action_settings:
				Intent settingsIntent = new Intent(this, TabSample.class);
				startActivity(settingsIntent);
			default:
				return super.onOptionsItemSelected(item);
		}
	}

}