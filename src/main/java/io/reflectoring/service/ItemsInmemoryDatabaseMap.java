package io.reflectoring.service;

import io.reflectoring.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class ItemsInmemoryDatabaseMap {
    private final ConcurrentHashMap<UUID, Item> itemHashMap;

    public ItemsInmemoryDatabaseMap() {
        this.itemHashMap = new ConcurrentHashMap<>();
    }

    public List<Item> getItemsFromCursor(Integer limit, UUID cursor) {
        if (itemHashMap.size() == 0)
            return Collections.emptyList();
        TreeMap <UUID, Item> itemSortedTreeMap = new TreeMap<>(itemHashMap);
        UUID floorUuid = itemSortedTreeMap.floorKey(Optional.ofNullable(cursor).orElse(itemSortedTreeMap.firstKey()));
        Iterator it = itemSortedTreeMap.keySet().iterator();
        while (it.hasNext() && !((UUID)it.next()).equals(floorUuid)){
            itemSortedTreeMap.remove((UUID)it.next());
        }
        List<Item> retList = itemSortedTreeMap.values().stream().limit(limit).collect(Collectors.toList());
        return retList;
    }

    public Item findById(UUID uuid) {
        return itemHashMap.get(uuid);
    }

    public Item add(Item item) throws NullPointerException, UnsupportedOperationException, ClassCastException, IllegalArgumentException {
        return itemHashMap.put(item.getId(), item);
    }
}
