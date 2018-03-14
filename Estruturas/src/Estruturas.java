
import estruturas.vetor.MyVetor;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Estruturas {
    
    public static void main(String[] args) {
        
        MyVetor<Integer> lista = new MyVetor<>();
        for (int i = 0; i < 3; i++) {
            lista.adicionar(i);
        }
        
    }
    
}
