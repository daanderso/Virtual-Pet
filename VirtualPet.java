import java.util.Random;

public class VirtualPet {

	int hunger = 25;
	int thirst = 10;
	int boredom = 30;
	int tired = 25;	
	boolean isHungry;
	boolean isThirsty;
	boolean isBored;
	boolean isTired;
	boolean death; //boolean to start while loop if the pet is alive
	              //the while loop condition is true
	
// creating random object r for random number generator in tick method
	Random r = new Random();
		
//Methods for a hungry pet		
	void feed() {
		hunger = hunger - 10;
	}
	
	boolean isHungry() {
		
		return hunger >= 50;
		
	}
	
	int getHunger(){
		 return hunger;	
	}
	
//Methods for a thirsty pet	
	
	void water (){
		thirst = thirst - 10;
	}
	
	boolean isThirsty() {
		return thirst >= 50;
	}
	
	int getThirst(){
		return thirst;
	}
	
//Methods for a bored pet
	void play (){
		boredom = boredom - 10;
		hunger = hunger + 3;
		thirst = thirst + 5;
		tired = tired + 5;
	}

	boolean isBored() {
		return boredom >= 50;
	}
	
	int getPlayfulness(){
		return boredom;
	}
	
//Methods for a tired pet
	void nap (){
		tired = tired - 10;
	}
	
	boolean isTired() {
		return tired >= 60;
	}
	
	int getTiredness(){
		return tired;
	}
	
		
	
	
// Done method
	void quit (){
		System.exit(0);
	}
	
//Tick method
	void tick() {
		
		//hunger = hunger + 5;
		//thirst = thirst + 10;
		hunger = hunger + r.nextInt(10);
		thirst = thirst + r.nextInt(20);
		boredom = boredom + r.nextInt(10);
		tired = tired + r.nextInt(15);
		
	}
		
	
}//end class bracket
