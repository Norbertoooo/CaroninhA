import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {


    private static void menuAdmin(){
        System.out.println("\t\tACESSO DE ADMINISTRADOR INICIADO");
        System.out.println("\t\t\t\tTELA DE ADMINISTRADOR");
        System.out.println("\t\t\tListar Passageiros ------------- 1");
        System.out.println("\t\t\tListar Motoristas -------------- 2");
        System.out.println("\t\t\tAlterar Dados ------------------ 3");
        System.out.println("\t\t\tExcluir Usuario ---------------- 4");
        System.out.println("\t\t\tSair da Tela de Admistrador ---- 0");
        System.out.printf("\t\t\tEntrada: ");


    }

    private static int menu(){
        Scanner scan = new Scanner(System.in);
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

    private static void login(Admin admin){
        Scanner scan = new Scanner(System.in); // declaraçao do scan
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
                    menuAdmin();

                }
                break;
        }
        //fim tela de login
    }

    private static void cadastro(ArrayList listam, ArrayList listap){

        Scanner scan = new Scanner(System.in);
        int controleMenu;
        System.out.println("\t\t\t\t TELA DE CADASTRO");
        System.out.println("\t\t\tCadastrar como motorista  -------------- 1");
        System.out.println("\t\t\tCadastrar como passageiro -------------- 2");
        System.out.print("\t\t\tEntrada: ");
        controleMenu = scan.nextInt();
        switch (controleMenu) {
            case 1:
                //cadastrando motorista
                System.out.println("\t\t\t\tTELA DE CADASTRO *MOTORISTA* ");

                Motorista motorista = new Motorista(); //criando o objeto passageiro

                System.out.print("\t\t\tDigite o nome: ");
                motorista.nome = new Scanner(System.in).nextLine().toLowerCase();

                System.out.print("\t\t\tDigite a idade: ");
                motorista.idade = scan.nextInt();

                System.out.print("\t\t\tDigite o cpf: ");
                motorista.cpf = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite o destino: ");
                motorista.destino = new Scanner(System.in).nextLine().toLowerCase();

                System.out.print("\t\t\tDigite a senha: ");
                motorista.senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");

                System.out.print("\t\t\tDigite a cnh: ");
                motorista.cnh = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite o modelo do carro: ");
                motorista.carro.modelo = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite a placa do carro: ");
                motorista.carro.placa = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite a cor do carro: ");
                motorista.carro.cor = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite a marca do carro: ");
                motorista.carro.marca = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite o ano de fabricacao do carro: ");
                motorista.carro.ano = scan.nextInt();

                // fim do cadastro do motorista

                listam.add(motorista);
                Iterator j = listam.iterator();
                while ( j.hasNext() ) {
                    System.out.println("\t\t\t\tDADOS DO MOTORISTA");
                    motorista = (Motorista) j.next();
                    System.out.println(motorista.nome);
                    System.out.println(motorista.idade);
                    System.out.println(motorista.cpf);
                    System.out.println(motorista.destino);
                    System.out.println(motorista.senha);
                    System.out.println(motorista.carro.modelo);
                    System.out.println(motorista.carro.placa);
                    System.out.println(motorista.carro.cor);
                    System.out.println(motorista.carro.marca);
                    System.out.println(motorista.carro.ano);
                }
                break;


            case 2:

                System.out.println("\t\t\t\tTELA DE CADASTRO *PASSAGEIRO* ");

                Passageiro passageiro = new Passageiro(); //criando o objeto passageiro

                System.out.print("\t\t\tDigite o nome: ");
                passageiro.nome = new Scanner(System.in).nextLine().toLowerCase();

                System.out.print("\t\t\tDigite a idade: ");
                passageiro.idade = scan.nextInt();

                System.out.print("\t\t\tDigite o cpf: ");
                passageiro.cpf = new Scanner(System.in).nextLine();

                System.out.print("\t\t\tDigite o destino: ");
                passageiro.destino = new Scanner(System.in).nextLine().toLowerCase();

                System.out.print("\t\t\tDigite a senha: ");
                passageiro.senha = new Scanner(System.in).nextLine().toLowerCase().replace(" ", "");

                listap.add(passageiro); //adicionando a lista de passageiros
                Iterator i = listap.iterator();
                while (i.hasNext()) {
                    System.out.println("\t\t\t\tDADOS DO PASSAGEIRO");
                    passageiro = (Passageiro) i.next();
                    System.out.println(passageiro.nome);
                    System.out.println(passageiro.cpf);
                    System.out.println(passageiro.idade);
                    System.out.println(passageiro.destino);
                    System.out.println(passageiro.senha);
                }

                break;
        } // switch
}

    public static void main(String[] args) {
        Admin admin = new Admin(); //objeto admin
        Scanner scan = new Scanner(System.in); // declaraçao do scan
        ArrayList listap = new ArrayList(); //lista para os passageiros
        ArrayList listam = new ArrayList(); //lista para os motoristas

        switch (menu()){
            case 1:
                login(admin);
                break;
            case 2:
                cadastro(listam,listap);
                break;
        }//switch menu

    }//main

}
