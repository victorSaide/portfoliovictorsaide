package com.portfolio.vs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
// con esta línea anterior evito escribir los getters & setters

@Entity
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size (min = 1, max = 50, message = "El nombre no cumple con la longuitud esperada")
    private String nombre;

    @NotNull
    @Size (min = 1, max = 50, message = "El apellido no cumple con la longuitud esperada")
    private String apellido;

    @Size (min = 1, max = 50, message = "El campo no cumple con la longuitud esperada")
    private String img;
}
