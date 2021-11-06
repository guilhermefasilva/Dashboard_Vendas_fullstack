package io.guilhermefasilva.dsvendas.dto;

import io.guilhermefasilva.dsvendas.entities.Saller;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class SaleSuccessDto implements Serializable {

    private static final long serialVersionUID = -9161988575692676635L;

    private String salleName;
    private Long visited;
    private Long deals;

    public SaleSuccessDto(Saller saller, Long visited, Long deals){
        this.salleName = saller.getName();
        this.visited = visited;
        this.deals = deals;
    }

}
