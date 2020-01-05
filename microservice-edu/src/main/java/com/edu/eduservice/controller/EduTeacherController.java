package com.edu.eduservice.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.edu.eduservice.entity.EduTeacher;
import com.edu.eduservice.entity.query.TeacherQuery;
import com.edu.eduservice.service.EduTeacherService;
import com.edu.entity.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2019-11-10
 */
@Api(value="讲师",tags={"讲师后台操作接口"})
@RestController
@RequestMapping("/eduservice/edu-teacher")
@CrossOrigin
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;



    @ApiOperation("讲师分页列表")
    @PostMapping("pageList/{pageNum}/{limit}")
    public R pageListTeacher
            (@PathVariable long pageNum, @PathVariable long limit, TeacherQuery teacherQuery){

        Page<EduTeacher> eduTeacherPage = new Page<>(pageNum,limit);
        eduTeacherService.pageTeacherListCondition(eduTeacherPage,teacherQuery);
        List<EduTeacher> records = eduTeacherPage.getRecords();
        long total = eduTeacherPage.getTotal();
        return R.ok().data("total",total).data("records",records);

    }

    @ApiOperation("讲师添加")
    @PostMapping("save")
    public R saveTeacher(@RequestBody EduTeacher eduTeacher){

        boolean flag = eduTeacherService.save(eduTeacher);
        if (flag){

            return R.ok().message("添加讲师成功！");
        }

            return R.error().message("添加失败");
    }

    @ApiOperation(value = "根据ID查询讲师")
    @GetMapping("{id}")
    public R getById(
            @ApiParam(name = "id", value = "讲师ID", required = true)
            @PathVariable String id){

        EduTeacher teacher = eduTeacherService.getById(id);
        return R.ok().data("item", teacher);
    }

    @ApiOperation(value = "根据ID修改讲师")
    @PutMapping("update")
    public R updateById(
            @ApiParam(name = "teacher", value = "讲师对象", required = true)
            @RequestBody EduTeacher teacher){
        eduTeacherService.updateById(teacher);
        return R.ok();
    }

    @ApiOperation(value = "根据ID删除")
    @DeleteMapping("delete/{id}")
    public R deletedId(@ApiParam(name = "id", value = "讲师ID", required = true) @PathVariable String id){

        boolean b = eduTeacherService.removeById(id);
        if (b){

            return R.ok().message("删除讲师成功！");
        }

        return R.error().message("删除失败");
    }







}

