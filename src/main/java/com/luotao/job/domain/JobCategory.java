package com.luotao.job.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname JobCategory
-- 岗位分类表
drop table if exists job_category;
create table job_category(
id int not null auto_increment comment 'ID',
category_name varchar(80) not null comment '分类名称',
category_desc varchar(200) default null comment '分类描述',
primary key (id),
unique key category_name_unique(category_name)
) engine =innodb default charset =utf8mb4 comment ='岗位分类表';
 */
@Data // 自动生成getter、setter及toString方法
@NoArgsConstructor // 自动生成无参构造
@AllArgsConstructor // 自动生成全参构造
public class JobCategory {
    private int id;
    /**
    * @Description: 分类名称
    **/
    private String category_name;
    /**
     * @Description: 分类描述
     **/
    private String category_desc;
}
