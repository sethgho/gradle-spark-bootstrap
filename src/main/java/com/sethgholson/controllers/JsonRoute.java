package com.sethgholson.controllers;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import spark.Route;

public class JsonRoute implements Route {

  private final Route func;
  private final Gson gson;

  public JsonRoute(Route func) {
    this.func = func;
    this.gson = new Gson();
  }

  @Override public Object handle(Request request, Response response) throws Exception {
    response.type("application/json");
    return gson.toJson(func.handle(request, response));
  }
}
