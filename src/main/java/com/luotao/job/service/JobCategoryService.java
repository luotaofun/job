package com.luotao.job.service;
import com.luotao.job.domain.JobCategory;

import java.util.List;

public interface JobCategoryService {
    /**
        获取所有岗位类别
    **/
    List<JobCategory> getAllJobCategory();

    /**
     * 新增岗位类别
     **/
    int addJobCategory(JobCategory jobCategory);

    /**
     * 删除岗位类别
     **/
    int deleteJobCategory(Integer id);
    /**
     * 更新岗位类别
     **/
    int updateJobCategory(JobCategory jobCategory);

}
