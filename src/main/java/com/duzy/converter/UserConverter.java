package com.duzy.converter;

import com.duzy.dto.UserDTO;
import com.duzy.model.SysUserModel;
import com.duzy.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
@Component
public interface UserConverter {

    SysUserModel dto2Model(UserDTO userDTO);

    UserVO model2Vo(SysUserModel model);

    List<UserVO> model2VoList(List<SysUserModel> modelList);
}
