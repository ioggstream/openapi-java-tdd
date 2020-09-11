package io.reflectoring.service;

import io.reflectoring.model.Item;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ItemsList {
    private ConcurrentHashMap<UUID, Item> itemHashMap;
    public Item findById(UUID uuid){
        return itemHashMap.get(uuid);
    }
}
