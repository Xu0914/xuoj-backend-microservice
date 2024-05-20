package com.xu.xuojbackendserviceclient.service;

import com.xu.xuojbackendcommon.model.entity.Question;
import com.xu.xuojbackendcommon.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
* @author 徐思捷
* @description 针对表【question(题目)】的数据库操作Service
* @createDate 2024-05-06 18:40:31
*/
@FeignClient(name = "xuoj-backend-question-service", path = "/api/question/inner")
public interface QuestionFeignClient {

//questionService.getById(questionId)
//questionSubmitService.getById(questionSubmitId)
//questionSubmitService.updateById(questionSubmitUpdate)

    @GetMapping("/get/id")
    Question getQuestionById(@RequestParam("questionId") long questionId);

    @GetMapping("/question_submit/get/id")
    QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId);

    @PostMapping("/question_submit/update")
    boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit);
}
