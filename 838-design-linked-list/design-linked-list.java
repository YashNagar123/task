class MyLinkedList {

    public class Node { // making Structure of node

        int val;// for value
        Node next ;// for storing reference of next node

        Node(int val){
            this.val = val;
        }
    }

    int size = 0;

    Node head;

    public MyLinkedList() {
        
    }
    
    public int get(int index) {

        if(index < 0 || index >= size){
            return -1;
        }
        Node temp = head;

        int i =0;

        while(i < index){
            temp = temp.next;
            i++;
        }

        return temp.val;
    }
    
    public void addAtHead(int val) {

        Node n = new Node(val);

        // if(head == null){
        //     head = n; 
        //     n.next = null;
        // }else{
            n.next = head;
            head = n;
        // }

        size++;
        
    }
    
    public void addAtTail(int val) {

        Node n = new Node(val);

        Node temp = head;

       if(head == null){
        head = n;
       } else {

            while(temp.next != null){
                temp = temp.next;
            }
                temp.next = n;
       }

        size++;
        
    }
    
    public void addAtIndex(int index, int val) { 

        if(index < 0 || index > size) return;

        Node n = new Node(val);
        Node temp = head;

        if(index == 0){
            addAtHead(val);
            return;
        }

        if(index == size){
            addAtTail(val);
            return;
        }

        int i = 0;

        while(i < index - 1){
            temp = temp.next;
            i++;
        }
        
        n.next = temp.next;
        temp.next = n;

        size++;
        
    }
    
    public void deleteAtIndex(int index) {

        if(index < 0 || index >= size) return;

        if(index == 0){
            head = head.next;
            size--;
            return;
        }

        Node temp = head;

        int i =0;

        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */