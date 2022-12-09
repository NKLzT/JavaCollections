import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("nikolas");
        alunos.add("raimunda");
        alunos.add("adolfo");
        alunos.add("fred");

        System.out.println(alunos.size());
        alunos.add("nikolas");
        boolean adicionou = alunos.add("nikolas");
        System.out.println("Nikolas foi adicionado: "+ adicionou);
        System.out.println(alunos.size());
    }
}
