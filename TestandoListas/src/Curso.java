import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {
    private String nome, instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    public Object getAulas;
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome , String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }
    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    public Aluno buscaMatriculado(int numero){
        return this.matriculaParaAluno.get(numero);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }
    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }
    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }
    public int getTempoTotal(){
        int tempototal = 0;
        for(Aula aula : aulas ){
            tempototal += aula.getTempo();
        }
        return tempototal;
    }
    @Override
    public String toString() {
        return "[Curso: "+ this.getNome() + ", Tempo total: " + this.getTempoTotal() + "Aula : " + this.aulas; 
    }
    @Override
    public boolean equals(Object obj) {
    Aluno outroAluno = (Aluno) obj;
    return this.nome.equals(outroAluno.nome);
    }
    @Override
    public int hashCode(){
    return this.nome.hashCode();
    }
    

}
