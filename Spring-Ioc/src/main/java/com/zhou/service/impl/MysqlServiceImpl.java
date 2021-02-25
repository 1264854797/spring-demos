package com.zhou.service.impl;

import com.zhou.dao.impl.OrcalUserDaoImpl;

public class MysqlServiceImpl {
//    public MysqlUserDaoImpl mysql=new MysqlUserDaoImpl();
      public OrcalUserDaoImpl orcal=new OrcalUserDaoImpl();
    public void employ() {
        orcal.employ();
    }
}
