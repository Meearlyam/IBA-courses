package by.meearlyam.dentistry.repository;

import by.meearlyam.dentistry.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByLogin(String login);

    Optional<User> findByNameAndSurname(String name, String surname);

    Boolean existsByLogin(String login);
}
