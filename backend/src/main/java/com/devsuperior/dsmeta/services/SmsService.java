package com.devsuperior.dsmeta.services;

import org.springframework.stereotype.Service;

@Service
public interface SmsService {
    void sendSms(Long saleId);
}
