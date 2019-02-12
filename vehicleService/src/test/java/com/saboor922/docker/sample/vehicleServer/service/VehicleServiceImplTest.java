package com.saboor922.docker.sample.vehicleServer.service;

import com.saboor922.docker.sample.vehicleServer.domain.Vehicle;
import com.saboor922.docker.sample.vehicleServer.repository.VehicleRepository;
import com.saboor922.docker.sample.vehicleServer.service.implementation.VehicleServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class VehicleServiceImplTest {

    @Mock
    VehicleRepository vehicleRepositoryImpl;

    @InjectMocks
    VehicleServiceImpl vehicleServiceImpl;

    private Vehicle mockVehicle1 = new Vehicle(BigInteger.valueOf(2974287443L), "RV64KWO", "BMW", "428I", "M SPORT AUTO PROFESSIONAL", 2015, Arrays.asList("Sport", "Coupe"));

    private Vehicle mockVehicle2 = new Vehicle(BigInteger.valueOf(8907245771L), "FF55WQE", "Toyota", "Corolla", "GSE", 2017, Arrays.asList("Sedan", "Economy"));

    private Vehicle mockVehicle3 = new Vehicle(BigInteger.valueOf(8907245771L), "TT67LOQ", "Toyota", "Corolla", "GSE", 2017, Arrays.asList("Sedan", "Economy"));

    private List<Vehicle> mockVehicleList = Arrays.asList(mockVehicle1, mockVehicle2);

    @Test
    public void getAllVehiclesTest() {
        when(vehicleRepositoryImpl.findAll()).thenReturn(mockVehicleList);
        assertEquals(mockVehicleList, vehicleServiceImpl.getAllVehicles());
    }

    @Test
    public void getVehicleByRegistrationNumberTest() {
        when(vehicleRepositoryImpl.findByRegistrationNumberIgnoreCase("RV64KWO")).thenReturn(mockVehicle1);
        assertEquals(mockVehicle1.getRegistrationNumber(), vehicleServiceImpl.getVehicleByRegistrationNumber("RV64KWO").getRegistrationNumber());
    }

    @Test
    public void getVehicleListByManufacturerTest() {
        when(vehicleRepositoryImpl.findByManufacturerIgnoreCase("Toyota")).thenReturn(Arrays.asList(mockVehicle2));
        assertEquals(Arrays.asList(mockVehicle2), vehicleServiceImpl.getByManufacturer("Toyota"));
    }

    @Test
    public void createVehicleTest() {
        when(vehicleRepositoryImpl.save(mockVehicle1)).thenReturn(mockVehicle1);
        assertEquals(mockVehicle1, vehicleServiceImpl.createVehicle(mockVehicle1));
    }

    @Test
    public void updateVehicleTest() {
        when(vehicleRepositoryImpl.updateVehicleByRegistration(mockVehicle2, "TT67LOQ")).thenReturn(mockVehicle3);
        assertEquals(mockVehicle3, vehicleServiceImpl.updateVehicle(mockVehicle2, "TT67LOQ"));
    }

    @Test
    public void deleteVehicleTest() {
        when(vehicleRepositoryImpl.deleteVehicleByRegistrationNumberIgnoreCase("RV64KWO")).thenReturn(1L);
        assertEquals(Long.valueOf(1L), vehicleServiceImpl.deleteVehicle("RV64KWO"));
    }
}
