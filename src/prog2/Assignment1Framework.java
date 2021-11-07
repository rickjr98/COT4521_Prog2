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
        Point[] pArray = new Point[28];
        
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
        pArray[0] = p;
        pArray[0].setStudents(15000);
        pArray[1] = q;
        pArray[1].setStudents(500);
        pArray[2] = r;
        pArray[2].setStudents(800);
        pArray[3] = s;
        pArray[3].setStudents(101000);
        
        p = new Point(258, 74);
        q = new Point(286, 43);
        r = new Point(258,43);
        s = new Point(286, 74);
        rpArray[1] = new RectPolygon(4);
        rpArray[1].addVertex(p);
        rpArray[1].addVertex(q);
        rpArray[1].addVertex(r);
        rpArray[1].addVertex(s);
        pArray[4] = p;
        pArray[4].setStudents(4600);
        pArray[5] = q;
        pArray[5].setStudents(48000);
        pArray[6] = r;
        pArray[6].setStudents(5700);
        pArray[7] = s;
        pArray[7].setStudents(3500);
        
        p = new Point(125, 136);
        q = new Point(151, 110);
        r = new Point(125, 110);
        s = new Point(151, 136);
        rpArray[2] = new RectPolygon(4);
        rpArray[2].addVertex(p);
        rpArray[2].addVertex(q);
        rpArray[2].addVertex(r);
        rpArray[2].addVertex(s);
        pArray[8] = p;
        pArray[8].setStudents(26888);
        pArray[9] = q;
        pArray[9].setStudents(27000);
        pArray[10] = r;
        pArray[10].setStudents(57000);
        pArray[11] = s;
        pArray[11].setStudents(2400);
        
        p = new Point(329, 78);
        q = new Point(357, 44);
        r = new Point(329, 44);
        s = new Point(357, 78);
        rpArray[3] = new RectPolygon(4);
        rpArray[3].addVertex(p);
        rpArray[3].addVertex(q);
        rpArray[3].addVertex(r);
        rpArray[3].addVertex(s);
        pArray[12] = p;
        pArray[12].setStudents(5670);
        pArray[13] = q;
        pArray[13].setStudents(45000);
        pArray[14] = r;
        pArray[14].setStudents(34000);
        pArray[15] = s;
        pArray[15].setStudents(2400);
        
        p = new Point(317, 328);
        q = new Point(339, 302);
        r = new Point(317, 302);
        s = new Point(339, 328);
        rpArray[4] = new RectPolygon(4);
        rpArray[4].addVertex(p);
        rpArray[4].addVertex(q);
        rpArray[4].addVertex(r);
        rpArray[4].addVertex(s);
        pArray[16] = p;
        pArray[16].setStudents(3400);
        pArray[17] = q;
        pArray[17].setStudents(56000);
        pArray[18] = r;
        pArray[18].setStudents(1300);
        pArray[19] = s;
        pArray[19].setStudents(15000);
        
        p = new Point(293, 74);
        q = new Point(318, 47);
        r = new Point(293, 47);
        s = new Point(318, 74);
        rpArray[5] = new RectPolygon(4);
        rpArray[5].addVertex(p);
        rpArray[5].addVertex(q);
        rpArray[5].addVertex(r);
        rpArray[5].addVertex(s);
        pArray[20] = p;
        pArray[20].setStudents(45000);
        pArray[21] = q;
        pArray[21].setStudents(23400);
        pArray[22] = r;
        pArray[22].setStudents(78000);
        pArray[23] = s;
        pArray[23].setStudents(70000);
        
        p = new Point(319, 287);
        q = new Point(339, 264);
        r = new Point(319, 264);
        s = new Point(339, 287);
        rpArray[6] = new RectPolygon(4);
        rpArray[6].addVertex(p);
        rpArray[6].addVertex(q);
        rpArray[6].addVertex(r);
        rpArray[6].addVertex(s);
        pArray[24] = p;
        pArray[24].setStudents(35000);
        pArray[25] = q;
        pArray[25].setStudents(3400);
        pArray[26] = r;
        pArray[26].setStudents(80000);
        pArray[27] = s;
        pArray[27].setStudents(10000);
        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, pArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
