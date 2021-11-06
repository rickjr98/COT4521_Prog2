/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

// Ricardo Estrella

import java.util.ArrayList;

// 6071900

public class K2Tree {
    private Node root;
    
    public K2Tree()
    {
        root = new Node();
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(null);
    }
    
    public void add(Point p)
    {
        root.setLeftChild(add(p, root.getLeftChild(), "even"));
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public ArrayList<Point> pointsInRange(Rectangle r)
    {
        return pointsInRange(r, root.getLeftChild(), "even");
    }

    public String toString()
    {
        String str = toString(root.getLeftChild());
        str = "[" + str.substring(0, str.length()-2) + "]";

        return str;
    }

    private Node add(Point p, Node node, String level)
    {
        if (node == null)
            node = new Node(p);
        else
            switch (level)
            {
                case "even" ->
                {
                    if (p.getX() < node.getInfo().getX())
                        node.setLeftChild(add(p, node.getLeftChild(), "odd"));
                    else
                        node.setRightChild(add(p, node.getRightChild(), "odd"));
                }
                case "odd" ->
                {
                    if (p.getY() < node.getInfo().getY())
                        node.setLeftChild(add(p, node.getLeftChild(), "even"));
                    else
                        node.setRightChild(add(p, node.getRightChild(), "even"));
                }
            }

        return node;
    }

    private String toString(Node p)
    {
        if (p != null)
        {
            return toString(p.getLeftChild()) +
                   p.getInfo() + ", " +
                   toString(p.getRightChild());
        }
        else return "";
    }
    
    private ArrayList<Point> pointsInRange(Rectangle r, Node node, String level)
    {
        ArrayList<Point> pArray = new ArrayList<>();
        
        if (node != null)
        {
            double minX = r.smallestX();
            double maxX = r.greatestX();
            double minY = r.smallestY();
            double maxY = r.greatestY();
            
            double x = node.getInfo().getX();
            double y = node.getInfo().getY();
            
            if ((minX<=x && x<=maxX) &&
                (minY<=y && y<=maxY))
            {
                pArray.add(node.getInfo());
            }
            
            switch (level)
            {
                case "even" ->
                {
                    if (minX <= x)
                    {
                        ArrayList<Point> t =
                                pointsInRange(r, node.getLeftChild(), "odd");
                        pArray.addAll(t);
                    }
                    if (maxX >= x)
                    {
                        ArrayList<Point> t =
                                pointsInRange(r, node.getRightChild(), "odd");
                        pArray.addAll(t);
                    }
                }

                case "odd" ->
                {
                    if (minY <= y)
                    {
                        ArrayList<Point> t =
                                pointsInRange(r, node.getLeftChild(), "even");
                        pArray.addAll(t);
                    }
                    if (maxY >= y)
                    {
                        ArrayList<Point> t =
                                pointsInRange(r, node.getRightChild(), "even");
                        pArray.addAll(t);
                    }
                }
            }
        }
        
        return pArray;
    }
}
