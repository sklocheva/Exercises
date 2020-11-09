package main.bintree;

/**
 * @author Sophia Klocheva
 * on 09/11/2020
 */
public class BasicBinaryTree<X extends Comparable<X>>
{
    private Node root;
    private int size;

    public BasicBinaryTree()
    {
        this.root = null;
    }

    public int size()
    {
        return size;
    }

    public void add(X item)
    {
        if (root == null)
        {
            this.root = new Node(item);
            this.size++;
        }
        else
        {
            insertNode(item);
        }
    }

    public boolean contains(X item)
    {
        return findNode(root, item) != null;
    }

    public boolean delete(X item)
    {
        boolean deleted = false;

        if (this.root == null)
        {
            return false;
        }

        Node curNode = findNode(root, item);

        if (curNode != null)
        {
            //if it doesn't have any children
            if (curNode.getLeft() == null && curNode.getRight() == null)
            {
                unlinkNode(curNode, null);
                deleted = true;
            }
            else if (curNode.getLeft() == null && curNode.getRight() != null)
            {
                unlinkNode(curNode, curNode.getRight());
                deleted = true;
            }
            else if (curNode.getLeft() != null && curNode.getRight() == null)
            {
                unlinkNode(curNode, curNode.getLeft());
                deleted = true;
            }
            else
            {
                Node child = curNode.getLeft();
                //swap with the right most leaf from the left side
                while (child.getRight() != null && child.getLeft() != null)
                {
                    child = child.getRight();
                }

                child.getParent().setRight(null);

                child.setLeft(curNode.getLeft());
                child.setRight(curNode.getRight());

                unlinkNode(curNode, child);
                deleted = true;
            }
        }
        return deleted;
    }

    private void unlinkNode(Node curNode, Node newNode)
    {

        if (curNode == this.root)
        {
            newNode.setLeft(curNode.getLeft());
            newNode.setRight(curNode.getRight());
        }
        else if (curNode.getParent().getRight() == curNode)
        {
            curNode.getParent().setRight(newNode);
        }
        else
        {
            curNode.getParent().setLeft(newNode);
        }
    }

    private Node findNode(Node parent, X item)
    {
        if (parent == null)
        {
            return null;
        }

        int diff = parent.getItem().compareTo(item);
        if (diff < 0)
        {
            findNode(parent.getLeft(), item);
        }
        else if (diff > 0)
        {
            findNode(parent.getRight(), item);
        }

        //equal
        return parent;
    }

    //or recursive
    private void insertNode(X item)
    {
        Node newNode = new Node(item);
        Node curNode = root;
        while (curNode != null)
        {
            int diff = curNode.getItem().compareTo(item);
            if (diff < 0)
            {
                if (curNode.left != null)
                {
                    //go left
                    curNode = curNode.left;
                }
                else
                {
                    newNode.setParent(curNode);
                    curNode.left = newNode;
                    size++;
                    break;
                }
            }
            else if (diff > 0)
            {
                if (curNode.right != null)
                {
                    //go right
                    curNode = curNode.right;
                }
                else
                {
                    newNode.setParent(curNode);
                    curNode.right = newNode;
                    size++;
                    break;
                }
            }
            //if they are equal then no need to add
        }
    }

    private class Node
    {
        private Node left;
        private Node right;
        private Node parent;
        private X item;

        public Node(X item)
        {
            this.item = item;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node getLeft()
        {
            return left;
        }

        public void setLeft(Node left)
        {
            this.left = left;
        }

        public Node getRight()
        {
            return right;
        }

        public void setRight(Node right)
        {
            this.right = right;
        }

        public Node getParent()
        {
            return parent;
        }

        public void setParent(Node parent)
        {
            this.parent = parent;
        }

        public X getItem()
        {
            return item;
        }

        public void setItem(X item)
        {
            this.item = item;
        }
    }

}
