import java.util.*;

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

        Deque<Estudante> deque = new ArrayDeque<>();
        deque.addLast(e2);
        deque.addLast(eg2);
        deque.addLast(ep2);
        deque.addLast(epm2);
        deque.addLast(epd2);
        for(int i = deque.size(); i >= 0; i--){
            try{
                deque.remove();
                System.out.println("Removido.");
            } catch (NoSuchElementException e){
                System.out.println("Deque já está vazio.");
            }
        }
    }
}
