package ch05;

public class Ex01 {
	
	public static void main(String[] args) {
		int[] arr1; //int형 x, int배열형 o
		int[] arr2;
		int[] arr3;
		
		arr1=new int[] {1,2,3};
		arr2=new int[] {1,2,3};
		arr3=arr2;
		
		System.out.println(arr1==arr2);
		System.out.println(arr2==arr3);
	}

}