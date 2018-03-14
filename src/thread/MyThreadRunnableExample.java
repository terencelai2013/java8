package thread;

/**
 * Created by icorda on 21/08/2016.
 */
public class MyThreadRunnableExample implements Runnable{
    public void run(){
        System.out.println("This thread " + new thread.MyRunnableThread() + " is running");
    }
}
