package com.asandoval.backend.rh.repositorio;

import com.asandoval.backend.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
