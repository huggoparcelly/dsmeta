package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SaleService {
    List<Sale> findSales();
}
