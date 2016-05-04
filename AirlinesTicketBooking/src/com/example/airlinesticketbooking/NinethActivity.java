package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NinethActivity extends Activity{
	EditText et,et1,et2;
	DatabaseHandler handler;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main9);
		et=(EditText)findViewById(R.id.editText1);
		et1=(EditText)findViewById(R.id.editText2);
		et2=(EditText)findViewById(R.id.editText3);
		}
	public void log_out(View v)
	{
		Intent in=new Intent(NinethActivity.this, MainRegister.class);
		startActivity(in);
		this.finish();
	}
    public void Confirm(View v)
    {
    	String cardName=et.getText().toString();
    	String cardNumber=et1.getText().toString();
    	String expirationDate=et2.getText().toString();
    	handler=new DatabaseHandler(getBaseContext());
    	handler.insertCardData(cardName,cardNumber,expirationDate);
    	Toast.makeText(getApplicationContext(), "Congratulations! your ticket is booked", Toast.LENGTH_LONG).show();
    	
    }
}
