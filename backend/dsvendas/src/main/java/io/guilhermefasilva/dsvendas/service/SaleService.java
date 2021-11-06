package io.guilhermefasilva.dsvendas.service;

import io.guilhermefasilva.dsvendas.dto.SaleDto;
import io.guilhermefasilva.dsvendas.dto.SaleSuccessDto;
import io.guilhermefasilva.dsvendas.dto.SaleSumDto;
import io.guilhermefasilva.dsvendas.entities.Sale;
import io.guilhermefasilva.dsvendas.repository.SaleRepository;
import io.guilhermefasilva.dsvendas.repository.SallerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SallerRepository sallerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sallerRepository.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return  result.map(x -> new SaleDto(x));
    }
    @Transactional(readOnly = true)
    public List<SaleSumDto> amountGroupedBySaller(){
        return saleRepository.amountGroupedBySaller();
    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDto> successGroupedBySaller(){
        return saleRepository.successGroupedBySaller();
    }


}
