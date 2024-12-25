package com.luotao.job.service;

import com.luotao.job.domain.JobCategory;
import com.luotao.job.mapper.JobCategoryMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname JobCategoryServiceImpl
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/12/24 16:56
 * @Author LuoTao
 */
@Service
public class JobCategoryServiceImpl implements JobCategoryService {
    @Resource// 注入
    private JobCategoryMapper jobCategoryMapper;
    /**
     * 获取所有岗位类别
     **/
    @Override
    public List<JobCategory> getAllJobCategory() {
        return jobCategoryMapper.allJobCategory();
    }

    /**
     * 新增岗位类别
     *
     * @param jobCategory
     */
    @Override
    public int addJobCategory(JobCategory jobCategory) {
        int increamentID = jobCategoryMapper.insertJobCategory(jobCategory);
        if (increamentID >0 ){
            increamentID = jobCategory.getId();
        }
        return increamentID;
    }

    /**
     * 删除岗位类别
     *
     * @param id
     */
    @Override
    public int deleteJobCategory(Integer id) {
        return jobCategoryMapper.deleteByPrimaryKey(id);
    }

    /**
     * 更新岗位类别
     *
     * @param jobCategory
     */
    @Override
    public int updateJobCategory(JobCategory jobCategory) {
        return jobCategoryMapper.updateByPrimaryKey(jobCategory);
    }

}
