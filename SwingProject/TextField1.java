package SwingProject;

import java.awt.Frame;
        import java.awt.Label;
        import java.awt.Panel;
        import java.awt.TextField;

public class TextField1 extends Frame {
    public TextField1(String str) {
        super(str);
        // 패널 생성
        Panel p = new Panel();
        // 레이블 생성
        Label lbl1 = new Label(" 아 이 디:");
        Label lbl2 = new Label(" 비밀번호:");
        // 20자리 텍스트 필드 생성
        TextField txt1 = new TextField("ID", 20 );
        TextField txt2 = new TextField(20);
        // 비밀번호 * 로
        txt2.setEchoChar('*');
        p.add(lbl1);
        p.add(txt1);
        p.add(lbl2);
        p.add(txt2);
        add(p);
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TextField1("TextField 테스트");
    }
}