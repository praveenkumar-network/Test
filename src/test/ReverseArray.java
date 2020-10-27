package test;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[]=new int[] {1,2,3,4,5,6};
		int temp=0;
		for(int i=0,j=array.length-1;i<array.length/2;i++,j--) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}

	}

}
