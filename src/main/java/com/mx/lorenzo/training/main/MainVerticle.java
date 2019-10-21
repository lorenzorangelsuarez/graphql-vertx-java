package com.mx.lorenzo.training.main;

import java.util.Map;

import graphql.ExecutionInput;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;

/*
 * Class that allows to build a web server with VertX
 * Author Lorenzo Rangel Suárez
 * Sunday, October 20th, 2019
 * */
		
public class MainVerticle extends AbstractVerticle {
	
	/*
	 * The start method is called when this Verticle is deployed. 
	 */
	public void start(Future<Void> future) {
		
		Router router = Router.router(vertx);
		router.route("/").handler(routingContext ->{
			routingContext.request().bodyHandler(routingHandler -> {
				String query = routingHandler.toString();
				handleQuery(routingContext, query);
			});
		});
		
		
		vertx.createHttpServer()
		.requestHandler(handler -> {
			handler.response().end("<h1>Welcome to the App</h1>");
		})
		.listen(8080, result ->{
			if(result.succeeded()) {
				future.complete();
			}
			else {
				future.fail("Something went wrong: " + future.cause());
			}
		});
	}
	
	private void handleQuery (RoutingContext routingContext, String json) {
		
		String query = null;
		JsonObject queryJson = new JsonObject(json);
		query = queryJson.getString("query");
		
		ExecutionInput input = new ExecutionInput(query, null, queryJson, null, extractVariables(queryJson));
		
	}
	
	private Map<String, Object> extractVariables(JsonObject request){
		return null;
	}

}
