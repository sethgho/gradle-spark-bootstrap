package com.sethgholson;

import com.sethgholson.controllers.Controller;
import java.util.Set;
import javax.inject.Inject;
import spark.Spark;

public class App {

  private final Set<Controller> controllers;

  @Inject public App(Set<Controller> controllers) {
    this.controllers = controllers;
  }

  public void start() {
    Spark.staticFileLocation("/public");
    for (Controller c : controllers) {
      c.init();
    }
  }
}
