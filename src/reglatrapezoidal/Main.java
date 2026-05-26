package reglatrapezoidal;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.err.println("No se pudo aplicar Look and Feel del sistema: " + ex.getMessage());
        }

        SwingUtilities.invokeLater(() -> new FrmTrapezoidal().setVisible(true));
    }
}
