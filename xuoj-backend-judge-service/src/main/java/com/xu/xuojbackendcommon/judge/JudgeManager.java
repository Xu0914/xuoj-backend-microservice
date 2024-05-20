package com.xu.xuojbackendcommon.judge;

import com.xu.xuojbackendcommon.judge.strategy.DefaultJudgeStrategy;
import com.xu.xuojbackendcommon.judge.strategy.JavaLanguageJudgeStrategy;
import com.xu.xuojbackendcommon.judge.strategy.JudgeContext;
import com.xu.xuojbackendcommon.judge.strategy.JudgeStrategy;
import com.xu.xuojbackendcommon.model.codesandbox.JudgeInfo;
import com.xu.xuojbackendcommon.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
