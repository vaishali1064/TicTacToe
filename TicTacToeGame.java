package com.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame 
{
	//UC1
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
		//UC2
		public static char player = ' ';
		public static char computer = ' ';
		
		public static char chooseInput(Scanner scan) {
			System.out.println(" Enter the input value you want : ");
			return scan.next().toUpperCase().charAt(0);

		}
		
		public static void main(String[] args) 
		{	//UC1
			TicTacToeGame obj = new TicTacToeGame();
			//calling method using object
			obj.createBoard();
			System.out.println(" Board created");
			
			//UC2
			Scanner scan = new Scanner(System.in);
			char player = chooseInput(scan);
			char computer = (player == 'X') ? 'O' : 'X';
			System.out.println(player + " is your choosen value " );

		}
}
