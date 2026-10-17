package com.example.jumptospringbootstudy;

import com.example.jumptospringbootstudy.Lombok.Answer;
import com.example.jumptospringbootstudy.Lombok.Question;
import com.example.jumptospringbootstudy.Repository.AnswerRepository;
import com.example.jumptospringbootstudy.Repository.QuestionRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class JumpToSpringBootStudyApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {
//        Question q1 = new Question();
//        q1.setSubject("jump가 무엇인가요?");
//        q1.setContent("jump에 대해서 알고 싶습니다.");
//        q1.setCreatDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreatDate(LocalDateTime.now());
//        this.questionRepository.save(q2);

//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2, all.size());
//
//        Question q = all.get(0);
//        assertEquals("jump가 무엇인가요?", q.getSubject());

//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()) {
//            Question q = oq.get();
//            assertEquals("jump가 무엇인가요?", q.getSubject());
//        }

//        Question q = this.questionRepository.findBySubject("jump가 무엇인가요?");
//        assertEquals(1, q.getId());

//        Question q = this.questionRepository.findBySubjectAndContent(
//                "jump가 무엇인가요?", "jump에 대해서 알고 싶습니다.");
//        assertEquals(1, q.getId());

//        List<Question> qList = this.questionRepository.findBySubjectLike("jump%");
//        Question q = qList.get(0);
//        assertEquals("jump가 무엇인가요?", q.getSubject());

//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);

//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());

//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);

//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2, a.getQuestion().getId());

        Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
    }

}
