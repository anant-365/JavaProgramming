
/*ArrayList in Java: Demo & Methods:

The ArrayList class is the dynamic array found in the java.util package.
The size of the normal array can not be changed, but ArrayList provides
us the ability to increase or decrease the size.
ArrayList is slower than the standard array, but it helps us to manipulate
the data easily.

Adding an element :
add() method is used to insert an element in the ArrayList.
add(Object): Inserts an element at the end of the ArrayList.
add(Index,Object) : Inserts an element at the given index.

Removing an Element :
remove() method is used to delete or remove an element at a given index from the ArrayList.

EXAMPLE OF REMOVING:
L1.remove(index number)

Checking if an ArrayList contains a specific value or not :
contains() method is used to check if an ArrayList contains a
specified element or not. This method returns the boolean value.

Merging two ArrayLists :
The elements of an ArrayList can be merged into another Arraylist
with the help of the addAll() method.

Finding the first occurrence of a specified number in the ArrayList :
Indexof() method prints the index of the first occurrence of a particular
number. Returns -1 if the element is not present in the ArrayList.

Similarly, you can also find the index of the last occurrence of an element
 with the help of the lastIndexOf() method.

*/

package com.company;
import java.util.*;
public class CWH_40_Collection_ArrayList {
        public static void main(String[] args) {
            LinkedList<Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            l2.add(15);
            l2.add(18);
            l2.add(19);
            l1.add(6);
            l1.add(7);
            l1.add(4);
            l1.add(6);
            l1.add(0, 5);
            l1.add(0, 1);
            l1.addAll(0, l2);
            l1.addLast(676);
            l1.addFirst(788);
            System.out.println(l1.contains(27));
            System.out.println(l1.indexOf(6));
            System.out.println(l1.lastIndexOf(6));
            //l1.clear();
            l1.set(1, 566);
            for(int i=0; i<l1.size(); i++){
                System.out.print(l1.get(i));
                System.out.print(", ");
            }

//--------EDITED ON 5/5/2024--------(BELOW)
         
       // BELOW IS IMPLEMENTATION FOR ITERATOR INTERFACE OF JAVA COLLECTION FRAMEWORKS.
       // IT IS USED IN OPERATIONS LIKE SEARCHING, TRAVERSING, ACCESSING ELEMENT OF COLLECTION.
      // IT CONTAINS METHOD LIKE -- hasNext(), Next(), Remove().
         
        ArrayList<String> arrList = new ArrayList(Arrays.asList("1","a","7","bird","snake"));
        System.out.println(arrList);
        arrList.remove((Object)7);
        System.out.println(arrList);  
        Iterator<String> iterator = arrList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
           }
        }
    }
