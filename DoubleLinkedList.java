public class DoubleLinkedList implements Comparable<nfs_DoubleLinkedList> {

    private static final String DEFAULT_NAME = "Whatever";

    private String name;
    private Node head;
    private Node tail;
    private int size; //SB: added size declaration

    /** Basic constructor */
    public DoubleLinkedList(String name) {
        this.name = name;
        this.head = null;
        this.tail = null;
        this.size = 0; //SB: size initialized to 0
    } // Basic constructor

    /** Default constructor passes default name to basic constructor */
    public DoubleLinkedList() {
        this(DEFAULT_NAME);
    } // default constructor

    // Always* write a toString method for your objects.
    // --------
    // * well, almost always ...
    public String toString() {
        return this.name;
    } // method toString

    /** Add a new node to the linked list */
    public void add(Node node) {
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            node.setPrev(this.tail); //SB: sets previous item in doublelinked list
            this.tail = node;
        }
        this.size++; //SB: this should increment the size
    } // method add

    //SB: Method to return size
    public int size() {
    return this.size;
    } //SB: Not sure about the placement here but it is inside the class. Also not sure if legal due to having more than one return statement in this method.

    // overload method add to add a node by value
    public void add(String value) {
        Node newNode = new Node(value);
        add(newNode); // SB: added code to call method
    } // method add

    // implement the comparable interface
    public int compareTo(nfs_DoubleLinkedList other) {
        return -1234567;
    } // method compareTo
} // class DoubleLinkedList
