import javax.swing.JOptionPane;

public class firstProject {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("what is your name?");
        JOptionPane.showMessageDialog(null, "hallo"+name);
    }
}