package com.ketfarkukutya.GoodDeedServer.controller;

import com.ketfarkukutya.GoodDeedServer.model.Deed;
import com.ketfarkukutya.GoodDeedServer.model.FeatureCollection;
import com.ketfarkukutya.GoodDeedServer.repository.DeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeedController {
    @Autowired
    private DeedRepository deedRepository;

    @PostMapping("/deeds")
    public ResponseEntity<Deed> createDeed(@RequestBody Deed deed) {
        deed.setId(null);
        return ResponseEntity.ok(deedRepository.save(deed));
    }

    @GetMapping("/deeds")
    public FeatureCollection getAllDeeds() {
        return new FeatureCollection(deedRepository.findAll());
    }

    @GetMapping("/deeds/{id}")
    public ResponseEntity<Deed> getDeedById(@PathVariable String id) {
        return deedRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/deeds/{id}")
    public ResponseEntity<Deed> updateDeed(@PathVariable String id, @RequestBody Deed newDeed) {
        return deedRepository.findById(id)
                .map(deed -> {
                    deed.setGeometry(newDeed.getGeometry());
                    deed.setDescription(newDeed.getDescription());
                    return ResponseEntity.ok(deedRepository.save(deed));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/deeds/{id}")
    public ResponseEntity<Object> deleteDeed(@PathVariable String id) {
        deedRepository.deleteById(id);

        return ResponseEntity.noContent().build();
    }
}
