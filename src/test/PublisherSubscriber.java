package test;

import java.util.ArrayList;
import java.util.List;

public class PublisherSubscriber {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		Publish publish=new Publish(list);
		Subscribe subscribe=new Subscribe(list);
		Thread t=new Thread(publish);
		Thread t1=new Thread(subscribe);
		t.start();
		t1.start();

	}

}
