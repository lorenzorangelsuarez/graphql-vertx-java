/**
 * 
 */
package com.mx.lorenzo.training.main;

import io.vertx.core.Vertx;

/**
 * @author lorenzorangelsuarez
 * Helping class that init main verticle
 * Sunday, October 20th, 2019
 */
public class InitVerticle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new MainVerticle());

	}

}
