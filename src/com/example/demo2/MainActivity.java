package com.example.demo2;

import android.R.integer;
import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.provider.MediaStore.Images;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterViewFlipper;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ProgressWheel wheel = (ProgressWheel) findViewById(R.id.pw_spinner);
		wheel.setProgress(180);//设置进度a
	    wheel.incrementProgress();//增加进度
	}
}
