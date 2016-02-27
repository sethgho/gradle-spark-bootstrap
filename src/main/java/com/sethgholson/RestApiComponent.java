package com.sethgholson;

import com.sethgholson.controllers.ControllerModule;
import dagger.Component;

@Component(modules = ControllerModule.class)
public interface RestApiComponent {

  void inject(App app);
}
