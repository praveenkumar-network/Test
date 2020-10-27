package test;

import java.util.LinkedList;
import java.util.List;

public class assignment {

	static int upperBoundResult=0;
	static int lowerBoundResult=0;
	public static void main(String[] args) {

		int upperBound=10;
		int loweBound=5;
		
		List<Integer> list=new LinkedList<Integer>();

		assignment assignmentObj=new assignment();
		
		for(int i=0;i<=10;i++) {
			assignmentObj.addElement(list,i,upperBound);	
		}
		System.out.println(list.toString());
		
		for(int i=0;i<=5;i++) {
			assignmentObj.removeElement(list,i,loweBound);	
		}
		System.out.println(list.toString());
	}
	
	public List addElement(List<Integer> list,int element,int upperBound){
		if(upperBound >=upperBoundResult) {
		list.add(element);
		upperBoundResult++;
		lowerBoundResult++;
		}
		return list;
	}
	
	public List removeElement(List<Integer> list,int element,int lowerBound){
		if(lowerBound<=lowerBoundResult) {
		list.remove(element);
		lowerBoundResult--;
		}
		return list;
	}

}
