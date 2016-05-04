package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EighthActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main8);
	}
   public void masterCard(View v)
   {
	   Intent in=new Intent(EighthActivity.this,NinethActivity.class);
	   startActivity(in);
	   this.finish();
   }
   public void visaCard(View v)
   {
	   Intent in=new Intent(EighthActivity.this,NinethActivity.class);
	   startActivity(in);
	   this.finish();
   }
 
   public void cancel(View v)
   {
	   Intent in=new Intent(EighthActivity.this,MainActivity.class);
	   startActivity(in);
	   this.finish();
   }
   
   
   
}
