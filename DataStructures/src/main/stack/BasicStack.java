package main.stack;

/**
 * @author Sophia Klocheva
 * on 10/11/2020
 */
public class BasicStack<X>
{
    private X[] data;
    private int stackPointer;

    public BasicStack()
    {
        this.data = (X[]) new Object[1000];
        this.stackPointer = 0;
    }

    public void push(X newItem)
    {
        this.data[this.stackPointer++] = newItem;
    }

    public X pop()
    {
        if (stackPointer == 0)
        {
            return null;
        }
        return data[--stackPointer];
    }

    public boolean contains(X item)
    {
        boolean found = false;
        for (int i = 0; i < stackPointer; i++)
        {
            if (data[i].equals(item))
            {
                found = true;
                break;
            }
        }
        return found;
    }

    public X access(X item)
    {
        while (stackPointer > 0)
        {
            X tmpItem = pop();
            if (item.equals(tmpItem))
            {
                return tmpItem;
            }
        }
        return null;
    }

    public int size()
    {
        return stackPointer;
    }
}
