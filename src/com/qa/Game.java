package com.qa;

public class Game {

	//apologies in advance for not understanding blackjack
	
	
	public int closest(int player, int dealer) {
		
		System.out.println(player + "\n" + dealer);
		
		if ( dealer > 21 && player > 21) {
			
			System.out.println("Both players bust!");
			return 0;
			
		} else if (dealer > 21 && player <= 21) {
			
			System.out.println("Dealer bust! Player wins with " + player);
			return 1;
			
		} else if (dealer < 21 && player > 21) {
			System.out.println("Dealer wins with " + dealer);
			return 2;
			
		}  else if (dealer == player) {
			System.out.println("Dealer wins with draw" + dealer);
			return 4;
			
		}
		
		else {
			System.out.println("Error");
			return 3;
		}
	}
}
