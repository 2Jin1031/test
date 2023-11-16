//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class JC22011531Q09 extends JFrame {
//    private JLabel la = new JLabel("Hello"); // "Hello" 문자열을 출력하기 위한 레이블 컴포넌트
//    private EnumProject.EnumTest.Color myColor;
//
//    public JC22011531Q09() {
//        setTitle("22011531 Lee Jin");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Container c = getContentPane();
//        c.addMouseListener(new MyMouseListener()); // 컨텐트팬에 이벤트 리스너 달기
//
//        c.setLayout(null); // 컨텐트팬의 배치관리자 삭제
//        la.setSize(50, 20); // 레이블의 크기 50x20 설정
//        la.setLocation(30, 30); // 레이블의 위치 (30,30)으로 설정
//        c.add(la); // 레이블 컴포넌트 삽입
//
//        setSize(250, 250);
//        setVisible(true);
//    }
//
//    // Mouse 리스너 구현
//    class MyMouseListener implements MouseListener {
//        public void mousePressed(MouseEvent e) {
//            int x = e.getX(); // 마우스 클릭 좌표 x
//            int y = e.getY(); // 마우스 클릭 좌표 y
//            la.setLocation(x, y); // 레이블의 위치를 (x,y)로 이동
//        }
//
//        public void mouseReleased(MouseEvent e) {
//            // 마우스 왼쪽 버튼으로 더블 클릭하면 백그라운드 색상을 랜덤하게 변경
//            if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
//                int R = (int) (Math.random() * 256);
//                int G = (int) (Math.random() * 256);
//                int B = (int) (Math.random() * 256);
//                myColor = new EnumProject.EnumTest.Color(R, G, B);
//                getContentPane().setBackground(myColor); // Set background color of the content pane
//            }
//        }
//
//        public void mouseClicked(MouseEvent e) {}
//        public void mouseEntered(MouseEvent e) {}
//        public void mouseExited(MouseEvent e) {}
//    }
//
//    public static void main(String[] args) {
//        new JC22011531Q09();
//    }
//}
