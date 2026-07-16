public class LinkedList {
    Node head; 

    public LinkedList() {
        this.head = null; 
    }

    public String traversal() {
        Node current_node = head;
        String result = "[";
        boolean first = true;
        while (current_node != null) {
            if (!first) {
                result += ", ";
            }
            result += current_node.data;
            first = false;
            current_node = current_node.next;
        }
        result += "]";
        return result;
    }

    public void insert(int position, Object value) {
        Node new_node = new Node(value);
        
        if (position == 0 || head == null) {
            new_node.next = head;
            head = new_node;
        } else {
            Node current_node = head;
            int current_position = 0;
            while (current_node.next != null && current_position < position - 1) {
                current_node = current_node.next;
                current_position++;
            }
            new_node.next = current_node.next;
            current_node.next = new_node;
        }
    }
 
    public void insert(Object value) {
        Node new_node = new Node(value);
        if (head == null) {
            head = new_node;
        } else {
            Node current_node = head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }
            current_node.next = new_node;
        }
    }
    public void remove(int position) {
        if (position == 0) {
        	Node current_node = head;
            head = current_node.next;
          } else {
                    Node current_node = head;
                    int current_position = 0;
                    
                    while (current_node.next != null && current_position < position - 1) {
                        current_node = current_node.next;
                        current_position++;
                    }
                        current_node.next = current_node.next.next;
                    }
                }
    public void removeLastElement() {
    	if (head == null);
    	if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    	}
    }
	
	public int lenght() {
		return 0;
	}
	
	public Object get(int position) {
		return null;
	}
	
	public void set(int position,Object value) {
		
	}
	
	public void clear() {
		head = null;
	}