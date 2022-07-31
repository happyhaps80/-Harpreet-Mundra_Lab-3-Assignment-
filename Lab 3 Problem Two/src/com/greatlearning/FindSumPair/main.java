package com.greatlearning.FindSumPair;

import java.util.Set;
import java.util.HashSet;
class FindSumPair {
    class Node {
        private Node left;
        private Node right;
        private int data;
        Node(int key) {
            left = right =null;
            data=key;
        } }
    public Node insert(Node root,int key) {
        if(root==null)
            return new Node(key);
        if(key<root.data) {
            root.left= insert(root.left,key);
        }
        else {
            root.right=insert(root.right,key);
        }
        return root;
    }public static boolean findPair(Node root,int sum,Set set) {
        if(root==null) {
            return false;
        }
        else {
            boolean isPresent = findPair(root.left,sum,set);
            if(isPresent) {
                return isPresent;
            }
            if(set.contains(sum - root.data)) {
                System.out.println("The pair exists with values of " + (sum-root.data + "," + root.data));
                return true;
            }
            else {
                set.add(root.data);
            }
            return findPair(root.right,sum,set);
        } }
    public static boolean findPairWithGivenSum(Node root, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        boolean isPresent = findPair(root,sum,set);
        if(!isPresent) {
            System.out.println("Pair does not exist");
        }
        return isPresent;
    }
    public static void main(String[]args) {
        Node root = null;FindSumPair findSumPair = new FindSumPair();
        root = findSumPair.insert(root,40);
        root = findSumPair.insert(root,20);
        root = findSumPair.insert(root,60);
        root = findSumPair.insert(root,10);
        root = findSumPair.insert(root,30);
        root = findSumPair.insert(root,50);
        root = findSumPair.insert(root,70);
        System.out.println(findPairWithGivenSum(root,130));
    }
}


