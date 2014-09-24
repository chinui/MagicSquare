package com.example.magicsquare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button buttonStart = (Button) findViewById(R.id.ButtonStart);
		buttonStart.setOnClickListener(this);
	}

	@Override
	public void onClick(View v)
	{
		// TODO Auto-generated method stub
		EditText editOrder = (EditText) findViewById(R.id.EditOrder);
		int order =  Integer.parseInt(editOrder.getText().toString());
		Intent i = new Intent(this, SquareActivity.class);
		i.putExtra("order", order);
		startActivity(i); 
		
	}
}
