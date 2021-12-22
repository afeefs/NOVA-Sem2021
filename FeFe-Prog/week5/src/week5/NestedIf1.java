package week5;

public class NestedIf1 {
		public static void main(String[] args) {
			//practice nested IF statements
			/*
			 * age >= 18
			 * gender = m
			 * tt- adult male
			 * tf- adult female
			 * ft- youth male
			 * ffyouth female
			 * */
			int age = 17;
			char gender = 'm';
			String league = null;
			
			if(age >= 18) {
				if(gender == 'm') {
					league = "Adult Male";
				}
				else {
					league = "Adult Female";
				}
			}
			else {
				if(gender ==  'm') {
					league = "Youth Male";
				}
				else {
					league = "Youth Female";
				}
			}
			System.out.println("You are on " + league + " league.");
			
			
			
		}

}
