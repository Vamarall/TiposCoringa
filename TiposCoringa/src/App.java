import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Com tipos coringa podemos fazer metodos que recebem um generico de qualquer
         * tipo
         */

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Everton ribeiro", "Marcelo moreno", "Julio baptista");
        printList(myStrs);

    }

    // List<?> é o supertipo de qualquer lista(Tipo coringa)
    public static void printList(List<?> list) {
       // list.add(3); Não é possivel adicionar dados a uma coleção de tipo coringa
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
