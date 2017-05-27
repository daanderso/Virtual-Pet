import java.util.Random;

public class VirtualPet {

	int hunger = 25;
	int thirst = 10;
	int boredom = 30;
	int tiredness = 25;	
	boolean isHungry;
	boolean isThirsty;
	boolean isBored;
	boolean death;
	//boolean dead = ((hunger >= 50) && (thirst >= 50));
	
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
	}

	boolean isBored() {
		return boredom >= 50;
	}
	
	int getPlayfulness(){
		return boredom;
	}
	
// Done method
	void quit (){
		System.exit(0);
	}
	
//Tick method
	void tick() {
		
		//hunger = hunger + 5;
		hunger = hunger + r.nextInt(10);
		//thirst = thirst + 10;
		thirst = thirst + r.nextInt(20);
		boredom = boredom + r.nextInt(10);
		
	}
	
	//death method
	
//	boolean death () {
//		
//		return (hunger >= 50 && thirst >= 50);
//
//	}
	
	
	
	
	
	
	
}//end class bracket
