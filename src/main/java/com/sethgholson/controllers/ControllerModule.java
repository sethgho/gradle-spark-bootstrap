package com.sethgholson.controllers;

import dagger.Module;
import dagger.Provides;

@Module
public class ControllerModule {

  @Provides(type = Provides.Type.SET)
  public Controller provideWidgetController() {
    return new WidgetController("/widget");
  }
}
