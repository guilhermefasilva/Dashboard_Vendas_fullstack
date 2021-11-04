package io.guilhermefasilva.dsvendas.repository;

import io.guilhermefasilva.dsvendas.entities.Saller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SallerRepository extends JpaRepository<Saller, Long> {
}
