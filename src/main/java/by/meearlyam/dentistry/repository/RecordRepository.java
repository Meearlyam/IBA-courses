package by.meearlyam.dentistry.repository;

import by.meearlyam.dentistry.model.Patient;
import by.meearlyam.dentistry.model.Record;
import by.meearlyam.dentistry.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
    List<Record> findByIdIn(List<Long> userIds);

    Optional<Record> findBy(String login);

    Optional<Record> findByService(Service service);

    Optional<Record> findByPatient(Patient patient);

    Boolean existsByPatient(Patient patient);

    Boolean existsByService(Service service);
}
