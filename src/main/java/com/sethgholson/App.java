package com.sethgholson;

import com.sethgholson.controllers.Controller;
import com.sethgholson.controllers.ControllerModule;
import java.util.Set;
import javax.inject.Inject;
import spark.Spark;

public class App {

  @Inject Set<Controller> controllers;

  public App() {
    RestApiComponent component = com.sethgholson.DaggerRestApiComponent.builder()
        .controllerModule(new ControllerModule())
        .build();
    component.inject(this);
  }

  public void start() {
    Spark.staticFileLocation("/public");
    for(Controller c : controllers) {
      c.init();
    }
  }
}
