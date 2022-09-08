package com.devsuperior.dsmeta.repositories.serviceImp;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import com.devsuperior.dsmeta.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImp implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> findSales() {
        return saleRepository.findAll();
    }
}
