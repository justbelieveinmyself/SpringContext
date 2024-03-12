package com.justbelieveinmyself.springcontext;

public class Term2000 extends TerminatorQuoter implements Quoter {
    @Override
    public void sayQuote() {
        System.out.println("Meow");
    }
}
