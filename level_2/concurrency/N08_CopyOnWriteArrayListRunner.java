package com.leveltwo.concurrency;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 * ConcurrentHashMap
In HashTable, all methods are synchronized.

In ConcurrentHashMap, data structure is organized into disjoint regions.
Access methods use different Locks for different regions, reducing performance impact
during concurrent access.

Concurrent Collections : Copy-On-Write Optimization
All values in Copy-On-Write collections are stored in an internal immutable
(not-changeable) array. A new array is created if there is any modification to the collection.

Read operations are not synchronized. Only write operations are synchronized.

Copy on Write approach is used in scenarios where reads greatly out number write’s on a collection.

CopyOnWriteArrayList & CopyOnWriteArraySet are implementations of this approach.

Copy on Write collections are typically used in Subject – Observer scenarios, where the
observers very rarely change. Most frequent operations would be iterating around the observers and
notifying them.
 */

public class N08_CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		// Total of 3 threads doing add()'s, maybe in a separate method
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// Total of 10000 threads looping on get(), again, in a separate method
		for (String element : list) {
			System.out.println(element);
		}
	}

}
