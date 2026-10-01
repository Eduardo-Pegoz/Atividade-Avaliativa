public class Reserva {

    private int codigo;
    private String nomeCliente;
    private String data;
    private String horario;
    private String status;
    private double valorTotal;
    private int quantidadeConvidados;
    private Salao salao;

    public Reserva(int codigo, String nomeCliente, String data,
                   String horario, String status,
                   double valorTotal, int quantidadeConvidados) {

        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.horario = horario;
        this.status = status;
        this.valorTotal = valorTotal;
        this.quantidadeConvidados = quantidadeConvidados;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getData() {
        return data;
    }
    public String getHorario() {
        return horario;
    }
    public String getStatus() {
        return status;
    }
    public int getQuantidadeConvidados() {
        return quantidadeConvidados;
    }
    public Salao getSalao() {
        return salao;
    }
    public void atribuirSalao(Salao salao) {
        this.salao = salao;
    }
    public void exibirDetalhes() {
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Status: " + status);
        System.out.println("Valor: R$ " + valorTotal);
        System.out.println("Convidados: " + quantidadeConvidados);

        if (salao != null) {
            System.out.println("Salão: " + salao.getNumero());
            System.out.println("Organizador: " + salao.getOrganizador().getNome());
        }
    }
}