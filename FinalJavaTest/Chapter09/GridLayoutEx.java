package FinalJavaTest.Chapter09;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    public GridLayoutEx() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 3); // 4줄 2개씩
        grid.setVgap(5); // 간격 5 픽셀

        Container c = getContentPane();
        c.setLayout(grid);
        c.add(new JLabel(" 이름"));
        c.add(new JTextField(""));
        c.add(new JTextField("입력칸"));
        c.add(new JLabel(" 학번"));
        c.add(new JTextField(""));
        c.add(new JTextField("입력칸"));
        c.add(new JLabel(" 학과"));
        c.add(new JTextField(""));
        c.add(new JTextField("입력칸"));
        c.add(new JLabel(" 과목"));
        c.add(new JTextField(""));
        c.add(new JTextField("입력칸"));
        setSize(300, 200); // 전체 사이즈
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
