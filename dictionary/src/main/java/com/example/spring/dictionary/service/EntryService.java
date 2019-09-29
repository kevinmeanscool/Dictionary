package com.example.spring.dictionary.service;

import com.example.spring.dictionary.model.Entry;

import java.util.List;

public interface EntryService {
    List<Entry> listFuzzyMatchingResult(String str,String category);
}
