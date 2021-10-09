package classes;

public class Task1 extends AccountantUtil {
	public static void main(String[] args) {

		Teacher teacher1 = new Teacher();
		teacher1.setPosition("Teacher");
		teacher1.setAcademDegree("Professor");
		teacher1.setExperience(10);
		teacher1.setFirstName("Vasiliy");
		teacher1.setLastName("Sutkin");
		teacher1.setId();
		teacher1.setSubjects("Math");
		teacher1.setAge(45);
		addAcademicPay(teacher1);
		addPrize(teacher1);
		addSalary(teacher1);
		System.out.println(teacher1.toString() + "\t" + teacher1.intoducedYourself() + "\n");

		Teacher teacher2 = new Teacher();
		teacher2.setPosition("Teacher");
		teacher2.setAcademDegree("Docent");
		teacher2.setExperience(5);
		teacher2.setFirstName("Ivan");
		teacher2.setLastName("Driev");
		teacher2.setId();
		teacher2.setSubjects("Comp. Science");
		teacher2.setAge(31);
		addAcademicPay(teacher2);
		addPrize(teacher2);
		addSalary(teacher2);
		System.out.println(teacher2.toString() + "\t" + teacher2.intoducedYourself() + "\n");

		Teacher teacher3 = new Teacher();
		teacher3.setPosition("Teacher");
		teacher3.setAcademDegree("Head of chair");
		teacher3.setExperience(16);
		teacher3.setFirstName("Dmitry");
		teacher3.setLastName("Cidorov");
		teacher3.setId();
		teacher3.setSubjects("Java dev");
		teacher3.setAge(36);
		addAcademicPay(teacher3);
		addPrize(teacher3);
		addSalary(teacher3);
		System.out.println(teacher3.toString() + "\t" + teacher3.intoducedYourself() + "\n");

		Teacher teacher4 = new Teacher();
		teacher4.setPosition("Teacher");
		teacher4.setAcademDegree("Professor");
		teacher4.setExperience(32);
		teacher4.setFirstName("Ivan");
		teacher4.setLastName("Petrenko");
		teacher4.setId();
		teacher4.setSubjects("Java dev");
		teacher4.setAge(72);
		addAcademicPay(teacher4);
		addPrize(teacher4);
		addSalary(teacher4);
		System.out.println(teacher4.toString() + "\t" + teacher4.intoducedYourself() + "\n");

		Cleaner cleaner1 = new Cleaner();
		cleaner1.setExperience(8);
		cleaner1.setFirstName("Peter");
		cleaner1.setLastName("Gavrilov");
		cleaner1.setAge(40);
		cleaner1.setPosition("Cleaner");
		cleaner1.setSchedule("18:00 - 21:00");
		addPrize(cleaner1);
		addSalary(cleaner1);
		System.out.println(cleaner1.toString() + "\t" + cleaner1.intoducedYourself() + "\n");

		Chair ch1 = new Chair();
		ch1.setHeadOfChair(teacher3);
		ch1.setCleaner(cleaner1);
		ch1.addTeacher(teacher1);
		ch1.addTeacher(teacher2);
		ch1.setChairName("IT");
		System.out.println(ch1.toString());
		ch1.removeTeachers(teacher1.getId());
		System.out.println(ch1.toString());
		ch1.addTeacher(teacher4);
		System.out.println(ch1.toString());

		Student student1 = new Student();
		student1.setAge(18);
		student1.setFaculty("IT");
		student1.setFirstName("Petr");
		student1.setLastName("Ivanov");
		student1.setMarks("Good");
		student1.setPosition("Head of Group");
		student1.setId();
		student1.addScholarship(student1);
		System.out.println(student1.toString() + "\t" + student1.intoducedYourself() + "\n");

		Student student2 = new Student();
		student2.setId();
		student2.setAge(18);
		student2.setFaculty("IT");
		student2.setFirstName("Misha");
		student2.setLastName("Cidorov");
		student2.setMarks("Bad");
		student2.setPosition("Student");
		student2.addScholarship(student2);
		System.out.println(student2.toString() + "\t" + student2.intoducedYourself() + "\n");

		Student student3 = new Student();
		student3.setId();
		student3.setAge(18);
		student3.setFaculty("Eng");
		student3.setFirstName("Dasha");
		student3.setLastName("Nikitsina");
		student3.setMarks("Good");
		student3.setPosition("Student");
		student3.addScholarship(student3);
		System.out.println(student3.toString() + "\t" + student3.intoducedYourself() + "\n");

		Student student4 = new Student();
		student4.setId();
		student4.setAge(18);
		student4.setFaculty("IT");
		student4.setFirstName("Nastya");
		student4.setLastName("Konovalova");
		student4.setMarks("Bad");
		student4.setPosition("Student");
		student4.addScholarship(student4);
		System.out.println(student4.toString() + "\t" + student4.intoducedYourself() + "\n");

		Group gr1 = new Group();
		gr1.setCurator(teacher1);
		gr1.setGroupName("911101");
		gr1.setSpecializ("IT");
		gr1.addStudents(student1);
		gr1.addStudents(student2);
		gr1.addStudents(student3);
		System.out.println(gr1.toString());
		gr1.removeStudents(student2);
		System.out.println(gr1.toString());
		gr1.addStudents(student4);
		System.out.println(gr1.toString());
	}
}
