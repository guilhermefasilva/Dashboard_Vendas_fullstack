package io.guilhermefasilva.dsvendas.dto;

import io.guilhermefasilva.dsvendas.entities.Saller;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;


@Data
@NoArgsConstructor
public class SaleSumDto implements Serializable {


    private static final long serialVersionUID = -2573685362633288511L;

    private String salleName;
    private Double sum;

    public SaleSumDto(Saller saller, Double sum){
        this.salleName = saller.getName();
        this.sum = sum;
    }

}
