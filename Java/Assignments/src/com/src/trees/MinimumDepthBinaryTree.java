package com.src.trees;

import java.util.Stack;

public class MinimumDepthBinaryTree {
    public static int minDepth(TreeNode root) {
       if(root==null) return 0;

       int minLeft=minDepth(root.left);
       int minRight=minDepth(root.right);

       return (minLeft==0 ||  minRight==0)? minLeft+minRight+1:Math.min(minLeft,minRight)+1;



    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(minDepth(root));
    }
}
