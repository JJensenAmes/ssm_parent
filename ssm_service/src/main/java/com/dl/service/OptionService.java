package com.dl.service;

import com.dl.entity.Option;

import java.util.List;

public interface OptionService {
    List<Option> findBySid(int sid);
    int updateVote(int id,String option);
}
