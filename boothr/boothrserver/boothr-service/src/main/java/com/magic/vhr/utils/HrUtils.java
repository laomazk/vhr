package com.magic.vhr.utils;

import com.magic.vhr.model.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtils {
    public static Hr getCurrentHr(){
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
