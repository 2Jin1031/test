package SwingProject;

import java.awt.*;

public class FrameTest1 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("첫 번째 프레임입니다.");
        f.setBounds(100, 100, 300, 300); // setBounds: 위치와 크기를 설정
        f.setVisible(true); // setVisible(boolean b): 파라미터 b값에 응해, 이 컴퍼넌트를 표시하는지 비표시로 하는지 결정
    }
}
