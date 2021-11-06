package com.librarymanagementsystem.library.repositories;

import com.librarymanagementsystem.library.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
