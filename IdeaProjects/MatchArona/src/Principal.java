import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {
    // j para motorista
    // i para passageiro
    public static Scanner scan = new Scanner(System.in);

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


        switch (controleMenu){
            case 1:
                Iterator j = listam.iterator();
                Motorista motorista = new Motorista();
                System.out.println("----------- Lista de Motoristas ---------");
                while ( j.hasNext() ) {
                    System.out.println("\t\t\t\tDADOS DO MOTORISTA");
                    motorista = (Motorista) j.next();
                    System.out.println(motorista.getNome());
                    System.out.println(motorista.getIdade());
                    System.out.println(motorista.getCpf());
                    //System.out.println(motorista.);
                    System.out.println(motorista.getSenha());
                    System.out.println(motorista.getCarro().getModelo());
                    System.out.println(motorista.getCarro().getCnh());
                    System.out.println(motorista.getCarro().getCor());
                    System.out.println(motorista.getCarro().getMarca());
                    System.out.println(motorista.getCarro().getAno());
                }
                break;
            case 2:
                Iterator i = listap.iterator();
                Passageiro passageiro = new Passageiro();
                System.out.println("----------- Lista de Passageiros ---------");
                while (i.hasNext()) {
                    System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
                    passageiro = (Passageiro) i.next();
                    System.out.println(passageiro.getNome());
                    System.out.println(passageiro.getCpf());
                    System.out.println(passageiro.getIdade());
                    //System.out.println(passageiro.destino);
                    System.out.println(passageiro.getSenha());
                }

                break;
        }




    }

    private static int menuGeral(){
        int controleMenu;
        do {
            System.out.println("**********************************************");
            System.out.println("\t\t\t\tMATCH-ARONA");
            System.out.println("**********************************************");
            System.out.println();
            System.out.println("\t\t\t\tTELA DE INICIO");
            System.out.println("\t\t\tLOGIN ----------------- 1");
            System.out.println("\t\t\tCADASTRO -------------- 2");
            System.out.println("\t\t\tSAIR ------------------ 0");
            System.out.printf("\t\t\tEntrada: ");
            controleMenu = scan.nextInt();

            if( controleMenu == 0){
                System.out.println("Encerrando Programa");
            }

            return controleMenu;
        }while( controleMenu != 0  );

    }

    private static void login(Admin admin, ArrayList listam, ArrayList listap ){
        String login;
        String senha;
        System.out.println("\t\t\t\t TELA DE LOGIN");
        System.out.println("\t\t\tMotorista ----------------- 1");
        System.out.println("\t\t\tPassageiro ---------------- 2");
        System.out.println("\t\t\tAdministrador ------------- 3");
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

                //System.out.print("\t\t\tDigite o destino: ");
                // motorista.setdestino ;new Scanner(System.in).nextLine().toLowerCase()

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
        } // switch
}

    public static void main(String[] args) {

        Admin admin = new Admin(); //objeto admin
        ArrayList listap = new ArrayList(); //lista para os passageiros
        ArrayList listam = new ArrayList(); //lista para os motoristas
        do {
            switch (menuGeral()){
                case 1:
                    login(admin,listam,listap);
                    break;
                case 2:
                    cadastro(listam,listap);
                    break;
            }//switch menu

        }while( menuGeral() !=0 );


    }//main

}
