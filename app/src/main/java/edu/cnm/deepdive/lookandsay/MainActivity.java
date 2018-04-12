package edu.cnm.deepdive.lookandsay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public static void main(String[] args) {
    ArrayList<String> cheeseString = new ArrayList();
    cheeseString.add("1");
    cheeseString.add("11");
    cheeseString.add("21");
    cheeseString.add("1211");
    cheeseString.add("111221");
    cheeseString.add("312211");
    cheeseString.add("13112221");
    cheeseString.add("1113213211");
    cheeseString.add("31131211131221");
    cheeseString.add("13211311123113112211");
    cheeseString.add("11131221133112132113212221");
    cheeseString.add("3113112221232112111312211312113211");
    cheeseString.add("1321132132111213122112311311222113111221131221");
    cheeseString.add("11131221131211131231121113112221121321132132211331222113112211");
    cheeseString.add("311311222113111231131112132112311321322112111312211312111322212311322113212221");
    Cheese cheese = new Cheese(cheeseString);
     for (String cheesy : cheese) {
       System.out.print(cheesy);
     }
  }
}
