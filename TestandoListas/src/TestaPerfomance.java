import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
    public static void main(String[] args) {
        Collection<Integer> arrayNum = new HashSet<>();
        
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 50000; i++ ){
            arrayNum.add(i);
        }

        for(Integer arrayNume : arrayNum){
            arrayNum.contains(arrayNume);
        }
        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);
    }
}
