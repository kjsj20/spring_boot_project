package com.jskim.project.domain;

import lombok.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notice_id;
    @NonNull
    private String writer_id;
    @NonNull
    private String writer_name;
    @NonNull
    private String writer_ip;
    @NonNull
    private String content;
    private Long view_count;
    private Long like_count;
    private Long bookmark_count;
    private String register_timestamp;
    private String update_timestamp;
    private String delete_timestamp;
}
