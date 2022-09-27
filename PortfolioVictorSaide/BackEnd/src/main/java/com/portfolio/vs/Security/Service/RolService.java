package com.portfolio.vs.Security.Service;

import com.portfolio.vs.Security.Entity.Rol;
import com.portfolio.vs.Security.Enums.RolNombre;
import com.portfolio.vs.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save (Rol rol){
        
    }
}
