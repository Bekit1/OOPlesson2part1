package task1;

import java.util.Arrays;

public class Group {
	private Student[] group = new Student[10];

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public void addStudent(Student student) throws GroupIsAlreadyFullException {

		for (int i = 0;; i++) {
			if (i >= group.length)
				throw new GroupIsAlreadyFullException();
			if (group[i] == student) {
				System.out.println("This student already in the group");
				break;
			}
			if (group[i] == null) {
				group[i] = student;
				break;
			}
		}
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == student) {
				group[i] = null;
				break;
			}
		}
	}

	public void findStudentBySurname(String surname) {
		int exist = 0;
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getSurname() == surname) {
				System.out.println("This student is: " + group[i].toString());
				exist++;
				break;
			}
		}
		if (exist == 0) {
			System.out.println("There is no such student");
		}
	}

	public void showInformation() {
		Student[] compare = new Student[10];
		System.arraycopy(group, 0, compare, 0, group.length);
		String[] temp = new String[10];
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				temp[i] = "zzzz";
			} else {
				temp[i] = group[i].getSurname();
			}
		}
		Arrays.sort(temp);
		for (int i = 0; i < group.length; i++) {
			if (temp[i].equalsIgnoreCase("zzzz")) {
				group[i] = null;
			}

			for (int j = 0; j < compare.length; j++) {
				if (compare[j] != null && temp[i].equalsIgnoreCase(compare[j].getSurname())) {
					group[i] = compare[j];
				}
			}
		}
		System.out.println("Group contains such students:");
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null) {
				System.out.println(group[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		Student[] compare = new Student[10];
		System.arraycopy(group, 0, compare, 0, group.length);
		String[] temp = new String[10];
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				temp[i] = "zzzz";
			} else {
				temp[i] = group[i].getSurname();
			}
		}
		Arrays.sort(temp);
		for (int i = 0; i < group.length; i++) {
			if (temp[i].equalsIgnoreCase("zzzz")) {
				group[i] = null;
			}

			for (int j = 0; j < compare.length; j++) {
				if (compare[j] != null && temp[i].equalsIgnoreCase(compare[j].getSurname())) {
					group[i] = compare[j];
				}
			}
		}
		return Arrays.toString(group);

	}
}
