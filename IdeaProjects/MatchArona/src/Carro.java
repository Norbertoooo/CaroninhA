import java.util.Scanner;

public class Carro {

    private String modelo;
    private String marca;
    private int ano;
    private String placa;
    private String cor;
    private String cnh;
    private Scanner scan = new Scanner(System.in);





    public void alterarDadosDoCarro(){
        System.out.println("\t\t\tQual campo deseja alterar? ");
        System.out.println("\t\t\tModelo ----------- 1");
        System.out.println("\t\t\tMarca ------------ 2");
        System.out.println("\t\t\tAno -------------- 3");
        System.out.println("\t\t\tPlaca ------------ 4");
        System.out.println("\t\t\tCor -------------- 5");
        System.out.println("\t\t\tCNH -------------- 6");
        System.out.println("\t\t\tSAIR ------------- 0");
        System.out.print("Entrada: ");
        int escolha = scan.nextInt();
        switch (escolha){

            case 1:
                System.out.println("\t\t\tModelo Atual: "+ getModelo());
                System.out.print("\t\t\tDigite o novo modelo: ");
                String novoModelo = new Scanner(System.in).nextLine();
                setModelo(novoModelo);
                System.out.println("\t\t\tModelo Atualizada: "+ getModelo());
                break;
            case 2:
                System.out.println("\t\t\tMarca Atual: "+ getMarca());
                System.out.print("\t\t\tDigite a nova marca: ");
                String novaMarca = new Scanner(System.in).nextLine();
                setMarca(novaMarca);
                System.out.println("\t\t\tMarca Atualizada: "+ getMarca());
                break;
            case 3:
                System.out.println("\t\t\tAno Atual: "+ getAno());
                System.out.print("\t\t\tDigite o novo Ano: ");
                int novoAno = new Scanner(System.in).nextInt();
                setAno(novoAno);
                System.out.println("\t\t\tMarca Atualizada: "+ getAno());

            case 4:
                System.out.println("\t\t\tPlaca Atual: "+ getPlaca());
                System.out.print("\t\t\tDigite a nova placa: ");
                String novaPlaca = new Scanner(System.in).nextLine();
                setPlaca(novaPlaca);
                System.out.println("\t\t\tPlaca Atualizada: "+ getPlaca());
                break;
            case 5:
                System.out.println("\t\t\tCor Atual: "+ getCor());
                System.out.print("\t\t\tDigite a nova cor: ");
                String novoCor = new Scanner(System.in).nextLine();
                setCor(novoCor);
                System.out.println("\t\t\tCor Atualizada: "+ getCor());
                break;
            case 6:
                System.out.println("\t\t\tCNH Atual: "+ getCnh());
                System.out.print("\t\t\tDigite a nova cnh: ");
                String novoCnh = new Scanner(System.in).nextLine();
                setCnh(novoCnh);
                System.out.println("\t\t\tCNH Atualizada: "+ getCnh());
                break;
            case 0:
                return;

        }

    }



    // getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
