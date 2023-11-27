package SwingProject;

import java.awt.*;

public class ModelessDialog extends Frame {
    public ModelessDialog() {
        super("다이얼로그 테스트");
        // 객체 생성
        Dialog d = new Dialog(this, "모덜리스 다이얼로그");
        // 위치와 크기 설정
        setBounds(100, 100, 400, 400);
        // 창을 화면에 보이게 함
        setVisible(true);
        d.setBounds(200, 200, 500, 500);
        // 크기 설정
        d.setSize(200, 200);
        // 다이어로그를 화면에 보이게 함
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new ModelessDialog();
    }
}
