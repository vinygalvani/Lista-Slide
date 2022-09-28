import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {

    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador: "));

    if (idade <= 7) {
      JOptionPane.showMessageDialog(null, "Nadador de categoria INFANTIL.");
    }
      else if ((idade > 7) && (idade <= 10)) {
        JOptionPane.showMessageDialog(null, "Nadador de categoria JUVENIL.");
      }
        else if ((idade > 10) && (idade <= 15)) {
          JOptionPane.showMessageDialog(null, "Nadador de categoria ADOLESCENTE.");
        }
          else if ((idade > 16) && (idade <= 30)) {
            JOptionPane.showMessageDialog(null, "Nadador de categoria ADULTO.");
          }
            else {
              JOptionPane.showMessageDialog(null, "Nadador de categoria SENIOR.");
            }


  }
}