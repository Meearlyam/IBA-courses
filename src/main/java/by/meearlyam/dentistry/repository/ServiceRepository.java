package by.meearlyam.dentistry.repository;

import by.meearlyam.dentistry.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long> {
    List<Service> findByIdIn(List<Long> userIds);

    Optional<Service> findByName(String name);

    Optional<Service> findByCost(Double cost);

    Boolean existsByName(String name);
}