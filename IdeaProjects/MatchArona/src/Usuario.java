import java.util.Scanner;

public abstract class Usuario {

    private String nome;
    private int idade;
    private String cpf;
    private String senha;
    private String destino;



    public void alterarDadosDoUsuario() {
        System.out.println("\t\t\tQual campo deseja alterar? ");
        System.out.println("\t\t\tNome ----------- 1");
        System.out.println("\t\t\tIdade ---------- 2");
        System.out.println("\t\t\tSenha ---------- 3");
        System.out.println("\t\t\tDestino -------- 4");
        System.out.println("\t\t\tCPF ------------ 5");
        System.out.println("\t\t\tSAIR ----------- 0");
        System.out.print("\t\t\tEntrada: ");
        int escolha = Principal.scan.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("\t\t\tNome Atual: " + getNome());
                System.out.print("\t\t\tDigite o novo Nome: ");
                setNome(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tNome Atualizado: " + getNome());
                break;
            case 2:
                System.out.println("\t\t\tIdade Atual: " + getIdade());
                System.out.print("\t\t\tDigite a nova Idade: ");
                setIdade(new Scanner(System.in).nextInt());
                System.out.println("\t\t\tIdade Atualizada: " + getIdade());
                break;
            case 3:
                System.out.println("\t\t\tSenha Atual: " + getSenha());
                System.out.print("\t\t\tDigite a nova Senha: ");
                setSenha(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tSenha Atualizada: " + getSenha());
                break;
            case 4:
                System.out.println("\t\t\tDestino Atual: " + getDestino());
                System.out.print("\t\t\tDigite o novo Destino: ");
                setDestino(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tDestino Atualizado: " + getDestino());
                break;
            case 5:
                System.out.println("\t\t\tCPF Atual: " + getCpf());
                System.out.print("\t\t\tDigite o novo CPF: ");
                setCpf(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tCPF Atualizado: " + getCpf());
                break;
            case 0:
                return;

            default:
                System.out.println("entrada invalida");

        }
    }



    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
