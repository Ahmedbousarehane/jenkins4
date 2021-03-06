package com.fboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fboot.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Integer>{
	
	@Query("SELECT q FROM Question q WHERE q.qcm.ID = :idQcm and q.ID > :n")
    public List<Question> findQuestions(@Param("idQcm") int idQcm,@Param("n") int n);
}
