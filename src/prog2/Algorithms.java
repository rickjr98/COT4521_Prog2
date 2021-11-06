package prog2;

import java.util.ArrayList;

/**
 * This class implements several algorithms.
 */
// Ricardo Estrella
// PID: 6071900
public class Algorithms
{
    /**
     * Determines the closest pair of points. Brute-force solution is used.
     * 
     * @param points input points. Array is assumed to be fully populated.
     * @param indices output array containing indices of closest pair
     */
    public static void closestPairOfPoints(Point[] points, int[] indices)
    {
        double minDistance = Double.MAX_VALUE;
        for (int i=0; i<points.length; i++)
        {
            for (int j=i+1; j<points.length; j++)
            {
               double d = points[i].distance(points[j]);
               if (d<minDistance)
               {
                   minDistance = d;
                   indices[0] = i;
                   indices[1] = j;
               }
            }
        }
    }

    public static int isPointContainedIn(GeometricObject[] g, Point p)
    {
        Rectangle[] rArray = (Rectangle[])g;
        
        for (int i=0; i<g.length; i++)
        {
            if (rArray[i].isPointInRectangle(p))
                return i;
        }
        
        return -1;
    }
    
    public static int isPointInPolygon(GeometricObject[] g, Point p) {
        RectPolygon[] rpArray = (RectPolygon[])g;
        
        for(int i = 0; i < g.length; i++) {
            if(rpArray[i].isPointInRectPolygon(p)) {
                return i;
            }
        }
        return -1;
    }
    
    public static Point[] inRectangle(GeometricObject[] g, Rectangle r)
    {
        int inputLength = g.length; //number of points in input array
        Point[] pArray = (Point[])g; //input points
        
        K2Tree k2Tree = new K2Tree();
        for(int i=0; i<inputLength; i++)
        {
            k2Tree.add(pArray[i]);
        }
        
        ArrayList<Point> pList = k2Tree.pointsInRange(r);
        Point[] output = pList.toArray(new Point[pList.size()]);
        
        return output;
    }
}
