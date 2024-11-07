import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String []args){
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(e2);
        estudantes.add(eg2);
        estudantes.add(ep2);
        estudantes.add(epm2);
        estudantes.add(epd2);
        estudantes.remove(3);

        Stack<Estudante> estudantesPilha = new Stack<Estudante>();
        estudantesPilha.add(e2);
        estudantesPilha.add(eg2);
        estudantesPilha.add(ep2);
        estudantesPilha.add(epm2);
        estudantesPilha.add(epd2);

        System.out.println("Lista desordenada");
        for(Estudante e:estudantes){
            e.print();
        }
        System.out.println('\n');

        System.out.println("Pilha");
        for(Estudante e:estudantesPilha){
            e.print();
        }
        System.out.println('\n');

        System.out.println("Lista ordenada");
        Collections.sort(estudantes);
        Collections.sort(estudantesPilha);

        for(Estudante e:estudantes){
            e.print();
        }
    }
}
