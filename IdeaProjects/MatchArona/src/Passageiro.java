import java.util.ArrayList;
import java.util.Iterator;

public class Passageiro extends Usuario {

    public void match(ArrayList listam,Motorista motorista){
        Iterator j = listam.iterator();
        boolean verif = false;
        while (j.hasNext()){
            motorista = (Motorista) j.next();
            if(motorista.getDestino().equals(getDestino())){
                verif = true;
                System.out.println("\t\t------------- MATCH ---------------");
                System.out.println("\t\t\t\tDADOS DO MOTORISTA");
                System.out.println("\t\t\tNome: "+motorista.getNome());
                System.out.println("\t\t\tIdade: "+motorista.getIdade());
                System.out.println("\t\t\tCPF: "+motorista.getCpf());
                System.out.println("\t\t\tDestino: "+motorista.getDestino());
                System.out.println("\t\t\tModelo do carro: "+motorista.getCarro().getModelo());
                System.out.println("\t\t\tCNH: "+motorista.getCarro().getCnh());
                System.out.println("\t\t\tCor do carro: "+motorista.getCarro().getCor());
                System.out.println("\t\t\tMarca do carro: "+motorista.getCarro().getMarca());
                System.out.println("\t\t\tAno do carro: "+motorista.getCarro().getAno());
            }
        }
        if(verif == false){
            System.out.println("\t\tNenhum motorista encontrado para seu destino");
        }
    }

}
