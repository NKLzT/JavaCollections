import java.util.List;

public class TestaCurso {
    

    public static void main(String[] args) {
        
        Curso javaColecoes = new Curso("java para todos", "Nikinha");
        List<Aula> aulas = javaColecoes.getAulas();
        javaColecoes.getAulas().add(new Aula("Olá Mundo", 26));
        javaColecoes.getAulas().add(new Aula("Lidando com variaveis", 30));
        javaColecoes.getAulas().add(new Aula("Criado metodos", 36));
        System.out.println(aulas);

    }
    
    
}
