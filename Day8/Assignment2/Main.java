package Day8.Assignment2;

public class Main {
    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1("Thread1");
        threadDemo1.start();

        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2,"Thread2");
        thread.start();
    }
}
