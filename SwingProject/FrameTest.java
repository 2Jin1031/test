package SwingProject;

import java.awt.*;

public class FrameTest extends Frame {
    public FrameTest(String str) {
        super(str);
        Panel panel1 = new Panel();
        panel1.setBackground(Color.RED);
        add(panel1);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameTest("페널 테스트");
    }
}
