package com.studentsapi.persitence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentsapi.persitence.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
