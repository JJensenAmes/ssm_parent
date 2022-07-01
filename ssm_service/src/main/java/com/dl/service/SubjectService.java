package com.dl.service;

import com.dl.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> findSub();
    Subject updateView(int id);
    int updateTotalVotes(int id);
}
