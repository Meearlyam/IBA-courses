package by.meearlyam.dentistry.repository;

import by.meearlyam.dentistry.model.Department;
import by.meearlyam.dentistry.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByIdIn(List<Long> userIds);

    Optional<Patient> findByFullName(String fullName);

    Optional<Patient> findByDepartment(Department department);

    Optional<Patient> findByAddress(String address);

    Boolean existsByFullName(String fullName);
}