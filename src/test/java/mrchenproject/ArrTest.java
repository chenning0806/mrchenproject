package mrchenproject;

public class ArrTest {

	public static void main(String[] args) {

		
		int[] arr = {12,42,534,7,456,34,34,22222,1231231231,123,1,1,1,1,1,11,-11};
//		int index = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]<arr[index]){
//				index=i;
//			}
//		}
//		System.out.println(arr[index]+"");
		
//		//选择排序
//		for (int i = 0; i < arr.length-1; i++) {
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i]>arr[j]){
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+",");
//		}
		//冒泡排序
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}

}
