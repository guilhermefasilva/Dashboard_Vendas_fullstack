package io.guilhermefasilva.dsvendas.dto;

import io.guilhermefasilva.dsvendas.entities.Saller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SallerDto implements Serializable {

    private static final long serialVersionUID = -5542753444592041918L;

    private Long id;
    private String name;

    public SallerDto(Saller saller){
        this.id = saller.getId();
        this.name = saller.getName();
    }
}
