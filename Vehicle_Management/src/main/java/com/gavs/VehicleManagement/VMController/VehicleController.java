package com.gavs.VehicleManagement.VMController;

import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gavs.VehicleManagement.VMEntity.Vehicle;
import com.gavs.VehicleManagement.VMRepository.VehicleRepository;
import com.gavs.VehicleManagement.VMService.VehicleService;

import java.util.Optional;
import java.util.Set;
import javax.persistence.JoinColumn;

@SuppressWarnings("unused")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class VehicleController {
	
	@Autowired
	public VehicleRepository repo;

	@RequestMapping(value = "/addVehicle", method = RequestMethod.POST)
	public Vehicle addVehicle(@RequestBody Vehicle v) {
		repo.save(v);
		return v;

	}

	@RequestMapping(value = "/updateVehicle", method = RequestMethod.PUT)
	public Vehicle updateVehicle(@RequestBody Vehicle v) {
		repo.save(v);
		return v;
	}

	@RequestMapping(value = "/removeVehicle", method = RequestMethod.DELETE)
	public int removeVehicle(@RequestBody Vehicle v) {
		repo.deleteById(v.getVid());
		return 1;
	}

	@RequestMapping(value = "/findAllVehicles", method = RequestMethod.GET)
	@GetMapping("/findAllVehicles")
	public List<Vehicle> v() {
		return repo.findAll();
	}

}
