package com.coptercontorl.user;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.*;
import android.widget.AdapterView.*;
import android.widget.*;
import android.view.*;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
		if (!(networkInfo != null && networkInfo.isConnected())) {
		    //send network not connected dialog
		    moveTaskToBack(true);
		    finish();
		    android.os.Process.killProcess(android.os.Process.myPid());
		}
		Button up = (Button) findViewById(R.id.up);
		up.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
		Button down = (Button) findViewById(R.id.down);
		down.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
		Button left = (Button) findViewById(R.id.left);
		left.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
		Button right = (Button) findViewById(R.id.right);
		right.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
		Button front = (Button) findViewById(R.id.front);
		front.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
		Button back = (Button) findViewById(R.id.back);
		back.setOnClickListener(
			new View.OnClickListener() {
				public void onClick(View v) {
					// Perform action on click
				}
			}
		);
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
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
