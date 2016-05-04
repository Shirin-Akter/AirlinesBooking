package com.example.airlinesticketbooking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FourthActivity extends Activity implements OnItemSelectedListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);
		
		Spinner spinner1=(Spinner)findViewById(R.id.spinner1);
		Spinner spinner2=(Spinner)findViewById(R.id.spinner2);
		Spinner spinner3=(Spinner)findViewById(R.id.spinner3);
		Spinner spinner4=(Spinner)findViewById(R.id.spinner4);
		
	    spinner1.setOnItemSelectedListener(this);
	    spinner2.setOnItemSelectedListener(this);
	    spinner3.setOnItemSelectedListener(this);
	    spinner4.setOnItemSelectedListener(this);
	    
	    
		
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	    R.array.Country_frst, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
	    R.array.City_list, android.R.layout.simple_spinner_item);
	    adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    
	    
		
		// Apply the adapter to the spinner
		spinner1.setAdapter(adapter);
		spinner2.setAdapter(adapter1);
		spinner3.setAdapter(adapter);
		spinner4.setAdapter(adapter1);
		
	   

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
	  
	  public void meth_ok(View v)
	  {
		  Intent in =new Intent(FourthActivity.this,FifthActivity.class);
		  startActivity(in);
		  this.finish();
	  }
	
	 
}
