package com.gavs.VehicleManagement.VMService;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.gavs.VehicleManagement.VMEntity.Vehicle;
import com.gavs.VehicleManagement.VMRepository.VehicleRepository;


@SuppressWarnings("unused")
public class VehicleService {

	@Autowired
	private VehicleRepository repo;
	
	public Vehicle save(Vehicle saveVehicle) {
		return repo.save(saveVehicle);
	}
	public Vehicle update(Vehicle updateVehicle) {
		return repo.save(updateVehicle);
	}
	public String deleteById(int vid) {
		repo.deleteById(vid);
		return "Deleted Successfully......!";
	}
	public Optional<Vehicle> findById(int vid) {
		return repo.findById(vid);
	}
	public List<Vehicle> findAll() {
		return null;
	}
	
	
}


