package com.dl.service;

import com.dl.entity.Option;
import com.dl.mapper.OptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("optionService")
public class OptionServiceImpl implements OptionService{
    @Autowired
    private OptionMapper optionMapper;
    @Override
    public List<Option> findBySid(int sid) {
        return optionMapper.findBySid(sid);
    }

    @Override
    public int updateVote(int id, String option) {
        return  optionMapper.updateVote(id,option);
    }
}
