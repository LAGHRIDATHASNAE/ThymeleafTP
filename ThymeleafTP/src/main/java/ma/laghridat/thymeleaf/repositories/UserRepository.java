package ma.laghridat.thymeleaf.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.laghridat.thymeleaf.beans.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
