package com.saboor922.randomRestServer.service.implementation;

import com.saboor922.randomRestServer.domain.Quote;
import com.saboor922.randomRestServer.service.RandomRestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@PropertySource("classpath:bootstrap.properties")
public class RandomRestServiceImpl implements RandomRestService {

    @Value("${randomUrl.path}")
    private String randomUrl;

    @Override
    public Quote randomClient() {
        return new RestTemplate().getForObject(randomUrl, Quote.class);
    }


}
