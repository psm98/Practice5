package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("������");
		System.out.println(studentLee.serialNumber);
		studentLee.serialNumber++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.serialNumber);
		System.out.println(studentLee.serialNumber);

	}

}
