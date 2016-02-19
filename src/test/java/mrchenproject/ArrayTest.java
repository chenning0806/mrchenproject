package mrchenproject;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] array = {85,1,1,0,85,2,2,1,5,85,1,1,0,85,1,1,0,85,3,2,3,2,1};
		
		splitArray(array);

	}

	private static void splitArray(int[] array) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			if(array[i]==85){
				for (int j = i+1; j < length; j++) {
					if(j==length-1){
						System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, length)));
						break;
					}
					else{
						if (array[j]==85) {
							System.out.println(Arrays.toString(Arrays.copyOfRange(array, i, j)));
							break;
						}
					}
				}
			}
		}
		
	}

}
