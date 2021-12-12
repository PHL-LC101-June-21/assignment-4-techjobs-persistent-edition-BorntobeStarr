package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//import javax.transaction.Transactional;

@Repository
//@Transactional
public interface EmployerRepository extends CrudRepository<Employer, Integer> {
//    Optional<Employer> findById(int employerId);
}
