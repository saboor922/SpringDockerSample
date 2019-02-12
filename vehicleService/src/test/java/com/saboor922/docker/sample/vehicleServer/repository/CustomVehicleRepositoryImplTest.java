package com.saboor922.docker.sample.vehicleServer.repository;

import com.saboor922.docker.sample.vehicleServer.repository.implementation.CustomVehicleRepositoryImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.MongoConverter;

@RunWith(MockitoJUnitRunner.class)
public class CustomVehicleRepositoryImplTest {

    @Mock
    private MongoTemplate mongoTemplate;

    @Mock
    private MongoDbFactory mongoDbFactory;

    @Mock
    private MongoConverter mongoConverter;


    @InjectMocks
    CustomVehicleRepositoryImpl customVehicleRepositoryImpl;

    @Before
    public void setup() {

    }

    @Test
    public void updateVehicleByRegistrationTest() {
    }
}
