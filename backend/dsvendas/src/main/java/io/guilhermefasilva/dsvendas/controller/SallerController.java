package io.guilhermefasilva.dsvendas.controller;

import io.guilhermefasilva.dsvendas.dto.SallerDto;
import io.guilhermefasilva.dsvendas.service.SallerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sallers")
public class SallerController {

    @Autowired
    private SallerService sallerService;

    @GetMapping
    public ResponseEntity<List<SallerDto>> findAll(){
        List<SallerDto> list = sallerService.findAll();
        return ResponseEntity.ok(list);
    }
}
