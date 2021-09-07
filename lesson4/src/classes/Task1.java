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
		addAcademicPay(teacher1);
		addPrizeT(teacher1);
		addSalaryT(teacher1);
		System.out.println(teacher1.toString());

		Teacher teacher2 = new Teacher();
		teacher2.setPosition("Teacher");
		teacher2.setAcademDegree("Docent");
		teacher2.setExperience(5);
		teacher2.setFirstName("Ivan");
		teacher2.setLastName("Driev");
		teacher2.setId();
		teacher2.setSubjects("Comp. Science");
		addAcademicPay(teacher2);
		addPrizeT(teacher2);
		addSalaryT(teacher2);
		System.out.println(teacher2.toString());

		Teacher teacher3 = new Teacher();
		teacher3.setPosition("Teacher");
		teacher3.setAcademDegree("Head of chair");
		teacher3.setExperience(16);
		teacher3.setFirstName("Dmitry");
		teacher3.setLastName("Cidorov");
		teacher3.setId();
		teacher3.setSubjects("Java dev");
		addAcademicPay(teacher3);
		addPrizeT(teacher3);
		addSalaryT(teacher3);
		System.out.println(teacher3.toString());

		Teacher teacher4 = new Teacher();
		teacher4.setPosition("Teacher");
		teacher4.setAcademDegree("Professor");
		teacher4.setExperience(30);
		teacher4.setFirstName("Ivan");
		teacher4.setLastName("Petrenko");
		teacher4.setId();
		teacher4.setSubjects("Java dev");
		addAcademicPay(teacher4);
		addPrizeT(teacher4);
		addSalaryT(teacher4);
		System.out.println(teacher4.toString());

		Cleaner cleaner1 = new Cleaner();
		cleaner1.setAge(40);
		cleaner1.setPosition("Cleaner");
		addPrizeC(cleaner1);
		addSalaryC(cleaner1);

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
		student1.addScholarship(student1);

		Student student2 = new Student();
		student2.setAge(18);
		student2.setFaculty("IT");
		student2.setFirstName("Misha");
		student2.setLastName("Cidorov");
		student2.setMarks("Bad");
		student2.setPosition("Student");
		student2.addScholarship(student2);

		Student student3 = new Student();
		student3.setAge(18);
		student3.setFaculty("Eng");
		student3.setFirstName("Dasha");
		student3.setLastName("Nikitsina");
		student3.setMarks("Good");
		student3.setPosition("Student");
		student3.addScholarship(student3);
		
		Student student4 = new Student();
		student4.setAge(18);
		student4.setFaculty("IT");
		student4.setFirstName("Nastya");
		student4.setLastName("Konovalova");
		student4.setMarks("Bad");
		student4.setPosition("Student");
		student4.addScholarship(student4);

		Group gr1 = new Group();
		gr1.addStudents(student1);
		gr1.addStudents(student2);
		gr1.addStudents(student3);
		System.out.println(gr1.toString());
		gr1.removeStudents(student2.getId());
		System.out.println(gr1.toString());
		gr1.addStudents(student4);
		System.out.println(gr1.toString());
	}
}
