package com.tqc.gdd01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import java.time.Instant;

//import android.widget.TextView;

public class GDD01 extends Activity
{
  private EditText etheight;
  private EditText etweight;
  private RadioButton rb1;
  private RadioButton rb2;

//  private TextView showbmi;

  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    etheight = findViewById(R.id.edHeight);
    etweight = findViewById(R.id.edWeight);

//    showbmi = findViewById(R.id.tvShowBMI);


    Button b1 = (Button) findViewById(R.id.button1);

    b1.setOnClickListener(new Button.OnClickListener()
    {
      public void onClick(View v)
      {

        double h = Double.parseDouble(etheight.getText().toString());
        double w = Double.parseDouble(etweight.getText().toString());

//        if(etheight.getText().toString().isEmpty()||etweight.getText().toString().isEmpty()){
//          showbmi.setText("請完整輸入身高體重的數值");
//        }else {
//          double h = Double.parseDouble(etheight.getText().toString());
//          double w = Double.parseDouble(etweight.getText().toString());
//          double bmi = w /((h)*(h));
//          showbmi.setText(String.valueOf(bmi));
//
//        }





        Intent intent = new Intent(GDD01.this,GDD01_child.class);
        Bundle bundle = new Bundle();
        bundle.putDouble("height",h);
        bundle.putDouble("weight",w);
        startActivity(intent);


        //從輸入介面中取出了的身高、體重值，要將身高、體重值傳送給 child_Activity 後作計算

        //這些附加在 Intent 上的訊息都儲存在 Bundle 物件中

        //透過「intent.putExtras(bundle)」敘述，將「bundle」 物件附加在 Intent 上，隨著 Intent 送出而送出

      }
    });
  }

}
