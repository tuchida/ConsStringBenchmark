package com.tuchida.consstring.benchmark;

import com.tuchida.consstring.*;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@Fork(5)
@State(Scope.Thread)
public class MyBenchmark {
    String s = "aabbccddeeff";
    int n = 10;

    String concat(Concatenater c) {
        CharSequence cs = s;
        for (int i = 0; i < n; i++) {
            cs = c.concat(cs, cs);
        }
        return cs.toString();
    }

    @Benchmark
    public String testMethod_GetChars() {
        return concat(new GetCharsConcatenater());
    }

    @Benchmark
    public String testMethod_StringBulder() {
        return concat(new StringBuilderConcatenater());
    }
}
