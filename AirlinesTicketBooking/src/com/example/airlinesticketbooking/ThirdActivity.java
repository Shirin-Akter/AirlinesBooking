package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends Activity{
	EditText username;
	EditText password;
	EditText mail;
	EditText phone;
	DatabaseHandler handler;
	//SQLiteDatabase db;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main3);
		username=(EditText)findViewById(R.id.editname);
		mail=(EditText)findViewById(R.id.editText2);
		password=(EditText)findViewById(R.id.editpassword);
		phone=(EditText)findViewById(R.id.editText4);
}
	public void meth_reg1(View v)
	{
		String getUsername=username.getText().toString();
		String getMail=mail.getText().toString();
		String getPassword=password.getText().toString();
		String getPhone=phone.getText().toString();
		handler=new DatabaseHandler(getBaseContext());
		handler.insertData(getUsername, getMail, getPassword, getPhone);
		Toast.makeText(getApplicationContext(), "you are registered successfully", Toast.LENGTH_LONG).show();
	
		
		
	}
	public void register_log(View v)
	{
		Intent in=new Intent(ThirdActivity.this,MainRegister.class);
		startActivity(in);
		this.finish();
	}
}
