package com.portfolio.vs.Security.Repository;

import com.portfolio.vs.Security.Entity.Rol;
import com.portfolio.vs.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
