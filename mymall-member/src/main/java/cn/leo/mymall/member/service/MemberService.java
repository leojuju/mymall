package cn.leo.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.leo.common.utils.PageUtils;
import cn.leo.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author leojuju
 * @email linjian6426@126.com
 * @date 2021-06-01 00:56:30
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

