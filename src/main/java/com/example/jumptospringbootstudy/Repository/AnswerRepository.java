package com.example.jumptospringbootstudy.Repository;

import com.example.jumptospringbootstudy.Lombok.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

}
