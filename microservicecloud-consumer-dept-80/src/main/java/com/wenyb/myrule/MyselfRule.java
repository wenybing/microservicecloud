package com.wenyb.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wenyabing
 * @Date 2019/3/16 23:15
 * 自定义规则类
 */
@Configuration
public class MyselfRule {
    /**
     * 随机负载均衡
     */
    @Bean
    public IRule getRandomRule() {
        /**
         * Ribbon默认是轮询，自定义为随机
         */
//        return new RandomRule();
        /**
         * 自定义轮询算法
         */
        return new RandomRule_wenyb();
    }
}
