package src.bank;

class LinkedList {
    Node head;

    // Add element at the end
    public void add(User user) {
        Node newNode = new Node(user);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Print the user name
    public void printUserName() {
        Node current = head;
        while (current != null) {
            System.out.print(current.user.getName() + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


}
