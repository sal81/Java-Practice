class LinkedList{
    Node head;

    //create a node
    class Node{
        int data;
        Node next;
    
    Node(int d){
        data=d;
        next = null;
        }
    }
//insert at beginning of LL
public void insertBeginning(int new_data){
    Node new_node = new Node(new_data);
    //pointer moved from head to new node.next and new node assigned head.
    new_node.next = head;
    head = new_node;
}
//inserting node with certain value after a given node
public void insertAfter(Node past_node, int new_data){
    Node new_node = new Node(new_data);
    //check if node after which insertion is to be done is null
    if(past_node==null){
        System.out.println("Cannot be null");
        return;
        }
    //connect past node to next node and node value of past node.next to data value of insertion
    new_node.next = past_node.next;
    past_node.next = new_node;
}
//insert node at end
public void insertEnd(int new_data){
    Node new_node = new Node(new_data);
    //empty list insert at first pos
    if(head==null){
        head = new Node(new_data);
        return;
    }
    new_node.next = null;
    //if reached last node enter key there
    Node last = head;
    while(last.next != null)
    last = last.next;
    last.next = new_node;
    return;
}
//delete by key
public void deleteKey(int key){
    Node temp = head, prev = null;
    //temp reaches key to delete
    if(temp != null && temp.data == key) {
        head = temp.next;
        return;
    }
    //keep a track of prev node until we reach desired node 
    while(temp != null && temp.data != key){
        prev = temp;
        temp = temp.next;
    }
    //for empty list
    if(temp == null){
        return;
    }
    prev.next = temp.next;
}

//delete by position
public void deletePos(int pos){
    if(head == null){
        return;
    }
    Node temp = head;
    //remove at pos 0
    if(pos ==0){
        head = temp.next;
        return;
    }
    //remove at pos n
    for(int i=0; temp != null && i<pos-1;i++){
            temp = temp.next; 
        }
    //remove at pos > len
    if(temp == null || temp.next == null){
        return;
    }
    Node next = temp.next.next;
    temp.next = next;
}
public void printList(){
    Node tnode = head;
    while(tnode != null)
    {
        System.out.println(tnode.data + " ");
        tnode = tnode.next;
    }   
}
public static void main(String[] args) {
    LinkedList nlist = new LinkedList();  
    nlist.insertBeginning(8);
    nlist.insertBeginning(6);
    nlist.insertBeginning(12);
    nlist.insertBeginning(4);
    nlist.insertAfter(nlist.head, 7);
    nlist.insertEnd(56);
    nlist.insertEnd(9);
    nlist.deletePos(2);
    nlist.deleteKey(4);
    System.out.println("\nNew List : ");
    nlist. printList();
}
}