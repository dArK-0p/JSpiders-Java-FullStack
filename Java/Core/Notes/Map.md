# Map

- To represent a group of objects as *`Key : Value`* pair.
- Both `Key` and `Value` are objects.
- Each `Key : Value` pair is known as an **Entry**.
- Duplicate Keys are not allowed, but Values can be duplicates.
- `Map` is an independent interface, therefore methods from `Collection` cannot be applicable here.

## Methods of `<Map>`.

- `Object put(Object key, Object value);` - **Inserts** value inside the map.
- `void putAll(Map);` - **Inserts** *Entries* from an argument Map object to current Map. 
- `Object get(Object key);` - **Returns** *Value* for the corresponding key provided.
- `Object remove(Object key);` - **Removes** the *entry* of the given key.
- `boolean containsKey(Object key);` - **Checks** if `key` is already present in current `Map`.
- `boolean constaisValue(Object value);` - **Checks** if `value` is already present in current `Map`.
- `boolean isEmpty();` - **Checks** whether the `Map` is empty.
- `int size();` - **Returns** the no. of `keys` in the current `Map`.
- `void clear();` - **Clears** all *entries* from current `Map`.

## HashMap

- `Implements` `<Map>`.
- **Insertion Order** is *not* preserved, order depends upon `hashCode()` of the `Key`.
- *Heterogeneous* objects are allowed for bot h`Key` and `Value`.
- *Suitable* for **Searching** operation.
- Introduced in **Java v1.2**.

### Constructors.

- `HashMap();`
- `HasMap(int);`
- `HashMap(Map m);`

```java
import java.util.*;
public class HASHMAP {
    public static void main(String[] args) {
        HashMap h1 = new HashMap();
        h1.put('a', "abc");
        h1.put('e', "def");
        h1.put('c', "ghi");
        h1.put('b', "jkl");
        h1.put('d', "mno");
        System.out.println(h1);
        
        h1.put('e', "qrt");
        System.out.println(h1);
		
        HashMap h2 = new HashMap();
        h2.putAll(h1);
        System.out.println(h2);
        
        System.out.println(h1.get('e'));
        h1.remove('e');
        System.out.println(h1);

        System.out.println(h1.containsKey('a'));
        System.out.println(h1.containsValue("abc"));
        
        System.out.println(h1.isEmpty());
        System.out.println(h1.size());
        h1.clear();
        System.out.println(h1);
    }
}
```

## LinkedHashMap.

- Introduced in **Java v1.4**.
- **Insertion order** is *preserved*.

```java
import java.util.*;
public class LINKEDHASHMAP {
    public static void main(String[] args) {
        LinkedHashMap h1 = new LinkedHashMap();
        h1.put('a', "abc");
        h1.put('e', "def");
        h1.put('c', "ghi");
        h1.put('b', "jkl");
        h1.put('d', "mno");
        System.out.println(h1);
        
        h1.put('e', "qrt");
        System.out.println(h1);
		
        LinkedHashMap h2 = new LinkedHashMap();
        h2.putAll(h1);
        System.out.println(h2);
        
        System.out.println(h1.get('e'));
        h1.remove('e');
        System.out.println(h1);

        System.out.println(h1.containsKey('a'));
        System.out.println(h1.containsValue("abc"));
        
        System.out.println(h1.isEmpty());
        System.out.println(h1.size());
        h1.clear();
        System.out.println(h1);
    }
}
```

## IdentityHashMap.

- Here, JVM uses `==` to identify the duplicate `Keys`, unlike `HashMap` which uses `.equals()`.

```java
import java.util.*;
public class IDENTITYHASHMAP {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        IdentityHashMap = ihm = new IdentityHashMap();
        Integer i = new Integer(10), j = new Integer(10);
        
        System.out.println(i + " " + j);
        
        hm.put(i, "aaa"); hm.put(j, "bbb");
        ihm.put(i, "aaa"); ihm.put(j, "bbb");
        
        System.out.println(hm + "\n" + ihm);
    }
}
```

## WeakHashMap.

- In the case of `WeakHashMap`, if an object does not have any reference, then it is eligible to be cleared by the *garbage collector*.
  - GC is able to dominate the `WeakHashMap`.

```java
import java.util.*;
public class WEAKHASHMAP {
    public void finalize() {System.out.println();}
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        WeakHashMap = whm = new WeakHashMap();
        Integer i = new Integer(10);
        
        hm.put(i, "aaa"); whm.put(i, "aaa");
        System.out.println(hm + "\n" + whm);
        i = null;
        System.gc();
        Thread.sleep(3000);
        System.out.println(hm + "\n" + whm);
    }
}
```

