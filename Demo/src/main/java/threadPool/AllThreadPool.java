package threadPool;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 所有的线程池类型都从此类获取
 */
@Component
public class AllThreadPool {


    @Bean(name = "rejectWebThreadPool")
    @Primary
    public ThreadPoolExecutor getRejectExecutor(){
        /**cpu核心线程数*/
        int coreNum=Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                coreNum<<1,
                coreNum<<1,
                120L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(50000),
                //new NamedThreadFactory("Etian-Web_Pool"),
                new RejectedTaskPolicyWithReport("Etian-Web-Pool"));
        return executor;
    }
}
