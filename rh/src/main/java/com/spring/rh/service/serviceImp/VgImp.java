package com.spring.rh.service.serviceImp;

import com.spring.rh.model.Vagas;
import com.spring.rh.repository.VagasRepository;
import com.spring.rh.service.VgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VgImp implements VgService {
    @Autowired
    VagasRepository vgRepository;

    @Override
    public List<Vagas> findAll() {
        return vgRepository.findAll();

    }

    @Override
    public Vagas save(Vagas vg) {
        return vgRepository.save(vg);
    }
}
