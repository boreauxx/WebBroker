package webbroker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webbroker.repository.TenantRepository;
import webbroker.service.interfaces.TenantService;

@Service
@RequiredArgsConstructor
public class TenantServiceImpl implements TenantService {

    private final TenantRepository tenantRepository;
}
