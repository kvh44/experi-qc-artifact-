package collections.hashmap.impl.linkedlist;

class MyEntry<K, V> {
    final K key;
    V value;
    MyEntry<K, V> next;

    public MyEntry(K key, V value, MyEntry<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    // getters, equals, hashCode and toString
}