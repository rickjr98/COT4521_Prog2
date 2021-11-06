package prog2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

// Ricardo Estrella
// PID: 6071900

public class GraphDisplay extends JPanel implements MouseMotionListener, MouseListener
{
    GeometricObject[] gArray; //geometric objects
    private BufferedImage image; //background image
    String description; //description of map element
    Point begin;
    Rectangle selectionRectangle;
    
    /**
     * Parameterized constructor.
     */
    public GraphDisplay(GeometricObject[] g)
    {
        this.gArray = g;
        addMouseMotionListener(this);
        addMouseListener(this);
        begin = null;
        selectionRectangle = null;
        
        try
        {
            image = ImageIO.read(new File("C:\\Users\\rickj\\Documents\\NetBeansProjects\\Prog1\\src\\prog1\\fiu map.png"));
        }
        catch (IOException ex)
        {
            System.out.println("Image file not found!");
        }        
        
        description = "";
    }
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        Point end = new Point(e.getX(), e.getY());
        selectionRectangle = new Rectangle(begin, end);
        repaint();
    }
    
    public void mousePressed(MouseEvent e)
    {
        begin = new Point(e.getX(), e.getY());
    }
    
    public void mouseReleased(MouseEvent e)
    {
        Point end = new Point(e.getX(), e.getY());
        selectionRectangle = new Rectangle(begin, end);
        begin = null;
        
        Point[] pArray = Algorithms.inRectangle(gArray, selectionRectangle);
            
        for(int i=0; i<pArray.length; i++)
        {
            pArray[i].setInteriorColor(Color.green);
        }        
        
        repaint();
        
        String str = "Summary" + "\nNumber of Points: " + pArray.length + "\nRectangle's Height: " + selectionRectangle.height() + "\nRectangle's Width: " + selectionRectangle.width();
        JOptionPane.showMessageDialog(null, str, "Output", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Captures mouse movement events.
     * 
     * @param e contains current location of mouse
     */
    @Override
    public void mouseMoved(MouseEvent e)
    {
        //only for coordinates lookup; remove after project completion
        System.out.println("(" + e.getPoint().x + ", " +
                           e.getPoint().y + ")");
        
        //is current mouse location inside a geometric object?
        //Set description accordingly
        int x = e.getPoint().x;
        int y = e.getPoint().y;
        Point p = new Point(e.getPoint().x, e.getPoint().y);
        
        repaint();
    }
    
    /**
     * Paints this panel; the system invokes it every time
     * it deems necessary to redraw the panel.
     */
    @Override
    public void paint(Graphics g)
    {        
        super.paint(g); //clears window
        if (selectionRectangle != null)
            selectionRectangle.draw(g);
        
        //draws background image
        Dimension d = getSize();
        g.drawImage(image, 0, 0, d.width, d.height, this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
