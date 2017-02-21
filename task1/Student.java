package task1;

public class Student extends Human {
	private int course;
	private int group;
	private String specialty;

	public Student(String name, String surname, int age, boolean sex, int course, int group, String specialty) {
		super(name, surname, age, sex);
		this.course = course;
		this.group = group;
		this.specialty = specialty;
	}

	public Student(String name, String surname, int age, boolean sex) {
		super(name, surname, age, sex);
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Student "+super.toString() + "course=" + course + ", group=" + group + ", specialty=" + specialty
				+ "]";
		
	}

}
