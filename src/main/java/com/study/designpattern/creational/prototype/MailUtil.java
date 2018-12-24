package com.study.designpattern.creational.prototype;

import java.text.MessageFormat;

public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向 {0} 的邮箱 {1} 发送邮件《{2}》成功";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getAddressNumber(),mail.getContent()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
