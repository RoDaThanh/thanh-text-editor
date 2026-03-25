import javax.swing.*;
import java.awt.*;

public class MyTextEditor {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new TexEditorFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
