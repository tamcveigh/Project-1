/**
 * A Linked List based table that can perform a few set operations
 * 
 * @author Tyler M. and P.
 *
 * @param <T> The data type of the data stored in the table
 */
public class Table <T extends AttributeInterface>{
	
	/** */
	private Node head;
	/** */
	private Node tail;
	/** */
	private String title;
	
	/**
	 * Default Constructor for Table class, creates a null table
	 */
	public Table() {
		this.head = null;
		this.tail = null;
		this.title = "";
	}
	
	/**
	 * 
	 * @param head
	 */
	public Table(Node head) {
		this.head = head;
		this.tail = head;
		this.title = "";
	}
	
	/**
	 * 
	 * @param otherTable
	 * @return
	 */
	public Table<T> difference(Table<T> otherTable){
		
		Table<T> newTable = new Table<T>();
		
		//TODO Write difference
		
		return newTable;
		
	}
	
	/**
	 * Adds a new node into the table
	 * 
	 * @param data The data to be placed into the table
	 */
	public void insert(T data) {
		
		Node newNode = new Node(data, null);
		
		if(head != null) {
			this.tail.next = newNode;
		}else {
			this.head = newNode;
		}
		
		this.tail = newNode;
	}
	
	public Table<T> intersect(String attribute, String value, Table<T> table){
		
		Table<T> newTable = new Table<T>();
		
		//TODO Write intersect
		
		return newTable;
	}
	
	
	/**
	 * Removes all nodes with the matching ID
	 * 
	 * @param id The ID of the node(s) to be removed
	 */
	public void remove(String id) {
		
		Node current = head;
		Node previous = head;
		
		for (;current.next != null; current = current.next) {
			
			if (current.data.check("id", id)) {
				if(current == head) {
					head = current.next;
				}else {
					previous.next = current.next;
				}
			}
			previous = current;
		}
	}
	
	/**
	 * 
	 * @param attribute
	 * @param value
	 * @return
	 */
	public Table<T> select(String attribute, String value){
		
		Table<T> newTable = new Table<T>();
		
		for(Node current = head; current.next != null; current = current.next) {
			
			T currentData = current.getData();
			
			if(currentData.check(attribute, value)) {
				
				AttributeInterface copy = currentData.makeCopy();
				
				
				//TODO Write data copy for select
				
			}
			
		}
		
		return newTable;
		
	}
	
	/**
	 * 
	 * @param otherTable
	 * @return
	 */
	public Table<T> union(Table<T> otherTable){
		Table<T> newTable = new Table<T>();
		
		//TODO write union method
		
		return newTable;
	}
	
	/**
	 * 
	 * @author Tyler
	 *
	 */
	public class Node{
		
		/** The data stored in the node	*/
		private T data;
		/** The following node in the Linked List */
		private Node next;
		
		/**
		 * 
		 * @param data
		 * @param next
		 */
		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
		
		/**
		 * 
		 * @return
		 */
		public T getData() {
			return this.data;
		}
		
		/**
		 * 
		 * @return
		 */
		public Node getNext() {
			return this.next;
		}
		
		/**
		 * 
		 * @param data
		 */
		public void setData(T data){
			this.data = data;
		}
		
		/**
		 * 
		 * @param next
		 */
		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	
}
