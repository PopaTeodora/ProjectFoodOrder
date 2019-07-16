package com.example.workpls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button pizzaButton, burgerButton, pastaButton, cakeButton, juiceButton;

    String choices = " ";
    Double price = 0.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        burgerButton = (Button) findViewById(R.id.burgerButton);
        pastaButton = (Button) findViewById(R.id.pastaButton);
        cakeButton = (Button) findViewById(R.id.cakeButton);
        juiceButton = (Button) findViewById(R.id.juiceButton);
    }

    public void add_to_list(View view)
    {
        if(view == findViewById(R.id.pizzaButton ))
        {
            choices = choices + "Pizza" + "\n";
            price = price + 7.00;
        }
        else if (view == findViewById(R.id.burgerButton))
        {
            choices = choices + "Burger" + "\n";
            price = price + 5.00;
        }
        else if (view == findViewById(R.id.pastaButton))
        {
            choices = choices + "Pasta" + "\n";
            price = price + 4.00;
        }
        else if (view == findViewById(R.id.cakeButton))
        {
            choices = choices + "Cake" + "\n";
            price = price + 3.00;
        }
        else if (view == findViewById(R.id.juiceButton))
        {
            choices = choices + "Juice" + "\n";
            price = price + 2.00;
        }

    }

    public void submit(View view)

    {
        Intent i = new Intent(MainActivity.this, PlaceOrder.class  );
        Bundle bundle = new Bundle();
        bundle.putString("choices", choices);
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i);
    }


}
