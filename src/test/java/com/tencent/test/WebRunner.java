package com.tencent.test;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.nio.SelectChannelConnector;
import org.mortbay.jetty.webapp.WebAppContext;

public class WebRunner {
	private static String WEB_HOME = "WebRoot";
	private static int JETTY_PORT = 8080;
	
	public static void main(String[] args) throws Exception {
		Server server = new Server();

		Connector connector = new SelectChannelConnector();
		connector.setPort(JETTY_PORT);
		server.setConnectors(new Connector[]{connector});

		WebAppContext webapp = new WebAppContext();
		webapp.setWar(WEB_HOME);
		webapp.setContextPath("/");

		server.setHandler(webapp);
		server.start();
		
	}
}
