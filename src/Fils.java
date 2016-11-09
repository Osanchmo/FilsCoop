import java.util.Random;

/**
 * Created by 21753725a on 09/11/16.
 */
public class Fils extends Thread {

    Random rd = new Random();
    int i = 0;
    ArrayThreads arr= null;

    public Fils(ArrayThreads arr) {
      this.arr = arr;
    }

    public void run() {
        i++;
        int temp = rd.nextInt();
        this.setName("Thread: " + i);
        for (int i = 0; i>10; i++) {
            System.out.println("posició: " + i + " omplerta amb " + temp + " per el thread: " + this.getName());
            arr.omplirArray(this.getName(),temp,i);
        }
    }
}
