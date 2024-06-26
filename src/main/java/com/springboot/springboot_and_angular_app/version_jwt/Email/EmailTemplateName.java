package com.springboot.springboot_and_angular_app.version_jwt.Email;

import lombok.Getter;

@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account")
    ;


    private final String name;
    EmailTemplateName(String name) {
        this.name = name;
    }
}