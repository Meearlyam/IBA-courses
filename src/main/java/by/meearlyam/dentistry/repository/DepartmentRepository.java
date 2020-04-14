package by.meearlyam.dentistry.repository;

import by.meearlyam.dentistry.model.Department;
import by.meearlyam.dentistry.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
        List<Department> findByIdIn(List<Long> userIds);

        Optional<Department> findByName(String name);

        Optional<Department> findByFloor(Integer floor);

        Optional<Department> findByUser(User user);

        Boolean existsByName(String name);
        }