package ole.step3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Mohannad Elmagharby
 * on 3/16/2020
 */
public class Step4_D {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Node tree[]=new Node[3];
        tree[0]=new Node('A');
        tree[1]=(new Node('B'));
        tree[2]=(new Node('C'));
        for (int i = 0; i < 3; i++) {
            String s = bf.readLine();
            char l = s.charAt(0);
            char  r= s.charAt(2);
            if (s.charAt(1)=='>'){
                tree[l-65].setChild(new Node(r));
                tree[r-65].setParent(new Node(l));
            }
        }

        Node min=null;
        for (int i = 0; i < tree.length; i++) {
            if (tree[i].getChild()==null){
                min=tree[i];
            }
        }
        while (min!=null){
            System.out.print(min.content);
            min=min.parent;
        }
    }

    static class Node{
        Node parent;
        Node child;
        char content;

        public Node(char content) {
            this.content = content;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public Node getChild() {
            return child;
        }

        public void setChild(Node child) {
            this.child = child;
        }

        public char getContent() {
            return content;
        }

        public void setContent(char content) {
            this.content = content;
        }
    }
}




/*
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 0
0 0 0 0 1
 */
