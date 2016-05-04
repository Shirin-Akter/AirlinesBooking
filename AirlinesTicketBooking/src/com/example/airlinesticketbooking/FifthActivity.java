package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FifthActivity extends Activity implements OnItemSelectedListener{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5);
		
		Spinner sdate=(Spinner)findViewById(R.id.spinnerdate);
		Spinner stime=(Spinner)findViewById(R.id.spinnertime);
		Spinner sadult=(Spinner)findViewById(R.id.spinneradult);
		Spinner schild=(Spinner)findViewById(R.id.spinnerchild);
		
		sdate.setOnItemSelectedListener(this);
		stime.setOnItemSelectedListener(this);
		sadult.setOnItemSelectedListener(this);
		schild.setOnItemSelectedListener(this);
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	    R.array.Date, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
	    ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
	    R.array.Time, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    
	    ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
	    R.array.Adult, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    
	    ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
	    R.array.Child, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    
	 // Apply the adapter to the spinner
	 		sdate.setAdapter(adapter);
	 		stime.setAdapter(adapter1);
	 		sadult.setAdapter(adapter2);
	 		schild.setAdapter(adapter3);
}
	
	
	public void onItemSelected(AdapterView<?> parent, View view, 
            int pos, long id)
	{
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }
	  public void onNothingSelected(AdapterView<?> parent)
	{
	        // Another interface callback
	}
	  public void meth_booking(View v)
	{
			Intent in=new Intent(FifthActivity.this,SixthActivity.class);
			startActivity(in);
			this.finish();
	}
	  
	 
}
