package registrationSystem;

import java.util.Random;

//This is my "FrontEnd!"
public class CourseRegApp {
	
	public static void main (String [] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
		// Adding students to fill the system
		Student st1 = new Student("Emily", 101);
		Student st2 = new Student("Daniel", 102);
		Student st3 = new Student("Hillary", 103);
		Student st4 = new Student("Michael", 104);
		Student st5 = new Student("Matthew", 105);
		Student st6 = new Student("Sabrina", 106);
		Student st7 = new Student("Sarah", 107);
		Student st8 = new Student("Billy", 108);
		Student st9 = new Student("Joseph", 109);
		Student st10 = new Student("Candice", 110);
		Student st11 = new Student("Foster", 111);
		Student st12 = new Student("Amy", 112);
		
		// Declaring necessary variables for loop exits, course requirements, prompts etc.
		boolean optionQuit = true;
		boolean studentQuit = false;
		boolean courseQuit = false;
		boolean sectionQuit = false;
		boolean removeQuit = false;
		boolean courseMatch = false;
		int sectionMin = 1;
		int sectionMax = 3;
		int sizeMin = 150;
		int sizeMax = 200;
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
			if(studentName.toLowerCase().equals("quit")){
				studentQuit = true;
				break;
			}
			reader.prompt("Please enter the student number:" + '\n');
			String strStudentNum = reader.getKeyboardInput();
			try {
				int studentNum = Integer.parseInt(strStudentNum);
				optionQuit = false;
				Student s1 = new Student(studentName, studentNum);
			
			// User navigates the selection options, only ending when the user decides to quit
			while(optionQuit == false) {
				
				// Prompting for selection
				reader.prompt(promptOptions);
				String userEntry = reader.getKeyboardInput();
				
				// Checking valid option selection entries only
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
							reader.display("Course Catalogue Search" + '\n' + '\n');
							
							// Enter course name
							reader.prompt("Please enter the course name (e.g. ENGG):" + '\n');
							String courseName = reader.getKeyboardInput();
							
							// Repeats until a course is found
							while(courseQuit == false) {
								
								// Enter course number
								reader.prompt("Please enter the course number (e.g. 201):" + '\n');
								String integerCourseNum = reader.getKeyboardInput();
								
								//Only accepting integer values
								try {
									int courseNum = Integer.parseInt(integerCourseNum);
									Course myCourse = cat.searchCat(courseName, courseNum);
									
									// Display course details if it is found
									if(myCourse != null) {
										reader.display("Course " + courseName + " " + courseNum + " was found!" + '\n');
									}
									courseQuit = true;
								} catch(NumberFormatException e){
									reader.display("That was an invalid entry, please try again");
									}
								}
								courseQuit = false;
							}
						
							// Add course
							else if(userSelection == 2) {
								
								// Allowing student to add courses if they have less than 6 already
								int courseCount = s1.getNumberOfCourses();
								if(courseCount < 6) {
									
									// Get course name
									reader.prompt("Please enter the course name (e.g. ENGG):" + '\n');
									String courseName = reader.getKeyboardInput();
									
									// Only accepting valid input types for course number
									while(courseQuit == false) {
										
										//Get course number
										reader.prompt("Please enter the course number (e.g. 201):" + '\n');
										String integerCourseNum = reader.getKeyboardInput();
										try {
											int courseNum = Integer.parseInt(integerCourseNum);
											Course myCourse = cat.searchCat(courseName, courseNum);
											
											// Setting course parameters
											if(myCourse != null) {
												Random rd = new Random();
												int sectionRand = rd.nextInt(sectionMax - sectionMin + 1) + sectionMin;
												int sizeRand = rd.nextInt(sizeMax - sizeMin + 1) + sizeMin;
												
												// Create offering with multiple sections
												for(int i = 0; i < sectionRand; i++) {
													cat.createOffering(myCourse, sectionRand, sizeRand);
												}
												
												// Display course/section options
												reader.display('\n' + "Course " + courseName + " " + courseNum + " was found!" + '\n');
												
												// Getting user's section selection
												reader.prompt("There are " + sectionRand + " sections available, which one would you like to select?" + '\n');
												String section = reader.getKeyboardInput();
												try {
													while(sectionQuit == false) {
														int sectionNum = Integer.parseInt(section);
														
														// Checking if it's a valid section and adding course for the student
														if(sectionNum > 0 && sectionNum <= sectionRand) {
															
															// Registering the student to the course
															s1.registerForCourse(cat, courseName, courseNum, sectionNum);
															
															// Confirmation to the user
															reader.display("Section " + sectionNum + " was selected." + '\n' + '\n');
															reader.display("You have been added to " + courseName + " " + courseNum + " Section " + sectionNum + '\n');
																									
															sectionQuit = true;
														}
														
														// Repeating for invalid section selection
														else {
															reader.display("That was an invalid entry, please try again" + '\n');
														}
													}
													
													// Catching invalid section entry types
												} catch(NumberFormatException e){
													reader.display("That was an invalid entry, please try again" + '\n');
												}
											}
											courseQuit = true;
											
											// Catching invalid course number entry types
										} catch(NumberFormatException e){
											reader.display("That was an invalid entry, please try again" + '\n');
										}
									}
									courseQuit = false;
								}
								else {
									reader.display('\n' + "You already have too many courses, remove one before adding another course" + '\n');
								}
							}
							
							// Remove course
							else if(userSelection == 3) {
								
								// Allowing student to remove course if they have more than one
								int courseCount = s1.getNumberOfCourses();
								if(courseCount > 0) {
									
									// Inquire about which course to remove
									reader.display('\n' + s1.getStudentName() + " is taking the following courses:" + '\n');
									reader.display(s1.getRegList().toString() + '\n');
									reader.prompt('\n' + "Enter the name of the course you would like to remove (e.g. ENGG):");
									String courseName = reader.getKeyboardInput();
									reader.prompt('\n' + "Enter the number of the course you would like to remove (e.g. 201):");
									String strCourseNumber = reader.getKeyboardInput();
									String course = courseName + " " + strCourseNumber;
									
									// Finds course and removes it if found
									for(int i = 0; i < courseCount; i++) {
										if(course.equals(s1.getRegList().get(i).toString())) {
											s1.removeRegistration(s1.getRegList().get(i));
											courseMatch = true;
											break;
										}
									}
									
									// Confirmation with the user on what happened
									if(courseMatch == true) {
										reader.display('\n' + course + " was found and has been removed." + '\n');
										courseMatch = false;
									}
									else {
										reader.display('\n' + course + " was not found." + '\n');
									}
									
									// Displaying the remaining courses to the user
									reader.display("The student still has the following courses:" + '\n');
									reader.display(s1.getRegList().toString() + '\n');
								}
								else {
									reader.display("You don't have any courses yet, unable to remove a course" + '\n');
								}
							}
							
							// Display course catalogue
							else if(userSelection == 4) {
								reader.display('\n' + cat.toString() + '\n');
							}
							
							// View student's courses
							else if(userSelection == 5) {
								reader.display('\n' + s1.getStudentName() + " is registered in the following courses:" + '\n' + '\n');
								reader.display(s1.getRegList().toString() + '\n');
							}
							
							// Other integer entries, repeat options
							else {
								reader.display("That was an invalid entry, please try again" + '\n');
							}
						}
					
				// Handles invalid selection option
				} catch(NumberFormatException e) {
					reader.display("That was an invalid entry, please try again" + '\n');
				}			
			}
			
			} catch(NumberFormatException e) {
				reader.display("That was an invalid entry, please try again" + '\n');
			}
			optionQuit = true;
		}
	}
}