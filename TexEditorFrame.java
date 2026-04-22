import javax.swing.*;

public class TexEditorFrame extends JFrame {
    private static final int DEFAULT_X = 300;
    private static final int DEFAULT_Y = 200;
    private static final String TITLE = "Thanh Dep Trai Editor";

    public TexEditorFrame() {
        setTitle(TITLE);
        add(new HelloWordComponent());
        pack();
        setLocation(DEFAULT_X, DEFAULT_Y);
    }
}
