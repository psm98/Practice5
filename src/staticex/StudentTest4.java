package staticex;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee =new Student2();
		studentLee.setStudentName("������");
		System.out.println(studentLee.getSerialNum());
		System.out.println(studentLee.studentName + "�й�: "+ studentLee.studentID+ " �л�ī��: " + studentLee.studentCard);
		
		Student2 studentSon = new Student2();
		studentSon.setStudentName("�ռ���");
		System.out.println(studentSon.getSerialNum());
		System.out.println(studentSon.studentName + "�й�: "+ studentSon.studentID + " �л�ī��: "+ studentSon.studentCard);

	}

}
