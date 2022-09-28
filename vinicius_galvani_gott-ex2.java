import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota do aluno: "));
    float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota do aluno: "));
    float media = ((nota1 + nota2) / 2); 
    if (media >= 7) {
      JOptionPane.showMessageDialog(null, "Média: " + media);
      JOptionPane.showMessageDialog(null, "Aluno aprovado!");
    }
    else {
      JOptionPane.showMessageDialog(null, "Média: " + media);
      JOptionPane.showMessageDialog(null, "Aluno reprovado.");
    } 

  }
}