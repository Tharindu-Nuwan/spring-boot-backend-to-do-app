package lk.ijse.dep11.app.repository;

import lk.ijse.dep11.app.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
