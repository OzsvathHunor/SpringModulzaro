package com.example.springmodulzaro.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface TaskRepository extends CrudRepository<Task, Long> {

    @Query("select t from task_mz t where t.id = ?1")
    Task findId(Long id);


    @Override
    void deleteById(Long aLong);
}
