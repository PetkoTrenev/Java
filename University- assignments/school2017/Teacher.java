
package school2017;


public class Teacher extends Person{

	private Course course;
	
	public Teacher(String name, String EGN, Course course){
		super(name, EGN);
		this.course = course;
	}
	
	public void setCourse(Course course){
		this.course = course;
	}
	
	public Course getCourse(){
		return course;
	}

}
