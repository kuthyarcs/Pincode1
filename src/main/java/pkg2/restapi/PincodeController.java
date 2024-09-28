package pkg2.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PincodeController {
	@Autowired
	PincodeRepo pincoderepo;
	
	@GetMapping("/pincode/getAll")
	public List<PincodeEntity> getAllPincodes() {
		return pincoderepo.findAll();
	}
	@GetMapping("/pincode/get/{num1}")
	public PincodeEntity getPincode(@PathVariable int num1) {
		List<PincodeEntity>list1=pincoderepo.getPincode(num1);
		return list1.get(0);
	}
	

}
