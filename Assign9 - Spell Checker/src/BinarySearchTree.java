public class BinarySearchTree<E extends Comparable<E>> {

    public void display(String s) {

    }

    <object> object remove(E String) {
        return null;
    }

    int numberNodes() {
        return 0;
    }

    int numberLeafNodes() {
        return 0;
    }

    int height(int h) {
        if (h == 0)
            return 0;
        else {
            int heightLeft = height();
            int heightRight = height();
            if (heightLeft > heightRight)
                return 1 + heightLeft;
            else
                return 1 + heightRight;
        }
    }

    int height() {
        return 0;
    }


    private class TreeNode {
        private E data;
        private TreeNode left;
        private TreeNode right;

        TreeNode(E theData) {
            data = theData;
            left = null;
            right = null;
        }
    }

    private TreeNode root;

    BinarySearchTree() {
        root = null;
    }


    boolean insert(E newElement) {
        // newElement will be added and this will still be a
        // BinarySearchTree. This tree will not insert newElement
        // if it will compareTo an existing element equally.
        if (root == null)
            root = new TreeNode(newElement);
        else {
            // find the proper leaf to attach to
            TreeNode curr = root;
            TreeNode prev = root;
            while (curr != null) {
                prev = curr;
                if (newElement.compareTo(curr.data) < 0)
                    curr = curr.left;
                else if (newElement.compareTo(curr.data) > 0)
                    curr = curr.right;
                else {
                    System.out.println(newElement + " in this BST");
                    return false;
                }
            }

            // Correct leaf has now been found. Determine whether to
            // link the new node came from prev.left or prev.right
            if (newElement.compareTo(prev.data) < 0)
                prev.left = new TreeNode(newElement);
            else
                prev.right = new TreeNode(newElement);
        }
        return true;
    } // end insert


    // Return a reference to the object that will compareTo
    // searchElement equally. Otherwise, return null.
    boolean search(E searchElement) {
        // Begin the search at the root
        TreeNode ref = root;
        // Search until found or null is reached
        while (ref != null) {

            if (searchElement.compareTo(ref.data) < 0)
                ref = ref.left; // go down the left subtree
            else
                ref = ref.right; // go down the right subtree
        }
        // Found an empty tree. SearchElement was not found


        // The insert and find methods will be added here
        return Boolean.parseBoolean(null);
    }

}


































//import java.util.Random;
//import java.util.Scanner;
//class LinkedNode<E extends Comparable<E>> extends BinarySearchTree {
//    int data;
//    LinkedNode left;
//    LinkedNode right;
//    public LinkedNode(int data)
//    {
//        super();
//        this.data = data;
//        left = null;
//        right = null;
//    }
//
//    public LinkedNode() {
//
//    }
//
//    public void setLeftChild() {
//
//    }
//
//    public <E extends Comparable<E>> BinarySearchTree<E>.TreeNode getLeft() {
//        return null;
//    }
//}
//public class BinarySearchTree<E extends Comparable<E>> {
//    private E value;
//
//    public class TreeNode extends LinkedNode {
//
//        private E data;
//        private TreeNode left;
//        private TreeNode right;
//
//        TreeNode(E theData) {
//            super();
//            data = theData;
//            left = null;
//            right = null;
//        }
//
//
//        public boolean remove() {
//            return false;
//        }
//
//        public int getValue() {
//            return 0;
//        }
//    }
//
//    private LinkedNode root;
//
//    public BinarySearchTree() {
//        root = null;
//    }
//
//
//    boolean insert(E value) {
//        // newElement will be added and this will still be a
//        // BinarySearchTree. This tree will not insert newElement
//        // if it will compareTo an existing element equally.
//        if (root == null)
//            root = new TreeNode(value);
//        else {
//            // find the proper leaf to attach to
//            LinkedNode curr = root;
//            LinkedNode prev = root;
//            while (curr != null) {
//                prev = curr;
//                if (value.compareTo(curr.data) < 0)
//                    curr = curr.left;
//                else if (value.compareTo(curr.data) > 0)
//                    curr = curr.right;
//                else {
//                    System.out.println(value + " in this BST");
//                    return false;
//                }
//            }
//
//            // Correct leaf has now been found. Determine whether to
//            // link the new node came from prev.left or prev.right
//            if (value.compareTo(prev.data) < 0) {
//                prev.left = new TreeNode(value);
//            } else {
//                prev.right = new TreeNode(value);
//            }
//        }
//        return true;
//    } // end insert
//
//    boolean remove(E value) {
//        this.value = value;
//        if (root == null)
//            return false;
//        else {
//            if (root.getValue() == Integer.parseInt(String.valueOf(value))) {
//                LinkedNode auxRoot = new LinkedNode(0);
//                auxRoot.setLeftChild();
//                boolean result = root.remove();
//                root = auxRoot.getLeft();
//                return result;
//            } else {
//                return root.remove();
//            }
//        }
//    }
//
//    boolean search(E value) {
//        if (value == this.data)
//            return true;
//        else if (value < this.data) {
//            if (left == null)
//                return false;
//            else
//                return left.search(value);
//        } else {
//            if (right == null)
//                return false;
//            else
//                return right.search(value);
//        }
//    }
//
//
//
//
//    // The insert and find methods will be added here
//}
//
//    public boolean delete(int key)
//    {
//        LinkedNode parent = root;
//        LinkedNode current = root;
//        boolean isLeftChild = false;
//        while(current.data!=key)
//        {
//            parent = current;
//            if(current.data>key)
//            {
//                isLeftChild = true;
//                current = current.left;
//            }
//            else
//            {
//                isLeftChild = false;
//                current = current.right;
//            }
//            if(current ==null)
//            {
//                return false;
//            }
//        }
//        if(current.left==null && current.right==null)
//        {
//            if(current==root)
//            {
//                root = null;
//            }
//            if(isLeftChild ==true)
//            {
//                parent.left = null;
//            }
//            else
//            {
//                parent.right = null;
//            }
//        }
//        else if(current.right==null)
//        {
//            if(current==root)
//            {
//                root = current.left;
//            }
//            else if(isLeftChild)
//            {
//                parent.left = current.left;
//            }
//            else
//            {
//                parent.right = current.left;
//            }
//        }
//        else if(current.left==null)
//        {
//            if(current==root)
//            {
//                root = current.right;
//            }
//            else if(isLeftChild)
//            {
//                parent.left = current.right;
//            }
//            else
//            {
//                parent.right = current.right;
//            }
//        }
//        else if(current.left!=null && current.right!=null)
//        {
//            LinkedNode successor=getSuccessor(current);
//            if(current==root)
//            {
//                root = successor;
//            }
//            else if(isLeftChild)
//            {
//                parent.left = successor;
//            }
//            else
//            {
//                parent.right = successor;
//            }
//            successor.left = current.left;
//        }
//        return true;
//    }
//    public boolean find(int key)
//    {
//        LinkedNode current = root;
//        while(current!=null)
//        {
//            if(current.data==key)
//            {
//                return true;
//            }
//            else if(current.data>key)
//            {
//                current = current.left;
//            }
//            else
//            {
//                current = current.right;
//            }
//        }
//        return false;
//    }
//    public LinkedNode getSuccessor(LinkedNode deleleNode)
//    {
//        LinkedNode successsor =null;
//        LinkedNode successsorParent =null;
//        LinkedNode current = deleleNode.right;
//        while(current!=null)
//        {
//            successsorParent = successsor;
//            successsor = current;
//            current = current.left;
//        }
//        if(successsor!=deleleNode.right)
//        {
//            successsorParent.left = successsor.right;
//            successsor.right = deleleNode.right;
//        }
//        return successsor;
//    }
//    public void InorderTraversal(LinkedNode root,int space)
//    {
//        if(root!=null)
//        {
//            space += COUNT;
//            InorderTraversal(root.left,space);
//            System.out.println();
//            for(int i=COUNT;i<space;i++)
//                System.out.print(" ");
//            System.out.print(" " + root.data);
//            InorderTraversal(root.right,space);
//        }
//    }
//    public void PreorderTraversal(LinkedNode root,int space)
//    {
//        space += COUNT;
//        if(root!=null)
//        {
//            for(int i=COUNT;i<space;i++)
//                System.out.print(" ");
//            System.out.print(" " + root.data);
//            PreorderTraversal(root.left,space);
//            PreorderTraversal(root.right,space);
//        }
//    }
//    public void PostOrderTraversal(LinkedNode root,int space)
//    {
//        if(root!=null)
//        {
//            PostOrderTraversal(root.left,space);
//            PostOrderTraversal(root.right,space);
//            System.out.print(" " + root.data);
//        }
//    }
//    public int getMinimum(LinkedNode root)
//    {
//        if (root == null)
//            return Integer.MAX_VALUE;
//        int smallest = root.data;
//        int lres = getMinimum(root.left);
//        int rres = getMinimum(root.right);
//        if (lres < smallest)
//            smallest = lres;
//        if (rres < smallest)
//            smallest = rres;
//        return smallest;
//    }
//    public int getMaxNode(LinkedNode root)
//    {
//        if (root == null)
//            return Integer.MIN_VALUE;
//        int largest = root.data;
//        int lres = getMaxNode(root.left);
//        int rres = getMaxNode(root.right);
//        if (lres > largest)
//            largest = lres;
//        if (rres > largest)
//            largest = rres;
//        return largest;
//    }
//    public static void main(String[] args)
//    {
//        Binary_Tree obj = new Binary_Tree();
//        Scanner sc=new Scanner(System.in);
//        Random rand=new Random();
//        int size=10,data,option,choice;
//        System.out.println("\n-------------------------------------");
//        System.out.println("*** Implementation of Binary Search Tree ****");
//        System.out.println("\n--------------------------------------");
//        System.out.println("\nGenerating Random Numbers...............");
//        for(int i=0;i<size;i++)
//        {
//            data=rand.nextInt(50);
//            obj.insert(data);
//        }
//        System.out.println("The Data Elements are:");
//        obj.InorderTraversal(root,4);
//        System.out.println("\n---------------------------------------");
//        while(true)
//        {
//            System.out.println("\n*** MENU ****");
//            System.out.println("1.Insert data in the Tree");
//            System.out.println("2.Delete an Item from the Tree");
//            System.out.println("3.Search an Item from the Tree");
//            System.out.println("4.Display Data Elements");
//            System.out.println("5.Get Minimum Node");
//            System.out.println("6.Get Maximum Node");
//            System.out.println("7.Exit");
//            System.out.println("Please Select any Option:");
//            option=sc.nextInt();
//            switch(option)
//            {
//                case 1:
//                    System.out.println("Please Enter Data to insert: ");
//                    data=sc.nextInt();
//                    obj.insert(data);
//                    break;
//                case 2:
//                    System.out.println("Please Enter Data to delete: ");
//                    data=sc.nextInt();
//                    obj.delete(data);
//                    break;
//                case 3:
//                    System.out.println("Please Enter Data to Search: ");
//                    data=sc.nextInt();
//                    boolean result=obj.find(data);
//                    if(result==true)
//                        System.out.println("Key found");
//                    else
//                        System.out.println("Key is not Found");
//                    break;
//                case 4:
//                    System.out.println("1.inorder Traversal");
//                    System.out.println("2.preorder Traversal");
//                    System.out.println("3.postorder Traversal");
//                    System.out.println("Please Select any technique");
//                    choice=sc.nextInt();
//                    switch(choice)
//                    {
//                        case 1:
//                            obj.InorderTraversal(root,4);
//                            break;
//                        case 2:
//                            obj.PreorderTraversal(root,4);
//                            break;
//                        case 3:
//                            obj.PostOrderTraversal(root,4);
//                            break;
//                    }
//                    break;
//                case 5:
//                    System.out.println("\nThe Smallest Number in the Tree is:"+obj.getMinimum(root));
//                    break;
//                case 6:
//                    System.out.println("\nThe Largest Number in the Tree is:"+obj.getMaxNode(root));
//                    break;
//                case 7:
//                    System.out.println("\nTerminated!");
//                    System.exit(0);
//                default:
//                    System.out.println("!invalid Option");
//            }
//        }
//    }
//}
//
//
//
//
//
//
//
//



































//// This simple class stores a collection of strings in a binary tree.
//// There is no add or insert method.Instead a tree will be "hard coded" to
//// demonstrate algorithms such as tree traversals, makeMirror, and height.
//public class BinarySearchTree<E extends Comparable<E>> {
//
//    private int data;
//    private BinarySearchTree left;
//    private BinarySearchTree right;
//
//    public Object height() {
//        return null;
//    }
//
//    public Object numberLeafNodes() {
//        return null;
//    }
//
//    public Object numberNodes() {
//        return null;
//    }
//
//    private class LinkedNode implements Comparable {
//
//
//        private E data;
//        private boolean left;
//        private boolean right;
//
//        LinkedNode(E theData) {
//            data = theData;
//            left = Boolean.parseBoolean(null);
//            right = Boolean.parseBoolean(null);
//        }
//
//        @Override
//        public int compareTo(Object o) {
//            return 0;
//        }
//    }
//
//    private boolean root;
//
//    public BinarySearchTree() {
//        root = Boolean.parseBoolean(null);
//    }
//
//
//
//
//
//
//
//
//
//
//    public boolean insert(E newElement) {
//        // newElement will be added and this will still be a
//        // BinarySearchTree. This tree will not insert newElement
//        // if it will compareTo an existing element equally.
//        if (root = Boolean.parseBoolean(null))
//            root = new LinkedNode(newElement);
//        else {
//            // find the proper leaf to attach to
//            boolean curr = root;
//            boolean prev = root;
//            while (curr != null) {
//                prev = curr;
//                if (newElement.compareTo(curr.data) < 0)
//                    curr = curr.left;
//                else if (newElement.compareTo(curr.data) > 0)
//                    curr = curr.right;
//                else {
//                    System.out.println(newElement + " in this BST");
//                    return false;
//                }
//            }
//
//            // Correct leaf has now been found. Determine whether to
//            // link the new node came from prev.left or prev.right
//            if (newElement.compareTo(prev.data) < 0)
//                prev.left = new LinkedNode(newElement);
//            else
//                prev.right = new LinkedNode(newElement);
//        }
//        return true;
//    }
//
//
//
//
//
//    // Return a reference to the object that will compareTo
//    // searchElement equally. Otherwise, return null.
//    public E find(E searchElement) {
//        // Begin the search at the root
//        boolean ref = root;
//        // Search until found or null is reached
//        while (ref != null) {
//            if (searchElement.compareTo(ref.data) == 0)
//                return ref.data; // found
//            else if (searchElement.compareTo(ref.data) < 0)
//                ref = ref.left; // go down the left subtree
//            else
//                ref = ref.right; // go down the right subtree
//        }
//        // Found an empty tree. SearchElement was not found
//        return null;
//    }
//
//
//
//
//
//
//
//
//
//
//
//    //Remove an item from the tree
//    public boolean remove(Comparable item) {
//        root = remove(root, item);
//        return Boolean.parseBoolean(null);
//    }
//    private boolean remove(boolean t, Comparable item) {
//        if (t == null) {
//// Item not found; do nothing
//            return Boolean.parseBoolean(null);
//        } else {
//            int cmp = t.data.compareTo((E) item);
//            if (cmp == 0) {
//                // found the item here, let’s delete this node
//                return remove(t);
//            } else if (cmp>0) {
//                // data greater than item, remove from left tree
//                t.left = remove(t.left);
//                return remove(t);
//            } else {
//                // data less than item, remove from right tree
//                t.right = remove(t.right);
//                return remove(t);
//            }
//        }
//    }
//
//
//
//
//
//
//
//
//
//
//    boolean search(int value) {
//        if (value == this.data)
//            return true;
//        else if (value < this.data) {
//            if (left == null)
//                return false;
//            else
//                return left.search(value);
//        } else {
//            if (right == null)
//                return false;
//            else
//                return right.search(value);
//        }
//    }
//
//
//
//
//
//
//     //Add an item to the tree
//    public void add(Comparable item) {
//        root = add(root, item);
//    }
//
//    private boolean add(boolean t, Comparable item) {
//        if (t == null) {
//// The (sub)tree is empty, make a new leaf node return new Node(item);
//        } else {
//            int cmp = t.data.compareTo((E) item);
//            if (cmp == 0) {
//                // data is already in the tree, no change
//                return t;
//            } else if (cmp > 0) {
//                // data is greater than item, add in left tree
//                t.left = add(t.left, item);
//                return t;
//            } else {
//                // data is less than item, add in right tree
//                t.right = add(t.right, item);
//            }
//        }
//        return t;
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    void display(String s) {
//    }
//
//
//
//
//
//    void numberNodes(String s) {
//    }
//
//    void numberLeafNodes(String s) {
//    }
//
//    int height(BinarySearchTree node) {
//        if (node == null)
//            return 0;
//        else {
//            int heightLeft = height(left);
//            int heightRight = height(right);
//            if (heightLeft > heightRight)
//                return 1 + heightLeft;
//            else
//                return 1 + heightRight;
//        }
//    }
//}
//
//
//
//
//
//
//
//// The insert and find methods will be added here
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////
////
////
////public class Binary_Tree
////{
////    public static LinkedNode root;
////    public static int COUNT=10;
////    public Binary_Tree()
////    {
////        this.root=null;
////    }
////    public void insert(String data)
////    {
////        LinkedNode newNode = new LinkedNode(data);
////        if(root==null)
////        {
////            root = newNode;
////            return;
////        }
////        LinkedNode current = root;
////        LinkedNode parent = null;
////        while(true)
////        {
////            parent = current;
////            if(data == String.valueOf(current.data))
////            {
////                current = current.left;
////                if(current==null)
////                {
////                    parent.left = newNode;
////                    return;
////                }
////            }
////            else
////            {
////                current = current.right;
////                if(current==null)
////                {
////                    parent.right = newNode;
////                    return;
////                }
////            }
////        }
////    }
////    public boolean delete(int key)
////    {
////        LinkedNode parent = root;
////        LinkedNode current = root;
////        boolean isLeftChild = false;
////        while(current.data!=key)
////        {
////            parent = current;
////            if(current.data>key)
////            {
////                isLeftChild = true;
////                current = current.left;
////            }
////            else
////            {
////                isLeftChild = false;
////                current = current.right;
////            }
////            if(current ==null)
////            {
////                return false;
////            }
////        }
////        if(current.left==null && current.right==null)
////        {
////            if(current==root)
////            {
////                root = null;
////            }
////            if(isLeftChild ==true)
////            {
////                parent.left = null;
////            }
////            else
////            {
////                parent.right = null;
////            }
////        }
////        else if(current.right==null)
////        {
////            if(current==root)
////            {
////                root = current.left;
////            }
////            else if(isLeftChild)
////            {
////                parent.left = current.left;
////            }
////            else
////            {
////                parent.right = current.left;
////            }
////        }
////        else if(current.left==null)
////        {
////            if(current==root)
////            {
////                root = current.right;
////            }
////            else if(isLeftChild)
////            {
////                parent.left = current.right;
////            }
////            else
////            {
////                parent.right = current.right;
////            }
////        }
////        else if(current.left!=null && current.right!=null)
////        {
////            LinkedNode successor=getSuccessor(current);
////            if(current==root)
////            {
////                root = successor;
////            }
////            else if(isLeftChild)
////            {
////                parent.left = successor;
////            }
////            else
////            {
////                parent.right = successor;
////            }
////            successor.left = current.left;
////        }
////        return true;
////    }
////    public boolean find(int key)
////    {
////        LinkedNode current = root;
////        while(current!=null)
////        {
////            if(current.data==key)
////            {
////                return true;
////            }
////            else if(current.data>key)
////            {
////                current = current.left;
////            }
////            else
////            {
////                current = current.right;
////            }
////        }
////        return false;
////    }
////    public LinkedNode getSuccessor(LinkedNode deleleNode)
////    {
////        LinkedNode successsor =null;
////        LinkedNode successsorParent =null;
////        LinkedNode current = deleleNode.right;
////        while(current!=null)
////        {
////            successsorParent = successsor;
////            successsor = current;
////            current = current.left;
////        }
////        if(successsor!=deleleNode.right)
////        {
////            successsorParent.left = successsor.right;
////            successsor.right = deleleNode.right;
////        }
////        return successsor;
////    }
////    public void InorderTraversal(LinkedNode root,int space)
////    {
////        if(root!=null)
////        {
////            space += COUNT;
////            InorderTraversal(root.left,space);
////            System.out.println();
////            for(int i=COUNT;i<space;i++)
////                System.out.print(" ");
////            System.out.print(" " + root.data);
////            InorderTraversal(root.right,space);
////        }
////    }
////    public void PreorderTraversal(LinkedNode root,int space)
////    {
////        space += COUNT;
////        if(root!=null)
////        {
////            for(int i=COUNT;i<space;i++)
////                System.out.print(" ");
////            System.out.print(" " + root.data);
////            PreorderTraversal(root.left,space);
////            PreorderTraversal(root.right,space);
////        }
////    }
////    public void PostOrderTraversal(LinkedNode root,int space)
////    {
////        if(root!=null)
////        {
////            PostOrderTraversal(root.left,space);
////            PostOrderTraversal(root.right,space);
////            System.out.print(" " + root.data);
////        }
////    }
////    public int getMinimum(LinkedNode root)
////    {
////        if (root == null)
////            return Integer.MAX_VALUE;
////        int smallest = root.data;
////        int lres = getMinimum(root.left);
////        int rres = getMinimum(root.right);
////        if (lres < smallest)
////            smallest = lres;
////        if (rres < smallest)
////            smallest = rres;
////        return smallest;
////    }
////    public int getMaxNode(LinkedNode root)
////    {
////        if (root == null)
////            return Integer.MIN_VALUE;
////        int largest = root.data;
////        int lres = getMaxNode(root.left);
////        int rres = getMaxNode(root.right);
////        if (lres > largest)
////            largest = lres;
////        if (rres > largest)
////            largest = rres;
////        return largest;
////    }
////    public static void main(String[] args)
////    {
////        Binary_Tree obj = new Binary_Tree();
////        Scanner sc=new Scanner(System.in);
////        Random rand=new Random();
////        int size=10,data,option,choice;
////        System.out.println("\n-------------------------------------");
////        System.out.println("*** Implementation of Binary Search Tree ****");
////        System.out.println("\n--------------------------------------");
////        System.out.println("\nGenerating Random Numbers...............");
////        for(int i=0;i<size;i++)
////        {
////            data=rand.nextInt(50);
////            obj.insert(String.valueOf(data));
////        }
////        System.out.println("The Data Elements are:");
////        obj.InorderTraversal(root,4);
////        System.out.println("\n---------------------------------------");
////        while(true)
////        {
////            System.out.println("\n*** MENU ****");
////            System.out.println("1.Insert data in the Tree");
////            System.out.println("2.Delete an Item from the Tree");
////            System.out.println("3.Search an Item from the Tree");
////            System.out.println("4.Display Data Elements");
////            System.out.println("5.Get Minimum Node");
////            System.out.println("6.Get Maximum Node");
////            System.out.println("7.Exit");
////            System.out.println("Please Select any Option:");
////            option=sc.nextInt();
////            switch(option)
////            {
////                case 1:
////                    System.out.println("Please Enter Data to insert: ");
////                    data=sc.nextInt();
////                    obj.insert(data);
////                    break;
////                case 2:
////                    System.out.println("Please Enter Data to delete: ");
////                    data=sc.nextInt();
////                    obj.delete(data);
////                    break;
////                case 3:
////                    System.out.println("Please Enter Data to Search: ");
////                    data=sc.nextInt();
////                    boolean result=obj.find(data);
////                    if(result==true)
////                        System.out.println("Key found");
////                    else
////                        System.out.println("Key is not Found");
////                    break;
////                case 4:
////                    System.out.println("1.inorder Traversal");
////                    System.out.println("2.preorder Traversal");
////                    System.out.println("3.postorder Traversal");
////                    System.out.println("Please Select any technique");
////                    choice=sc.nextInt();
////                    switch(choice)
////                    {
////                        case 1:
////                            obj.InorderTraversal(root,4);
////                            break;
////                        case 2:
////                            obj.PreorderTraversal(root,4);
////                            break;
////                        case 3:
////                            obj.PostOrderTraversal(root,4);
////                            break;
////                    }
////                    break;
////                case 5:
////                    System.out.println("\nThe Smallest Number in the Tree is:"+obj.getMinimum(root));
////                    break;
////                case 6:
////                    System.out.println("\nThe Largest Number in the Tree is:"+obj.getMaxNode(root));
////                    break;
////                case 7:
////                    System.out.println("\nTerminated!");
////                    System.exit(0);
////                default:
////                    System.out.println("!invalid Option");
////            }
////        }
////    }
////}
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////
//////class BinarySearchTree {
//////    void numberNodes() {
//////    }
//////
//////    void numberLeafNodes() {
//////    }
//////
//////    int height(LinkedNode node) {
//////        if (node == null)
//////            return 0;
//////        return 0;
//////    }
//////}
//////
//////class LinkedNode
//////{
//////    private int data;
//////    private static LinkedNode left;
//////    private static LinkedNode right;
//////
//////    LinkedNode(int i) {
//////    }
//////
//////    boolean search(int value) {
//////        if (value == this.data)
//////            return true;
//////        else if (value < this.data) {
//////            if (left == null)
//////                return false;
//////            else
//////                return left.search(value);
//////        } else {
//////            if (right == null)
//////                return false;
//////            else
//////                return right.search(value);
//////        }
//////    }
//////
//////    void setLeftChild() {
//////    }
//////
//////    LinkedNode getLeft() {
//////        return null;
//////    }
//////
//////    int getValue() {
//////        return 0;
//////    }
//////
//////    boolean remove() {
//////        return false;
//////    }
//////    public boolean insert(E newElement) {
//////        // newElement will be added and this will still be a
//////        // BinarySearchTree. This tree will not insert newElement
//////        // if it will compareTo an existing element equally.
//////        if (root == null)
//////            root = new TreeNode(newElement);
//////        else {
//////            // find the proper leaf to attach to
//////            TreeNode curr = root;
//////            TreeNode prev = root;
//////            while (curr != null) {
//////                prev = curr;
//////                if (newElement.compareTo(curr.data) < 0)
//////                    curr = curr.left;
//////                else if (newElement.compareTo(curr.data) > 0)
//////                    curr = curr.right;
//////                else {
//////                    System.out.println(newElement + " in this BST");
//////                    return false;
//////                }
//////            }
//////
//////            // Correct leaf has now been found. Determine whether to
//////            // link the new node came from prev.left or prev.right
//////            if (newElement.compareTo(prev.data) < 0)
//////                prev.left = new TreeNode(newElement);
//////            else
//////                prev.right = new TreeNode(newElement);
//////        }
//////        return true;
//////    } // end insert
//////
//////    LinkedNode newNode = new LinkedNode(data);
//////        if(root==null)
//////        {
//////            root = newNode;
//////            return false;
//////        }
//////        LinkedNode current = root;
//////        while(true)
//////        {
//////            if(data == Integer.parseInt(String.valueOf(current.data)))
//////            {
//////                current = LinkedNode.left;
//////                if(current==null)
//////                {
//////                    LinkedNode.left = newNode;
//////                    return false;
//////                }
//////            }
//////            else
//////            {
//////                current = LinkedNode.right;
//////                if(current==null)
//////                {
//////                    LinkedNode.right = newNode;
//////                    return false;
//////                }
//////            }
//////        }
//////    }
//////    boolean delete(int key) {
//////        LinkedNode current = root;
//////        boolean isLeftChild = false;
//////        while(current.data!=key)
//////        {
//////            if(current.data>key)
//////            {
//////                isLeftChild = true;
//////                current = LinkedNode.left;
//////            }
//////            else
//////            {
//////                isLeftChild = false;
//////                current = LinkedNode.right;
//////            }
//////            if(current ==null)
//////            {
//////                return false;
//////            }
//////        }
//////        if(LinkedNode.left ==null && LinkedNode.right==null)
//////        {
//////            root = null;
//////        }
//////        else if(LinkedNode.right ==null)
//////        {
//////            if(current==root)
//////            {
//////                root = LinkedNode.left;
//////            }
//////        }
//////        else if(LinkedNode.left ==null)
//////        {
//////            if(current==root)
//////            {
//////                root = LinkedNode.right;
//////            }
//////        }
//////        else {
//////            LinkedNode successor=getSuccessor();
//////            if(current==root)
//////            {
//////                root = successor;
//////            }
//////            else if(isLeftChild)
//////            {
//////                LinkedNode.left = successor;
//////            }
//////            else
//////            {
//////                LinkedNode.right = successor;
//////            }
//////        }
//////        return true;
//////    }
//////
//////}
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
////////class LinkedNode
////////{
////////    int data;
////////    static LinkedNode left;
////////    static LinkedNode right;
////////
////////    LinkedNode(String data)
////////    {
////////        this.data = Integer.parseInt(data);
////////        left = null;
////////        right = null;
////////    }
////////
////////    public LinkedNode(int i) {
////////    }
////////
////////    boolean search(int value) {
////////        if (value == this.data)
////////            return true;
////////        else if (value < this.data) {
////////            if (left == null)
////////                return false;
////////            else
////////                return left.search(value);
////////        } else {
////////            if (right == null)
////////                return false;
////////            else
////////                return right.search(value);
////////        }
////////    }
////////
////////    void setLeftChild() {
////////    }
////////
////////    LinkedNode getLeft() {
////////        return null;
////////    }
////////
////////    int getValue() {
////////        return 0;
////////    }
////////
////////    boolean remove() {
////////        return false;
////////    }
////////}
//////////class BinarySearchTree<S> {
////////    private static LinkedNode root;
////////    private static int COUNT=10;
////////    BinarySearchTree()
////////    {
////////        root=null;
////////    }
////////
////////    boolean search(int value) {
////////        if (root == null)
////////            return false;
////////        else
////////            return root.search(value);
////////    }
////////
//////
//////
////////    boolean insert(int data)
////////    {
////////        LinkedNode newNode = new LinkedNode(data);
////////        if(root==null)
////////        {
////////            root = newNode;
////////            return false;
////////        }
////////        LinkedNode current = root;
////////        while(true)
////////        {
////////            if(data == Integer.parseInt(String.valueOf(current.data)))
////////            {
////////                current = LinkedNode.left;
////////                if(current==null)
////////                {
////////                    LinkedNode.left = newNode;
////////                    return false;
////////                }
////////            }
////////            else
////////            {
////////                current = LinkedNode.right;
////////                if(current==null)
////////                {
////////                    LinkedNode.right = newNode;
////////                    return false;
////////                }
////////            }
////////        }
////////    }
////////    boolean delete(int key) {
////////        LinkedNode current = root;
////////        boolean isLeftChild = false;
////////        while(current.data!=key)
////////        {
////////            if(current.data>key)
////////            {
////////                isLeftChild = true;
////////                current = LinkedNode.left;
////////            }
////////            else
////////            {
////////                isLeftChild = false;
////////                current = LinkedNode.right;
////////            }
////////            if(current ==null)
////////            {
////////                return false;
////////            }
////////        }
////////        if(LinkedNode.left ==null && LinkedNode.right==null)
////////        {
////////            root = null;
////////        }
////////        else if(LinkedNode.right ==null)
////////        {
////////            if(current==root)
////////            {
////////                root = LinkedNode.left;
////////            }
////////        }
////////        else if(LinkedNode.left ==null)
////////        {
////////            if(current==root)
////////            {
////////                root = LinkedNode.right;
////////            }
////////        }
////////        else {
////////            LinkedNode successor=getSuccessor();
////////            if(current==root)
////////            {
////////                root = successor;
////////            }
////////            else if(isLeftChild)
////////            {
////////                LinkedNode.left = successor;
////////            }
////////            else
////////            {
////////                LinkedNode.right = successor;
////////            }
////////        }
////////        return true;
////////    }
//////
//////    void display(String s) {
//////    }
//////
//////    boolean find(int key)
//////    {
//////        LinkedNode current = root;
//////        while(current!=null)
//////        {
//////            if(current.data==key)
//////            {
//////                return true;
//////            }
//////            else if(current.data>key)
//////            {
//////                current = LinkedNode.left;
//////            }
//////            else
//////            {
//////                current = LinkedNode.right;
//////            }
//////        }
//////        return false;
//////    }
//////    private LinkedNode getSuccessor()
//////    {
//////        LinkedNode successsor =null;
//////        LinkedNode current = LinkedNode.right;
//////        while(current!=null)
//////        {
//////            successsor = current;
//////            current = LinkedNode.left;
//////        }
//////        return successsor;
//////    }
//////    private void InorderTraversal(LinkedNode root, int space)
//////    {
//////        if(root!=null)
//////        {
//////            space += COUNT;
//////            InorderTraversal(LinkedNode.left,space);
//////            System.out.println();
//////            for(int i=COUNT;i<space;i++)
//////                System.out.print(" ");
//////            System.out.print(" " + root.data);
//////            InorderTraversal(LinkedNode.right,space);
//////        }
//////    }
//////    private void PreorderTraversal(LinkedNode root, int space)
//////    {
//////        space += COUNT;
//////        if(root!=null)
//////        {
//////            for(int i=COUNT;i<space;i++)
//////                System.out.print(" ");
//////            System.out.print(" " + root.data);
//////            PreorderTraversal(LinkedNode.left,space);
//////            PreorderTraversal(LinkedNode.right,space);
//////        }
//////    }
//////    private void PostOrderTraversal(LinkedNode root)
//////    {
//////        if(root!=null)
//////        {
//////            PostOrderTraversal(LinkedNode.left);
//////            PostOrderTraversal(LinkedNode.right);
//////            System.out.print(" " + root.data);
//////        }
//////    }
//////    private int getMinimum(LinkedNode root)
//////    {
//////        if (root == null)
//////            return Integer.MAX_VALUE;
//////        int smallest = root.data;
//////        int lres = getMinimum(LinkedNode.left);
//////        int rres = getMinimum(LinkedNode.right);
//////        if (lres < smallest)
//////            smallest = lres;
//////        if (rres < smallest)
//////            smallest = rres;
//////        return smallest;
//////    }
//////    private int getMaxNode(LinkedNode root)
//////    {
//////        if (root == null)
//////            return Integer.MIN_VALUE;
//////        int largest = root.data;
//////        int lres = getMaxNode(LinkedNode.left);
//////        int rres = getMaxNode(LinkedNode.right);
//////        if (lres > largest)
//////            largest = lres;
//////        if (rres > largest)
//////            largest = rres;
//////        return largest;
//////    }
//////
//////    int height(LinkedNode node) {
//////        if (node == null)
//////            return 0;
//////        else {
//////            int heightLeft = height(LinkedNode.left);
//////            int heightRight = height(LinkedNode.right);
//////            if (heightLeft > heightRight)
//////                return 1 + heightLeft;
//////            else
//////                return 1 + heightRight;
//////        }
//////    }
//////
//////    boolean remove(int data) {
//////        if (root == null)
//////            return false;
//////        else {
//////            if (root.getValue() == Integer.parseInt(data)) {
//////                LinkedNode auxRoot = new LinkedNode(0);
//////                auxRoot.setLeftChild();
//////                boolean result = root.remove();
//////                root = auxRoot.getLeft();
//////                return result;
//////            } else {
//////                return root.remove();
//////            }
//////        }
//////    }
//////
//////    public void setData(int data) {
//////        this.data = data;
//////    }
//////}
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
//////
////////
////////
////////class BinarySearchTree  {
////////    static class Node {
////////        Node left; // left subtree
////////        Comparable data; // label we can use compareTo on
////////        Node right; // right subtree
////////
////////        public Node(Comparable d) { // Construct a leaf
////////            data = d;
////////        }
////////    }
////////
////////    private Node root;
////////
////////
////////    // Is item in the tree?
////////    public boolean contains(Comparable item) {
////////        return contains(root, item);
////////    }
////////
////////    private static boolean contains(Node t, Comparable item) {
////////        if (t == null) {
////////// Object not found in empty tree
////////            return false;
////////        } else {
////////            int cmp = t.data.compareTo(item);
////////            if (cmp == 0) {
////////                // found the item
////////                return true;
////////            } else if (cmp > 0) {
////////                // data is greater than item, search left tree
////////                return contains(t.left, item);
////////            } else {
////////                // data is less than item, search right tree
////////                return contains(t.right, item);
////////            }
////////        }
////////    }
////////
////////    // Add an item to the tree
////////    public void add(Comparable item) {
////////        root = add(root, item);
////////    }
////////
////////    private static Node add(Node t, Comparable item) {
////////        if (t == null) {
////////// The (sub)tree is empty, make a new leaf node return new Node(item);
////////        } else {
////////            int cmp = t.data.compareTo(item);
////////            if (cmp == 0) {
////////                // data is already in the tree, no change
////////                return t;
////////            } else if (cmp > 0) {
////////                // data is greater than item, add in left tree
////////                t.left = add(t.left, item);
////////                return t;
////////            } else {
////////                // data is less than item, add in right tree
////////                t.right = add(t.right, item);
////////            }
////////        }
////////        return t;
////////    }
////////
////////
////////    // Remove an item from the tree
////////    public void remove(Comparable item) {
////////        root = remove(root, item);
////////    }
////////    private static Node remove(Node t, Comparable item) {
////////        if (t == null) {
////////// Item not found; do nothing
////////    return null;
////////        } else {
////////            int cmp = t.data.compareTo(item);
////////            if (cmp == 0) {
////////                // found the item here, let’s delete this node
////////                return deletenode(t);
////////            } else if (cmp>0) {
////////                // data greater than item, remove from left tree
////////                t.left = remove(t.left, item);
////////                return t;
////////            } else {
////////                // data less than item, remove from right tree
////////                t.right = remove(t.right, item);
////////                return t;
////////            }
////////        }
////////    }
////////
////////
////////
////////
////////
////////// Delete this node from the tree.
//////// // Should only be called on non-null nodes
////////         private static Node deletenode(Node t) {
////////         if (t.left == null) {
////////             // Replace with right subtree
////////             t = t.right;
////////             } else if (t.right == null) {
////////             // Replace with left subtree
////////             t = t.left;
////////             } else {
////////             // Find least node in right subtree,
////////             Node least = findleftmost(t.right);
////////             // Copy its label here
////////             t.data = least.data;
////////             // Delete the least node in the right subtree.
////////             t.right = deleteleftmost(t.right);
////////             }
////////         return t;
////////         }
////////
////////
////////    boolean insert(String data){
////////        return ;
////////    }
////////
////////        // Find leftmost node.
////////    // Should only be called on non-null nodes
////////    private static Node findleftmost(Node t) {
////////    if (t.left != null) {
////////            return findleftmost(t.left);
////////        } else {
////////        return t;
////////    }
////////        }
////////    // Delete leftmost node.
////////    // Should only be called on non-null nodes
////////    private static Node deleteleftmost(Node t) {
////////        if (t.left != null) {
////////            t.left = deleteleftmost(t.left);
////////            return t;
////////        }
////////        else {
////////    // This is the leftmost node, replace it
////////    // with its right subtree.
////////        return t.right; }
////////    }
////////}
