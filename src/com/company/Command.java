package com.company;

import java.util.regex.Pattern;

public enum Command {
    //TODO

    TURN_SIDE,
    PRINT_SIDE,
    IS_SOLVED,
    SHUFFLE_CUBE,
    RESET_CUBE,
    CREATE_NEW_CUBE,
    QUIT,
    NULL;

    private Pattern pattern;

    public Command(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

}
