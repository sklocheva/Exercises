package main.hashes;

/**
 * @author Sophia Klocheva
 * on 09/11/2020
 */
public class BasicHashTable<X, Y>
{
    private HashEntry[] data;
    private int capacity;
    private int size;

    public BasicHashTable(int sizeTable)
    {
        this.capacity = sizeTable;
        this.data = new HashEntry[this.capacity];
        this.size = 0;
    }

    /**
     * Find the value from hashing the key.
     *
     * @param key
     * @return
     */
    public Y get(X key)
    {
        int hash = calculateHash(key);

        if (data[hash] == null)
        {
            return null;
        }
        else
        {
            return (Y) data[hash].getValue();
        }
    }

    /**
     * Calculate a new hash from the key and put it in the
     * specific hash spot.
     *
     * @param key
     * @param value
     */
    public void put(X key, Y value)
    {
        int hash = calculateHash(key);
        data[hash] = new HashEntry<X, Y>(key, value);
        size++;
    }

    /**
     * Deletes the hash entry and recalculates the hashes
     * that come after it.
     *
     * @param key
     * @return
     */
    public Y delete(X key)
    {
        //get the value from the key
        Y value = get(key);

        if (value != null)
        {
            //find the hash and remove it
            int hash = calculateHash(key);
            data[hash] = null;
            size--;
            //find if there are more hashes after the deleted oen
            int nextHash = (hash + 1) % this.capacity;

            //if there are more slots, recalculate them
            while (data[nextHash] != null)
            {
                HashEntry entry = data[nextHash];
                data[nextHash] = null;
                put((X) entry.getKey(), (Y) entry.getValue());
                //by adding "new" one it increased the size, so need to
                //decrease the size
                size--;
                //check again for more after deleted
                nextHash = (nextHash + 1) % this.capacity;
            }
        }
        return value;

    }

    public boolean hasKey(X key)
    {
        int hash = calculateHash(key);
        if (data[hash] != null)
        {
            return false;
        }
        else
        {
            if (data[hash].getKey() == key)
                return true;
            else
                return false;
        }
    }

    public boolean hasValue(Y value)
    {
        for (int i = 0; i < this.capacity; i++)
        {
            HashEntry entry = data[i];
            if (entry != null && entry.getValue().equals(value))
            {
                return true;
            }
        }
        return false;
    }


    public int size()
    {
        return this.size;
    }


    private int calculateHash(X key)
    {
        int hash = (key.hashCode() % this.capacity);
        // avoids collision
        while (data[hash] != null && !data[hash].getKey().equals(key))
        {
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }

    private class HashEntry<X, Y>
    {
        private X key;
        private Y value;

        public HashEntry(X key, Y value)
        {

            this.key = key;
            this.value = value;
        }

        public X getKey()
        {
            return key;
        }

        public void setKey(X key)
        {
            this.key = key;
        }

        public Y getValue()
        {
            return value;
        }

        public void setValue(Y value)
        {
            this.value = value;
        }
    }
}
