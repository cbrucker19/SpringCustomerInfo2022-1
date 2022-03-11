package customerInfo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import customerInfo.beans.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long>{

	
}
