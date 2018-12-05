package com.yefan.study.transaction.demo4;

/**
 * @author yefan
 * @date 2018/12/05
 */
public interface AccountDao {

    void outMoney(String out, Double money);

    void intMoney(String in, Double money);

}

