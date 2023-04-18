package com.kbstar.frame;

import java.util.List;

public interface ProductDAO<K, V> {
    public void insert(V v);
    public void delete(K k);
    public void update(V v);
    public V select(K k);
    public List<V> select();
}
