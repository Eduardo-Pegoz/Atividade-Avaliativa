import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Organizador> organizadores = new ArrayList<>();
        ArrayList<Salao> saloes = new ArrayList<>();
        ArrayList<Reserva> reservas = new ArrayList<>();

        organizadores.add(new Organizador("João", "111", "9999-1111", "Casamentos"));
        organizadores.add(new Organizador("Maria", "222", "9999-2222", "Formaturas"));
        organizadores.add(new Organizador("Carlos", "333", "9999-3333", "Eventos"));

        saloes.add(new Salao(1, 100, "Centro", "Festas"));
        saloes.add(new Salao(2, 200, "Savassi", "Eventos"));
        saloes.add(new Salao(3, 300, "Pampulha", "Formaturas"));

        saloes.get(0).associarOrganizador(organizadores.get(0));
        saloes.get(1).associarOrganizador(organizadores.get(1));
        saloes.get(2).associarOrganizador(organizadores.get(2));

        int opcao;

        do {
            System.out.println("\n1 - Cadastrar reserva");
            System.out.println("2 - Atribuir reserva a salão");
            System.out.println("3 - Ver reservas confirmadas");
            System.out.println("4 - Ver reservas finalizadas");
            System.out.println("5 - Buscar reserva por status");
            System.out.println("6 - Ver detalhes da reserva");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            /*switch case pra realizar as acoes do usuario */
        }
    }
}