package com.zqh.usequartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 描述: 打印任何内容的Job（作业或者任务）
 * 作者：zqh
 * 时间：2020/8/10 15:00
 * 电话：15657979926
 * 邮箱：2855942332@qq.com
 */
public class PrintWordsJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        String printTime = new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date());
        System.out.println("PrintWordsJob start at:"+ printTime+",prints: Hello Job-"+new Random().nextInt(100));
    }
}
