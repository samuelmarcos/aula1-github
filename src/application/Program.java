package application;

import java.time.Duration;
import java.time.Instant;

public class Program {
	
	public static void main(String [] args) {
		
		System.out.println("Bom dia !"); 
		System.out.println("Boa tarde !");
		System.out.println("Boa noite !");
		
		Instant startTime = Instant.now();
		for (int i = 0; i < 10000; i ++) {
			System.out.println("Console.log :" + Math.pow(i, 3));
		}
		Instant endTime = Instant.now();
		Duration totalTime = Duration.between(startTime, endTime);
		System.out.println("Tempo de execução :" + totalTime);
		
	}

}
