import java.util.Scanner;



public class TestRunable {

	public static void main(String[] args) {
		MyRunable runable=new MyRunable();
		Thread thread1=new Thread(runable,"one");
		MyRunable2 thread2=new MyRunable2("two");
		thread1.start();
		thread2.start();
		// TODO Auto-generated method stub
		
		
	}

}
class MyRunable implements Runnable {
	@Override
	public void run(){
		int i=(int)(Math.random()*100);
		int j=(int)(Math.random()*100);
		System.out.println("��������ʱ�䣬����"+i+"��"+j+"�ĺ͡�");
		Scanner in=new Scanner(System.in);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("������С�ĳ�������ˣ�����������������ɣ���֪���ǲ��ǳ���˯����ʱ�򱻴����ˡ�:"+e.getMessage());
			return;
		};
		while(true){
			int g=in.nextInt();
			if(g==i+j){
				System.out.println("��ϲ���óɾ͡���С�ĳɹ��ˡ�");
				break;
			}else{
				System.out.println("�������ٽ����������˲���˵���а���");
			}
		}	
		System.out.println(Thread.currentThread().getName());		
	}
	
}

class MyRunable2 extends Thread{
	MyRunable2(String s){
		super(s);
	}
	@Override
	public void run(){
		
		
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
}