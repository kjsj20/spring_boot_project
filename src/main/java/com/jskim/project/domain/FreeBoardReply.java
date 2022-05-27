package com.jskim.project.domain;

import lombok.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FreeBoardReply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long free_board_id;
    @NonNull
    private String writer_id;
    @NonNull
    private String writer_name;
    @NonNull
    private String writer_ip;
    @NonNull
    private String content;
    private Long like_count;
    private String register_timestamp;
    private String update_timestamp;
    private String delete_timestamp;
}
