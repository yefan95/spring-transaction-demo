package com.yefan.study.transaction.demo1;

/**
 * @author yefan
 * @date 2018/12/05
 * <p>
 * 转账案例的DAO层接口
 */
public interface AccountDao {
    /**
     * @param out   转出金额
     * @param money 转账金额
     */
    void outMoney(String out, Double money);

    /**
     * @param in    转入金额
     * @param money 转账金额
     */
    void intMoney(String in, Double money);

}

