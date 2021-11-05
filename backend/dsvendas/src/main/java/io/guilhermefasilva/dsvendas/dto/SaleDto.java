package io.guilhermefasilva.dsvendas.dto;

import io.guilhermefasilva.dsvendas.entities.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleDto {

    private Long id;
    private Integer visited;
    private Integer deals;
    private double amount;
    private LocalDate date;
    private SallerDto sallerDto;

    public SaleDto(Sale sale){
        this.id = sale.getId();
        this.visited = sale.getVisited();
        this.deals = sale.getDeals();
        this.amount = sale.getAmount();
        this.date = sale.getDate();
        this.sallerDto = new SallerDto(sale.getSaller());
    }

}
