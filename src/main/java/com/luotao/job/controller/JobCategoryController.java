package com.luotao.job.controller;

import com.luotao.job.domain.JobCategory;
import com.luotao.job.service.JobCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname JobCategoryController
 */
@RestController
public class JobCategoryController {
    @Resource
    private JobCategoryService jobCategoryService;

    @GetMapping("/all/category")
    public List<JobCategory> getAllCategory(){
        return jobCategoryService.getAllJobCategory();
    }

    @GetMapping("/add/category")
    public int addJobCategory(JobCategory jobCategory){
        return jobCategoryService.addJobCategory(jobCategory);
    }
}
