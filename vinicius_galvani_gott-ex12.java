import javax.swing.*;

class Main {
  public static void main(String[] args) {
    
    float primeiroNumero = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
    
    float segundoNumero = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

    int escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma operação: \n[1]Somar. \n[2]Subtrair. \n[3]Multiplicar. \n[4]Dividir. \n[5]Sair."));

    if (escolha == 1) {
      JOptionPane.showMessageDialog(null, primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero+segundoNumero));
    }
      else if (escolha == 2) {
        JOptionPane.showMessageDialog(null, primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero-segundoNumero));
      }
        else if (escolha == 3) {
          JOptionPane.showMessageDialog(null, primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero*segundoNumero));
        }
          else if (escolha == 4) {
            JOptionPane.showMessageDialog(null, primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero/segundoNumero));
          }
          else {
            JOptionPane.showMessageDialog(null, "Programa finalizado.");
          }
  }
} 