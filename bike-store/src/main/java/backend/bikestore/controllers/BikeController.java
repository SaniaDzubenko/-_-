package backend.bikestore.controllers;

import backend.bikestore.models.Bike;
import backend.bikestore.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {
    private final BikeRepository bikeRepository;

    @Autowired
    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public List<Bike> getAllBikes(){
        return bikeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Bike getBikeById(@PathVariable Long id){
        return bikeRepository.findById(id).orElseThrow();
    }
}
