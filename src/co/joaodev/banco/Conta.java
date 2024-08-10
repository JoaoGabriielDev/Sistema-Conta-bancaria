package co.joaodev.banco;

public class Conta {

    private String agencia;
    private String conta;
    private String nome;

    private static final int MAX_LENGTH = 12;

    public Conta(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        setNome(nome);
    }

    public void setNome(String nome) {
        if(nome.length() > MAX_LENGTH){
            this.nome = nome.substring(0, MAX_LENGTH);
        } else {
            this.nome = nome;
        }
        System.out.println(this.nome);
    }
}
