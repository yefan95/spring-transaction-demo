package com.yefan.study.transaction.demo2;

/**
 * @author yefan
 * @date 2018/12/05
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
//                int a = 2 / 0;
        accountDao.intMoney(in, money);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
