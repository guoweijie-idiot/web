package com.idiot.web.service.impl;

import com.idiot.web.model.Customers;
import com.idiot.web.mapper.CustomersMapper;
import com.idiot.web.service.ICustomersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 顾客信息表 服务实现类
 * </p>
 *
 * @author guoweijie
 * @since 2021-01-16 下午10:20
 */
@Service
public class CustomersServiceImpl extends ServiceImpl<CustomersMapper, Customers> implements ICustomersService {

}
