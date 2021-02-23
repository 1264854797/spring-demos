package com.zhou.service.impl;

import com.zhou.dao.impl.MysqlUserDaoImpl;
import com.zhou.dao.impl.OrcalUserDaoImpl;
import com.zhou.service.UserService;

public class MysqlServiceImpl implements UserService {
//    public MysqlUserDaoImpl mysql=new MysqlUserDaoImpl();
      public OrcalUserDaoImpl orcal=new OrcalUserDaoImpl();
    public void employ() {
        orcal.employ();
    }
}
