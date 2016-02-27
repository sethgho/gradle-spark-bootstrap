package com.sethgholson;

import com.sethgholson.controllers.Controller;
import com.sethgholson.controllers.WidgetController;
import spark.Spark;

public class App {
  static Controller[] controllers = new Controller[]{
      new WidgetController("/widget")
  };

  public static void main(String[] args) {
    Spark.staticFileLocation("/public");
    for (Controller c : controllers) {
      c.init();
    }
  }
}