package projetoAula3;

public class Cliente {
    //atributos
    private String nome;
    private String cpf;
    private String endereco;
    
    public Cliente(){
    }
    
    public Cliente (String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf=cpf;
        this.endereco=endereco;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   public String dadosCompleto () {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco;
    }
    
    
}