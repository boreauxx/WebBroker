package webbroker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webbroker.repository.AppointmentRepository;
import webbroker.service.interfaces.AppointmentService;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
}
