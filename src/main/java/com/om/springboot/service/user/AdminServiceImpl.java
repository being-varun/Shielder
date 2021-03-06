package com.om.springboot.service.user;

import com.om.springboot.dto.mapper.user.AdminDtoMapper;
import com.om.springboot.dto.model.user.AdminDto;
import com.om.springboot.mappers.user.AdminMapper;
import com.om.springboot.model.user.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    @Qualifier("adminMapper")
    AdminMapper adminMapper;


    @Override
    public Boolean adminByMobileNumberAndCompany(String mobile,String country){
        Boolean isExist=adminMapper.adminExistByMobAndCompany(mobile,country);
        if(null==isExist|| !isExist){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Boolean insertAdmin(AdminDto adminDto){
        Admin admin=new Admin();
        admin.setName(adminDto.getAdminName());
        admin.setCompany(adminDto.getCompany());
        admin.setEmail(adminDto.getAdminEmailId());
        admin.setMobile(adminDto.getAdminMobileNumber());
        Boolean isInserted=adminMapper.insertAdminDetails(admin);
        if(null==isInserted||!isInserted){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public AdminDto getAdminDetails(String mobile){
        return AdminDtoMapper.toAdminDto(adminMapper.getAdmin(mobile));
    }

    @Override
    public Boolean adminByMobile(String mobile){
        Boolean isExist=adminMapper.existByMobile(mobile);
        if(null==isExist|| !isExist){
            return false;
        }
        else {
            return true;
        }
    }

}
