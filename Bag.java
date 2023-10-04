import java.util.ArrayList;
import java.util.Random;

public class Bag<T> {
    private ArrayList<T> items;

    public Bag() {
        this.items = new ArrayList<T>();
    }

    // Adds an item to the bag
    public void add(T item) {
        items.add(item);
    }

    // Clears all contents of the bag
    public void clear() {
        items.clear();
    }

    // Checks if the item exists in the bag
    public boolean contains(T item) {
        return items.contains(item);
    }

    // Returns a random element from the bag
    public T grab() {
        if(isEmpty()) return null; // Or throw an exception
        Random rand = new Random();
        return items.get(rand.nextInt(items.size()));
    }

    // Checks if the bag is empty
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Removes one instance of the item
    public boolean remove(T item) {
        return items.remove(item);
    }

    // Returns the number of items in the bag
    public int size() {
        return items.size();
    }

    // Returns an array with all the items
    public Object[] toArray() {
        return items.toArray();
    }

    // Returns a string representation of the bag
    @Override
    public String toString() {
        return items.toString();
    }
}
