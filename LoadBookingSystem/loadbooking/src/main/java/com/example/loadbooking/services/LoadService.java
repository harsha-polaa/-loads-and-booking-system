package com.example.loadbooking.services;

import com.example.loadbooking.models.Load;
import com.example.loadbooking.repositories.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoadService {

    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    // Get all loads
    public List<Load> getAllLoads() {
        return loadRepository.findAll();
    }

    // Get load by id
    public Optional<Load> getLoadById(Long id) {
        return loadRepository.findById(id);
    }

    // Save new load
    public Load saveLoad(Load load) {
        return loadRepository.save(load);
    }

    // Delete load by id
    public void deleteLoad(Long id) {
        loadRepository.deleteById(id);
    }

    // Update load by id
    public Load updateLoad(Long id, Load load) {
        Optional<Load> existingLoadOpt = loadRepository.findById(id);
        
        if (existingLoadOpt.isPresent()) {
            Load existingLoad = existingLoadOpt.get();
            // Update the fields of the existing load
            existingLoad.setLoadType(load.getLoadType());
            existingLoad.setWeight(load.getWeight());
            existingLoad.setOrigin(load.getOrigin());
            existingLoad.setDestination(load.getDestination());
            
            // Save the updated load to the repository
            return loadRepository.save(existingLoad);
        } else {
            // If the load does not exist, you can either throw an exception or return a suitable response
            return null;  // Returning null or you could throw an exception here
        }
    }
    
}
