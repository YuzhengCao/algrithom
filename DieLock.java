package test;

public class DieLock {
	enum Key {
		KEY1,KEY2
	}
	
	public static void main(String[] args) {
		new Thread(() -> {
			synchronized (Key.KEY1) {
				 
				System.out.println(" DieLock Key.key1");
	 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (Key.KEY2) {
					// 此时要获取key
					System.out.println(" DieLock Key.key2");
				}
	 
			}
		}).start();
		new Thread(() -> {
			synchronized (Key.KEY2) {
				System.out.println(" DieLock1 Key.key2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (Key.KEY1) {
	 
				}
	 
			}
		}).start();
 
	}
 
}
