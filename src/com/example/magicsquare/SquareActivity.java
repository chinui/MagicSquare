package com.example.magicsquare;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SquareActivity extends Activity
{
	private int[][] magicSquare;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_square);
		
		int order = getIntent().getIntExtra("order", 0);
		
		if (order == 0)
		{
			Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
		}
		else if (order%2 ==0)
		{ 
			
		}
		else
		{
			OddSquareBuilding oddSquareBuilding = new OddSquareBuilding(order);
			magicSquare = oddSquareBuilding.getMagicSquare();
		}	
		
		DisplayTheSquare displayTheSquare = new DisplayTheSquare(magicSquare, order);
		String squareToDisplay = displayTheSquare.getTheSquare();
		TextView textView = (TextView) findViewById(R.id.TextSquare);
		textView.setText(squareToDisplay);
	}
}
