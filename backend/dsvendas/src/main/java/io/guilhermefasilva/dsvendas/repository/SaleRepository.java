package io.guilhermefasilva.dsvendas.repository;

import io.guilhermefasilva.dsvendas.dto.SaleSuccessDto;
import io.guilhermefasilva.dsvendas.dto.SaleSumDto;
import io.guilhermefasilva.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new io.guilhermefasilva.dsvendas.dto.SaleSumDto(obj.saller, SUM(obj.amount))"
    +"FROM Sale AS obj GROUP BY obj.saller")
    List<SaleSumDto> amountGroupedBySaller();

    @Query("SELECT new io.guilhermefasilva.dsvendas.dto.SaleSuccessDto(obj.saller, SUM(obj.visited), SUM(obj.deals))"
            +"FROM Sale AS obj GROUP BY obj.saller")
    List<SaleSuccessDto> successGroupedBySaller();

}
