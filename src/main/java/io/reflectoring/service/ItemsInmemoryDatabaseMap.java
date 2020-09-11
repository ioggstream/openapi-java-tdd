package io.reflectoring.service;

import io.reflectoring.model.Item;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ItemsInmemoryDatabaseMap {
    private final ConcurrentHashMap<UUID, Item> itemHashMap;

    public ItemsInmemoryDatabaseMap() {
        this.itemHashMap = new ConcurrentHashMap<>();
    }

    public Item findById(UUID uuid) {
        return itemHashMap.get(uuid);
    }

    public Item add(Item item) throws NullPointerException, UnsupportedOperationException, ClassCastException, IllegalArgumentException {
        return itemHashMap.put(item.getId(), item);
    }
}
