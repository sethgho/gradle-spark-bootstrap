package com.sethgholson;

import com.sethgholson.controllers.ControllerModule;

public class Main {

  public static void main(String[] args) {
    RestApiComponent component = com.sethgholson.DaggerRestApiComponent.builder()
        .controllerModule(new ControllerModule())
        .build();
    App app = component.createApp();
    app.start();
  }
}