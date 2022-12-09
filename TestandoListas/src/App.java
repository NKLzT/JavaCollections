import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        String curso1 = "java";
        String curso2 = "python";
        String curso3 = "C#";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println("Cursos: " + cursos);

        cursos.remove(curso2);

        System.out.println("Cursos: " + cursos);

        System.out.println(cursos.get(0));

        Collections.sort(cursos);

        System.out.println(cursos);

    }
}
