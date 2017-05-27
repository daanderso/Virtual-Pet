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
		
		//while loop
		while (!dragon.death){
	
		//Virtual Pet Menu
		//writeLine("Drago the Dragon");		
		//writeLine("Before Tick:");
		//writeLine("Hunger: " + dragon.getHunger());
		//writeLine("Thirst: " + dragon.getThirst());
		//writeLine("Boredom:"  + dragon.getPlayfulness());
		
		writeLine("What do you want to do ?\n");
		writeLine("1. Feed Drago");
		writeLine("2. Water Drago");
		writeLine("3. Play with Drago");
		writeLine("4. Let Drago rest");
		writeLine("5. Quit\n");
		
		String enterAction = input.next();
		
		switch (enterAction) {
		case "1":
			dragon.feed();
			//writeInt(dragon.getHunger());
			//drago is hungry
			if (dragon.isHungry()){
			writeLine("Feed ME !!!");
			}else{
			writeLine("I'm not hungry right now");
			}
			break;
			
		case "2":
			dragon.water();
			//Drago is thirsty
			if (dragon.isThirsty()){
				writeLine("I need WATER !!!");
			}else{
				writeLine("I'm not thirsty right now");
			}
			break;
		case "3":
			// Drago is bored 
			dragon.play();
			
			if (dragon.isBored()){
				writeLine("I WANNA to Play !!!");
			}else{
				writeLine("I don't wanna play right now");
			}
			break;
		case "4":
			//let Drago rest
			break;
		case "5":
			writeLine(" You have exited the app");
			dragon.quit();
			break;
			
		}

		//writeLine("After time moves forward...tick");
		//writeLine("Hunger: " + dragon.getHunger());
		//writeLine("Thirst: " + dragon.getThirst());
		//writeLine("Boredom:"  + dragon.getPlayfulness());
				
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
				
	 //  writeLine(" so sorry, your pet died");	
			
		}//end while
				

		//test current hunger
		//writeInt(dragon.getHunger());
	
		
	}//end main method bracket
	
	public static void writeLine(String message){
		System.out.println(message);
	}
	
	public static void writeInt(int message){
		System.out.println(message);
	}
	
	
}//end class bracket 
