import javax.swing.JOptionPane;

public class SwingAlert {

    public static void main(String[] args) {
        String message = "Hello World!";
        JOptionPane.showMessageDialog(
            null,
            message,
            "Swing Alert",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
