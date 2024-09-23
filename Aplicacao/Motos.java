package Aplicacao;
import javax.swing.JOptionPane;
import Entidades.Honda;
import Entidades.Suzuki;
import Entidades.Yamaha;
import Entidades.Moto;

public class Motos {
    public static void main(String[] args) {
        while (true)    
        {
          try{
            String nome = JOptionPane.showInputDialog("Informe a marca [cancelar] para sair: ");
            if (nome.equalsIgnoreCase("Honda")) {
                Moto moto = new Honda();
                JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome + "\nCilindrada: " + moto.cilindrada + "\nCor: " + moto.cor, "Dados da moto", JOptionPane.CLOSED_OPTION);
            }  
            else if (nome.equalsIgnoreCase("Yamaha"))
            {
                Moto moto = new Yamaha(); 
                JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome + "\nCilindrada: " + moto.cilindrada + "\nCor: " + moto.cor, "Dados da moto", JOptionPane.CLOSED_OPTION);
            }
            else if (nome.equalsIgnoreCase("Suzuki")) 
            {
                Moto moto = new Suzuki();
                JOptionPane.showMessageDialog(null, "\nNome: " + moto.nome + "\nCilindrada: " + moto.cilindrada + "\nCor: " + moto.cor, "Dados da moto", JOptionPane.CLOSED_OPTION);
            }
            } 
            catch (Exception e){
                break;
            }
        }
        System.out.println("\nPROGRAMA FINALIZADO!");
    }
}
