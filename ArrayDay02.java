package array;

import java.util.Arrays;

public class ArrayDay02 {

	public static void main(String[] args) {
		int [][] numbers = {{10,20,30},{40,50,60}};
//		System.out.println(Arrays.deepToString(numbers));
		
//		for(int num[] : numbers) {
//			for(int num1 : num) {
//				System.out.println(num1);
//			}
//		}
		
		int [][] num2 = new int[2][3];
		num2[0][0]=10;
		num2[0][1]=20;
		num2[0][2]=30;
		num2[1][0]=40;
		num2[1][1]=50;
		num2[1][2]=60;
		
		System.out.println(Arrays.deepToString(num2));
	}
	
}
