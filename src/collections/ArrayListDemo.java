package collections;
/*
Fast retrieval, allows duplicates, maintains insertion order.
 */
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList mylist= new ArrayList(); //Allow any type of data
        //ArrayList<Integer> mylist= new ArrayList<Integer>(); Allow only Integer(wraper class)
        //List mylist1= new ArrayList();
        mylist.add("hello");
        mylist.add(10);
        mylist.add(20.5);
        mylist.add('A');
        mylist.add(true);
        mylist.add(10);
        mylist.add(null);
        mylist.add(2,"hello");// insert "hello" at index 2
        System.out.println(mylist.size()); //size of the list
        System.out.println(mylist); //print the list
        System.out.println(mylist.get(0)); //get the first element
        mylist.remove(1); //remove the second element which is 10
        System.out.println(mylist); //print the list
        mylist.set(0, "hi"); //set the first element to "hi"
        System.out.println(mylist); //print the list

        //Read all the elements of the list using for loop
        for(int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }
        //Read all the elements of the list using for each loop
        for(Object i:mylist){
            System.out.println(i);
        }
        /*
        An Iterator in Java is an interface that provides methods to iterate over a collection.
         It allows you to traverse through the elements of a collection one by one.
         The Iterator interface is part of the java.util package.

         mylist.iterator() does not create a new object explicitly.
         Instead, it returns an existing iterator object provided by the Collection implementation (like ArrayList, HashSet, etc.).
        This object is already implemented inside ArrayList, LinkedList, etc.
        When we call .iterator(), we are just getting a reference to that iterator.
         */
        //Read all the elements of the list using iterator
        Iterator it=mylist.iterator();
        while(it.hasNext()){ //checks whether there are more elements left to iterate.
            System.out.println(it.next());//retrieves the next element and moves the iterator forward.
        }

        System.out.println(mylist.isEmpty());//check if the list is empty
       // mylist.clear(); //remove all elements from the list
        System.out.println(mylist.isEmpty());//check if the list is empty
        System.out.println(mylist.size()); //size of the list

        //to remove some elements from the list
        List myslist1= new ArrayList();// create a new list
        myslist1.add("hello");
        myslist1.add(10);
        myslist1.add(20.5);
        myslist1.add('A');
        mylist.removeAll(myslist1);
        System.out.println(mylist); //print the list







    }
}
