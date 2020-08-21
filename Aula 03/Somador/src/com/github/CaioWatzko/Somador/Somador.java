package com.github.CaioWatzko.Somador;

public class Somador {

	public static void main(String[] args) {
		int x=0;
		int somar=0;
		
		for (x=0; x < args.length; x++) {
			if(args != null) {
				
				//parseInt utilizado para coinversao String -> Int
				somar += Integer.parseInt(args[x]);
				
			}//fim if
		}//fim for
		
		System.out.println("Soma total de args: " + somar);
		
	}//fim main
}
