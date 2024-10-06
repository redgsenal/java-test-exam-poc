package com.exam.test30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {

    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {

    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class ProductOfRedNodesVisitor extends TreeVis {

    public int getResult() {
        //implement this
        return 1;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

class FancyVisitor extends TreeVis {

    public int getResult() {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}

public class Solution {

    private static Color getColorValue(String n) {
        return n.equalsIgnoreCase("0") ? Color.RED : Color.GREEN;
    }

    private static int getNodeValue(String v) {
        return Integer.getInteger(v);
    }

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            int numberOfNodes = Integer.parseInt(br.readLine().trim());
            String inputNodeValues = scanner.next();
            String[] nodeValues = inputNodeValues.split(" ");
            System.out.println("number of nodes: " + numberOfNodes);
            System.out.println("node values: ");
            String inputColorValues = scanner.next();
            String[] colorValues = inputColorValues.split(" ");
            // initial top tree node
            TreeNode treeNodeParent = new TreeNode(getNodeValue(nodeValues[0]), getColorValue(colorValues[0]), 1);
            // build the remaining nodes
            for (int node = 1; node < numberOfNodes; node++) {
                TreeNode treeNodeChild = new TreeNode(getNodeValue(nodeValues[node]), getColorValue(colorValues[node]), node);
                treeNodeParent.addChild(treeNodeChild);
            }
            return treeNodeParent;

        } catch (NumberFormatException | IOException e) {
            System.out.println("** error");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        return new TreeNode(1, Color.RED, 1);
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

}
