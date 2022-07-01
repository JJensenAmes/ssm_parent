package com.dl.mapper;

import com.dl.entity.Subject;

import java.util.List;

public interface SubjectMapper {
    List<Subject> findSub();
    int updateView(int id);
    int updateTotalVotes(int id);
}
