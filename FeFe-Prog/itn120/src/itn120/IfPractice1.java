package itn120;

public class IfPractice1 {

	public static void main(String[] args) {
		//if practice
		int age = 17;
		
		
		//if-else structure ex age
		if(age >= 18) {
			System.out.println("ADULT");
		}
		else {
			System.out.println("MINOR");
		}
		
		
		//if-else if-else structure
		double grade = 73.5;
		String letGrade = null;
		
		if(grade >= 90) {
			letGrade = "A";
		}
		else if (grade >= 80) { 
			letGrade = "B";
		}
		else if (grade >= 70) {
			letGrade = "C";
		}
		else if (grade >= 60) {
			letGrade = "D";
		}
		else {
			letGrade = "F";
		}
		
		System.out.println(letGrade);
	}

}
