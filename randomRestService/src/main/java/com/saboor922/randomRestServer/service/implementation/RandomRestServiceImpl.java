package com.saboor922.randomRestServer.service.implementation;

import com.saboor922.randomRestServer.domain.Quote;
import com.saboor922.randomRestServer.service.RandomRestService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RandomRestServiceImpl implements RandomRestService {

    @Override
    public Quote randomClient(String randomUrl) {
        return new RestTemplate().getForObject(randomUrl, Quote.class);
    }


}
