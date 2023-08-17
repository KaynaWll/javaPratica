import javax.swing.JOptionPane;
import javax.swing.plaf.metal.DefaultMetalTheme;

public class Exercicio18 {
    public static void main(String[] args){
        String nome = (JOptionPane.showInputDialog(null, "Digite seu nome"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor"));
        char categoria = (JOptionPane.showInputDialog(null, "Digite a categoria")).toUpperCase().charAt(0);
       
        double desconto = 0;
        switch(categoria){
            case 'A':
            desconto = 10;
            break;

            case 'B':
            desconto = 15;
            break;

            case 'C':
            desconto = 20;
            break;

            case 'D':
            desconto = 25;
            break;

            case 'E':
            desconto = 50;
            break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                    break;


        }

        double precofinal = preco - (preco * desconto / 100);
        JOptionPane.showMessageDialog(null, "O valor a  ser pago é: " + precofinal);

    }

}
