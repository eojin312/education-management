package hachi.education_management.score.repository;

import hachi.education_management.score.vo.ScoreWithStudent;

import java.util.List;

public interface ScoreRepository {
    List<ScoreWithStudent> selectByScoreNoWithStudentNo();

}
