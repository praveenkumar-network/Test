package test;

import java.util.List;

public class Subscribe implements Runnable{
	private List<Integer> list;
	public Subscribe() {
	}
	public Subscribe(List<Integer> list) {
		this.list = list;
	}


	@Override
	public void run() {
		synchronized (list) {
			while(list.isEmpty() || list.size()==0) {
			try {
				list.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			}
		}
		
		synchronized (list) {
			for(int i=0;i<10;i++) {
				System.out.println("Publisher List Element before removing "+list.toString());
				boolean b=list.remove(new Integer(i));
			System.out.println(Thread.currentThread().getName()+" subscriber removing "+i+" List Element after removing -> "+i+" "+list.toString());
			list.notify();
			}
		}
		
		

		
	}
}
