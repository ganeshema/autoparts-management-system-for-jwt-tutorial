package com.ganeshgc.autopartsmanagementsystem.controller;

import com.ganeshgc.autopartsmanagementsystem.dto.PartsDto;
import com.ganeshgc.autopartsmanagementsystem.service.PartsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/parts")
public class PartsController {
    @Autowired
    private PartsService partsService;

    @PostMapping
    public ResponseEntity saveParts(@RequestBody PartsDto partsDto) {
        partsService.saveParts(partsDto);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity<List<PartsDto>> getParts() {
        partsService.getParts();
        return ResponseEntity.ok().body(partsService.getParts());
    }
    @DeleteMapping("/{partsId}")
    public ResponseEntity deleteParts(@PathVariable int partsId) {
        partsService.deleteParts(partsId);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping("/{partsId}")
    public ResponseEntity updateParts(@PathVariable int partsId, @RequestBody PartsDto partsDto) {
        partsService.updateParts(partsId,partsDto);
        return new ResponseEntity(HttpStatus.OK);
    }
    @GetMapping("/{partsId}")
    public ResponseEntity<PartsDto> getParts(@PathVariable int partsId) {
        partsService.getPartsById(partsId);
        return ResponseEntity.ok().body(partsService.getPartsById(partsId));
    }
}
