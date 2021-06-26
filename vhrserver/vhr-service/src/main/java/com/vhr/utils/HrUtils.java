package com.vhr.utils;

import org.springframework.security.core.context.SecurityContextHolder;

import com.vhr.model.Hr;

public class HrUtils {

    public static Hr getCurrentHr(){
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
