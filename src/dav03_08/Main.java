package dav03_08;


import org.w3c.dom.css.Counter;

class MyThread implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            try{
                System.out.println("Hello world");
                Thread.sleep(2000);

            }catch (InterruptedException e){
            e.printStackTrace();
            }
        }
    }
}

class CounterThread extends Thread{
    private int sleepTime;
  CounterThread(String name,int sleepTime){
      super(name);
      this.sleepTime=sleepTime;
  }
    @Override
    public void run() {

        System.out.println(getName()+ " Started working");
        for(int i =1; i <11;i++){
            try{
                System.out.println(i);
                Thread.sleep(sleepTime);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Main {


    public static void main(String[] args) {

        /*n1
     MyThread myThread = new MyThread();
     Thread  thread = new Thread(myThread);
      thread.start();

         */

        new CounterThread("Thread1",3000).start();

    }
}
