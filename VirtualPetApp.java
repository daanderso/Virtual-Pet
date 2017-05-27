import java.util.Scanner;


public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		VirtualPet dragon = new VirtualPet();
		
		
		writeLine("Drago the Dragon\n");
		writeLine("       ^__^            ");
		writeLine("       /oo\\            ");
		writeLine("      | .. |           ");
		writeLine(" ^^   (vvvv)  ^^      ");
		writeLine(" \\\\  /    \\  //       ");
		writeLine("  \\\\/      \\//        ");
		writeLine("   /        \\         ");      
		writeLine("   |         |      ^   ");
		writeLine("  /           \\___/ |  "); 
		writeLine(" (            )     | ");
		writeLine(" \\-----------/     /  ");
		writeLine("    //    \\\\____/    ");
		writeLine("   W       W          ");
		writeLine("Hunger: " + dragon.getHunger());
		writeLine("Thirst: " + dragon.getThirst());
		writeLine("Boredom:"  + dragon.getPlayfulness());
		writeLine("Tiredness:" + dragon.getTiredness());
		
		//while loop
		while (!dragon.death){
		
		writeLine("What do you want to do ?\n");
		writeLine("1. Feed Drago");
		writeLine("2. Water Drago");
		writeLine("3. Play with Drago");
		writeLine("4. Let Drago rest");
		writeLine("5. Quit\n");
		
		String enterAction = input.next();
		
		switch (enterAction) {
		case "1":
			//Feed Dragon
			dragon.feed();
			//Drago is hungry
			if (dragon.isHungry()){
			writeLine("Feed ME !!!\n");
			}else{
			writeLine("I'm not hungry right now\n");
			}
			break;
			
		case "2":
			//Give Drago water
			dragon.water();	
			//Drago is thirsty
			if (dragon.isThirsty()){
				writeLine("I need WATER !!!\n");
			}else{
				writeLine("I'm not thirsty right now\n");
			}
			break;
		case "3":
			// Play with Drago 
			dragon.play();
			// Drago is bored 
			if (dragon.isBored()){
				writeLine("I WANNA to Play !!!\n");
			}else{
				writeLine("I don't wanna play right now\n");
			}
			break;
		case "4":
			//Give Drago a nap
			dragon.nap();
			//Drago is tired
			if (dragon.isTired()){
				writeLine("Yawn, I Need a nap !!!\n");
			}else{
				writeLine("Leave me alone I don't want a nap\n");
			}
			break;
		case "5":
			writeLine(" You have exited the app");
			dragon.quit();
			break;
			
		}

		//test line
		writeLine("Before Tick");
		writeLine("Hunger: " + dragon.getHunger());
		writeLine("Thirst: " + dragon.getThirst());
		writeLine("Boredom:"  + dragon.getPlayfulness());
		writeLine("Tiredness:" + dragon.getTiredness() +"\n");
				
		dragon.tick();
		
		writeLine("After time moves forward...tick\n ");
		writeLine("Drago the Dragon\n");
		writeLine("       ^__^            ");
		writeLine("       /oo\\            ");
		writeLine("      | .. |           ");
		writeLine(" ^^   (vvvv)  ^^      ");
		writeLine(" \\\\  /    \\  //       ");
		writeLine("  \\\\/      \\//        ");
		writeLine("   /        \\         ");      
		writeLine("   |         |      ^   ");
		writeLine("  /           \\___/ |  "); 
		writeLine(" (            )     | ");
		writeLine(" \\-----------/     /  ");
		writeLine("    //    \\\\____/    ");
		writeLine("   W       W          ");
		writeLine("Hunger: " + dragon.getHunger());
		writeLine("Thirst: " + dragon.getThirst());
		writeLine("Boredom:"  + dragon.getPlayfulness());
		writeLine("Tiredness:" + dragon.getTiredness());
				
			
		}//end while
				
		input.close();
		
	}//end main method bracket
	
	public static void writeLine(String message){
		System.out.println(message);
	}
	
	public static void writeInt(int message){
		System.out.println(message);
	}
	
	
	
}//end class bracket 
