package io.guilhermefasilva.dsvendas.service;

import io.guilhermefasilva.dsvendas.dto.SallerDto;
import io.guilhermefasilva.dsvendas.entities.Saller;
import io.guilhermefasilva.dsvendas.repository.SallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SallerService {

    @Autowired
    private SallerRepository sallerRepository;


    public List<SallerDto> findAll(){
    List<Saller> result = sallerRepository.findAll();
        return  result.stream().map(x -> new SallerDto(x)).collect(Collectors.toList());
    }
}
