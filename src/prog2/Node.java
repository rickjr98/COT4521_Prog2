/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2;

/**
 *
 * @author rickj
 */
public class Node {
    private Point point;
    private Node left;
    private Node right;
    
    public Node() {
        setNode(new Point(), null, null);
    }
    
    public Node(Point p) {
        setNode(p, null, null);
    }
    
    public void setNode(Point p, Node l, Node r) {
        point = p;
        left = l;
        right = r;
    }
    
    public Point getInfo() {
        return point;
    }
    
    public Node getLeftChild() {
        return left;
    }
    
    public Node getRightChild() {
        return right;
    }
    
    public void setInfo(Point p) {
        point = p;
    }
    
    public void setLeftChild(Node l) {
        left = l;
    }
    
    public void setRightChild(Node r) {
        right = r;
    }
}
