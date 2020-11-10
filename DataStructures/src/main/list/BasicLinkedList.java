package main.list;

/**
 * @author Sophia Klocheva
 * on 10/11/2020
 */
public class BasicLinkedList<X>
{
    private Node first;
    private Node last;
    private int nodeCount;

    public BasicLinkedList()
    {
        this.first = null;
        this.last = null;
        this.nodeCount = 0;
    }

    public void add(X item)
    {
        Node newNode = new Node(item);
        if (this.first == null || this.last == null)
        {
            this.first = newNode;
        }
        else
        {
            this.last.nextNode = newNode;
        }
        this.last = newNode;
        nodeCount++;
    }

    public void insert(X item, int position)
    {
        if (this.nodeCount >= position && position >= 0)
        {
            if ((position + 1) == this.nodeCount
                    || this.nodeCount == 0)
            {
                add(item);
            }
            else
            {
                Node newNode = new Node(item);
                Node prevNode = this.first;
                int curPos = 0;
                while (curPos != (position - 1))
                {
                    prevNode = prevNode.getNextNode();
                }
                Node nextNode = prevNode.getNextNode();
                prevNode.nextNode = newNode;
                newNode.nextNode = nextNode;
                nodeCount++;
            }
        }
    }

    public X removeAt(int position)
    {
        if (nodeCount > 0 && position < nodeCount)
        {
            Node curNode = this.first;
            int curPos = 0;
            while (curPos != (position - 1))
            {
                curNode = curNode.getNextNode();
            }
            Node toRemove = curNode.nextNode;
            curNode.nextNode = toRemove.nextNode;
            nodeCount--;
            return toRemove.getNodeItem();
        }
        return null;
    }

    public X get(int position)
    {
        if (this.first != null)
        {
            int curPos = 0;
            Node curNode = this.first;
            while (curPos != position)
            {
                curNode = curNode.getNextNode();
            }
            return curNode.getNodeItem();
        }
        return null;
    }

    public X remove()
    {
        if (this.first != null)
        {
            X item = this.first.getNodeItem();
            this.first = this.first.nextNode;
            nodeCount--;
            return item;
        }
        return null;
    }

    public int find(X item)
    {
        if (this.first != null)
        {
            Node curNode = this.first;
            for (int i = 0; i < nodeCount; i++)
            {
                if (curNode.getNodeItem().equals(item))
                {
                    return i;
                }
                curNode = curNode.getNextNode();
            }
        }
        return -1;
    }

    public int size()
    {
        return this.nodeCount;
    }

    private class Node
    {
        private Node nextNode;
        private X nodeItem;

        public Node(X item)
        {
            this.nextNode = null;
            this.nodeItem = item;
        }

        public Node getNextNode()
        {
            return nextNode;
        }

        public X getNodeItem()
        {
            return nodeItem;
        }

        public void setNodeItem(X nodeItem)
        {
            this.nodeItem = nodeItem;
        }
    }
}
