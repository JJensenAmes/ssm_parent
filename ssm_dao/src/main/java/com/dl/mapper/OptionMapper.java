package com.dl.mapper;

import com.dl.entity.Option;

import java.util.List;

public interface OptionMapper {
    List<Option> findBySid(int sid);
    int updateVote(int id,String option);
}
