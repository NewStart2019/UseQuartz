package com.zqh.usequartz.schedule;

import com.zqh.usequartz.job.PrintWordsJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

/**
 * 描述: 执行任务
 * 作者：zqh
 * 时间：2020/8/10 15:06
 * 电话：15657979926
 * 邮箱：2855942332@qq.com
 */
public class MyScheduler {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
        // 1、创建调度器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler =schedulerFactory.getScheduler();// 获取调度器

        // 2、创建JobDetail实例(任务)，并与PrintWordsJob类绑定(Job执行内容)
        JobDetail jobDetail = JobBuilder.newJob(PrintWordsJob.class)
                .withIdentity("job1","group1").build();

        // 3、构建Trigger实例(触发器),每隔1s执行一次
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","triggerGroup1")
                .startNow() // 立即生效
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(1) // 每一秒执行一次
                        .repeatForever()          // 重复执行无数次
                ).build();

        // 4、执行
        scheduler.scheduleJob(jobDetail,trigger);
        System.out.println("-------------------schedule start------------------------");
        scheduler.start();
        //睡眠
        TimeUnit.MINUTES.sleep(1);
        scheduler.shutdown();
        System.out.println("--------scheduler shutdown ! ------------");
    }
}
