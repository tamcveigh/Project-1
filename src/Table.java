/**
 * A Linked List based table that can perform a few set operations
 * 
 * @author Tyler M. and P.
 *
 * @param <T> The datatype of the data stored in the table
 */
//TODO Finish Table Class JavaDoc
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
	 * This method returns a new table containing copies of the nodes
	 * that are in this table, but NOT in the other table provided
	 * 
	 * @param otherTable The other table to be compared against
	 * @return A new table containing the unique nodes in this table
	 */
	public Table<T> difference(Table<T> otherTable){
		
		Table<T> newTable = new Table<T>();
		boolean found = false;
		
		for(Node thisCurrent = this.head; thisCurrent != null; thisCurrent = thisCurrent.next) {
			
			found = false;
			
			for(Node otherCurrent = otherTable.head; otherCurrent != null && !(found); otherCurrent = otherCurrent.next) {
				
				if(thisCurrent.data.equals(otherCurrent.data)) {
					found = true;
				}
				
			}
			if(found == false) {
				//TODO Write code that doesn't throw this warning
				T copy = (T) thisCurrent.data.makeCopy();
				
				if (newTable.head != null) {
					newTable.tail.next = new Node(copy, null);
					newTable.tail = newTable.tail.next;
				}else {
					newTable.head = newTable.tail = new Node(copy, null);
				}
				
			}
		}
		
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
	
	/**
	 * 
	 * @param attribute
	 * @param value
	 * @param table
	 * @return
	 */
	public Table<T> intersect(String attribute, String value, Table<T> table){
		
		Table<T> newTable = new Table<T>();
		
		for(Node thisCurrent = this.head; thisCurrent != null; thisCurrent = thisCurrent.next) {
			
			if( thisCurrent.data.check(attribute, value) ) {
				//TODO Write code that doesn't throw this warning
				T copy = (T) thisCurrent.data.makeCopy();
				
				if (newTable.head != null) {
					newTable.tail.next = new Node(copy, null);
					newTable.tail = newTable.tail.next;
				}else {
					newTable.head = newTable.tail = new Node(copy, null);
				}
			}
			
		}
		
		for(Node otherCurrent = table.head; otherCurrent != null; otherCurrent = otherCurrent.next) {
			
			if( otherCurrent.data.check(attribute, value) ) {
				//TODO Write code that doesn't throw this warning
				T copy = (T) otherCurrent.data.makeCopy();
				
				if (newTable.head != null) {
					newTable.tail.next = new Node(copy, null);
					newTable.tail = newTable.tail.next;
				}else {
					newTable.head = newTable.tail = new Node(copy, null);
				}
			}
			
		}
		
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
				
				T copy = (T) currentData.makeCopy();
				
				if (newTable.head != null) {
					newTable.tail.next = new Node(copy, null);
					newTable.tail = newTable.tail.next;
				}else {
					newTable.head = newTable.tail = new Node(copy, null);
				}
				
			}
			
		}
		
		return newTable;
		
	}
	
	/**
	 * The method searches through this table and the other table given to find 
	 * the data that is in both.
	 * 
	 * @param otherTable The table to be compared against
	 * @return a new table containing only the data that is in both tables
	 */
	public Table<T> union(Table<T> otherTable){
		Table<T> newTable = new Table<T>();
		boolean found = false;
		
		for(Node thisCurrent = this.head; thisCurrent != null; thisCurrent = thisCurrent.next) {
			
			for(Node otherCurrent = otherTable.head; otherCurrent != null && !(found); otherCurrent = otherCurrent.next) {
				
				if(thisCurrent.data.equals(otherCurrent.data)) {
					
					found = true;
					
					//TODO Write code that doesn't throw this warning
					T copy = (T) thisCurrent.data.makeCopy();
					
					if (newTable.head != null) {
						newTable.tail.next = new Node(copy, null);
						newTable.tail = newTable.tail.next;
					}else {
						newTable.head = newTable.tail = new Node(copy, null);
					}
					
				}
				
			}
			
		}
		
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
