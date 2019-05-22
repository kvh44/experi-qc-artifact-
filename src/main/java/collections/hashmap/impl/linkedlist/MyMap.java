package collections.hashmap.impl.linkedlist;

public class MyMap<K, V> {
    private MyEntry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 1 << 4; // 16
    private static final int CURRENT_CAPACITY = INITIAL_CAPACITY;
    
    private int size = 0;

    public MyMap() {
        this(INITIAL_CAPACITY);
    }

    public MyMap(int capacity) {
        this.buckets = new MyEntry[capacity];
    }

    public void put(K key, V value) {
    	MyEntry<K, V> entry = new MyEntry<>(key, value, null);

        int bucket = getHash(key) % getBucketSize();

        MyEntry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            // compare the keys see if key already exists
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
                    return;
                }
                existing = existing.next;
            }

            if (existing.key.equals(key)) {
                existing.value = value;
            } else {
                existing.next = entry;
                size++;
            }
        }
    }
    
    public V get(K key) {
        MyEntry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

        while (bucket != null) {
            if (key == bucket.key) {
                return bucket.value;
            }
            bucket = bucket.next;
        }
        return null;
    }

	private int getBucketSize() {
		return CURRENT_CAPACITY;
	}

	private int getHash(K key) {
		return (int)((String) key).charAt(0); 
	} 
  
	public static void main(String[] args) {
	    MyMap<String, String> myMap = new MyMap<>();
	    myMap.put("USA", "Washington DC");
	    myMap.put("Nepal", "Kathmandu");
	    myMap.put("India", "New Delhi");
	    myMap.put("Australia", "Sydney");

	    System.out.println(myMap.get("USA"));
	    System.out.println(myMap.get("FFF"));
	}
    
}
