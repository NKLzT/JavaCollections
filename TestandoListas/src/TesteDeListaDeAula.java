import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteDeListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Aula de java", 21);
        Aula a2 = new Aula("Aula de python", 22);
        Aula a3 = new Aula("Aula de C#", 23);
    
        ArrayList<Aula> aulas = new ArrayList<>();
    
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
    
        Collections.sort(aulas);
        System.out.println(aulas.toString());
        System.out.println("Aulas ordenadas por tempo: ");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    
    
    }
}
