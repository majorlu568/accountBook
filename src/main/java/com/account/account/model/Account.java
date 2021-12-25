package com.account.account.model;

import lombok.Data;

import java.util.Date;

@Data
public class Account {
    private String id;
    private Date create_time;
    private String createUser;
    private Date updateTime;
    private String updateUser;
    private String belong;//所属账本
    private Integer consumptionSum;//消费金额
    private String address;
    private String bigType;
    private String smallType;
    private String channel;
}
