package org.data.agroassistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SimpleCursorAdapter;

public class AreaSearch extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.area_search);
	    
	    final RadioGroup rdg_area = (RadioGroup) findViewById(R.id.rdgrp_asearch);
	    //final EditText edt_farmer_search = (EditText) findViewById(R.id.edt_area_search);
	    final AutoCompleteTextView edt_farmer_search = (AutoCompleteTextView) findViewById(R.id.edt_area_search);
	    final Button btn_search = (Button) findViewById(R.id.btn_area_search);
	    
	    AgroAssistantDB agroDB = new AgroAssistantDB(this);
	    String[] saArea = agroDB.getArea();
	    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.autocomplete_list, saArea);
	    edt_farmer_search.setAdapter(adapter);
	    //scaArea = new SimpleCursorAdapter(this, R.layout.autocomplete_list, cComments, new String[agroDB.]); 

	    
	    final Intent returnIntent = new Intent();
	    
		btn_search.setOnClickListener(new OnClickListener() {
			//@Override
			public void onClick(View v) {
				String userInput = "";
				userInput = edt_farmer_search.getText().toString();
				switch(rdg_area.getCheckedRadioButtonId()) {
					case R.id.rdo_parish:
						
						//Toast.makeText(AreaSearch.this, "Parish: " + userInput, //Toast.LENGTH_SHORT).show();
						
						returnIntent.putExtra("column", "Parish");
						returnIntent.putExtra("value", userInput );
						setResult(RESULT_OK,returnIntent);    	
				    	finish();
						break;
					case R.id.rdo_extension:
						//Toast.makeText(AreaSearch.this, "Extension: " + userInput, //Toast.LENGTH_SHORT).show();
						returnIntent.putExtra("column", "Extension");
						returnIntent.putExtra("value", userInput );
						setResult(RESULT_OK,returnIntent);    	
				    	finish();
						break;
					case R.id.rdo_district:
						//Toast.makeText(AreaSearch.this, "District: " + userInput, //Toast.LENGTH_SHORT).show();
						returnIntent.putExtra("column", "District");
						returnIntent.putExtra("value", userInput );
						setResult(RESULT_OK,returnIntent);    	
				    	finish();
						break;
					case -1:
						//Toast.makeText(AreaSearch.this, "Please check area to search", //Toast.LENGTH_SHORT).show();
						break;
				}
			}
		});
		agroDB.close();
	}
}
