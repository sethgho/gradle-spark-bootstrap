package com.sethgholson.controllers;

import com.sethgholson.models.Widget;
import spark.Request;
import spark.Response;
import spark.Spark;

public class WidgetController extends Controller {

  public WidgetController(String pathRoot) {
    super(pathRoot);
  }

  @Override
  public void init() {
    Spark.get(pathRoot, new JsonRoute(this::list));
  }

  private Widget list(Request request, Response response) {
    return new Widget("test widget", 32, "test", "widge");
  }
}
