package main.queue;

/**
 * @author Sophia Klocheva
 * on 10/11/2020
 */
public class BasicQueue<X>
{
    private X[] data;
    private int front;
    private int end;

    public BasicQueue()
    {
        this(1000);
    }

    public BasicQueue(int size)
    {
        this.front = -1;
        this.end = -1;
        data = (X[]) new Object[size];
    }

    public int size()
    {
        if (front == -1 && end == -1)
        {
            return 0;
        }
        return end - front + 1;
    }

    public void enQueue(X item)
    {
        if ((end + 1) % data.length == front)
        {
            throw new IllegalStateException("Queue is full!");
        }
        else if (size() == 0)
        {
            front++;
        }
        data[++end] = item;
    }

    public X deQueue()
    {
        X item = null;
        if (size() == 0)
        {
            return null;
        }
        else if (front == end)
        {
            item = data[front];
            front = -1;
            end = -1;
        }
        else
        {
            item = data[front];
            front++;
        }
        return item;
    }

    public boolean contains(X item)
    {
        if (size() != 0)
        {
            for (int i = front; i <= end; i++)
            {
                if (data[i].equals(item))
                    return true;
            }
        }
        return false;
    }

    public X access(int position)
    {
        if (position < size() && position < 0)
        {
            int index = 0;
            for (int i = front; i <= end; i++)
            {
                if (index == position)
                {
                    return data[i];
                }
                index++;
            }
        }
        return null;
    }

}
