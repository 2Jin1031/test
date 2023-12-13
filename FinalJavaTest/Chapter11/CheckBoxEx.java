package FinalJavaTest.Chapter11;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
    public CheckBoxEx() {
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg"); 			ImageIcon selectedCherryIcon = new ImageIcon(
                "images/selectedCherry.jpg");

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true);
        JCheckBox cherry = new JCheckBox("체리", cherryIcon);
        cherry.setBorderPainted(true); // 체크 박스의 외곽선 표시하도록
        cherry.setSelectedIcon(selectedCherryIcon); // 체리 체크박스가 선택되었을 때 표시되는 아이콘을 설정하는 코드

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250,150);
        setVisible(true);
    }
    public static void main(String [] args) {
        new CheckBoxEx();
    }
}