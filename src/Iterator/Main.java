package Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] data = {1, 2, 3, 4, 5};

        ConcreteAggregate<Integer> aggregate = new ConcreteAggregate<>(data);

        //Iteração normal
        Iterator<Integer> iterator = aggregate.createIterator();
        System.out.println("Iteração Normal:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }

        System.out.println("\n\n------------------\n");

        //Iteração Reverse
        System.out.println("Iteração Reversa:");
        Iterator<Integer> reverseIterator = aggregate.createReverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next()+ " ");
        }
    }
}