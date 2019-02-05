package com.saboor922.docker.sample.vehicleServer.service;

import com.saboor922.docker.sample.vehicleServer.domain.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> getAllVehicles();

    Vehicle getVehicleByRegistrationNumber(String registrationNumber);

    List<Vehicle> getByManufacturer(String manufacturer);

    Vehicle createVehicle(Vehicle vehicle);

    Vehicle updateVehicle(Vehicle vehicle, String registration);

    void deleteVehicle(String registration);
}
