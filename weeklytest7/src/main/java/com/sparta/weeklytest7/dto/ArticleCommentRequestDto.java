package com.sparta.weeklytest7.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleCommentRequestDto {
    private Long idx;
    private String comment;
}