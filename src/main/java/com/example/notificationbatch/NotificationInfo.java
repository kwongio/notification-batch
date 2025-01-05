package com.example.notificationbatch;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;


@Setter
@Getter
public class NotificationInfo {

    private int followId;
    private String email;
    private String username;
    private String followerName;
    private int followerId;
    private ZonedDateTime followDateTime;

}
