package com.sethgholson;

import com.sethgholson.controllers.Controller;
import com.sethgholson.controllers.WidgetController;
import java.util.ArrayList;
import java.util.List;

public class App {
  static List<Controller> controllers;

  public static void main(String[] args) {
    controllers = new ArrayList<>();
    controllers.add(new WidgetController("/widget"));
    for (Controller c : controllers) {
      c.init();
    }
  }
}