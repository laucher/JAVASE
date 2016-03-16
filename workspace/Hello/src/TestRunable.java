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
		System.out.println("给你五秒时间，计算"+i+"和"+j+"的和。");
		Scanner in=new Scanner(System.in);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("啊，不小心程序出错了，让我们来看看报错吧，不知道是不是程序睡觉的时候被打扰了。:"+e.getMessage());
			return;
		};
		while(true){
			int g=in.nextInt();
			if(g==i+j){
				System.out.println("恭喜你获得成就—不小心成功了。");
				break;
			}else{
				System.out.println("少年郎再接再厉，男人不能说不行啊！");
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