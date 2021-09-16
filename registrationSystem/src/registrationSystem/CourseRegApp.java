package registrationSystem;

import java.util.Random;

//This is my "FrontEnd!"
public class CourseRegApp {
	
	public static void main (String [] args) {
		
		KeyboardReader reader = new KeyboardReader();
		
		// Creating course catalogue
		CourseCat cat = new CourseCat();
		
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
		
		// Creating course offerings
		cat.createOffering(cat.getCourseList().get(1), 1, 200);
		cat.createOffering(cat.getCourseList().get(1), 2, 160);
		cat.createOffering(cat.getCourseList().get(1), 3, 180);
		cat.createOffering(cat.getCourseList().get(2), 1, 151);
		cat.createOffering(cat.getCourseList().get(2), 2, 190);
		cat.createOffering(cat.getCourseList().get(3), 1, 200);
		cat.createOffering(cat.getCourseList().get(3), 2, 185);
		cat.createOffering(cat.getCourseList().get(3), 3, 169);
		cat.createOffering(cat.getCourseList().get(4), 1, 171);
		cat.createOffering(cat.getCourseList().get(5), 1, 182);
		cat.createOffering(cat.getCourseList().get(6), 1, 198);
		cat.createOffering(cat.getCourseList().get(6), 2, 200);
		cat.createOffering(cat.getCourseList().get(7), 1, 200);
		cat.createOffering(cat.getCourseList().get(7), 2, 156);
		cat.createOffering(cat.getCourseList().get(8), 1, 153);
		cat.createOffering(cat.getCourseList().get(9), 1, 200);
		cat.createOffering(cat.getCourseList().get(9), 2, 188);
		cat.createOffering(cat.getCourseList().get(10), 1, 177);
		cat.createOffering(cat.getCourseList().get(10), 2, 200);
		cat.createOffering(cat.getCourseList().get(0), 1, 163);		
		
		// Registering students into classes
		st1.registerForCourse(cat, cat.getCourseList().get(1).getCourseName(), cat.getCourseList().get(1).getCourseNum(), 1);
		st1.registerForCourse(cat, cat.getCourseList().get(2).getCourseName(), cat.getCourseList().get(2).getCourseNum(), 1);
		st1.registerForCourse(cat, cat.getCourseList().get(3).getCourseName(), cat.getCourseList().get(3).getCourseNum(), 1);
		st2.registerForCourse(cat, cat.getCourseList().get(4).getCourseName(), cat.getCourseList().get(4).getCourseNum(), 1);
		st3.registerForCourse(cat, cat.getCourseList().get(5).getCourseName(), cat.getCourseList().get(5).getCourseNum(), 1);
		st3.registerForCourse(cat, cat.getCourseList().get(6).getCourseName(), cat.getCourseList().get(6).getCourseNum(), 1);
		st4.registerForCourse(cat, cat.getCourseList().get(7).getCourseName(), cat.getCourseList().get(7).getCourseNum(), 1);
		st4.registerForCourse(cat, cat.getCourseList().get(8).getCourseName(), cat.getCourseList().get(8).getCourseNum(), 1);
		st5.registerForCourse(cat, cat.getCourseList().get(9).getCourseName(), cat.getCourseList().get(9).getCourseNum(), 2);
		st6.registerForCourse(cat, cat.getCourseList().get(10).getCourseName(), cat.getCourseList().get(10).getCourseNum(), 1);
		st6.registerForCourse(cat, cat.getCourseList().get(0).getCourseName(), cat.getCourseList().get(0).getCourseNum(), 1);
		st6.registerForCourse(cat, cat.getCourseList().get(1).getCourseName(), cat.getCourseList().get(1).getCourseNum(), 2);
		st7.registerForCourse(cat, cat.getCourseList().get(2).getCourseName(), cat.getCourseList().get(2).getCourseNum(), 2);
		st7.registerForCourse(cat, cat.getCourseList().get(3).getCourseName(), cat.getCourseList().get(3).getCourseNum(), 2);
		st7.registerForCourse(cat, cat.getCourseList().get(4).getCourseName(), cat.getCourseList().get(4).getCourseNum(), 1);
		st8.registerForCourse(cat, cat.getCourseList().get(5).getCourseName(), cat.getCourseList().get(5).getCourseNum(), 1);
		st8.registerForCourse(cat, cat.getCourseList().get(6).getCourseName(), cat.getCourseList().get(6).getCourseNum(), 2);
		st9.registerForCourse(cat, cat.getCourseList().get(7).getCourseName(), cat.getCourseList().get(7).getCourseNum(), 2);
		st10.registerForCourse(cat, cat.getCourseList().get(8).getCourseName(), cat.getCourseList().get(8).getCourseNum(), 1);
		st10.registerForCourse(cat, cat.getCourseList().get(9).getCourseName(), cat.getCourseList().get(9).getCourseNum(), 1);
		st10.registerForCourse(cat, cat.getCourseList().get(10).getCourseName(), cat.getCourseList().get(10).getCourseNum(), 2);
		st11.registerForCourse(cat, cat.getCourseList().get(0).getCourseName(), cat.getCourseList().get(0).getCourseNum(), 1);
		st11.registerForCourse(cat, cat.getCourseList().get(1).getCourseName(), cat.getCourseList().get(1).getCourseNum(), 3);
		st12.registerForCourse(cat, cat.getCourseList().get(2).getCourseName(), cat.getCourseList().get(2).getCourseNum(), 1);
		st12.registerForCourse(cat, cat.getCourseList().get(3).getCourseName(), cat.getCourseList().get(3).getCourseNum(), 3);
		st1.registerForCourse(cat, cat.getCourseList().get(4).getCourseName(), cat.getCourseList().get(4).getCourseNum(), 1);
		st2.registerForCourse(cat, cat.getCourseList().get(5).getCourseName(), cat.getCourseList().get(5).getCourseNum(), 1);
		st3.registerForCourse(cat, cat.getCourseList().get(6).getCourseName(), cat.getCourseList().get(6).getCourseNum(), 2);
		st4.registerForCourse(cat, cat.getCourseList().get(7).getCourseName(), cat.getCourseList().get(7).getCourseNum(), 1);
		st5.registerForCourse(cat, cat.getCourseList().get(8).getCourseName(), cat.getCourseList().get(8).getCourseNum(), 1);
		st6.registerForCourse(cat, cat.getCourseList().get(9).getCourseName(), cat.getCourseList().get(9).getCourseNum(), 2);
		st7.registerForCourse(cat, cat.getCourseList().get(10).getCourseName(), cat.getCourseList().get(10).getCourseNum(), 1);
		
		// Declaring necessary variables for loop exits, course requirements, prompts etc.
		boolean optionQuit = true;
		boolean studentQuit = false;
		boolean courseQuit = false;
		boolean sectionQuit = false;
		boolean addMatch = false;
		boolean removeMatch = false;
		int userSelection;
		int courseMax = 6;
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
								if(courseCount < courseMax) {
									
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

											// Checking how many sections are available for the course
											int foundCourse = 0;
											String courseTest = courseName + " " + courseNum;
											for(int i = 0; i < cat.getCourseList().size(); i++) {
												String courseTestRef = cat.getCourseList().get(i).getCourseName() + " " + cat.getCourseList().get(i).getCourseNum();
												if(courseTest.equals(courseTestRef)) {
													reader.display(courseTestRef);
													foundCourse = i;
												}
											}
																					
											// Setting course parameters
											if(cat.getCourseList().get(foundCourse) != null) {
												
												// Check if they have already taken or are taking that course
												for(int i = 0; i < courseCount; i++) {
													if(s1.getRegList().get(i).toString().equals(cat.getCourseList().get(foundCourse).getCourseName() + " " + cat.getCourseList().get(foundCourse).getCourseNum())) {
														addMatch = true;
													}
												}

												if(addMatch == false) {
													
													int offeringCount = cat.getCourseList().get(foundCourse).getOfferingList().size();
											
													// Display course/section options
													reader.display('\n' + "Course " + courseName + " " + courseNum + " was found!" + '\n');
													
													// Getting user's section selection
													reader.prompt("There are " + offeringCount + " sections available, which one would you like to select?" + '\n');
													String section = reader.getKeyboardInput();
													try {
														while(sectionQuit == false) {
															int sectionNum = Integer.parseInt(section);
															
															// Checking if it's a valid section and adding course for the student
															if(sectionNum > 0 && sectionNum <= offeringCount) {
																
																int studentCount = cat.getCourseList().get(foundCourse).getOfferingList().get(sectionNum).getStudentList().size();
																
																// Only allowing less than the student limit into the class
																if(cat.getCourseList().get(foundCourse).getOfferingList().get(sectionNum).getStudentList().size() < cat.getCourseList().get(foundCourse).getOfferingList().get(sectionNum).getSectionCap()) {
																	
																	// Registering the student to the course
																	s1.registerForCourse(cat, courseName, courseNum, sectionNum);
																	
																	// Confirmation to the user
																	reader.display("Section " + sectionNum + " was selected." + '\n' + '\n');
																	reader.display("You have been added to " + courseName + " " + courseNum + " Section " + sectionNum + '\n');
																											
																	sectionQuit = true;
																}
																
																else {
																	reader.display("There are too many students in this section, please try another offering" + '\n');
																	sectionQuit = true;
																}
															}
															
															// Repeating for invalid section selection
															else {
																reader.display("That was an invalid entry, please try again" + '\n');
																sectionQuit = true;
															}
														}
														
														// Catching invalid section entry types
													} catch(NumberFormatException e){
														reader.display("That was an invalid entry, please try again" + '\n');
													}
												}	
												else {
													reader.display(s1 + " is already taking " + cat.getCourseList().get(foundCourse).getCourseName() + " " + cat.getCourseList().get(foundCourse).getCourseNum() + '\n');
												}
												addMatch = false;
												courseQuit = true;
											}
												
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
											removeMatch = true;
											break;
										}
									}
									
									// Confirmation with the user on what happened
									if(removeMatch == true) {
										reader.display('\n' + course + " was found and has been removed." + '\n');
										removeMatch = false;
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