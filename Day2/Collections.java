package Day2;
import java.util.*;  

public class Collections {
    
    public static void main(String[] args) {

        ArrayList<String> arrList= new ArrayList<String>(); //List - arraylist
        arrList.add("Array List");

        LinkedList<String> linkList=new LinkedList<String>(); // List - LinkedList
        linkList.add("Linked List");

        Vector<String> v=new Vector<String>();  //List - Vector
        v.add("Vector"); 

        Stack<String> stack = new Stack<String>();  //List - Stack
        stack.push("stack");
        
        PriorityQueue<String> queue=new PriorityQueue<String>(); // Queue - Priority Queue
        queue.add("Queue"); 
        
        Deque<String> deque = new ArrayDeque<String>();  // Queue- Deque
        deque.add("Dequeue");  

        HashSet<String> hashSet=new HashSet<String>();  // Set - Hash Set
        hashSet.add("Hash Set");

        LinkedHashSet<String> linkHashSet=new LinkedHashSet<String>(); // Set - Linked Hash Set  
        linkHashSet.add("Linked Hash Set");
        
        TreeSet<String> treeSet=new TreeSet<String>();  // Set - Sorted Set - Tree Set
        treeSet.add("Tree Set");   
    }
}
