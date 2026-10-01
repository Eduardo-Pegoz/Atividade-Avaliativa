import java.util.ArrayList;

public class Salao {

    private int numero;
    private int capacidadeMaxima;
    private String localizacao;
    private String tipoSalao;

    private Organizador organizador;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    public Salao(int numero, int capacidadeMaxima,
                 String localizacao, String tipoSalao) {

        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.localizacao = localizacao;
        this.tipoSalao = tipoSalao;
    }
    public int getNumero() {
        return numero;
    }
    public Organizador getOrganizador() {
        return organizador;
    }
    public void associarOrganizador(Organizador organizador) {
        this.organizador = organizador;
    }
    public boolean adicionarReserva(Reserva reserva) {
        if (reserva.getQuantidadeConvidados() > capacidadeMaxima) {
            return false;
        }
        for (Reserva r : reservas) {
            if (r.getStatus().equals("confirmada")
                    && r.getData().equals(reserva.getData())
                    && r.getHorario().equals(reserva.getHorario())) {
                return false;
            }
        }
        reservas.add(reserva);
        reserva.atribuirSalao(this);
        return true;
    }
    public void exibirReservasConfirmadas() {
        int total = 0;
        for (Reserva r : reservas) {
            if (r.getStatus().equals("confirmada")) {
                r.exibirDetalhes();
                total += 1;
            }
        }
        System.out.println("Total de reservas confirmadas: " + total);
    }
    public int quantidadeFinalizadas() {
        int total = 0;
        for (Reserva r : reservas) {
            if (r.getStatus().equals("finalizada")) {
                total++;
            }
        }
        return total;
    }
}