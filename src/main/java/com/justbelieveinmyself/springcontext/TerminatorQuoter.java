package com.justbelieveinmyself.springcontext;

import com.justbelieveinmyself.springcontext.annotations.InjectRandomInt;
import com.justbelieveinmyself.springcontext.annotations.PostProxy;

//@Profiling
//@DeprecatedClass(newImpl = Term2000.class)
public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 2, max = 15)
    private int repeat;

    public TerminatorQuoter() {
        System.out.println("Phase 1");
        System.out.println(message);
    }

    @Override
//    @PostConstruct
    @PostProxy
    public void sayQuote() {
        System.out.println("Phase 2");
        System.out.println(message+  " --- " + repeat);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
