package com.saboor922.docker.sample.vehicleServer.repository;

import com.saboor922.docker.sample.vehicleServer.domain.Vehicle;

public interface CustomVehicleRepository {

    Vehicle updateVehicleByRegistration(Vehicle vehicle, String registration);
}
