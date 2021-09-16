package registrationSystem;

import java.util.ArrayList;

public class CourseCat {
	
	private ArrayList <Course> courseList;
	
	public CourseCat () {
		this.courseList = loadFromDB ();
	}

	private static ArrayList<Course> loadFromDB() {
		//In real life course would be loaded for the database or at least some sort of file
		//on disk. 
		
		//So imagine this is being loaded from the database!
		
		ArrayList <Course> imaginaryDB = new ArrayList <Course> ();
		
		imaginaryDB.add(new Course ("ENGG", 233));
		imaginaryDB.add(new Course ("ENSF", 607));
		imaginaryDB.add(new Course ("PHYS", 259));
		imaginaryDB.add(new Course ("ENGG", 201));
		imaginaryDB.add(new Course ("ENGG", 357));
		imaginaryDB.add(new Course ("ENSF", 608));
		imaginaryDB.add(new Course ("ENSF", 612));
		imaginaryDB.add(new Course ("ENSF", 614));
		imaginaryDB.add(new Course ("ENME", 341));
		imaginaryDB.add(new Course ("ENME", 479));
		imaginaryDB.add(new Course ("ENME", 485));
		return imaginaryDB;
	}
	public ArrayList <Course> searchCat (String courseName) {
		ArrayList <Course> foundCourses = new ArrayList <Course>();
		return foundCourses;
	}
	public Course searchCat (String courseName, int courseNum) {
		for (Course c: courseList) {
			if (c.getCourseNum() == courseNum && c.getCourseName().equals(courseName)) {
				return c;
			}
		}
		System.err.println("Course " + courseName + " " + courseNum + " does NOT exist!");
		return null;
	}
	
	public void createOffering (Course theCourse, int secNum, int secCap) {
		if (theCourse != null) {
			Offering theOffering = new Offering (secNum, secCap);
			theOffering.setTheCourse(theCourse);   //I set theCourse object reference in the Course
			theCourse.addOffering(theOffering);
		}
	}

	public ArrayList <Course> getCourseList() {
		return this.courseList;
	}

	public void setCourseList(ArrayList <Course> courseList) {
		this.courseList = courseList;
	}
	
	@Override
	public String toString() {
		StringBuffer b1 = new StringBuffer();
		b1.append("Course Catalogue:" + '\n');
		for(int i = 0; i < courseList.size(); i++) {
			b1.append(courseList.get(i));
		}
		String test = b1.toString();
		return test;
	}
}