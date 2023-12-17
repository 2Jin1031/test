package SwingProject;

import javax.swing.*;
import java.awt.*;

public class Menu1 extends JFrame
{
    public Menu1(String str)
    {
        super(str);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container containPane = getContentPane();
        containPane.setBackground(Color.cyan);
        containPane.setLayout(new FlowLayout());
        // 메뉴바 생성
        MenuBar mb = new MenuBar();
        // 메뉴 '파일' 생성
        Menu file = new Menu("파일");
        // 하위 항목 정의
        MenuItem file_new = new MenuItem("새로 만들기");
        MenuItem file_open = new MenuItem("열기");
        MenuItem file_save = new MenuItem("저장");
        MenuItem file_newname = new MenuItem("이름 변경 하기");
        // 하위 항목 
        file.add(file_new);
        file.add(file_open);
        file.add(file_save);
        file.add(file_newname);

        Menu edit = new Menu("편집");
        MenuItem edit_undo = new MenuItem("실행 취소");
        MenuItem edit_cut = new MenuItem("잘라내기");
        MenuItem edit_copy = new MenuItem("복사");
        MenuItem edit_paste = new MenuItem("붙여넣기");
        edit.add(edit_undo);
        edit.add(edit_cut);
        edit.add(edit_copy);
        edit.add(edit_paste);

        Menu view = new Menu("보기");
        CheckboxMenuItem view_status = new CheckboxMenuItem("상태 표시줄");
        view.add(view_status);


        mb.add(file);
        mb.add(edit);
        mb.add(view);

        setMenuBar(mb);

//        // Panel 생성 및 추가
//        Panel panel = new Panel();
//        panel.add(mb);
//        add(panel);

        setSize(500,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu1("메뉴 테스트");
    }
}