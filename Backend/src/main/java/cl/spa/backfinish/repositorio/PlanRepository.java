/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.spa.backfinish.repositorio;

import cl.spa.backfinish.model.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Duoc
 */
public interface PlanRepository extends JpaRepository<Plan, Long>{
    
}
