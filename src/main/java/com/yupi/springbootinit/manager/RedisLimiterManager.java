package com.yupi.springbootinit.manager;


import com.yupi.springbootinit.common.ErrorCode;
import com.yupi.springbootinit.config.RedissonConfig;
import com.yupi.springbootinit.exception.BusinessException;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RedisLimiterManager {

//    @Resource
//    private RedissonClient redissonClient;
//
//    public void doRateLimit(String key){
//        RRateLimiter rateLimiter = redissonClient.getRateLimiter(key);
//        rateLimiter.trySetRate(RateType.OVERALL,2 , 1, RateIntervalUnit.SECONDS);
//        boolean canOp = rateLimiter.tryAcquire(1);
//        if (!canOp) {
//            throw new BusinessException(ErrorCode.TOO_MANY_REQUEST);
//        }
//    }

}
