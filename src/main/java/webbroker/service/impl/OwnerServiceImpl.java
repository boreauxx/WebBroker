package webbroker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webbroker.repository.OwnerRepository;
import webbroker.service.interfaces.OwnerService;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
}
