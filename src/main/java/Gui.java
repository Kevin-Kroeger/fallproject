import javax.swing.*;
import java.awt.*;

public class Gui extends Container {

    public void logInScreen(){
        //Creating a new Frame
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //JPannel
        JPanel p1 = new JPanel();
        BoxLayout box = new BoxLayout(p1,BoxLayout.Y_AXIS);
        p1.setLayout(box);
        p1.setBorder(BorderFactory.createEmptyBorder(50, 150, 50, 150));

        //Creating Buttons
        JButton logIn = new JButton("LogIn");
        JButton signUp = new JButton("SignUp");
        logIn.setAlignmentX(Component.CENTER_ALIGNMENT);
        signUp.setAlignmentX(Component.CENTER_ALIGNMENT);

        p1.add(logIn);
        p1.add(Box.createRigidArea(new Dimension(0,10)));
        p1.add(signUp);

        frame.setContentPane(p1);
        frame.setVisible(true);
    }


}
