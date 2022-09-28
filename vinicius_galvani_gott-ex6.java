import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Cálculo de IMC.");
    float massa = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso em KG: "));
    float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura em M: "));
    double imc = (massa / (Math.pow(altura,2))); 

    if (imc < 20) {
      JOptionPane.showMessageDialog(null, "Abaixo do peso.");
      JOptionPane.showMessageDialog(null, "O IMC é: " + (String.format("%.2f",imc)));
    }
      else if ((imc >= 20) && (imc < 25)) {
        JOptionPane.showMessageDialog(null, "Peso ideal.");
        JOptionPane.showMessageDialog(null, "O IMC é: " + (String.format("%.2f",imc)));
      }
        else if ((imc >= 25) && (imc < 30)) {
          JOptionPane.showMessageDialog(null, "Sobre peso.");
          JOptionPane.showMessageDialog(null, "O IMC é: " + (String.format("%.2f",imc)));
        }
          else if ((imc >= 30) && (imc < 40)) {
            JOptionPane.showMessageDialog(null, "Obesidade.");
            JOptionPane.showMessageDialog(null, "O IMC é: " + (String.format("%.2f",imc)));
          }
            else {
              JOptionPane.showMessageDialog(null, "Obesidade mórbida.");
              JOptionPane.showMessageDialog(null, "O IMC é: " + (String.format("%.2f",imc)));
            }

  }
}