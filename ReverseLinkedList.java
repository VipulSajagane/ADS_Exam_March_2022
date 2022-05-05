  
   class ReverseLinkedList{
    
	Node head;
	
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
		
	}
	
	
	Node reverse(){
		if (head == null){
			return null;
		}
		
		Node current = head;
		Node previous = null;
		Node next = null;
		
		while(current !=null ){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
		
		
	}
	
	void print(){
		
		Node n = head;
		while(n!=null){
			System.out.print(n.data+" --> ");
			n = n.next;
		}
		System.out.println("null");
	}
	
	
	public void insertLast(int value){
		Node newNode = new Node(value);
		
		if(head == null){
			head = newNode;
			return;
		}
		
		Node current = head;
		while(null != current.next){
			current = current.next;
		
		}
		current.next = newNode;
	}
	
    public static void main(String [] args){
	
	ReverseLinkedList rll = new ReverseLinkedList();
	
	rll.insertLast(1);
	rll.insertLast(2);
	rll.insertLast(3);
	rll.insertLast(4);
	rll.insertLast(5);
	
	
	rll.print();
	
	rll.reverse();
	rll.print();
	
	}   
   
   
   
}