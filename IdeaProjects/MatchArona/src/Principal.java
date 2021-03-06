import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    // j para motorista
    // i para passageiro
    public static Scanner scan = new Scanner(System.in); //scanner universal
    public static Motorista motorista = new Motorista(); // instanciando objeto para todas as funcoes
    public static Passageiro passageiro = new Passageiro(); // instanciando objeto para todas as funcoes
    public static Admin admin = new Admin(); //objeto admin
    public static ArrayList listap = new ArrayList(); //lista para os passageiros
    public static  ArrayList listam = new ArrayList(); //lista para os motoristas


    private static void menuLoginMotorista(Motorista motorista){

        System.out.println("\t\t...................................");
        System.out.println("\t\t\t\t TELA DE LOGIN MOTORISTA");
        System.out.println("\t\t...................................");
        System.out.println("\t\t\tAlterar dados do carro -------------- 1");
        System.out.println("\t\t\tAlterar dados de usuario ------------ 2");
        System.out.println("\t\t\tSAIR -------------------- 0");
        System.out.print("\t\t\tEntrada: ");
        int controleMenu = scan.nextInt();
        switch (controleMenu){
            case 1:
                motorista.getCarro().alterarDadosDoCarro();
                break;
            case 2:
                motorista.alterarDadosDoUsuario();
                break;
            case 0:
                menuGeral();

                default:
                    System.out.println("valor invalido");
        }


    }

    private static void menuLoginPassageiro(Passageiro passageiro){

        System.out.println("\t\t..........................................");
        System.out.println("\t\t\t\t TELA DE LOGIN - PASSAGEIRO");
        System.out.println("\t\t..........................................");
        System.out.println("\t\t\tAlterar dados de usuario ----- 1");
        System.out.println("\t\t\tProcurar Match --------------- 2");
        System.out.println("\t\t\tSair da tela de login -------- 0");
        System.out.print("\t\t\tEntrada: ");
        int controleMenu = scan.nextInt();
        switch (controleMenu){
            case 1:
                passageiro.alterarDadosDoUsuario();
                break;
            case 2:
                passageiro.match(listam,motorista);
                break;
            case 0:
                menuGeral();
            default:
                System.out.println("valor invalido");
        }


    }

    private static void exibirMotorista() {
        Iterator j = listam.iterator();
        while (j.hasNext()) {
            System.out.println("\t\t\t\tDADOS DO MOTORISTA");
            motorista = (Motorista) j.next();
            System.out.println("\t\t\tNome: "+motorista.getNome());
            System.out.println("\t\t\tIdade: "+motorista.getIdade());
            System.out.println("\t\t\tCPF: "+motorista.getCpf());
            System.out.println("\t\t\tDestino: "+motorista.getDestino());
            System.out.println("\t\t\tSenha: "+motorista.getSenha());
            System.out.println("\t\t\tModelo do carro: "+motorista.getCarro().getModelo());
            System.out.println("\t\t\tCNH: "+motorista.getCarro().getCnh());
            System.out.println("\t\t\tCor do carro: "+motorista.getCarro().getCor());
            System.out.println("\t\t\tMarca do carro: "+motorista.getCarro().getMarca());
            System.out.println("\t\t\tAno do carro: "+motorista.getCarro().getAno());
        }

    }

    private static void exibirPassageiros() {
        Iterator i = listap.iterator();
        while (i.hasNext()) {
            System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
            passageiro = (Passageiro) i.next();
            System.out.println("\t\t\tNome: "+ passageiro.getNome());
            System.out.println("\t\t\tCpf: "+passageiro.getCpf());
            System.out.println("\t\t\tIdade: "+passageiro.getIdade());
            System.out.println("\t\t\tDestino: "+passageiro.getDestino());
            System.out.println("\t\t\tSenha: "+passageiro.getSenha());
            System.out.println("\t\t\t--------------------------------------");
        }
    }

    private static void alterarDados() {
        Iterator j = listam.iterator();
        Iterator i = listap.iterator();
        System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
        System.out.println("\t\t\t\tFunção: ALTERAR DADOS");
        System.out.print("\t\t\tDigite o cpf: ");
        String cpf = new Scanner(System.in).nextLine();
        while (j.hasNext()) {
            motorista = (Motorista) j.next();
            if (cpf.equals(motorista.getCpf())) {
                System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
                System.out.println("\t\t\t\tFunção: ALTERAR DADOS");
                System.out.println("\t\t\t\t Encontrado");
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
                System.out.print("\t\t\tEntrada: ");
                int entrada = scan.nextInt();
                switch (entrada) {
                    case 1:
                        System.out.print("\t\t\tDigite o novo nome: ");
                        String nome = new Scanner(System.in).nextLine();
                        passageiro.setNome(nome);
                        break;
                    case 2:
                        System.out.print("\t\t\tDigite a nova idade: ");
                        int idade = new Scanner(System.in).nextInt();
                        passageiro.setIdade(idade);
                        break;
                    case 3:
                        System.out.print("\t\t\tDigite o novo CPF: ");
                        String CPF = new Scanner(System.in).nextLine();
                        passageiro.setCpf(CPF);
                        break;
                    case 4:
                        System.out.print("\t\t\tDigite o nova senha: ");
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

    private static void excluirDados() {
        System.out.println("\t\t\t\tTela de Administrador");
        System.out.println("\t\t\t\tFunção: Exclusão");
        System.out.print("\t\t\tDigite o cpf de quem deseja excluir: ");
        String conta = new Scanner(System.in).nextLine();
        Iterator j = listam.iterator();
        Iterator i = listap.iterator();
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
                    break;
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
                System.out.print("\t\t\tEntrada: ");
                int escolha = scan.nextInt();
                if(escolha == 1) {
                    listap.remove(passageiro);
                    System.out.println("\t\t\tremovido com sucesso");
                    break;
                }else System.out.println("Operação cancelada");
            }


            }
        }

    private static void menuAdmin(){
        int controleMenu;
        do{
            System.out.println("\t\t\tACESSO DE ADMINISTRADOR INICIADO");
            System.out.println("\t\t...................................");
            System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
            System.out.println("\t\t...................................");
            System.out.println("\t\t\tListar Motoristas ------------- 1");
            System.out.println("\t\t\tListar Passageiros ------------ 2");
            System.out.println("\t\t\tAlterar Dados ----------------- 3");
            System.out.println("\t\t\tExcluir Usuario --------------- 4");
            System.out.println("\t\t\tSair da Tela de Administrador - 0");
            System.out.printf("\t\t\tEntrada: ");
                controleMenu = scan.nextInt();
                switch (controleMenu) {
                    case 1:
                        System.out.println("\t\t----------- Lista de Motoristas ---------");
                        if(listam.isEmpty()){
                            System.out.println("\t\t\tNão há motoristas cadastrados");
                        }
                        else{
                            exibirMotorista();
                        }
                        break;
                    case 2:
                        System.out.println("\t\t----------- Lista de Passageiros ---------");
                        if(listap.isEmpty()){
                            System.out.println("\t\t\tNão há Passageiros cadastrados");
                        }
                        else{
                            exibirPassageiros();
                        }
                        break;
                    case 3:
                        if(listap.isEmpty() && listam.isEmpty()){
                            System.out.println("\t\t\tNão há Usuarios cadastrados");
                        }
                        else{
                            alterarDados();
                        }
                        break;
                    case 4:
                        if(listap.isEmpty() && listam.isEmpty()){
                            System.out.println("\t\t\tNão há Usuarios cadastrados");
                        }
                        else{
                            excluirDados();
                        }
                        break;
                }
        }while (controleMenu != 0 );




    }

    private static int menuGeral(){
        int controleMenu;
        System.out.println("----------------------------------------------------");
        System.out.println("                 C-A-R-O-N-I-N-H-A");
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("\t\t...................................");
        System.out.println("\t\t\t\t  TELA DE INICIO");
        System.out.println("\t\t...................................");
        System.out.println("\t\t\tLOGIN ----------------- 1");
        System.out.println("\t\t\tCADASTRO -------------- 2");
        System.out.println("\t\t\tSAIR ------------------ 0");
        System.out.printf("\t\t\tEntrada: ");
        controleMenu = scan.nextInt();
        return controleMenu;
    }

    private static void login( ) {
        String login;
        String senha;
        Iterator j = listam.iterator();
        System.out.println("\t\t...................................");
        System.out.println("\t\t\t\t TELA DE LOGIN");
        System.out.println("\t\t...................................");
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
                senha = new Scanner(System.in).nextLine();
                //procura
                while (j.hasNext()) {
                    motorista = (Motorista) j.next();
                    if(motorista.getCpf().equals(login) && motorista.getSenha().equals(senha)){
                        System.out.println("\t\t\t\tBem Vindo "+motorista.getNome());
                        System.out.println("\t\t\tLogin efetuado com sucesso");
                        menuLoginMotorista(motorista);
                        break;
                    }else{
                        System.out.println("\t\t\tNenhum usuario encontrado com os dados inseridos");
                    }
                }

                break;
            case 2:
                System.out.print("\t\t\tLOGIN: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\t\tSENHA: ");
                senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");
                Iterator p = listap.iterator();
                while ( p.hasNext() ) {
                    passageiro = (Passageiro) p.next();
                    if(passageiro.getSenha().equals(senha)&& passageiro.getCpf().equals(login)){
                        System.out.println("\t\t\t\tBem Vindo "+passageiro.getNome());
                        System.out.println("\t\t\tLogin efetuado com sucesso");
                        menuLoginPassageiro(passageiro);
                        break;
                    }else{
                        System.out.println("\t\t\tNenhum usuario encontrado com os dados inseridos");
                    }

                }

                break;

            case 3:
                System.out.println("\t\t...................................");
                System.out.println("\t\t\t\t    TELA DE LOGIN");
                System.out.println("\t\t...................................");
                System.out.print("\t\t\t\tLOGIN: ");
                login = new Scanner(System.in).nextLine();
                System.out.print("\t\t\t\tSENHA: ");
                senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");
                if(admin.compara(login,senha) ){

                    menuAdmin();

                }
                break;
        }
        //fim tela de login
    }

    private static void cadastro(){
        int controleMenu;
        System.out.println("\t\t...................................");
        System.out.println("\t\t\t\t TELA DE CADASTRO");
        System.out.println("\t\t...................................");
        System.out.println("\t\tCadastrar como Motorista  --------- 1");
        System.out.println("\t\tCadastrar como Passageiro --------- 2");
        System.out.println("\t\tSair da Tela de Cadastro ---------- 0");
        System.out.print("\t\tEntrada: ");
        controleMenu = scan.nextInt();
        switch (controleMenu) {
            case 1:
                //cadastrando motorista
                    System.out.println("\t\t...................................");
                    System.out.println("\t\t\t\tTELA DE CADASTRO - MOTORISTA ");
                    System.out.println("\t\t...................................");

                    Motorista motorista = new Motorista(); //criando o objeto passageiro

                    System.out.print("\t\t\tDigite o nome: ");
                    motorista.setNome(new Scanner(System.in).nextLine().toLowerCase());

                    System.out.print("\t\t\tDigite a idade: ");
                    motorista.setIdade(scan.nextInt());

                    System.out.print("\t\t\tDigite o Destino: ");
                    motorista.setDestino(new Scanner(System.in).nextLine());

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
                    System.out.println("\t\t...................................");
                    System.out.println("\t\t\t\tTELA DE CADASTRO - PASSAGEIRO ");
                    System.out.println("\t\t...................................");

                    Passageiro passageiro = new Passageiro(); //criando o objeto passageiro

                    System.out.print("\t\t\tDigite o nome: ");
                    passageiro.setNome(new Scanner(System.in).nextLine().toLowerCase());

                    System.out.print("\t\t\tDigite a idade: ");
                    passageiro.setIdade(scan.nextInt());

                    System.out.print("\t\t\tDigite o cpf: ");
                    passageiro.setCpf(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite o destino: ");
                    passageiro.setDestino(new Scanner(System.in).nextLine());

                    System.out.print("\t\t\tDigite a senha: ");
                    passageiro.setSenha(new Scanner(System.in).nextLine().toLowerCase().replace(" ", ""));

                    listap.add(passageiro); //adicionando a lista de passageiros

                    break;
                case 0:
                    break;
            }
}

    public static void main(String[] args) {
        int decisao;
            do {
                decisao = menuGeral();
                switch (decisao) {
                    case 1:
                        login();
                        break;
                    case 2:
                        cadastro();
                        break;
                    case 0:
                        break;

                        default:
                            System.out.println("\t\t\tValor invalido !");
                }
            } while (decisao != 0);

            if (decisao == 0) {
                System.out.println();
                System.out.println("\t\t\tEncerrando Programa...");
            }
    }//main

}//principal
