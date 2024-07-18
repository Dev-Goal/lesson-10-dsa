package practice.practice_6;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);

        System.out.println("Element 2: " + listInteger.get(2));
        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 6: " + listInteger.get(6));

        listInteger.add(10);
        System.out.println("Element 10: " + listInteger.get(10));

//        System.out.println("Element -1: " + listInteger.get(-1));
    }
}
