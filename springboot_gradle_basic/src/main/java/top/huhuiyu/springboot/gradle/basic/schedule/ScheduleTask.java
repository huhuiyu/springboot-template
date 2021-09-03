package top.huhuiyu.springboot.gradle.basic.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * 
 * @author 胡辉煜
 */
@Component
public class ScheduleTask {

  private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class);

  @Scheduled(initialDelay = 5 * 1000, fixedDelay = 10 * 1000)
  public void logInfo() {
    log.debug("定时日志任务");
  }

}