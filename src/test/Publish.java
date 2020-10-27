package test;

import java.util.List;

public class Publish implements Runnable{
	private List<Integer> list;
	
	public Publish() {
	}
	
	public Publish(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		
		synchronized (list) {
			for(int i=0;i<10;i++) {
				list.add(i);
				System.out.println(Thread.currentThread().getName()+" Publish added " +i);
				list.notify();
			}
			System.out.println("Publisher publish all element "+list.toString());
			System.out.println(" ");
		}
		
		synchronized (list) {
			while(list.size()>10) {
				try {
					list.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
