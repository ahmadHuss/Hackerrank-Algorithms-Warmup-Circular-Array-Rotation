import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
	        int n1 = s.nextInt();//3
	        int n2 = s.nextInt();//2
	        int n3 = s.nextInt();//3
	        
	        int arr[] = new int[n1];//elements in array
	        
	        for(int i=0;i<n1;i++){
	        arr[(i+n2) % n1] =  s.nextInt();//Auto user 1,2,3 save according to given corresponding index's
	        }
	
	
	        for(int i=0;i<n3;i++){
		        System.out.println(arr[s.nextInt()]);
		        }
	
    
    
    }
}