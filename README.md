# [HashMap](https://en.wikipedia.org/wiki/Hash_function)
### Map implementation using Hashing

![image](https://user-images.githubusercontent.com/24220136/232686505-f0e6881b-b182-43be-9ba2-f60a6d454945.png)

*[Hash Functions](https://en.wikipedia.org/wiki/Hash_function)*
------------------

A typical hash function first converts a search key to an integer value called a hash code, then compresses the hash code into an index to the hash table. Java’s root class Object has the hashCode method, which returns an integer hash code. By default, the method returns the memory address for the object. The general contract for the
hashCode method is as follows: 

1. You should override the hashCode method whenever the equals method is overridden to ensure that two equal objects return the same hash code.

2. During the execution of a program, invoking the hashCode method multiple times returns the same integer, provided that the object’s data are not changed.

3. Two unequal objects may have the same hash code, but you should implement the hashCode method to avoid too many such cases.

Demo:

![image](https://user-images.githubusercontent.com/24220136/232703343-4952da2e-245f-4239-8614-bbbb8377af35.png)

# [HashSet](https://en.wikipedia.org/wiki/Set_(abstract_data_type))
### Set implementation using Hashing

A hash set can be implemented using a hash map. A set is a data structure that stores distinct values. The Java Collections Framework defines the java.util.Set interface for modeling sets. Three concrete implementations are java.util.HashSet, java.util.LinkedHashSet, and java.util.TreeSet. 

java.util.HashSet is implemented using hashing, java.util.LinkedHashSet using LinkedList, and java.util.TreeSet using red-black trees. We can implement MyHashSet using the same approach as for implementing MyHashMap. The only difference is that key/value pairs are stored in the map, while elements are stored in the set. We design our custom Set interface to mirror java.util.Set and name the interface MySet and a concrete class MyHashSet, as shown in the following UML diagram:

![image](https://user-images.githubusercontent.com/24220136/232740200-d58fdd13-10c8-4cf7-8cd2-eaea46281e48.png)

The MyHashSet class implements the MySet interface using separate chaining. Implementing MyHashSet is very similar to implementing MyHashMap except for the following
differences:

1. The elements are stored in the hash table for MyHashSet, but the entries (key/value pairs) are stored in the hash table for MyHashMap.

2. MySet extends java.lang.Iterable and MyHashSet implements MySet and overrides iterator(). So the elements in MyHashSet are iterable.

Three constructors are provided to construct a set. You can construct a default set with the default capacity and load factor using the no-arg constructor (lines 26–28), a set with the specified capacity and a default load factor (lines 32–34), and a set with the specified capacity and load factor (lines 38–46).

The clear method removes all elements from the set (lines 49–52). It invokes removeElements(), which clears all table cells (line 190). Each table cell is a linked list
that stores the elements with the same hash code. The removeElements() method takes O(capacity) time.

The contains(element) method checks whether the specified element is in the set by examining whether the designated bucket contains the element (lines 55–65). This method
takes O(1) time.

The add(element) method adds a new element into the set. The method first checks if the element is already in the set (line 69). If so, the method returns false. The method then checks whether the size exceeds the load-factor threshold (line 72). If so, the program invokes rehash() (line 76) to increase the capacity and store elements into the new larger hash table.

The rehash() method first copies all elements in a list (line 197), doubles the capacity (line 198), creates a new hash table (line 199), and resets the size to 0 (line 200). The method then copies the elements into the new larger hash table (lines 202–204). The rehash method takes O(capacity) time. If no rehash is performed, the add method takes O(1) time to add a new element.

The remove(element) method removes the specified element in the set (lines 95–114). This method takes O(1) time.

The size() method simply returns the number of elements in the set (lines 122–124). This method takes O(1) time.

The iterator() method returns an instance of java.util.Iterator. The MyHashSetIterator class implements java.util.Iterator to create a forward iterator. When a MyHashSetIterator is constructed, it copies all the elements in the set to a list (line 141). The variable current points to the element in the list. Initially, current is 0
(line 135), which points to the first element in the list. MyHashSetIterator implements the methods hasNext(), next(), and remove() in java.util.Iterator. Invoking hasNext() returns true if current < list.size(). Invoking next() returns the current element and moves current to point to the next element (line 153). Invoking remove() removes the current element in the iterator from the set.

The hash() method invokes the supplementalHash to ensure that the hashing is evenly distributed to produce an index for the hash table (lines 166–174). This method takes O(1)
time.

JavaAPI demo run:

![image](https://user-images.githubusercontent.com/24220136/232741944-e9f4a27e-62ed-4d29-b73a-6b5a520f5e2c.png)


