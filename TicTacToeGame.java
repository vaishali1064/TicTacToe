package com.TicTacToe;

public class TicTacToeGame 
{
	//Array Declaration
		public static char [] board = new char [10];

		//creating Method
		public  void createBoard() 
		{
			for(int i=1; i<board.length;i++) //Ignore 0th index & Starting from 1 to make user friendly
			{
				
				board[i] = ' '; //Assigning empty space
			}
		}
		
		public static void main(String[] args) 
		{
			TicTacToeGame obj = new TicTacToeGame();
			//calling method using object
			obj.createBoard();
			System.out.println(" Board created");

		}
}
