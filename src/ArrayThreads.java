/**
 * Created by 21753725a on 09/11/16.
 */
public class ArrayThreads {

    private int pos[] = new int[1000];
    private String noms[] = new String[1000];

    public void omplirArray( String nom, int valor, int posicio){
        this.noms[posicio] = nom;
        this.pos[posicio] = valor;
    }
    public void imprimirArray(){
        for(int i = 0; i>1000;i++){
            System.out.println("en la posicio: " + i + " ha escrit el " + this.noms[i] + " el numero " + this.pos[i]);
        }
    }

}
