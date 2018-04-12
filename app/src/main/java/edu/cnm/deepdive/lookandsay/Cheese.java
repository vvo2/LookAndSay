package edu.cnm.deepdive.lookandsay;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

public class Cheese implements Iterable<String> {

  private ArrayList<String> cheese = new ArrayList<String>();

  public Cheese(ArrayList cheese){
    this.cheese = cheese;
  }

  public ArrayList getCheese() {
    return cheese;
  }
  @NonNull
  @Override
  public Iterator<String> iterator() {
    return null;
  }
}
