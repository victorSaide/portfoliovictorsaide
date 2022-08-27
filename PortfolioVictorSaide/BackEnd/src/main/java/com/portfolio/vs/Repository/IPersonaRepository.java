package com.portfolio.vs.Repository;

import com.portfolio.vs.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long>{
    
}
