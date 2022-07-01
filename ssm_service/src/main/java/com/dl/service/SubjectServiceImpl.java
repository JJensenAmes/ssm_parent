package com.dl.service;

import com.dl.entity.Subject;
import com.dl.mapper.SubjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("subjectService")
public class SubjectServiceImpl implements SubjectService{
    @Autowired
    private SubjectMapper subjectMapper;
    @Override
    public List<Subject> findSub() {
        List<Subject> list = subjectMapper.findSub();
        return list;
    }

    @Override
    public Subject updateView(int id) {
        int i = subjectMapper.updateView(id);
        Subject subject = subjectMapper.findSub().get(id-1);
        return subject;
    }

    @Override
    public int updateTotalVotes(int id) {
        return subjectMapper.updateTotalVotes(id);
    }

}
