package com.example.jumptospringbootstudy.Repository;

import com.example.jumptospringbootstudy.Lombok.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
