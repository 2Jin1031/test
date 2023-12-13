package FinalJavaTest.Chapter11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta / Yellow Button");
        JButton b2 = new JButton(" Disabled Button ");
        JButton b3 = new JButton("getX(), getY()");

        b1.setBackground(Color.ORANGE); // 배경색 설정
        b1.setForeground(Color.MAGENTA); // 글자색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
        b2.setEnabled(false); // 버튼 비활성화
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getSource(); // b3 버튼이 클릭되었을 때의 정보 가져옴
                JComponentEx frame = (JComponentEx)b.getTopLevelAncestor(); // 클릭된 JButton(b3)의 최상위 부모 컨테이너를 찾습니다. 여기서는 JFrame인 JComponentEx 클래스의 인스턴스를 찾아냅니다.
                frame.setTitle(b.getX() + "," + b.getY()); // 찾아낸 JFrame의 제목을 현재 클릭된 JButton의 X, Y 좌표로 설정합니다. 이렇게 하면 버튼이 화면상 어디에 위치해 있는지를 JFrame의 제목에 표시하게 됩니다.
            }
        });

        c.add(b1); c.add(b2); c.add(b3);
        setSize(260, 200);
        setVisible(true);
    }


    public static void main(String[] args) {
        new JComponentEx();
    }
}
