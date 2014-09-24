package com.example.magicsquare;

public class OddSquareBuilding
{
	private int order;
	private int magicSquare[][];
	public OddSquareBuilding(int tOrder)
	{
		order = tOrder;
		createTheSquare();
	}
	
	private void createTheSquare()
	{
		// TODO Auto-generated method stub
		int row = 0 ;
		int column = order/2 ;
		int tRow, tColumn;
		magicSquare = new int[order][order];
		for (int n=1; n<=(order*order); n++)
		{
			magicSquare[row][column] = n;
			tRow = row-1;
			tColumn = column-1;
			tRow = outOfSquare(tRow);
			tColumn = outOfSquare(tColumn);
			if(!isEmpty(tRow, tColumn))
			{
				row++;
				row = outOfSquare(row);
			}
			else
			{
				row = tRow;
				column = tColumn;
			}
		}
		
	}
	
	private int outOfSquare(int position)
	{
		if(position<0)		
			return order-1;
		else if (position == order)
			return 0;
		else
			return position;
	}
	
	private boolean isEmpty(int tRow, int tColumn)
	{
		if (magicSquare[tRow][tColumn] == 0)
			return true;
		else 
			return false;
	}
	
	public int[][] getMagicSquare()
	{
		return magicSquare;
	}
	
}
