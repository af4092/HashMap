# [HashMap](https://en.wikipedia.org/wiki/Hash_function)
Map implementation using Hashing

*[Hash Functions](https://en.wikipedia.org/wiki/Hash_function)*
------------------

A typical hash function first converts a search key to an integer value called a hash code, then compresses the hash code into an index to the hash table. Java’s root class Object has the hashCode method, which returns an integer hash code. By default, the method returns the memory address for the object. The general contract for the
hashCode method is as follows: 

1. You should override the hashCode method whenever the equals method is overridden to ensure that two equal objects return the same hash code.

2. During the execution of a program, invoking the hashCode method multiple times returns the same integer, provided that the object’s data are not changed.

3. Two unequal objects may have the same hash code, but you should implement the hashCode method to avoid too many such cases.
