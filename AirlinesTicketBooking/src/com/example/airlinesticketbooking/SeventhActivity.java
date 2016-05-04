package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SeventhActivity extends Activity{
	Button btn,btn1,btn2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main7);
		btn=(Button)findViewById(R.id.button1);

}
	public void seat_done(View v)
	{
		Intent in1 =new Intent(SeventhActivity.this, EighthActivity.class);
		startActivity(in1);
		this.finish();
		
	}
	int click_count=0;
	public void l_one(View v)
	{
		click_count++;
		if (click_count>1)
		{
			Toast.makeText(getApplicationContext(), "seat reserved", Toast.LENGTH_LONG).show();
		}
	}
}
