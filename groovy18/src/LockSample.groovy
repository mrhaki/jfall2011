import groovy.transform.WithReadLock
import groovy.transform.WithWriteLock

class Bucket {
   final def items = []

   @WithWriteLock
   void add(String item) {
       items << item
   }

   @WithReadLock
   List getAllItems() {
       items
   }
}


