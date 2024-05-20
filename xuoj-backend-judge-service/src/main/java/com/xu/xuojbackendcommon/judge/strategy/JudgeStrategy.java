package com.xu.xuojbackendcommon.judge.strategy;


import com.xu.xuojbackendcommon.model.codesandbox.JudgeInfo;

/**
 * 判题策略
 */
public interface JudgeStrategy {

    /**
     * 执行判题
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
