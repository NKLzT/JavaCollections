import java.util.Set;

public class TesteMatricula {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("java avançado", "nikinha");

        javaColecoes.adiciona(new Aula("aula 1", 28));
        javaColecoes.adiciona(new Aula("aula2", 29));
        javaColecoes.adiciona(new Aula("aula3", 90));

        Aluno a1 = new Aluno("nikolas", 2019201);
        Aluno a2 = new Aluno("joca", 32897282);
        Aluno a3 = new Aluno("jonini", 987989879);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Set<Aluno> alunos = javaColecoes.getAlunos();

        alunos.add(new Aluno("joci", 382983928));

        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
    }
    
}