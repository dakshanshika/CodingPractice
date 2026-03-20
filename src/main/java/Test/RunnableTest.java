package Test;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Runable interface "+Thread.currentThread().getName());

        for(int i=0; i<3; i++){
            System.out.println("I am a Brain");
            System.out.println("I achieve everything what i desire for");

            System.out.println("*****************************************");
        }

        System.out.println("----------------------------------------------");
        System.out.println(Thread.currentThread().getName());
    }
}
