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




