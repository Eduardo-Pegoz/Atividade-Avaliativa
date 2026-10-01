public class Organizador {

    private String nome;
    private String cpf;
    private String telefone;
    private String areaAtuacao;

    public Organizador(String nome, String cpf, String telefone, String areaAtuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Área: " + areaAtuacao);
    }
}