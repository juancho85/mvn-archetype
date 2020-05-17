package com.juancho85;

import lombok.extern.log4j.Log4j2;

import java.text.MessageFormat;

@Log4j2
public class App {

    public static void main( String[] args ) throws Exception {
        log.info(MessageFormat.format("Hello {0}", "World"));
    }
}
