## MyArrayList<T> Class

**MyArrayList** is a class that implements the MyList interface. It is a dynamic array that can hold any type of object.

## Constructors
**MyArrayList()** - Initializes an empty MyArrayList object with a default capacity of 10.
## Methods
**int size()** - 
Returns the number of elements in the MyArrayList.

**boolean contains(Object o)** - 
Returns true if the MyArrayList contains the specified element, otherwise returns false.

**boolean add(T item)** - Adds the specified element to the end of the MyArrayList. Returns true if the element was successfully added.

void add(T item, int index) - Inserts the specified element at the specified position in the MyArrayList. Throws an IndexOutOfBoundsException if the index is out of range.

**boolean remove(T item)** - Removes the first occurrence of the specified element from the MyArrayList, if it is present. Returns true if the element was successfully removed.

**T remove(int index)** - Removes the element at the specified position in the MyArrayList. Throws an IndexOutOfBoundsException if the index is out of range.

**void clear()** - Removes all elements from the MyArrayList.

**T get(int index)** - Returns the element at the specified position in the MyArrayList. Throws an IndexOutOfBoundsException if the index is out of range.

**int indexOf(Object o)** - Returns the index of the first occurrence of the specified element in the MyArrayList, or -1 if the element is not present.

**int lastIndexOf(Object o)** - Returns the index of the last occurrence of the specified element in the MyArrayList, or -1 if the element is not present.

**void sort()** - Sorts the elements of the MyArrayList in ascending order, according to their natural order. The elements must implement the Comparable interface.

## Type Parameters
T - the type of elements in this MyArrayList

## Exceptions
IndexOutOfBoundsException - if the index is out of range






## MyLinkedList Class
This is an implementation of a singly linked list called MyLinkedList. The class implements the MyList interface, which provides a
common interface for various types of lists.

## Methods
The MyLinkedList class implements the following methods from the MyList interface:

**size()** - returns the number of elements in the list

**contains(Object o)** - returns true if the list contains the specified element

**add(Object item)** - adds the specified element to the end of the list

**add(Object element, int index)** - inserts the specified element at the specified position in the list

**remove(int index)** - removes the element at the specified position in the list

**remove(Object o)** - removes the first occurrence of the specified element from the list

**clear()** - removes all elements from the list

**get(int index)** - returns the element at the specified position in the list

**indexOf(Object o)** - returns the index of the first occurrence of the specified element in the list

**lastIndexOf(Object o)** - returns the index of the last occurrence of the specified element in the list

**sort()** - sorts the elements in the list in ascending order

## Class Details
**Fields**

head - the first element in the list

tail - the last element in the list

size - the number of elements in the list


## Inner Class
The MyLinkedList class has an inner class called Node, which represents a single node in the linked list. Each Node object contains three fields:

**date** - the data stored in the node

**next** - a reference to the next node in the list

**prev** - a reference to the previous node in the list
