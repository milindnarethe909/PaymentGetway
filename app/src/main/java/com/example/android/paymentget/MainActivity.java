package com.example.android.paymentget;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button bt_pay;

//    private PayUmoneySdkInitializer.PaymentParam mPaymentParams;
//    int MY_SOCKET_TIMEOUT_MS = 30000; // 30 seconds. You can change it

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_pay=(Button)findViewById(R.id.bt_pay);
        //Payment gateway
//        PPConfig.getInstance().disableSavedCards(false);
//        PPConfig.getInstance().disableNetBanking(false);
//        PPConfig.getInstance().disableWallet(false);

        bt_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
startActivity(new Intent(getApplicationContext(),pAYActivity.class));
finish();
            }
        });
    }
}
