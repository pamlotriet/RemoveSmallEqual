public class TestMyLinkedList 
{
	
  public static void main(String[] args) 
  {
	MyLinkedList<Integer> list = new MyLinkedList<Integer>();
   /*boolean done = false;
   MyLinkedList<Integer> list = new MyLinkedList<Integer>();
	// test empty list
	System.out.println("\nRemove from empty list");
	System.out.println(list);
	System.out.println(list.delete(new Integer(6)));
	System.out.println(list);
	
    // Add elements to the list
    list.append(new Integer(6));
    list.append(new Integer(5));
    list.append(new Integer(3));
    list.append(new Integer(4)); 
	list.append(new Integer(2));
    list.append(new Integer(5));
	list.append(new Integer(1));
	System.out.println("\nRemove first element");
	System.out.println(list);
	System.out.println(list.delete(new Integer(6)));
    System.out.println(list);
	
    System.out.println("\nRemove last element");
	System.out.println(list);
	System.out.println(list.delete(new Integer(1)));
    System.out.println(list);
	//implicit call to toString()

    System.out.println("\nRemove middle element");
	System.out.println(list);
	System.out.println(list.delete(new Integer(4)));
    System.out.println(list);
	
	
	System.out.println("\nRemove invalid element");
	System.out.println(list);
	System.out.println(list.delete(new Integer(16)));
    System.out.println(list);*/
	
	// Add elements to the list
    list.append(new Integer(6));
    list.append(new Integer(5));
    list.append(new Integer(3));
    list.append(new Integer(4)); 
	list.append(new Integer(2));
    list.append(new Integer(5));
	list.append(new Integer(1));
	 list.append(new Integer(11));
    list.append(new Integer(15));
    list.append(new Integer(20));
    list.append(new Integer(85)); 
	list.append(new Integer(44));
    list.append(new Integer(50));
	list.append(new Integer(18));
	
	System.out.println("\nList before extract:");
	System.out.println(list);
	System.out.println("\n");
	System.out.println(list.extract(new Integer(30)));
	
	
  }
}

