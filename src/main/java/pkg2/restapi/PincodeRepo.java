package pkg2.restapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PincodeRepo extends JpaRepository<PincodeEntity,Integer> {
	@Query(value="select * from pincodes where pincode=:num1",nativeQuery=true)
	public List<PincodeEntity> getPincode(@Param(value = "num1") int num1);

}
