package com.friendfeed.core.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

import com.friendfeed.core.util.ConfigurationManager;

@WebListener
public class Startup implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0) {

    }

    public void contextInitialized(ServletContextEvent arg0) {
	Twitter twitter = TwitterFactory.getSingleton();

	twitter.setOAuthConsumer(ConfigurationManager.getConsumerKey(), ConfigurationManager.getConsumerSecret());
    }

}
