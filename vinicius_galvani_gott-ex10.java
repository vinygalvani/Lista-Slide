import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    
   float dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia da semana: "));

    if (dia == 1)
    JOptionPane.showMessageDialog(null, "Hoje é Domingo!");
    else if (dia == 2)
    JOptionPane.showMessageDialog(null, "Hoje é Segunda-Feira!");
    else if (dia == 3)
    JOptionPane.showMessageDialog(null, "Hoje é Terça-Feira!");
    else if (dia == 4)
    JOptionPane.showMessageDialog(null, "Hoje é Quarta-Feira!");
    else if (dia == 5)
    JOptionPane.showMessageDialog(null, "Hoje é Quinta-Feira!");
    else if (dia == 6)
    JOptionPane.showMessageDialog(null, "Hoje é Sexta-Feira!");
    else if (dia == 7)
    JOptionPane.showMessageDialog(null, "Hoje é Sábado!");
    else 
   JOptionPane.showMessageDialog(null, "Não existem mais dias na semana.",
      "Erro!", JOptionPane.ERROR_MESSAGE);
    
  }
}