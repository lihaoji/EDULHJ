package com.edu.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.edu.eduservice.entity.EduTeacher;
import com.baomidou.mybatisplus.extension.service.IService;
import com.edu.eduservice.entity.query.TeacherQuery;

/**
 * <p>
 * 讲师 服务类
 * </p>
 *
 * @author testjava
 * @since 2019-11-10
 */
public interface EduTeacherService extends IService<EduTeacher> {

    void pageTeacherListCondition(Page<EduTeacher> eduTeacherPage, TeacherQuery teacherQuery);
}
