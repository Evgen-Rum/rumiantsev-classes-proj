package classes;

public class Task1 {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Petr", "Vasilyev");
		teacher1.setAge(36);
		teacher1.setDepartment("IT");
		teacher1.setPosition("Teacher/Group curator");
		teacher1.setSalary(1500);
		System.out.println(teacher1);
		
		Student student1 = new Student("Victor", "Ivanov");
		student1.setAgeS(18);
		student1.setFaculty("FCS");
		student1.setPosition("Student");
		student1.setScholarship(90);
		System.out.println(student1);
		
		Student student2 = new Student("Ivan", "Petrov");
		student2.setScholarship(90);
		Student student3 = new Student("Anton", "Marvel");
		student3.setScholarship(90);
		
		Group group1 = new Group();
		group1.setGroupName("P22");
		group1.setSpecializ("Programmer");
		group1.setCurator(teacher1);
		group1.addStudents(student1);
		group1.addStudents(student2);
		group1.addStudents(student3);
		System.out.println(group1);
		
		group1.removeStudents(student2.getId());
		System.out.println(group1);
		
		Student student4 = new Student("Nikolay", "Kirov");
		student4.setMarks("Good");
		student4.addScholarship(student4);
		
		group1.addStudents(student4);
		System.out.println(group1);
		
		group1.removeStudents(student1.getId());
		group1.removeStudents(student3.getId());
		System.out.println(group1);
		
		Student student5 = new Student("Ilya", "Sidorenko");
		student5.setMarks("Bad");
		student5.addScholarship(student5);
		
		group1.addStudents(student5);
		System.out.println(group1);
		}
	}
