package com.company;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Command {

    TURN_SIDE("turn ([0-5]) (cw|acw)") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            int num = Integer.parseInt(matcher.group(1));
            boolean turnDir = true;
            if (matcher.group(2).matches("cw")) {
                turnDir = true;
            } else if (matcher.group(2).matches("acw")) {
                turnDir = false;
            }

            System.out.println(controller.turnSide(num, turnDir));
        }
    },
    PRINT_SIDE("print ([0-5])") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println(controller.getSideAsString(Integer.parseInt(matcher.group(1))));
        }
    },
    IS_SOLVED("solved") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println(controller.cubeIsSolved());
        }
    },
    SHUFFLE_CUBE("shuffle (\\d+)") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println(controller.shuffle(Integer.parseInt(matcher.group(1))));
        }
    },
    RESET_CUBE("reset") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println(controller.resetCube());
        }
    },
    CREATE_NEW_CUBE("new (\\d+)") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println(controller.newCube(Integer.parseInt(matcher.group(1))));
        }
    },
    QUIT("quit") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            isRunning = false;
            System.out.println("quited programm");
        }
    },
    NULL("") {
        @Override
        protected void execute(MatchResult matcher, Controller controller) {
            System.out.println("nothing entered");
        }
    };

    private static boolean isRunning = true;

    private Pattern pattern;

    Command(String pattern) {
        this.pattern = Pattern.compile(pattern);
    }

    public static Command excecuteFirstMatching(String input, Controller controller) throws RetardException {
        for (Command command : Command.values()) {
            Matcher matcher = command.pattern.matcher(input);
            if (matcher.matches()) {
                command.execute(matcher, controller);
                return command;
            }
        }
        throw new RetardException("invalid cmd");
    }

    protected abstract void execute(MatchResult matcher, Controller controller);

    public boolean isRunning() {
        return isRunning;
    }
}
