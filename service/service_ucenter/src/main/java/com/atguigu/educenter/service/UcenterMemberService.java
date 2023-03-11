package com.atguigu.educenter.service;

import com.atguigu.educenter.entity.UcenterMember;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author testjava
 * @since 2023-03-10
 */

public interface UcenterMemberService extends IService<UcenterMember> {

    String login(UcenterMember member);
}
