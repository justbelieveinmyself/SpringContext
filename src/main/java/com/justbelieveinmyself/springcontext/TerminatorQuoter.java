package com.justbelieveinmyself.springcontext;

import jakarta.annotation.PostConstruct;
@Profiling
public class TerminatorQuoter implements Quoter {
    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println(message);
    }

    @Override
//    @PostConstruct
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 2");
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
