package com.nagappans.dsalgolab;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length < 1) {
            System.err.println("Please provide an input");
            System.exit(0);
        }
        System.out.println(DigestUtils.sha256Hex(args[0]));
        System.out.println( "Hello World!" );
    }
}
