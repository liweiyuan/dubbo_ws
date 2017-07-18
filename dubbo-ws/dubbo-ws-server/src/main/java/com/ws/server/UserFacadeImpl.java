//--------------------------------------------------------------------------
//	Copyright (c) 2010-2020, En.dennisit or Cn.苏若年
//  All rights reserved.
//
//	Redistribution and use in source and binary forms, with or without
//  modification, are permitted provided that the following conditions are
//  met:
//
//	Redistributions of source code must retain the above copyright notice,
//  this list of conditions and the following disclaimer.
//	Redistributions in binary form must reproduce the above copyright
//  notice, this list of conditions and the following disclaimer in the
//  documentation and/or other materials provided with the distribution.
//	Neither the name of the dennisit nor the names of its contributors
//  may be used to endorse or promote products derived from this software
//  without specific prior written permission.
//  Author: dennisit@163.com | dobby | 苏若年
//--------------------------------------------------------------------------
package com.ws.server;

import com.ws.entity.User;
import com.ws.facade.UserFacade;

/**
 * Description: com.ws.server
 * Author dobby | dennisit@163.com
 * Date 2015/5/30 23:50
 * Copyright Corporation 2015.05
 * Version 1.0
 */
public class UserFacadeImpl implements UserFacade{


    public int insert(User user) {

        return 1;
    }

    public int delete(int id) {
        return 1;
    }

    public User select(int id) {
        User user = new User();
        user.setName("zhangssan");
        return user;
    }
}
