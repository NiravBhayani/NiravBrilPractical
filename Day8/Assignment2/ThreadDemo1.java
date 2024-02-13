package Day8.Assignment2;

public class ThreadDemo1 extends Thread{
    public ThreadDemo1(){

    }
    public ThreadDemo1(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i=1;i<=5000;i++){
            System.out.println("Thread "+Thread.currentThread().getName()+":"+i);
            if (i%50==0){
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
