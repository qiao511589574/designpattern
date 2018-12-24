package com.study.designpattern.creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模板");
        for(int i=0;i<10;i++){
            Mail mailClone = (Mail) mail.clone();
            mailClone.setName("姓名"+i);
            mailClone.setAddressNumber("姓名"+i+"@qq.com");
            mailClone.setContent("祝你圣诞节快乐");
            MailUtil.sendMail(mailClone);
        }
        MailUtil.saveOriginMailRecord(mail);

    }
}
