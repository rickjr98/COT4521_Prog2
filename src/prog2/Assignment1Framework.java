package prog2;
import javax.swing.*;

// Ricardo Estrella
// PID: 6071900

public class Assignment1Framework
{
    public static void main(String[] args)
    {
        new Assignment1Framework();
    }
    
    public Assignment1Framework()
    {        
        //Defining the geometric objects that represent the problem data
        Rectangle[] rArray = new Rectangle[3];
        RectPolygon[] rpArray = new RectPolygon[7];
        
        Point p = new Point(5, 6);
        Point q = new Point(10, 370);
        rArray[0] = new Rectangle(p, q); //Florida Turnpike
        
        p = new Point(10, 13);
        q = new Point(420, 26);
        rArray[1] = new Rectangle(p, q); //8th st.

        p = new Point(421, 10);
        q = new Point(430, 410);
        rArray[2] = new Rectangle(p, q); //107th Ave.
        
        p = new Point(159, 390);
        q = new Point(205, 340);
        Point r = new Point(159, 340);
        Point s = new Point(205, 390);
        rpArray[0] = new RectPolygon(4);
        rpArray[0].addVertex(p);
        rpArray[0].addVertex(q);
        rpArray[0].addVertex(r);
        rpArray[0].addVertex(s);
        
        p = new Point(258, 74);
        q = new Point(286, 43);
        r = new Point(258,43);
        s = new Point(286, 74);
        rpArray[1] = new RectPolygon(4);
        rpArray[1].addVertex(p);
        rpArray[1].addVertex(q);
        rpArray[1].addVertex(r);
        rpArray[1].addVertex(s);
        
        p = new Point(125, 136);
        q = new Point(151, 110);
        r = new Point(125, 110);
        s = new Point(151, 136);
        rpArray[2] = new RectPolygon(4);
        rpArray[2].addVertex(p);
        rpArray[2].addVertex(q);
        rpArray[2].addVertex(r);
        rpArray[2].addVertex(s);
        
        p = new Point(329, 78);
        q = new Point(357, 44);
        r = new Point(329, 44);
        s = new Point(357, 78);
        rpArray[3] = new RectPolygon(4);
        rpArray[3].addVertex(p);
        rpArray[3].addVertex(q);
        rpArray[3].addVertex(r);
        rpArray[3].addVertex(s);
        
        p = new Point(317, 328);
        q = new Point(339, 302);
        r = new Point(317, 302);
        s = new Point(339, 328);
        rpArray[4] = new RectPolygon(4);
        rpArray[4].addVertex(p);
        rpArray[4].addVertex(q);
        rpArray[4].addVertex(r);
        rpArray[4].addVertex(s);
        
        p = new Point(293, 74);
        q = new Point(318, 47);
        r = new Point(293, 47);
        s = new Point(318, 74);
        rpArray[5] = new RectPolygon(4);
        rpArray[5].addVertex(p);
        rpArray[5].addVertex(q);
        rpArray[5].addVertex(r);
        rpArray[5].addVertex(s);
        
        p = new Point(319, 287);
        q = new Point(339, 264);
        r = new Point(319, 264);
        s = new Point(339, 287);
        rpArray[6] = new RectPolygon(4);
        rpArray[6].addVertex(p);
        rpArray[6].addVertex(q);
        rpArray[6].addVertex(r);
        rpArray[6].addVertex(s);
        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, rpArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
