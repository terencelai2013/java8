package example;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class FrameTest extends Frame {

    public String message;

    public FrameTest() {
        super("This is the FrameTest Title");
        message = "This is the list of int variables from 6 to 12";
        /**
         * setBackground is employed to set the background color
         */
        this.setBackground(Color.cyan);
    }

    public static void main(String[] args) {

        FrameTest frame = new FrameTest();
        frame.start();

        /**
         * Create the first Array with the element name for each integers
         * Create the second Array with int elements 1 - 6
         * Loop through the array and print out the 6 elements (the element
         * name is appended in front to each int array element)
         */

        int[] myIntArray = new int[]{1, 2, 3, 4, 5, 6};
        String[] arrayElementName = new String[]{"one", "two", "three", "four", "five", "six"};
        for (int i = 0; i < 6; i++) {
            System.out.println(arrayElementName[i] + " " + myIntArray[i]);
        }
    }

    public void paint(Graphics g) {

        /** Create 6 int variables by adopting a number of allowed combinations
         */

        int thisIsNumber6 = 6;
        int _7NextInt = 7;
        int eight = 8;
        int Nine = 9;
        int TEn$ = 10;
        int ELeven_ = 11;
        int TwElve = 12;

        g.setColor(Color.BLACK);
        g.drawString(message, 50, 40);

        g.drawString("Number " + "" + thisIsNumber6, 50, 60);
        g.drawString("Number " + "" + _7NextInt, 50, 80);
        g.drawString("Number " + "" + eight, 50, 100);
        g.drawString("Number " + "" + Nine, 50, 120);
        g.drawString("Number " + "" + TEn$, 50, 140);
        g.drawString("Number " + "" + ELeven_, 50, 160);
        g.drawString("Number " + "" + TwElve, 50, 180);

        g.drawString("Click anywhere to Exit", 50, 220);
        System.out.println("Abort the Console's Job");
    }

    public void start() {
        setSize(300, 300);
        setVisible(true);

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                setVisible(false);
                dispose(); // free up system resources
                System.exit(0);
            }
        });
        // This would result in quitting the application

    }
}
