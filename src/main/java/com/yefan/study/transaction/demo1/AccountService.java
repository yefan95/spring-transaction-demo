package com.yefan.study.transaction.demo1;

/**
 * @author yefan
 * @date 2018/12/05
 * <p>
 * 转账案例的业务接口
 */
public interface AccountService {

    /**
     * @param out   转出账号
     * @param in    转入账号
     * @param money 转账金额
     */
    void transfer(String out, String in, Double money);

}
