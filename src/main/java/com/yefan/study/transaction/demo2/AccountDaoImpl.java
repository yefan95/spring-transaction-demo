package com.yefan.study.transaction.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @author yefan
 * @date 2018/12/05
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    @Override
    public void intMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}
