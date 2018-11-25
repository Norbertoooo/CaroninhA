import java.util.Scanner;

public class Motorista extends Usuario{

    private Carro carro = new Carro();

    //getters e setters
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }


    public void alterarDadosDoUsuario() {
        System.out.println("\t\t\tQual campo deseja alterar? ");
        System.out.println("\t\t\tNome ----------- 1");
        System.out.println("\t\t\tIdade ------------ 2");
        System.out.println("\t\t\tSenha -------------- 3");
        System.out.println("\t\t\tDestino ------------ 4");
        System.out.println("\t\t\tCPF -------------- 5");
        System.out.println("\t\t\tSAIR ------------- 0");
        System.out.print("Entrada: ");
        int escolha = Principal.scan.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("\t\t\tNome Atual: " + getNome());
                System.out.print("\t\t\tDigite o novo Nome: ");
                //String novoNome = new Scanner(System.in).nextLine();
                setNome(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tNome Atualizada: " + getNome());
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
                System.out.println("\t\t\tDestino Atualizada: " + getDestino());
                break;
            case 5:
                System.out.println("\t\t\tCPF Atual: " + getCpf());
                System.out.print("\t\t\tDigite o novo CPF: ");
                setCpf(new Scanner(System.in).nextLine());
                System.out.println("\t\t\tCPF Atualizada: " + getCpf());
                break;
            case 0:
                return;

                default:
                    System.out.println("entrada invalida");

        }
    }

}
