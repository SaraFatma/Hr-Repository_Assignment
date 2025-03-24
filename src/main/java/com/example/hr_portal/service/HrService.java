package com.example.hr_portal.service;

import com.example.hr_portal.model.Hr;
import java.util.Optional;

public interface HrService {
    Optional<Hr> authenticateHr(String hrUsername, String hrPassword);
}
