/**
 * 
 * @author Mason Vischer
 * Purpose: To be used in Course class to iterate through the Assignment[]
 */
public class CourseIterator implements Iterator {
	private Assignment[] assignments;
	private int position = 0;
	
	/**
	 * 
	 * @param assignments
	 * Purpose: Constructor for course iterator
	 */
	public CourseIterator(Assignment[] assignments) {
		this.assignments = assignments;
	}
	
	/**
	 * @return boolean
	 * Purpose: checks to see if the array has a spot one above the current position
	 */
	public boolean hasNext() {
		if(position >= assignments.length || assignments[position] == null)
			return false;
		else
			return true;
	}
	
	/**
	 * @return Assignment
	 * Purpose: returns the current assignment and then moves the position forward
	 */
	public Assignment next() {
		Assignment assignment = assignments[position];
		position = position + 1;
		return assignment;
	}
}
