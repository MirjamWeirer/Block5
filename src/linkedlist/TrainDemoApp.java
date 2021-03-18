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

        linkedList.printAllNodes();
    }
}
