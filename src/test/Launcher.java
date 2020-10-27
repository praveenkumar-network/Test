package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Launcher {

	public static void main(String[] args) {
		ABC abc=new XYZ();
		//abc.m1();

		List<String> list=new ArrayList<>();
		list.add("Praveen1");
		list.add("Praveen2");
		list.add("Praveen3");
		list.add("Praveen4");
		list.add("Praveen5");
		
		List<String> result=list.stream().
				filter(a->a.contains("Praveen")).
				collect(Collectors.toList());
	System.out.println(result.toString());
	}

}
