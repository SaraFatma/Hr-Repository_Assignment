package com.example.hr_portal.service;

import com.example.hr_portal.model.Hr;
import com.example.hr_portal.repository.HrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrRepository hrRepository;

    @Override
    public Optional<Hr> authenticateHr(String hrUsername, String hrPassword) {
        Optional<Hr> hr = hrRepository.findByHrUsername(hrUsername);
        if (hr.isPresent() && hr.get().getHrPassword().equals(hrPassword)) {
            return hr;
        }
        return Optional.empty();
    }
}



