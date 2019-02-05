package com.saboor922.docker.sample.vehicleServer.service.implementation;

import com.saboor922.docker.sample.vehicleServer.domain.Vehicle;
import com.saboor922.docker.sample.vehicleServer.repository.VehicleRepository;
import com.saboor922.docker.sample.vehicleServer.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@PropertySource("classpath:bootstrap.properties")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepositoryImpl;

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepositoryImpl.findAll();
    }

    @Override
    public Vehicle getVehicleByRegistrationNumber(String registrationNumber) {
        return vehicleRepositoryImpl.findByRegistrationNumberIgnoreCase(registrationNumber);
    }

    @Override
    public List<Vehicle> getByManufacturer(String manufacturer) {
        return vehicleRepositoryImpl.findByManufacturerIgnoreCase(manufacturer);
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepositoryImpl.save(vehicle);
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle, String registration) {
        return vehicleRepositoryImpl.updateVehicleByRegistration(vehicle, registration);
    }

    @Override
    public void deleteVehicle(String registration) {
        vehicleRepositoryImpl.deleteVehicleByRegistrationNumberIgnoreCase(registration);
    }


}
