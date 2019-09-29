package com.example.spring.dictionary.controller;

import com.example.spring.dictionary.Enum.CategoryEnum;
import com.example.spring.dictionary.service.EntryService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/entry")
public class EntryController {
    @Autowired
    EntryService entryService;

    @RequestMapping(value = "/FuzzyMatchingResult")
    @ResponseBody
    public Object listFuzzyMatchingResult(@RequestParam(value = "str") String str,@RequestParam("category") String category){
        return JSONArray.fromObject(entryService.listFuzzyMatchingResult(str,category));
    }

    @RequestMapping(value = "/EntryCategory")
    @ResponseBody
    public Object listEntryCategory(){
        List<String> categoryList = new ArrayList<String>();
        for (CategoryEnum categoryEnum : CategoryEnum.values()){
            categoryList.add(categoryEnum.getCategory());
        }
        return JSONArray.fromObject(categoryList);
    }
}
