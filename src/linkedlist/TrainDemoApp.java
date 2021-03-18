package linkedlist;

public class TrainDemoApp {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        // first / last == null

        linkedList.add(5);

        //etwas später
        linkedList.add(37);

        //etwas später
        linkedList.add(19);
        linkedList.add(58);
        linkedList.add(22);
        linkedList.add(35);
        linkedList.add(66);
        linkedList.add(77);

        linkedList.printAllNodes();

        System.out.println();
        System.out.println("linkedList.containsValue(19) = " + linkedList.containsValue(19));
        System.out.println("linkedList.containsValue(66) = " + linkedList.containsValue(66));
        System.out.println("linkedList.containsValue(7) = " + linkedList.containsValue(7));
        System.out.println("linkedList.containsValue(5) = " + linkedList.containsValue(5));

        System.out.println("linkedList.getAt(3) = " + linkedList.getAt(3).value);
        System.out.println("linkedList.getAt(5) = " + linkedList.getAt(5).value);
        System.out.println("linkedList.getAt(8) = " + linkedList.getAt(8).value);
        System.out.println("linkedList.getAt(10) = " + linkedList.getAt(10));

        linkedList.printAllNodes();
        System.out.println();
        linkedList.delteAt(3);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.delteAt(1);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.delteAt(6);
        linkedList.printAllNodes();
        System.out.println();
        linkedList.add(99);
        linkedList.printAllNodes();
    }
}
