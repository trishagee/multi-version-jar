package com.mechanitis.demo.multi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StackParser implements StackInfo {
    @Override
    public String getStackCount() {
        return "Java 8: " + Thread.currentThread()
                                  .getStackTrace().length;
    }

    @Override
    public String getStack() {
        return Arrays.stream(Thread.currentThread()
                                   .getStackTrace())
                     .map(element -> element.toString())
                     .collect(Collectors.joining("\n"));
    }
}
