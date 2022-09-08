package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public interface SaleService {
    Page<Sale> findSales(String minDate, String maxDate, Pageable pageable);
}
