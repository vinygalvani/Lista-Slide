import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    
   float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do primeiro lado do triângulo: "));
    float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do segundo lado do triângulo: "));
   float lado3 = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do terceiro lado do triângulo: "));

    if ((((lado1 * lado2) / 2) > lado3) && (((lado1 * lado3) / 2) > lado2) && (((lado2 * lado3) / 2) > lado1))
    JOptionPane.showMessageDialog(null, "Os 3 valores formam um triângulo: ");
    else 
      JOptionPane.showMessageDialog(null, "Os 3 valores não formam um triângulo: ");
  }
}