package task1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Human h1 = new Human();
		Student s1 = new Student("Alex", "Sydor", 21, true, 1, 2, "Economic");
		Group g1 = new Group();
		try {
			g1.addStudent(s1);
		} catch (GroupIsAlreadyFullException e) {
			System.out.println(e.getMessage());
		}

		Human h2 = new Human();
		Student s2 = new Student("Alex", "Rydor", 21, true, 1, 2, "Economic");
		try {
			g1.addStudent(s2);
		} catch (GroupIsAlreadyFullException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(g1.toString());
		g1.showInformation();
		g1.deleteStudent(s1);

		g1.findStudentBySurname("Sydor");
		g1.showInformation();
	}

}
