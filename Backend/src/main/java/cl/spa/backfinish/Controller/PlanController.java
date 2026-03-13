/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.spa.backfinish.Controller;

import cl.spa.backfinish.model.Plan;
import cl.spa.backfinish.repositorio.PlanRepository;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planes")
@CrossOrigin("*")
public class PlanController {
    
    private final PlanRepository repository;

    public PlanController(PlanRepository Repository) {
        this.repository = Repository;
    }
    
    @GetMapping
    public List<Plan> getPlanes(){
        return repository.findAll();
    }
}
