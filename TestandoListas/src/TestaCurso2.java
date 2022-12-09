import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("java para todos", "Nikinha");
        javaColecoes.adiciona(new Aula("Olá Mundo", 26));
        javaColecoes.adiciona(new Aula("Lidando com variaveis", 30));
        javaColecoes.adiciona(new Aula("Criado metodos", 36));

        System.out.println(javaColecoes.toString());

        List<Aula> AulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(AulasImutaveis);
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
