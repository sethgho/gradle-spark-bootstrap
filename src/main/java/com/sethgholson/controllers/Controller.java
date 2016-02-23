package com.sethgholson.controllers;

public abstract class Controller {

  protected final String pathRoot;

  public Controller(String pathRoot) {
    this.pathRoot = pathRoot;
  }

  /**
   * The controller's opportunity to initialize its own routes.
   */
  public abstract void init();

}
