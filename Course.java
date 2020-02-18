/**
 * 
 * @author Mason Vischer
 * Purpose: Combines all of the functionality from iterator and assignment classes together. Creates an array of assignments to represent a course
 */
public class Course {
	public static final int INIT_SIZE = 5;
	private Assignment[] assignments;
	private int count = 0;
	private String title;
	private String name;
	
	/**
	 * 
	 * @param title
	 * @param name
	 * Purpose: Constructor for Course
	 */
	public Course(String title, String name) {
		this.title = title; 
		this.name = name;
		this.assignments = new Assignment[INIT_SIZE];
	}
	
	/**
	 * 
	 * @param title
	 * @param description
	 * @param topic
	 * @param points
	 * Purpose: adds a new assignment with attributes from parameters to the assignments array
	 */
	public void addAssignment(String title, String description, String topic, int points) {
		if(count >= assignments.length) {
			this.assignments = growArray(assignments);
		}
		assignments[count] = new Assignment(title, description, topic, points);
		count = count + 1;
	}
	
	/**
	 * 
	 * @return CourseIterator
	 * Purpose: To implement the Course iterator
	 */
	public CourseIterator createIterator() {
		return new CourseIterator(assignments);
	}
	
	/**
	 * 
	 * @return double
	 * Purpose: calculate the weight of each assignment by dividing 100 by the assignment count
	 */
	public double getAssignmentWeights() {
		return Math.floor(100.0/count);
	}
	
	/**
	 * @return String
	 * Purpose: to return the name and title of the course
	 */
	public String toString() {
		return this.title+": "+this.name;
	}
	
	/**
	 * 
	 * @param first
	 * @return Assignment[]
	 * Purpose: doubles the assignment arrays size
	 */
	private Assignment[] growArray(Assignment[] first) {
		Assignment[] newArray = new Assignment[assignments.length*2];
		for(int i=0; i<assignments.length; i++) {
			newArray[i] = assignments[i];
		}
		return newArray;
	}
}
