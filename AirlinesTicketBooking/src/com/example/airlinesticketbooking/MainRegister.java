package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainRegister extends Activity {

	//DatabaseHandler handler;
	DatabaseHandler handler=new DatabaseHandler(this);
	EditText et,et1,et2;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main2);
			et=(EditText)findViewById(R.id.editText1);
		//	et1=(EditText)findViewById(R.id.editText2);
			et2=(EditText)findViewById(R.id.editText3);
			
		}
		public void meth_log(View v)
		{
			
			String userName=et.getText().toString();
			String password=et2.getText().toString();
			handler.open();
			String storedpass=handler.getSinlgeEntry(userName);
			handler.close();
			
			if(userName.equals("")&&password.equals(""))
			{
				Toast.makeText(getApplicationContext(), "field empty", Toast.LENGTH_LONG).show();
			}
			
		   if(storedpass.equals(password))
			{
				 Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
				    Intent in=new Intent(MainRegister.this,FourthActivity.class);
				    startActivity(in);
				    this.finish();
			}
			else
			{
				Toast.makeText(getApplicationContext(), "User Name and Does Not Matches", Toast.LENGTH_LONG).show();
			}
			
		}
			
		public void meth_reg(View v)
		{
		    Intent in=new Intent(MainRegister.this, ThirdActivity.class);
			startActivity(in);
			this.finish();
		}

}
