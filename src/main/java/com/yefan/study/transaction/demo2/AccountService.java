package com.yefan.study.transaction.demo2;

/**
 * @author yefan
 * @date 2018/12/05
 */
public interface AccountService {

    void transfer(String out, String in, Double money);

}
