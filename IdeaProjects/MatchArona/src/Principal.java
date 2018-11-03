import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    // j para motorista
    // i para passageiro
    // tentar implementar uma funcao de busca
    public static Scanner scan = new Scanner(System.in); //scanner universal
    public static Motorista motorista = new Motorista(); // instanciando objeto para todas as funcoes
    public static Passageiro passageiro = new Passageiro(); // instanciando objeto para todas as funcoes

    private static void exibirMotorista(ArrayList listam) {
        Iterator j = listam.iterator();
        while (j.hasNext()) {
            System.out.println("\t\t\t\tDADOS DO MOTORISTA");
            motorista = (Motorista) j.next();
            System.out.println(motorista.getNome());
            System.out.println(motorista.getIdade());
            System.out.println(motorista.getCpf());
            System.out.println(motorista.getSenha());
            System.out.println(motorista.getCarro().getModelo());
            System.out.println(motorista.getCarro().getCnh());
            System.out.println(motorista.getCarro().getCor());
            System.out.println(motorista.getCarro().getMarca());
            System.out.println(motorista.getCarro().getAno());
        }

    }

    private static void exibirPassageiros(ArrayList listap) {
        Iterator i = listap.iterator();
        while (i.hasNext()) {
            System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
            passageiro = (Passageiro) i.next();
            System.out.println(passageiro.getNome());
            System.out.println(passageiro.getCpf());
            System.out.println(passageiro.getIdade());
            //System.out.println(passageiro.destino);
            System.out.println(passageiro.getSenha());
        }

    }

    private static void alterarDados(ArrayList listam, ArrayList listap) {
        System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
        System.out.println("\t\t\t\tFunção: ALTERAR DADOS");
        System.out.print("\t\t\tDigite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();
        Iterator j = listam.iterator();
        Iterator i = listap.iterator();
        int posicao;
        while (j.hasNext()) {
            motorista = (Motorista) j.next();
            if (cpf.equals(motorista.getCpf())) {
                System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
                System.out.println("\t\t\t\tFunção: ALTERAR DADOS");
                System.out.println("\t\t\t\t Encontrado");
                posicao = listam.indexOf(motorista);
                System.out.println(posicao);
                System.out.println("\t\t\t\tDADOS DO MOTORISTA");
                System.out.println("\t\t\tNome: " + motorista.getNome());
                System.out.println("\t\t\tIdade: " + motorista.getIdade());
                System.out.println("\t\t\tCPF: " + motorista.getCpf());
                System.out.println("\t\t\tSenha: " + motorista.getSenha());
                System.out.println("\t\t\tModelo do Carro: " + motorista.getCarro().getModelo());
                System.out.println("\t\t\tTipo da CNH: " + motorista.getCarro().getCnh());
                System.out.println("\t\t\tCor do Carro: " + motorista.getCarro().getCor());
                System.out.println("\t\t\tMarca do Carro: " + motorista.getCarro().getMarca());
                System.out.println("\t\t\tAno do Carro: " + motorista.getCarro().getAno());

                System.out.println("\t\t\t\tQual campo deseja alterar?");
                System.out.println("Nome -------------- 1");
                System.out.println("Idade ------------- 2");
                System.out.println("CPF --------------- 3");
                System.out.println("Senha ------------- 4");
                System.out.println("Modelo do Carro --- 5");
                System.out.println("CNH --------------- 6");
                System.out.println("Cor do Carro ------ 7");
                System.out.println("Marca do Carro ---- 8");
                System.out.println("Ano do Carro ------ 9");
                int entrada = scan.nextInt();

                switch (entrada) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String nome = new Scanner(System.in).nextLine();
                        motorista.setNome(nome);
                        break;
                    case 2:
                        System.out.println("Digite a nova idade: ");
                        int idade = new Scanner(System.in).nextInt();
                        motorista.setIdade(idade);
                        break;
                    case 3:
                        System.out.println("Digite o novo CPF: ");
                        String CPF = new Scanner(System.in).nextLine();
                        motorista.setCpf(CPF);
                        break;
                    case 4:
                        System.out.println("Digite o nova senha: ");
                        String senha = new Scanner(System.in).nextLine();
                        motorista.setSenha(senha);
                        break;
                    case 5:
                        System.out.println("Digite o Novo Modelo do Carro: ");
                        String modelo = new Scanner(System.in).nextLine();
                        motorista.getCarro().setModelo(modelo);
                        break;
                    case 6:
                        System.out.println("Digite o tipo da CNH: ");
                        String cnh = new Scanner(System.in).nextLine();
                        motorista.getCarro().setCnh(cnh);
                        break;
                    case 7:
                        System.out.println("Digite o tipo da Cor: ");
                        String cor = new Scanner(System.in).nextLine();
                        motorista.getCarro().setCor(cor);
                        break;
                    case 8:
                        System.out.println("Digite a marca do Carro: ");
                        String marca = new Scanner(System.in).nextLine();
                        motorista.getCarro().setMarca(marca);
                        break;
                    case 9:
                        System.out.println("Digite o Ano do Carro: ");
                        int ano = new Scanner(System.in).nextInt();
                        motorista.getCarro().setAno(ano);
                        break;
                    default:
                        System.out.println("invalido");
                        break;
                }

            }
        }
        while (i.hasNext()) {
            passageiro = (Passageiro) i.next();
            if (cpf.equals(passageiro.getCpf())) {
                System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
                System.out.println("\t\t\t\tFunção: ALTERAR DADOS");
                System.out.println("\t\t\t\t Encontrado");
                posicao = listap.indexOf(passageiro);
                System.out.println(posicao);
                System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
                System.out.println("\t\t\tNome: " + passageiro.getNome());
                System.out.println("\t\t\tCPF: " + passageiro.getCpf());
                System.out.println("\t\t\tIdade: " + passageiro.getIdade());
                System.out.println("\t\t\tSenha: " + passageiro.getSenha());

                System.out.println("\t\t\t\tQual campo deseja alterar?");
                System.out.println("\t\t\tNome -------------- 1");
                System.out.println("\t\t\tIdade ------------- 2");
                System.out.println("\t\t\tCPF --------------- 3");
                System.out.println("\t\t\tSenha ------------- 4");
                System.out.println("\t\t\tEntrada: ");
                int entrada = scan.nextInt();
                switch (entrada) {
                    case 1:
                        System.out.println("\t\t\tDigite o novo nome: ");
                        String nome = new Scanner(System.in).nextLine();
                        passageiro.setNome(nome);
                        break;
                    case 2:
                        System.out.println("\t\t\tDigite a nova idade: ");
                        int idade = new Scanner(System.in).nextInt();
                        passageiro.setIdade(idade);
                        break;
                    case 3:
                        System.out.println("\t\t\tDigite o novo CPF: ");
                        String CPF = new Scanner(System.in).nextLine();
                        passageiro.setCpf(CPF);
                        break;
                    case 4:
                        System.out.println("\t\t\tDigite o nova senha: ");
                        String senha = new Scanner(System.in).nextLine();
                        passageiro.setSenha(senha);
                        break;
                    default:
                        System.out.println("\t\t\tinvalido");
                        break;

                }
            }
        }
    }

    private static void excluirDados(ArrayList listam, ArrayList listap) {
        System.out.println("\t\t\t\tTela de Administrador");
        System.out.println("\t\t\t\tFunção: Exclusão");
        System.out.println("\t\t\tDigite o cpf de quem deseja excluir: ");
        String conta = new Scanner(System.in).nextLine();
        Iterator j = listam.iterator();
        Iterator i = listap.iterator();
        int posicao;
        while (j.hasNext()) {
            motorista = (Motorista) j.next();
            if (conta.equals(motorista.getCpf())) {
                System.out.println("\t\t\t\tDADOS DO MOTORISTA");
                System.out.println("\t\t\tNome: " + motorista.getNome());
                System.out.println("\t\t\tIdade: " + motorista.getIdade());
                System.out.println("\t\t\tCPF: " + motorista.getCpf());
                System.out.println("\t\t\tSenha: " + motorista.getSenha());
                System.out.println("\t\t\tModelo do Carro: " + motorista.getCarro().getModelo());
                System.out.println("\t\t\tTipo da CNH: " + motorista.getCarro().getCnh());
                System.out.println("\t\t\tCor do Carro: " + motorista.getCarro().getCor());
                System.out.println("\t\t\tMarca do Carro: " + motorista.getCarro().getMarca());
                System.out.println("\t\t\tAno do Carro: " + motorista.getCarro().getAno());
                System.out.println("\t\t\tTem certeza que deseja excluir?");
                System.out.println("\t\t\tSIM -------------------------- 1");
                System.out.println("\t\t\tNÃO -------------------------- 2");
                int escolha = scan.nextInt();
                if(escolha == 1) {
                    listam.remove(motorista);
                    System.out.println("\t\t\tremovido com sucesso");
                }else System.out.println("Operação cancelada");
            }
        }
        while(i.hasNext()) {
            passageiro = (Passageiro) i.next();
            if (conta.equals(passageiro.getCpf())) {
                System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
                System.out.println("\t\t\tNome: " + passageiro.getNome());
                System.out.println("\t\t\tCPF: " + passageiro.getCpf());
                System.out.println("\t\t\tIdade: " + passageiro.getIdade());
                System.out.println("\t\t\tSenha: " + passageiro.getSenha());
                System.out.println("\t\t\tTem certeza que deseja excluir?");
                System.out.println("\t\t\tSIM -------------------------- 1");
                System.out.println("\t\t\tNÃO -------------------------- 2");
                int escolha = scan.nextInt();
                if(escolha == 1) {
                    listap.remove(passageiro);
                    System.out.println("\t\t\tremovido com sucesso");
                }else System.out.println("Operação cancelada");
            }


            }
        }

    private static void menuAdmin(ArrayList listam, ArrayList listap){
        System.out.println("\t\tACESSO DE ADMINISTRADOR INICIADO");
        System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
        System.out.println("\t\t\tListar Motoristas ------------- 1");
        System.out.println("\t\t\tListar Passageiros ------------ 2");
        System.out.println("\t\t\tAlterar Dados ----------------- 3");
        System.out.println("\t\t\tExcluir Usuario --------------- 4");
        System.out.println("\t\t\tSair da Tela de Administrador - 0");
        System.out.printf("\t\t\tEntrada: ");
        int controleMenu = scan.nextInt();

        do {
            switch (controleMenu) {
                case 1:
                    System.out.println("----------- Lista de Motoristas ---------");
                    exibirMotorista(listam);
                    break;
                case 2:
                    System.out.println("----------- Lista de Passageiros ---------");
                    exibirPassageiros(listap);
                    break;
                case 3:
                    alterarDados(listam, listap);
                    break;
                case 4:
                    excluirDados(listam, listap);
                    break;


                default:
                    System.out.println("Entrada invalida");
            }
        }while (controleMenu != 0 );




    }

    private static int menuGeral(){
        int controleMenu;
        System.out.println("----------------------------------------------------");
        System.out.println("               M A T C H - A  R O N A");
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("\t\t\t\tTELA DE INICIO");
        System.out.println("\t\t\tLOGIN ----------------- 1");
        System.out.println("\t\t\tCADASTRO -------------- 2");
        System.out.println("\t\t\tSAIR ------------------ 0");
        System.out.printf("\t\t\tEntrada: ");
        controleMenu = scan.nextInt();
        return controleMenu;
    }

    private static void login(Admin admin, ArrayList listam, ArrayList listap ){
        // erro        java.util.InputMismatchException
        String login;
        String senha;
        System.out.println("\t\t\t\t TELA DE LOGIN");
        System.out.println("\t\t\tMotorista -------------- 1");
        System.out.println("\t\t\tPassageiro ------------- 2");
        System.out.println("\t\t\tAdministrador ---------- 3");
        System.out.print("\t\t\tEntrada: ");
        int controleMenu = scan.nextInt();
        switch (controleMenu) {
            case 1:
                System.out.print("\t\t\tLOGIN: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\t\tSENHA: ");
                senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");

                break;
            case 2:
                System.out.print("\t\t\tLOGIN: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\t\tSENHA: ");
                senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");
                break;
            case 3:
                System.out.println("\t\t\t\tTELA DE LOGIN");
                System.out.print("\t\t\tLOGIN: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\t\tSENHA: ");
                senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");
                if(admin.compara(login,senha) ){

                    menuAdmin(listam,listap);

                }
                break;
        }
        //fim tela de login
    }

    private static void cadastro(ArrayList listam, ArrayList listap){
        int controleMenu;
        System.out.println("\t\t\t\t TELA DE CADASTRO");
        System.out.println("\t\t\tCadastrar como Motorista  -------------- 1");
        System.out.println("\t\t\tCadastrar como Passageiro -------------- 2");
        System.out.println("\t\t\tSair da Tela de Cadastro --------------- 0");
        System.out.print("\t\t\tEntrada: ");
        controleMenu = scan.nextInt();
        switch (controleMenu) {
            case 1:
                //cadastrando motorista
                    System.out.println("\t\t\t\tTELA DE CADASTRO *MOTORISTA* ");

                    Motorista motorista = new Motorista(); //criando o objeto passageiro

                    System.out.print("\t\t\tDigite o nome: ");
                    motorista.setNome(new Scanner(System.in).nextLine().toLowerCase());

                    System.out.print("\t\t\tDigite a idade: ");
                    motorista.setIdade(scan.nextInt());

                    System.out.print("\t\t\tDigite o cpf: ");
                    motorista.setCpf(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite a senha: ");
                    motorista.setSenha(new Scanner(System.in).nextLine().toLowerCase().replace(" ", ""));

                    System.out.print("\t\t\tDigite a cnh: ");
                    motorista.getCarro().setCnh(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite o modelo do carro: ");
                    motorista.getCarro().setModelo(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite a placa do carro: ");
                    motorista.getCarro().setPlaca(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite a cor do carro: ");
                    motorista.getCarro().setCor(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite a marca do carro: ");
                    motorista.getCarro().setMarca(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite o ano de fabricacao do carro: ");
                    motorista.getCarro().setAno(scan.nextInt());

                    listam.add(motorista);
                    break;


                case 2:

                    System.out.println("\t\t\t\tTELA DE CADASTRO *PASSAGEIRO* ");

                    Passageiro passageiro = new Passageiro(); //criando o objeto passageiro

                    System.out.print("\t\t\tDigite o nome: ");
                    passageiro.setNome(new Scanner(System.in).nextLine().toLowerCase());

                    System.out.print("\t\t\tDigite a idade: ");
                    passageiro.setIdade(scan.nextInt());

                    System.out.print("\t\t\tDigite o cpf: ");
                    passageiro.setCpf(new Scanner(System.in).nextLine());

                    //System.out.print("\t\t\tDigite o destino: ");
                    //passageiro.destino = new Scanner(System.in).nextLine().toLowerCase();

                    System.out.print("\t\t\tDigite a senha: ");
                    passageiro.setSenha(new Scanner(System.in).nextLine().toLowerCase().replace(" ", ""));

                    listap.add(passageiro); //adicionando a lista de passageiros

                    break;
            }
}

    public static void main(String[] args) {

        Admin admin = new Admin(); //objeto admin
        ArrayList listap = new ArrayList(); //lista para os passageiros
        ArrayList listam = new ArrayList(); //lista para os motoristas
        int decisao = menuGeral();
        do {
            switch (decisao) {
                case 1:
                    login(admin, listam, listap);
                    break;
                case 2:
                    cadastro(listam, listap);
                    break;
            }
        }while ( decisao != 0 );

        if( decisao == 0){
            System.out.println();
            System.out.println("\t\t\tEncerrando Programa...");
        }



    }//main

}
