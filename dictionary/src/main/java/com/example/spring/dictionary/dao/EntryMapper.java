package com.example.spring.dictionary.dao;

import com.example.spring.dictionary.model.Entry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EntryMapper {

    @Select("select ENTRYID,ENTRYNAME,CATEGORY,nvl(PARAPHRASE,0),FATHERNODEID,REGISTERTIME,UPDATETIME from entry where entryname like #{str} and category = #{category}")
    List<Entry> listFuzzyMatchingResultByCate(@Param("str") String str,@Param("category") Number category);

    @Select("select ENTRYID,ENTRYNAME,CATEGORY,nvl(PARAPHRASE,0),FATHERNODEID,REGISTERTIME,UPDATETIME from entry where entryname like #{str}")
    List<Entry> listFuzzyMatchingResultByALL(@Param("str") String str);
}
