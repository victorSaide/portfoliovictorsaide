package com.portfolio.vs.Repository;

import com.portfolio.vs.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepositoryImplementation<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE (String nombreE);
    public boolean existsByNombreE(String nombreE);
}
