package com.example.springbootmuldatasources.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettucePoolingClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Author hehongfei
 * @Description
 * @Date 2023/1/26 10:43
 */
@Configuration
public class RedisConfiguration {

    //配置redis的过期时间
    private static final StringRedisSerializer STRING_SERIALIZER = new StringRedisSerializer();
    private static final GenericJackson2JsonRedisSerializer JSON_SERIALIZER = new GenericJackson2JsonRedisSerializer();

    @Bean
    public RedisTemplate<String, Object> redisTemplate(LettuceConnectionFactory lettuceConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(lettuceConnectionFactory);
        //key的序列方式
        template.setKeySerializer(STRING_SERIALIZER);
        //hashKey的序列方式
        template.setHashKeySerializer(STRING_SERIALIZER);
        //value的序列方式
        template.setValueSerializer(JSON_SERIALIZER);
        //value hashmap序列化
        template.setHashValueSerializer(JSON_SERIALIZER);
        return template;
    }

    @Bean
    public GenericObjectPoolConfig poolConfig(){
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        //控制一个pool可分配多少个jedis实例
        poolConfig.setMaxTotal(500);
        //最大空闲数
        poolConfig.setMaxIdle(200);
        //每次释放连接的最大数目，默认是3
        poolConfig.setNumTestsPerEvictionRun(1024);
        //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        poolConfig.setTimeBetweenEvictionRunsMillis(30000);
        //连接的最小空闲时间 默认1800000毫秒(30分钟)
        poolConfig.setMinEvictableIdleTimeMillis(-1);
        poolConfig.setSoftMinEvictableIdleTimeMillis(10000);
        //最大建立连接等待时间。如果超过此时间将接到异常。设为-1表示无限制。
        poolConfig.setMaxWaitMillis(1500);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setTestOnReturn(false);
        poolConfig.setJmxEnabled(true);
        poolConfig.setBlockWhenExhausted(false);
        return poolConfig;
    }


    @Bean
    public LettuceConnectionFactory lettuceConnectionFactory() {
        LettucePoolingClientConfiguration lettucePoolingClientConfiguration = LettucePoolingClientConfiguration.builder()
                .poolConfig(poolConfig())
                .build();
        // 单机redis
        RedisStandaloneConfiguration redisConfig = new RedisStandaloneConfiguration();
        redisConfig.setHostName("127.0.0.1");
        redisConfig.setPort(6379);
        redisConfig.setDatabase(0);


        // 哨兵redis
        //RedisSentinelConfiguration redisConfig = new RedisSentinelConfiguration();

        // 集群redis
//        RedisClusterConfiguration redisConfig = new RedisClusterConfiguration();
//        Set<RedisNode> nodeses = new HashSet<>();
//        String[] hostses = nodes.split("-");
//        for (String h : hostses) {
//            h = h.replaceAll("\\s", "").replaceAll("\n", "");
//            if (!"".equals(h)) {
//                String host = h.split(":")[0];
//                int port = Integer.valueOf(h.split(":")[1]);
//                nodeses.add(new RedisNode(host, port));
//            }
//        }
//        redisConfig.setClusterNodes(nodeses);
//        // 跨集群执行命令时要遵循的最大重定向数量
//        redisConfig.setMaxRedirects(3);
//        redisConfig.setPassword(password);

        return new LettuceConnectionFactory(redisConfig, lettucePoolingClientConfiguration);
    }
}
