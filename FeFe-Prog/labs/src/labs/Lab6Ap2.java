package labs;
import java.util.Arrays;
//seperate class for find1() method
public class Lab6Ap2 {
	//method arguments are the plate number and the array
	public static int find1(String plateN, String[] plateArr) {
		int index = 0;
		java.util.Arrays.sort(plateArr); //array is sorted
		index = java.util.Arrays.binarySearch(plateArr, plateN); //the index of the plate number is found
		return index;
	}
}
