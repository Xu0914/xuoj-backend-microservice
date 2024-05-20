package com.xu.xuojbackendcommon.judge.strategy;


import com.xu.xuojbackendcommon.model.codesandbox.JudgeInfo;
import com.xu.xuojbackendcommon.model.dto.question.JudgeCase;
import com.xu.xuojbackendcommon.model.entity.Question;
import com.xu.xuojbackendcommon.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> InputList;

    private List<String> OutputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
