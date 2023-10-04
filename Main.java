public class Main {
    public static void main(String[] args) {
        Bag<Integer> intBag = new Bag<>();

        // Testing add method
        intBag.add(5);
        intBag.add(15);
        intBag.add(10);
        intBag.add(20);

        System.out.println("Bag after adding elements: " + intBag.toString());

        // Testing contains method
        System.out.println("Bag contains 10: " + intBag.contains(10));
        System.out.println("Bag contains 20: " + intBag.contains(20));

        // Testing grab method
        System.out.println("Random item: " + intBag.grab());

        // Testing isEmpty method
        System.out.println("Is bag empty?: " + intBag.isEmpty());

        // Testing remove method
        intBag.remove(10);
        System.out.println("Bag after removing 10: " + intBag.toString());

        // Testing size method
        System.out.println("Size of bag: " + intBag.size());

        // Testing toArray method
        Object[] array = intBag.toArray();
        System.out.println("Array from bag:");
        for (Object obj : array) {
            System.out.println(obj);
        }

        // Testing clear method
        intBag.clear();
        System.out.println("Bag after clearing: " + intBag.toString());
    }
}
