public class SLL_Driver {
    public static void main(String[] args) {
        SLL<String> myList = new SLL<String>();
        String[] cityNames = {"Jubail", "Riyadh", "Abha", "Dammam", "Taif"};
        for(int i = 0; i < cityNames.length; i++)
            myList.addToHead(cityNames[i]);

        System.out.println("The list is: " + myList);
        System.out.println("It is " + myList.contains("Dammam") + " that the list contains Dammam.");
        System.out.println("It is " + myList.contains("Jeddah") + " that the list contains Jeddah.");
        System.out.println(myList.toString()+"\n");

        /////////////////////////
        System.out.println("************************************************\n" );
        QueueAsArray<Integer> secondImplementation = new QueueAsArray<>(10);
        secondImplementation.enqueue(60);secondImplementation.enqueue(20);secondImplementation.enqueue(40);secondImplementation.enqueue(30);secondImplementation.enqueue(70);

        System.out.println("The secondImplementation is: " + secondImplementation);
        System.out.println("First dequeued element is: " +  secondImplementation.dequeue());
        System.out.println("Second dequeued element is: " +  secondImplementation.dequeue());
        System.out.println("After two node deletion the secondImplementation is: " + secondImplementation);
        System.out.println("Element at secondImplementation front is: " + secondImplementation.peek());
    }
}