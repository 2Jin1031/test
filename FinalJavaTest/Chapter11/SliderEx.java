package FinalJavaTest.Chapter11;

import javax.swing.*;
import java.awt.*;

public class SliderEx extends JFrame {
    public SliderEx() {
        setTitle("슬라이더 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
        slider.setPaintLabels(true); // 라벨 보이기
        slider.setPaintTicks(true); // 눈금 보이기
        slider.setPaintTrack(true); // track  보이기 -> 있어도 없어도 달라지는 게 없음
        slider.setMajorTickSpacing(50); // 큰 눈금 간격 50 지정
        slider.setMinorTickSpacing(10); // 작은 눈금 간격 10 지정

        c.add(slider);
        setSize(300,100);
        setVisible(true);
    }
    public static void main(String [] args) {
        new SliderEx();
    }
}