package com.example.spring.dictionary.service.Impl;

import com.example.spring.dictionary.Enum.EnumMatch;
import com.example.spring.dictionary.dao.EntryMapper;
import com.example.spring.dictionary.model.Entry;
import com.example.spring.dictionary.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServiceImpl implements EntryService {
    @Autowired
    EntryMapper entryMapper;


    @Override
    public List<Entry> listFuzzyMatchingResult(String str,String category) {
        Number matchResult = EnumMatch.matchCategoryEnum(category);
        System.out.println(matchResult);
        return  (Integer) matchResult == -1 ? entryMapper.listFuzzyMatchingResultByALL(str+"%") : entryMapper.listFuzzyMatchingResultByCate(str+"%",matchResult);
    }
}
