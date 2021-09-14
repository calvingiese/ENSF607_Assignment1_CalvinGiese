package registrationSystem;
//This is my "FrontEnd!"
public class CourseRegApp {
	
	public static void main (String [] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
		// Declaring necessary variables
		boolean optionQuit = true;
		boolean studentQuit = false;
		boolean courseQuit = false;
		int userSelection;
		String promptOptions = ('\n' + "Please select one of the following options by entering the associated number:" + '\n' +
								" 1: Search catalogue courses" + '\n' + 
								" 2: Add course to student courses" + '\n' + 
								" 3: Remove course from student courses" + '\n' + 
								" 4: View all courses in catalogue" + '\n' + 
								" 5: View all courses taken by student" + '\n' + 
								" 6: Quit" + '\n' + '\n');
		
		// Welcome screen display
		reader.display("             Welcome to the course registration App" + '\n');
		
		// Gets user to enter student name (or quit) and student number
		while(studentQuit == false) {
			reader.prompt('\n' + "Please enter a student name or 'Quit' to end the program:" + '\n');
			String studentName = reader.getKeyboardInput();
			if(studentName.equals("Quit")){
				studentQuit = true;
				break;
			}
			reader.prompt("Please enter the student number:" + '\n');
			String strStudentNum = reader.getKeyboardInput();
			try {
				int studentNum = Integer.parseInt(strStudentNum);
				optionQuit = false;
				Student s1 = new Student(studentName, studentNum);
			} catch(NumberFormatException e) {
				reader.display("That was an invalid entry, please try again" + '\n');
			}
			
			// User navigates the selection options, only ending when the user enters '6'
			while(optionQuit == false) {
				
				// Prompting for selection
				reader.prompt(promptOptions);
				String userEntry = reader.getKeyboardInput();
				
				// Checking valid entries only
				try {
					userSelection = Integer.parseInt(userEntry);
					
					// Ends selection loop
					if(userSelection == 6) {
						optionQuit = true;
						break;
						
					// All other selection options
					}else {
						// Creates course catalogue from hard coded options
						CourseCat cat = new CourseCat ();  //This loads the courses from our "DB"
						
						// Search course catalogue
						if(userSelection == 1) {
							reader.display("Course Catalogue Search" + '\n');
							reader.prompt("Please enter the course name (e.g. ENGG):" + '\n');
							String courseName = reader.getKeyboardInput();
							while(courseQuit == false) {
								reader.prompt("Please enter the course number (e.g. 201):" + '\n');
								String integerCourseNum = reader.getKeyboardInput();
								try {
									int courseNum = Integer.parseInt(integerCourseNum);
									cat.searchCat(courseName, courseNum);
									courseQuit = true;
								} catch(NumberFormatException e){
									reader.display("That was an invalid entry, please try again");
								}
							}
							courseQuit = false;
						}
						
						// Add course
						else if(userSelection == 2) {
							optionQuit = true;
							break;
						}
						
						// Remove course
						else if(userSelection == 3) {
							optionQuit = true;
							break;
						}
						
						// Display course catalogue
						else if(userSelection == 4) {
							reader.display('\n' + cat.toString() + '\n');
						}
						
						// View student's courses
						else if(userSelection == 5) {
							optionQuit = true;
							break;
						}
					}
					
				// Handles invalid selection option
				} catch(NumberFormatException e) {
					reader.display("That was an invalid entry, please try again");
				}			
			}
			optionQuit = true;
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