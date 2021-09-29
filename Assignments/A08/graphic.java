import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 * @version
 * @author Loic Konan
 */

public class graphic 
{

    public static void main(String[] args) 
    {
        EventQueue.invokeLater(() -> 
        {
            var frame = new FontFrame();
            frame.setTitle("FontTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * A frame with a text message component.
 */
class FontFrame extends JFrame 
{
    public FontFrame() 
    {
        add(new FontComponent());
        pack();
    }
}

/**
 * A component that shows a centered message in a box.
 */

class FontComponent extends JComponent 
{
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public void paintComponent(Graphics g) 
    {
        var g2 = (Graphics2D) g;

        var message = "Hello, World!";
    
        var f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);

        // measure the size of the message

        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        // set (x,y) = top left corner of text

        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;
        // add ascent to y to reach the baseline

        double ascent = -bounds.getY();
        double baseY = y + ascent;

        // draw the message

        g2.drawString(message, (int) x, (int) baseY);

        g2.setPaint(Color.RED);

        // draw the baseline

        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        // draw the enclosing rectangle

        var rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }

    public Dimension getPreferredSize() 
    {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}



// //Usually you will require both swing and awt packages
// // even if you are working with just swings.
// import javax.swing.*;
// import java.awt.*;
// class gui 
// {
//     public static void main(String args[]) 
//     {

//         //Creating the Frame
//         JFrame frame = new JFrame("Chat Frame");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(400, 400);

//         //Creating the MenuBar and adding components
//         JMenuBar mb = new JMenuBar();
//         JMenu m1 = new JMenu("FILE");
//         JMenu m2 = new JMenu("Help");
//         mb.add(m1);
//         mb.add(m2);
//         JMenuItem m11 = new JMenuItem("Open");
//         JMenuItem m22 = new JMenuItem("Save as");
//         m1.add(m11);
//         m1.add(m22);

//         //Creating the panel at bottom and adding components
//         JPanel panel = new JPanel(); // the panel is not visible in output
//         JLabel label = new JLabel("Enter Text");
//         JTextField tf = new JTextField(10); // accepts upto 10 characters
//         JButton send = new JButton("Send");
//         JButton reset = new JButton("Reset");
//         panel.add(label); // Components Added using Flow Layout
//         panel.add(tf);
//         panel.add(send);
//         panel.add(reset);

//         // Text Area at the Center
//         JTextArea ta = new JTextArea();

//         //Adding Components to the frame.
//         frame.getContentPane().add(BorderLayout.SOUTH, panel);
//         frame.getContentPane().add(BorderLayout.NORTH, mb);
//         frame.getContentPane().add(BorderLayout.CENTER, ta);
//         frame.setVisible(true);
//     }
// }