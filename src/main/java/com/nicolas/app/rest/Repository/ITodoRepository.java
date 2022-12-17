package com.nicolas.app.rest.Repository;

import com.nicolas.app.rest.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITodoRepository extends JpaRepository<Task, Long> {

}
