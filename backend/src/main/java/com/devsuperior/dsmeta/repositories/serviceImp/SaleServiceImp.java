package com.devsuperior.dsmeta.repositories.serviceImp;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import com.devsuperior.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SaleServiceImp implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate min = LocalDate.parse(minDate);
        LocalDate max = LocalDate.parse(maxDate);

        return saleRepository.findSales(min, max, pageable);
    }
}
