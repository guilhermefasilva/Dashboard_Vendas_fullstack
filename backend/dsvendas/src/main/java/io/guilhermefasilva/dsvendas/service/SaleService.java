package io.guilhermefasilva.dsvendas.service;

import io.guilhermefasilva.dsvendas.dto.SaleDto;
import io.guilhermefasilva.dsvendas.entities.Sale;
import io.guilhermefasilva.dsvendas.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SallerService sallerService;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        saleRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return  result.map(x -> new SaleDto(x));
    }
}
