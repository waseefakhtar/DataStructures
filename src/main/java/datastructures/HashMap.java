package datastructures;

public class HashMap<K, V> {
    private Entry<K, V>[] buckets;
    private static int INITIAL_CAPACITY = 1 << 4;
    private int size = 0;

    class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashMap() {
        this(INITIAL_CAPACITY);
    }

    public HashMap(int capacity) {
        this.buckets = new Entry[capacity];
    }

    public void put(K key, V value) {
        Entry<K, V> entry = new Entry<>(key, value, null);

        int bucket = getHash(key) % getBucketSize();

        Entry<K, V> existing = buckets[bucket];
        if (existing == null) {
            buckets[bucket] = entry;
            size++;
        } else {
            while (existing.next != null) {
                if (existing.key.equals(key)) {
                    existing.value = value;
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
        Entry<K, V> bucket = buckets[getHash(key) % getBucketSize()];

        while (bucket != null) {
            if (bucket.key.equals(key)) {
                System.out.println(bucket.value);
                return bucket.value;
            } else {
                bucket = bucket.next;
            }
        }
        return null;
    }

    private int getHash(K key) {
        return key == null ? 0 : Math.abs(key.hashCode());
    }

    private int getBucketSize() {
        return buckets.length;
    }
}
