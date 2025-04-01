package com.example.loadbooking.controllers;

import com.example.loadbooking.models.Load;
import com.example.loadbooking.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/loads")
public class LoadController {

    private final LoadService loadService;

    @Autowired
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    // Get all loads
    @GetMapping
    public List<Load> getAllLoads() {
        return loadService.getAllLoads(); // This will return a list of Load objects as JSON
    }

    // Get a load by id
    @GetMapping("/{id}")
    public Optional<Load> getLoadById(@PathVariable Long id) {
        return loadService.getLoadById(id);
    }

    // Create a new load
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Load createLoad(@RequestBody Load load) {
        return loadService.saveLoad(load);
    }

    // Update an existing load
    @PutMapping("/{id}")
    public Load updateLoad(@PathVariable Long id, @RequestBody Load load) {
        Load updatedLoad = loadService.updateLoad(id, load);
    
    if (updatedLoad == null) {
        // If the load doesn't exist, you can return a 404 response
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Load not found");
    }
    
    return updatedLoad;  // Return the updated load as the response
}

    // Delete a load by id
    @DeleteMapping("/{id}")
    public void deleteLoad(@PathVariable Long id) {
        loadService.deleteLoad(id);
    }
}
