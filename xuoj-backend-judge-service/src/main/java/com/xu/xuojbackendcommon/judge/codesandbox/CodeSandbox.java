package com.xu.xuojbackendcommon.judge.codesandbox;


import com.xu.xuojbackendcommon.model.codesandbox.ExecuteCodeRequest;
import com.xu.xuojbackendcommon.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
