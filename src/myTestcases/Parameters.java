package myTestcases;

import java.util.Random;

public class Parameters {

	Random rand = new Random();


	String[] FirstNames = { "Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Isabel", "Jack" };

	String[] lastNames = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
			"Taylor" };
	String CommonPassword = "Asd123!@#$";
	
	int randomIndex = rand.nextInt(10);
	int randomEmailId = rand.nextInt(9999); 
	
	String emailID = FirstNames[randomIndex]+lastNames[randomIndex]+randomEmailId+"@"+"gmail.com"; 
	
	

}
