package io.guilhermefasilva.dsvendas.controller;

import io.guilhermefasilva.dsvendas.dto.SaleDto;
import io.guilhermefasilva.dsvendas.dto.SallerDto;
import io.guilhermefasilva.dsvendas.service.SaleService;
import io.guilhermefasilva.dsvendas.service.SallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
