package com.study.exam02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onCreate() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onCreate()	ȣ���");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_activity);
		
		
		
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v)
			{
				finish();
			}
		});
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onStart() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onStart()	ȣ���");
		super.onStart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onResume() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onResume()	ȣ���");
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onPause() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onPause()	ȣ���");
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onStop() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onStop()	ȣ���");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onDestroy() ȣ���", Toast.LENGTH_SHORT).show();
		Log.d("Study", "onDestroy()	ȣ���");
		super.onDestroy();
	}

}
