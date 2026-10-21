package com.src.trees;

import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private static void helper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        helper(node.left, result);
        result.add(node.val);
        helper(node.right, result);
    }

    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        result.addAll(inorderTraversal2(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal2(root.right));

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal2(root));
    }
}
