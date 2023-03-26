import javax.swing.*;
import java.awt.*;
public class GameFrame {
    JFrame frame;
    Table table;
    GameFrame(){
        frame= new JFrame("Pong Game");
        table = new Table();
        table. setBackground(Color.BLACK);
        frame.add(table);
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        frame.setLocationRelativeTo(null);

    }

}
