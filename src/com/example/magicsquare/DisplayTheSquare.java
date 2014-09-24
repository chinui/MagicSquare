package com.example.magicsquare;

public class DisplayTheSquare
{
	private int order;
	private int[][] magicSquare;
	private String squareToDisplay;
	public DisplayTheSquare(int[][] tMagicSquare, int tOrder)
	{
		order = tOrder;
		magicSquare = tMagicSquare;
		drawTheSquare();
	}
	
	private void drawTheSquare()
	{
		/*String lane = "|";
		for (int i=0; i<order; i++)
		{
			lane = lane + "---";
		}
		lane = lane.substring(0, lane.length()-1) + "|\n";*/
		
		squareToDisplay = "";
		
		for(int i=0; i<order; i++)
		{
			squareToDisplay = squareToDisplay + "|";
			
			for(int j=0; j<order; j++)
			{
				if (magicSquare[i][j] < 10)
					squareToDisplay = squareToDisplay + "00" + magicSquare[i][j] + "|";
				else if (magicSquare[i][j] < 100)
					squareToDisplay = squareToDisplay + "0" + magicSquare[i][j]+ "|";
				else
					squareToDisplay = squareToDisplay + magicSquare[i][j] + "|";
			}
			
			squareToDisplay = squareToDisplay + "\n";
		}
	}
	
	public String getTheSquare()
	{
		return squareToDisplay;
	}
}
