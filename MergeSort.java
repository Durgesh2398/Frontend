package javaa;
import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int o=m+n;
		int ar[]=new int[m];
		int arr[]=new int[n];
		int arrr[]=new int [o];
		System.out.println("enter number of values in array 1");
		for(int i=0;i<m;i++){
			ar[i]=sc.nextInt();
		}
		System.out.println("enter number of values in array 2");
		for(int j=0;j<n;j++){
			arr[j]=sc.nextInt();
		}
		int k=0,i=0,j=0;
		while( i<m&& j<n){
			if(ar[i]<arr[j]){
				arrr[k]=ar[i];
				i++;
				k++;
			}
			else {
				arrr[k]=arr[j];
				j++;
				k++;
			}
		}
		while(i<m){
			arrr[k]=ar[i];
			i++;
			k++;
		}
		while(j<n){
			arrr[k]=arr[j];
			j++;
			k++;
		}
		for(k=0;k<o;k++){
			System.out.print(arrr[k]+"	");
		}
	}
}