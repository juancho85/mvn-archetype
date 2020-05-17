#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import lombok.extern.log4j.Log4j2;

import java.text.MessageFormat;

@Log4j2
public class App {

    public static void main( String[] args ) throws Exception {
        log.info(MessageFormat.format("Hello {0}", "World"));
    }
}
