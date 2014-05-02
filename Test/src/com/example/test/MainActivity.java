package com.example.test;

import com.appgate.homeland.BaseActivity;

import android.media.audiofx.BassBoost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;
import static com.nineoldandroids.view.ViewPropertyAnimator.animate;
public class MainActivity extends BaseActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView sas = (TextView)findViewById(R.id.sas);
		animate(sas).alpha(0).alphaBy(1).setDuration(2000).start();
	
	}


}
