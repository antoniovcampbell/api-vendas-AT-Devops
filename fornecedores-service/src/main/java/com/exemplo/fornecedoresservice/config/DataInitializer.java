package com.exemplo.fornecedoresservice.config;

import com.exemplo.fornecedoresservice.model.Fornecedor;
import com.exemplo.fornecedoresservice.repository.FornecedorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final FornecedorRepository fornecedorRepository;

    public DataInitializer(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @Override
    public void run(String... args) {
        fornecedorRepository.save(new Fornecedor("Alfa Distribuidora", "12.345.678/0001-90"));
        fornecedorRepository.save(new Fornecedor("Beta Atacadista", "23.456.789/0001-01"));
        fornecedorRepository.save(new Fornecedor("Comercial Gama", "34.567.890/0001-12"));
        fornecedorRepository.save(new Fornecedor("Delta Suprimentos", "45.678.901/0001-23"));
        fornecedorRepository.save(new Fornecedor("Epsilon Importadora", "56.789.012/0001-34"));
    }
}
