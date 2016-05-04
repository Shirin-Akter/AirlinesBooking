package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SixthActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main6);

}
	public void meth_exe(View v)
	{
		Intent in=new Intent(SixthActivity.this,SeventhActivity.class);
		startActivity(in);
		this.finish();
		
	}
	public void Business(View v)
	{
		Intent in=new Intent(SixthActivity.this,SeventhActivity.class);
		startActivity(in);
		this.finish();
		
	}
	public void Economy(View v)
	{
		Intent in=new Intent(SixthActivity.this,SeventhActivity.class);
		startActivity(in);
		this.finish();
	}
}