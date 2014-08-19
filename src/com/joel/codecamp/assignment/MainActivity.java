package com.joel.codecamp.assignment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final TextView textView = (TextView) findViewById(R.id.tv);
		Button button = (Button) findViewById(R.id.bbutton);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				DisplayMetrics metrics = new DisplayMetrics();
				Display mDisplay = MainActivity.this.getWindowManager().getDefaultDisplay();getWindowManager().getDefaultDisplay().getMetrics(metrics);
				float screenDensity = metrics.density;
				float screenDensityDPI = metrics.densityDpi;
				int width = mDisplay.getWidth();
				int height = mDisplay.getHeight();
				Log.e("Density:", String.valueOf(screenDensity + screenDensityDPI));
				textView.setText("Device Density = "  + screenDensity + "\nHeight = " + height + "\nWidth = " + width);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(getApplicationContext(), "CodeCamp14 is Awesome", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
