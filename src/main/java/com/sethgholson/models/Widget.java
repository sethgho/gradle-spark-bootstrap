package com.sethgholson.models;

import java.util.Arrays;
import java.util.List;

public class Widget {
  public String name;
  public int value;
  public List<String> otherValues;

  public Widget(String name, int value, String... otherValues) {
    this.name = name;
    this.value = value;
    this.otherValues = Arrays.asList(otherValues);
  }
}
