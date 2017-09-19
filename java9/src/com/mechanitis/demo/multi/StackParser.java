package com.mechanitis.demo.multi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StackParser implements StackInfo {

    @Override
    public String getStackCount() {
        return "Java 9: " + StackWalker.getInstance()
                                       .walk(Stream::count);
    }

    @Override
    public String getStack() {
        return StackWalker.getInstance()
                          .walk(frames -> frames.map(Object::toString)
                                                .collect(Collectors.joining("\n")));
    }

    public static void main(String[] args) {
        System.out.println(new StackParser().getStackCount());
        System.out.println(new StackParser().getStack());
    }

}
