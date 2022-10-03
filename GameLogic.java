package textadventure.main;
import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {

	static Scanner scanner = new Scanner(System.in);
	public static boolean isRunning;
	public static boolean researchTown;
	public static boolean researchMonster;
	public static boolean researchWeakness;
	public static boolean gun;
	public static boolean knife;
	public static boolean grimoire;

    public static int readInt(String prompt, int userChoice) {
        int input;

        do {
        	System.out.println(prompt);
            
            try {
                input = Integer.parseInt(scanner.next());
            
            } catch(Exception notNumber) {
                input = -1;
                System.out.println("Please enter a number.");
            
            }
            
        } while(input < 1 || input > userChoice);
        return input;
        
    }
    
    public static void pressContinue() {
    		System.out.println("\nPress anything to continue to continue...");
    		scanner.next();
    		for (int i = 0; i < 100; i++) {
    			System.out.println();
    		}
    }
    	
    public static void startGame() {
//    	int input = readInt("3 choices", 3);
//    	System.out.println(input);
    	
    	isRunning = true;
    	gameLoop();
    	
    }
    
    public static void noResearchEnd() {
    	System.out.println("You go searching for the monster, ignoring your training and better judgement. You\n"
				+ "glance at the file, and note a location, a farm. Quickly grabbing your bag of\n"
				+ "supplies, containing small but effective weapons. You rush to the farm, running through\n"
				+ "the first door that seems open. What you recognize as fae, still strong from its\n"
				+ "latest excursion, looks towards you angrily.");
		
		pressContinue();
		
		System.out.println("You let out a yell, rushing the fae with a blade and taking a swing. It passes \n"
				+ "right through, doing no damage. The creature lets out a shriek and takes a swing at you. It\n"
				+ "isn't long before you're killed, wishing you had just done your research.");
		
		System.out.println("\nGame over - No Research End");
    }
    
//    public static void doResearch(int input, boolean researchTown, boolean researchMonster, boolean researchWeakness) {
//    	
//    	
//    }
    
	public static void gameLoop() {
		while(isRunning) {
			String name;
			int input;
			ArrayList<String> notes = new ArrayList<String>();
			
			System.out.println("What is your name?");
			name = scanner.next();
			
			System.out.println("You are a monster hunter. You work for an organization called the Usher\n"
					+ "Foundation, dedicated to studying monsters and getting rid of them, as\n"
					+ "necessary. Normally, you have a team that helps. However, they are all out dealing\n"
					+ "with a case. The only reason you didn't go, much to your frustration, was because\n"
					+ "of an injury on your leg. It's still healing, but shouldn't cause too much trouble\n"
					+ "at this point, as long as you don't push it.");
			
			System.out.println("\nYou sit at your desk, finishing up some paperwork for new weapons when you\n"
					+ "hear a knock. The door opens, and your boss, Amelia Martins, walks in.");
			
			pressContinue();
			
			System.out.println("\n\"Good morning, " + name + ". I hope your doing well?\"");
			
			System.out.println("\nYou nod, giving her a questioning look. Normally, she doesn't come down unless you\n"
					+ "have a case. Looking down at her hands, she holds a envelope in her hands. You\n"
					+ "raise your eyebrow questioningly.");
			
			pressContinue();
			
			System.out.println("\nAmelia nods. \"I have a case for you today. I would rather wait for everyone\n"
					+ "to get back, but this cannot be put off.\" She hands you the envelope. \"You know how\n"
					+ "this works. Go over the statement, get your research done, and head out. You've only\n"
					+ "got a couple days before this gets ugly, so don't waste your time.\" With a click of her\n"
					+ "heels, she briskly walks out. You stare at the folder in front of you. It's labeled\n"
					+ "'Handfast'.");
			
//			pressContinue();
			
			System.out.println("What do you do?");
			System.out.println("1. Read the file");
			System.out.println("2. Go find the monster");
			
			input = readInt(">>> ", 2);
			
			if (input == 1) {
				System.out.println("You open the folder, revealing a few papers. One was a document, containing a\n"
						+ "statement you have become familiar with over the years. Along with that are a few\n"
						+ "photos. You pick up the statement first.\n");
				
				System.out.println("(TLDR: People are being attacked and there have been a series of unusual weather"
						+ "events. The attacks only happen when someone is alone at night. Additionally, there's"
						+ "stuff like spoiled food, blunt knives, and and objects getting thrown around.)\n");
//				System.out.println("You don't have to read it if there's not a lot of time. Or if it isn't there.\n");
				
				pressContinue();
				
				System.out.println("***statement will go here***");
				
				pressContinue();
				
				System.out.println("Statement was added to 'Notes'\n\n");
				
				System.out.println("You sit back, taking the information in. Objects getting thrown indicates a ghost,\n"
						+ "but what doesn't make sense is the weather changes. ");
				
				System.out.println("You decide you need to do some research on this town. If you can figure out what you're\n"
		    			+ "dealing with, you can pinpoint a reason, and maybe even a weakness if it comes down to it.\n");
		    	
		    	System.out.println("What do you research?\n");
		    	
		    	System.out.println("1. Town");
		    	System.out.println("2. Monsters");
		    	System.out.println("3. Weakness");
		    	System.out.println("4. Check notes");
		    	System.out.println("5. Stop researching");
		    	
		    	input = readInt(">>> ", 5);
		    	
		    	while (input != 5) {
					if (input == 1) {
						researchTown = true;
						System.out.println("Handfast holds a special celebration around midsummer, ever since the founding. Every 40\n"
								+ "years, there has been a child in that town who went missing. Records show each missing child\n"
								+ "was pulled out of school, never seen around town, and never mentioned again.");
						
						System.out.println("The attacks themselves started 40 years and one day exactly since the last disappearance.\n"
								+ "When asked about the disappearances, nobody seems to know what to make of it. Nobody\n"
								+ "has a single explanation, leaving the town itself a source of many amateur documentaries.");
						
						System.out.println("Notebook updated");
						
						Notebook.addNotes("Every 40 years is a midsummer festival that leads to a missing child.", notes);
						Notebook.addNotes("The missing children are never spoken about.", notes);
						Notebook.addNotes("The first attack was 40 years and one day after the last disappearance.", notes);
						
						
					} else if (input == 2) {
						if (!researchTown) {
							System.out.println("Unsure of the history of Handfast, you go off of the statement in front of you.\n"
									+ "Ghosts is what your first instinct says, but it could also be some kind of curse.\n"
									+ "Perhaps an rogue spellcaster who is trying to enact revenge? It's hard to say.");
							
						} else {
							researchMonster = true;
							System.out.println("Based on the history of the town and the current phenomenon going on, you believe\n"
									+ "it may be the work of fae. Someone may have made a deal with a faerie, but gone back\n"
									+ "on it. The disappearances could mean that there are possibly changelings involved,\n"
									+ "creatures who were once human but taken as children by the fae.");
							
							System.out.println("This could be extremely dangerous. Best to prepare as much as possible.");
							
							Notebook.addNotes("You could be dealing with fae.", notes);
							Notebook.addNotes("A deal may have gone wrong.", notes);
							Notebook.addNotes("They missing children may be Changelings.", notes);
							
							System.out.println("Notebook updated");
						}
		    		
					} else if (input == 3) {
						researchWeakness = true;
						if (!researchMonster) {
							System.out.println("You don't know what monster you're facing, but items like salt, iron, silver, and\n"
									+ "most magic works well against a lot of monsters.");
						} else {
							researchWeakness = true;
							System.out.println("The fae tend to watch their words carefully. Anything can turn into a deal, and once\n"
									+ "a deal is set, there is no going back. Should a fae go back on their word, the wronged pary\n"
									+ "will receive power over them. Additionally, iron tends to be a death sentence to any\n"
									+ "fae stabbed with it.");
							
							System.out.println("They also tend to be weaker in the winter time, but you don't know how much help\n"
									+ "that will be. It is summer, after all. Most importantly, names have power."
									+ "Never give any fae your name, or they will have complete power over you.");
							
							Notebook.addNotes("If a fae goes back on their word, the wronged party has power over them.", notes);
							Notebook.addNotes("Iron is fatal to fae.", notes);
							Notebook.addNotes("Fae are weak in the winter.", notes);
							Notebook.addNotes("Never give fae your name.", notes);
							
							System.out.println("Notebook updated");
							
						}
					} else if (input == 4) {
						Notebook.viewNotes(notes);
					}
					
					pressContinue();
					
					System.out.println("What else do you research?\n");
			    	
			    	System.out.println("1. Town");
			    	System.out.println("2. Monsters");
			    	System.out.println("3. Weakness");
			    	System.out.println("4. View Notes");
			    	System.out.println("5. Stop researching");
			    	
			    	input = readInt(">>> ", 5);
		    	}
		    	
		    	System.out.println("You finish what you believe to be adequate research and feel like you have a good grasp of the\n"
		    			+ "creature plaguing Handfast. Now to collect your weapon. There's a few you can choose from. Your\n"
		    			+ "handy knife, which can get you out of a rough situation and is easily concealable, a pistol with several\n"
		    			+ "differen types of rounds that tends to be loud, and a grimoire, which you haven't used before and know\n"
		    			+ "little about.");
		    	
		    	System.out.println("What do you use?");
		    	System.out.println("1. Knife");
		    	System.out.println("2. Gun");
		    	System.out.println("3. Grimoire");
		    	System.out.println("4. Check Notebook");
		    	System.out.println("5. Nothing, I don't need a weapon");
		    	input = readInt(">>> ", 5);
		    	
				if (input == 1) {
					knife = true;
					System.out.println("You decide to take your knife. Armed wiht your most trusted weapon, you head out towards\n"
							+ "the small farming town.");
					
				} else if (input == 2) {
					gun = true;
					System.out.println("You decide to take the gun, figuring its adaptability will be useful. With the gun safely\n"
							+ "holsterd, you make your way to the small farming town.");
					
				} else if (input == 3) {
					grimoire = true;
					System.out.println("You decide to take the grimoire. Flipping through a couple pages, you spend some time\n"
							+ "getting familiar with the spells. Hopefully, it will be useful when the time comes.\n"
							+ "Despite your apprehension, you make your way to the small farming town.");
					
				} else if (input == 4) {
					Notebook.viewNotes(notes);
					
				} else {
					System.out.println("You decide not to take a weapon, despite your better judgement, and head out towards the\n"
							+ "small farming town.");
				}
				
				pressContinue();
				
				
				
				System.out.println("You leave the Usher Foundation and begin traveling to Handfast. It's not a long drive, as it\n"
						+ "happens to be close by. You drive for about a day before stopping. The small farmtown has no hotel,\n"
						+ "so you stay in a bigger town a few miles over.");
				
				pressContinue();
				
				
				System.out.println("When the sun rises the next day, you walk into town and look for someone to talk to. You're\n"
						+ "by a police officer. He extends a hand.");
				
				System.out.println("\"Hello there. I assume you're " + name +"? You take his hand, nodding. \"Nice to meet ya.\n"
						+ "I'm Edward Turner, but you can just call me Ed.\"");
				
				System.out.println("\"I assume that Amelia already contacted you?\" You ask.");
				
				System.out.println("\"She sure did. You're investigatin' some of these attacks over the past couple days, eh? Can't\n"
						+ "say I know too much, but I've never seen anythin' like it.\" He puts his hands on his belts\n"
						+ "with a sigh. \"Is there anythin' I can do to help ya?\"");
				
				System.out.println("You ask him to take you to where most of the attacks seem to be originating. Ed agrees,\n"
						+ "pointing you in the direction of a big barn. You thank him before treking off.");
				
				pressContinue();
				
				System.out.println("As you approach the barn, you can hear a deeper voice coming from the inside. It quickly\n"
						+ "dies down and a higher pitched voice takes its place, frantic and rushed. You can't make\n"
						+ "out what they're saying.");
				
				System.out.println("What do you do?");
				
				System.out.println("1. Get closer and eavesdrop");
				System.out.println("2. Approach the barn and announce your presence");
				System.out.println("3. Check notebook");
				
				input = readInt(">>>", 3);
				while (input != 1) {
					if (input == 2) {
						System.out.println("Understanding how important is it to be polite to fae, you approach the barn and\n"
								+ "knock on what you think is the front door. The two voices quickly vanish, and you\n"
								+ "wait for a bit. When nobody opens the door, you decide to take it into your own hands.");
						
						System.out.println("\"I'm coming in!\" You call out. You slowly open the doors and the sight\n"
								+ "you're greeted with surprises you. In front of you are two figures, man and\n"
								+ "woman. The woman has her arms crossed, pointedly not looking at the other.\n"
								+ "The man, however, caught your eye. He was, objectively, beautiful. Unnaturally\n"
								+ "so. Beautiful in the way only fae could be. Everything about him was off.\n"
								+ "What really concerned you was the crown sitting on his head.");
						
						System.out.println("This wasn't just any fae. No, he was royalty.");
						
						pressContinue();
						
						System.out.println("You quickly bow to the fae, making a point of not making eye contact.\n"
								+ "\"My apologies, your Majesty, for intruding on you here.\" He looks down\n"
								+ "at you curiously. \"I'm not here to fight, but rather come to an agreement.\n"
								+ "May I ask why you are here?\"");
						
						System.out.println("The fae explains that when the town was first founded, the townspeople\n"
								+ "made a deal with him. As the King of the Faeries, he would grant them\n"
								+ "good health and an abundance of crops. In return, every 40 years, the\n"
								+ "town would give up a single child to him.");
						
						System.out.println("As he explains this, he looks over at the woman, her arms still crossed.\n"
								+ "\"This one,\" he explains, \"was the last brought to me, Violet.");
						
						pressContinue();
						
						System.out.println("She sighs, nodding her head. \"What is it you want?\" she snaps. \"I\n"
								+ " doubt you're here for no reason.\"");
						
						System.out.println("1. Attack");
						System.out.println("2. Talk");
						System.out.println("3. Check Notebook");
						
						input = readInt(">>>", 3);
//						while (input != 1) {
							//Talk to them - one ending
							if (input == 2) {
									System.out.println("You explain why you're here, and talk to them about what they want.\n"
											+ "After some discussion, you manage to convince them to leave,\n"
											+ "promising that the town, and foundation, would leave them alone and they could\n"
											+ "look elsewhere.");
									
									System.out.println("Ending 3 - Communication");
		
							} else if (input == 3) {
								Notebook.viewNotes(notes);
//								input = readInt(">>>", 3);
								
							//Fight the two - three endings	
							} else {
								if (gun) {
									System.out.println("You pull out your gun, shoothing the fae in the chest. Before\n"
											+ "you can react, Violet quickly comes at you with her knife, sinking\n"
											+ "it into your chest. The last thing you notice as everything\n"
											+ "fades to black is that the fae didn't even look injured.");
									
									System.out.println("Game Over");
									System.out.println("Ending 4 - Bullets are made of lead");
									
								} else if (knife) {
									 System.out.println("You attack, swinging your iron knife at the fae first. He\n"
									 		+ "quickly disappears with a hiss of smoke as you make contact.\n"
									 		+ "Violet, on the other hand, stares at you, before taking off.\n"
									 		+ "You stay for a while, waiting for her to come back, but she never does.");
									 
									 System.out.println("Ending 5 - Long Live the King");
									 
								} else if (grimoire) {
									System.out.println("Remembering the spells you went over before coming here,\n"
											+ "you shout out the first one that comes to mind. The\n"
											+ "temperature drops as snow begins to fall from inside\n"
											+ "the barn. Before either can react, you attack them both\n"
											+ "with your own bare hands, quickly subduing the pair.\n"
											+ "Neither of them will bother the town again.");
									
									System.out.println("Ending 6 - Christmas in July");
								}
							}
							
//						}
						
						
					} else if (input == 3) {
						Notebook.viewNotes(notes);
						input = readInt(">>>", 3);
						
					} else {
						System.out.println("You walk up to the barn, carefully watching your footsteps to make sure nobody\n"
								+ "hears you. As you approach the door, the voices become clearer. ");
						
						System.out.println("\"Your Majesty, I really think that we might be going about this the wrong way.\n"
								+ "Look at these people, I doubt any of them even remember a deal. Humans don't live\n"
								+ "for that long-\"");
						
						System.out.println("The deeper voice cuts them off. \"A deal was made. That cannot be undone.\n"
								+ "Regardless of what these people think, I will either receive the child promised\n"
								+ "to me or they will receive the consequences.\" The deep voice suddenly calls\n"
								+ "out. \"And to whoever is listening on our conversation, I would recommened\n"
								+ "considering how valuable you believe your life to be.\"");
						
						pressContinue();
						
						System.out.println("What do you do?");
						
						System.out.println("1. Step inside and reveal yourself.");
						System.out.println("2. Continue hiding.");
						System.out.println("3. Check notebook.");
						
						input = readInt(">>>", 3);
						
						while (input != 2) {
							if (input == 1) {
								System.out.println("You step inside, careful to leave your hands up and away from\n"
										+ "your pockets. Looking at two figures, a man and woman, they\n"
										+ "don't seem happy. The woman even has a hand on a dagger.");
								
								System.out.println("What do you do?");
								
								System.out.println("1. Attack");
								System.out.println("2. Talk");
								System.out.println("3. Check Notebook");
								
								input = readInt(">>>", 3);
//								while (input != 1) {
									//Talk to them - one ending
									if (input == 2) {
											System.out.println("You explain why you're here, and talk to them about what they want.\n"
													+ "After some discussion, you manage to convince them to leave,\n"
													+ "promising that the town, and foundation, would leave them alone and they could\n"
													+ "look elsewhere.");
											
											System.out.println("Ending 7 - No Trust");
				
									} else if (input == 3) {
										Notebook.viewNotes(notes);
//										input = readInt(">>>", 3);
										
									//Fight the two - three endings	
									} else {
										if (gun) {
											System.out.println("You pull out your gun, shoothing the fae in the chest. Before\n"
													+ "you can react, Violet quickly comes at you with her knife, sinking\n"
													+ "it into your chest. The last thing you notice as everything\n"
													+ "fades to black is that the fae didn't even look injured.");
											
											System.out.println("Game Over");
											System.out.println("Ending 4 - Bullets are made of lead");
											
										} else if (knife) {
											 System.out.println("You attack, swinging your iron knife at the fae first. He\n"
											 		+ "quickly disappears with a hiss of smoke as you make contact.\n"
											 		+ "Violet, on the other hand, stares at you, before taking off.\n"
											 		+ "You stay for a while, waiting for her to come back, but she never does.");
											 
											 System.out.println("Ending 5 - Long Live the King");
											 
										} else if (grimoire) {
											System.out.println("Remembering the spells you went over before coming here,\n"
													+ "you shout out the first one that comes to mind. The\n"
													+ "temperature drops as snow begins to fall from inside\n"
													+ "the barn. Before either can react, you attack them both\n"
													+ "with your own bare hands, quickly subduing the pair.\n"
													+ "Neither of them will bother the town again.");
											
											System.out.println("Ending 6 - Christmas in July");
										}
//									}
									
										isRunning = false;
								} 
								
							} else if (input == 3) {
								Notebook.viewNotes(notes);
								
							} else {
								System.out.println("You refuse to come out, hiding behind the door and hoping they'll\n"
										+ "leave you alone. Unfortunately, after a moment of silence, you here a\n"
										+ "sigh. \"Go take care of it Violet.\"");
								
								System.out.println("There's the sound of shuffling, and before you can even react,\n"
										+ "you feel a pain coming from your back. You don't even get a chance\n"
										+ "to look before you collapse on the ground.");
								
								System.out.println("Game Over");
								System.out.println("Ending 2 - It's not polite to eavesdrop");
								
								isRunning = false;
							}
						}
						
					}
					
				}
//				
//				System.out.println("1. \"Who would know the most about this town?\"");
//				System.out.println("2. \"Where is are the attacks happening the most?\"");
//				System.out.println("3. \"Can I talk to any of the victims?\"");
				
				pressContinue();
				
				System.out.println("Thank you for playing! I am going to flesh this out more when I have more time\n"
						+ "and also fix the notebook so it works how I want it to. The program is messy, but\n"
						+ "I might just remake it into something nice a clean. Until then, thanks for playing!\n");
				
				System.out.println("Story adapted from Monster of the Week's introduction mystery 'Dream Away the Time'");
//				System.out.println("Ending - Incomplete");
				
				isRunning = false;
				
				
				
				
				
				
				
				
				
			} else if (input == 2) {
				isRunning = false;
				noResearchEnd();
			} 
			
		}
	}
}
