package registrationSystem;
//This is my "FrontEnd!"
public class CourseRegApp {
	
	public static void main (String [] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
		// Declaring necessary variables
		boolean quit = false;
		int userSelection;
		String promptOptions = ('\n' + "Please select one of the following options by entering the associated number:" + '\n' +
								" 1: Search catalogue courses" + '\n' + 
								" 2: Add course to student courses" + '\n' + 
								" 3: Remove course from student courses" + '\n' + 
								" 4: View All courses in catalogue" + '\n' + 
								" 5: View all courses taken by student" + '\n' + 
								" 6: Quit" + '\n' + '\n');
		
		// Welcome screen display
		reader.display("             Welcome to the course registration App" + '\n');
		
		// User selection options, quitting only when the user decides to
		while(quit == false) {
			
			reader.prompt(promptOptions);
			String userEntry = reader.getKeyboardInput();
			
			try {
				userSelection = Integer.parseInt(userEntry);
				
				if(userSelection == 1) {
					quit = true;
					break;
				}
				if(userSelection == 2) {
					quit = true;
					break;
				}
				if(userSelection == 3) {
					quit = true;
					break;
				}
				else if(userSelection == 4) {
					CourseCat cat = new CourseCat ();  //This loads the courses from our "DB"
					reader.display('\n' + cat.toString() + '\n');
				}
				if(userSelection == 5) {
					quit = true;
					break;
				}
				if(userSelection == 6) {
					quit = true;
					break;
				}
				
				
				
				
				
				
				
				
				
				
			} catch(NumberFormatException e) {
				System.out.println("That was an invalid entry, please try again");
			}			
		}
		
		

//		Student st1 = new Student ("Sara", 1);
//		Student st2 = new Student ("Joe", 2);
//		
//		Course myCourse = cat.searchCat("ENGG", 233);
//		if (myCourse != null) {
//			cat.createOffering(myCourse, 1, 200);
//			cat.createOffering(myCourse, 2, 150);
//		}
//	    
//		st1.registerForCourse(cat, "ENGG", 233, 1);
//		
//		System.out.println(myCourse.getOfferingList().get(0).getTheCourse());
		
		//System.out.println(myCourse.getOfferingList().get(0).getStudentList().get(0).getTheStudent().getStudentName());
	}

}