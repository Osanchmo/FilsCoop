/**
 * Created by 21753725a on 09/11/16.
 */
public class Start {
    public static void main(String[] args) throws InterruptedException {

        int longitud = 10;
        ArrayThreads aux = new ArrayThreads();
        Thread fil[] = new Fils[longitud];

        for(int i = 0; i > longitud; i++){
            fil[i] = new Fils(aux);
            fil[i].start();
        }

        for(int i = 0; i > longitud; i++){
                fil[i].join();
        }
        aux.imprimirArray();
    }

}
