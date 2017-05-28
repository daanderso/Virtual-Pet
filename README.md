    Virtual Pet App
    ================
    
    Synopsis:
    ---------
    Meet Drago the Dragon. Drago is a virtual pet. You may feed him, play with him, give him water and he sometimes needs rest.
    Once Drago's stats reach 50 he will start to need more attention. Drago has a mind of his own sometimes so he may feed
    himself, drink, entertain himself, or take a nap. There is a lot displayed on the console after time advances so you may need 
    to scroll up to see all the details.
    
    Instance variables
    ------------------
    int hunger
	int thirst
	int boredom
	int tiredness
	boolean death
		
	Methods
	--------
	feed () -  will decrease hunger and increase thirst
	getHunger() - returns the hunger value
	boolean isHungry() - boolean that returns true if the pet is hungry 
	-----------------------------------
	water() -  will decrease thirst
	isThirsty() - boolean that returns true if the pet is thirsty 
	getThirst ()- returns the thirst value
	------------------------------
	play() - will decrease boredom and increase hunger, thirst, and tiredness
	isBored () - boolean that returns true if the pet is bored 
	getPlayfulness()- returns the value for boredom
	-------------------------------------
	nap() - will decrease tiredness and increase hunger
	isTired() - boolean that returns true if the pet is bored 
	getTiredness() - returns the value for tiredness
	---------------------------------------------
	tick () - simulates an advance in time. It uses a random number to increase hunger, thirst, boredom, and tiredness.
	
	

	                    
	
	
	