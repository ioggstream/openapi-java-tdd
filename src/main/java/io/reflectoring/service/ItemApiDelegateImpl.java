package io.reflectoring.service;

import io.reflectoring.api.ItemApiDelegate;
import io.reflectoring.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ItemApiDelegateImpl implements ItemApiDelegate {
    @Autowired
    ItemsList itemsList;

    @Override
    public ResponseEntity<Item> apiGetItem(UUID uuid) {
        return ResponseEntity.ok(itemsList.findById(uuid));
    }
}
