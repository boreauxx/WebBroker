package webbroker.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import webbroker.repository.OfferRepository;
import webbroker.service.interfaces.OfferService;

@Service
@RequiredArgsConstructor
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;
}
