import javax.swing.*;

public class introSessionForSwing {
    JFrame myframe;
    introSessionForSwing(){
        myframe = new JFrame("Today's Frame");  // title of frame

        JTextArea area = new JTextArea("Welcome to My Frame");

        area.setBounds(10,30,200,200); // area me jo text hai uske dimensions set kiye

        myframe.add(area); // area me jo text likha hai usko frame me add kiya, abhi ye dikhega screen par

        myframe.setSize(800,800); // frame ki total screen size

        myframe.setLayout(null);

        myframe.setVisible(true); // isse hamari frame dikhegi

    }

    public static void main(String[] args) {
        introSessionForSwing xy = new introSessionForSwing();
    }
}
