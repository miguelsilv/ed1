
import estruturas.vetor.MyVetor;

/**
 *
 * @author Miguel Silva (1271106300)
 */
public class Estruturas {

    public static void main(String[] args) {

        MyVetor<Integer> lista = new MyVetor<>(5);
        lista.adicionar(2, 4);
        System.out.println(lista.tamanho() + " " + lista.capacidade());
        lista.limpar();
        System.out.println(lista.tamanho() + " " + lista.capacidade());

        /*for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(lista.obter(i));
        }
       
        for (Integer num : lista) {
            System.out.println(num);
        }
         */
    }

}
