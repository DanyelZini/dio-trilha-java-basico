public class Conta {
    private Integer numeroConta;
    private String agenciaConta;
    private String nomeCliente;
    private Double saldoConta;

    public Conta(Integer numeroConta, String agenciaConta, String nomeCliente, Double saldoConta) {
        this.numeroConta = numeroConta;
        this.agenciaConta = agenciaConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    // Getters e Setters
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(String agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
