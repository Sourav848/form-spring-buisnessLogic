package com.form.spring.businesslogic;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.form.spring.common.Config;
import com.form.spring.common.Utils;
import com.form.spring.mongo.ConnectionFactory;
import com.form.spring.server.ServerConfig;

@ComponentScan
@Configuration
public class Application 

{
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        Properties p = Utils.readProperties(ServerConfig.class, "config.properties");
        //Utils.loadMongo(LOG, p);
        System.out.println(Config.MONGOHOST);
        ConnectionFactory.getInstance();
    }
}
