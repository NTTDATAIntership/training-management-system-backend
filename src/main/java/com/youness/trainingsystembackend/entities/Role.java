package com.youness.trainingmanagementsystem.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_EMPLOYEE,
    ROLE_MANAGER,
    ROLE_ADMIN,
    ROLE_TEAM_LEADER;

    @Override
    public String getAuthority() {
        return name();
    }
}
