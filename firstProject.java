import javax.swing.JOptionPane;

public class firstProject {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("what is your name?");
        JOptionPane.showMessageDialog(null, "hallo"+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age?"));
        JOptionPane.showMessageDialog(null, "are  you "+age);

        double tall = Double.parseDouble(JOptionPane.showInputDialog("how tall ara you"));
        JOptionPane.showMessageDialog(null, "are  you "+tall+"tall,");


    }
}