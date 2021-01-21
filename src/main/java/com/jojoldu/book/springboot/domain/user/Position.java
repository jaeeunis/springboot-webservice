package com.jojoldu.book.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Position {

    DIRECTOR("ROLE_DIRECTOR", "관리"),
    NONE("ROLE_NONE", "사원");

    private final String key;
    private final String title;

}
