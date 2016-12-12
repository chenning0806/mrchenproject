package constructor;

import java.util.Hashtable;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int[]  i = new int[]{4,5,2,6,9,3};
		selectSort(i);
		
	}

	public static void selectSort(int [] a) {  
        int n = a.length;  
        for(int k=0; k<n-1; k++) {  
            int min = k;  
            for(int i=k+1; i<n; i++) {  
                if(a[i] < a[min]) {  
                    min = i;  
                }  
            }  
            if(k != min) {  
                int temp = a[k];  
                a[k] = a[min];  
                a[min] = temp;  
            }  
        }  
    }  
}
