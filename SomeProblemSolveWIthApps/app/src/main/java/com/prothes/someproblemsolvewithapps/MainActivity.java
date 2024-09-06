package com.prothes.someproblemsolvewithapps;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.pdfview.PDFView;

public class MainActivity extends AppCompatActivity {
    private PDFView pdfView;
    private TextInputEditText inputField1,inputField2,inputField3,inputField4,inputField5,inputField6,inputField7,inputField8,inputField9,inputField10,inputField111,inputField11;
    private AppCompatButton problemBtn1,problemBtn2,problemBtn3,problemBtn4,problemBtn5,problemBtn6,problemBtn7,problemBtn8,problemBtn9,problemBtn10,problemBtn11,resetBtn;
    private TextView display1,display2,display3,display4,display5,display6,display7,display8,display9,display10,display11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setStatusBarColor(getColor(R.color.sky));
        this.getWindow().setNavigationBarColor(getColor(R.color.sky));
        setContentView(R.layout.activity_main);

        pdfView = findViewById(R.id.pdfView);
        inputField1 = findViewById(R.id.inputField1);
        inputField2 = findViewById(R.id.inputField2);
        inputField3 = findViewById(R.id.inputField3);
        inputField4 = findViewById(R.id.inputField4);
        inputField5 = findViewById(R.id.inputField5);
        inputField6 = findViewById(R.id.inputField6);
        inputField7 = findViewById(R.id.inputField7);
        inputField8 = findViewById(R.id.inputField8);
        inputField9 = findViewById(R.id.inputField9);
        inputField10 = findViewById(R.id.inputField10);
        inputField111 = findViewById(R.id.inputField111);
        inputField11 = findViewById(R.id.inputField11);
        problemBtn1 = findViewById(R.id.problemBtn1);
        problemBtn2 = findViewById(R.id.problemBtn2);
        problemBtn3 = findViewById(R.id.problemBtn3);
        problemBtn4 = findViewById(R.id.problemBtn4);
        problemBtn5 = findViewById(R.id.problemBtn5);
        problemBtn6 = findViewById(R.id.problemBtn6);
        problemBtn7 = findViewById(R.id.problemBtn7);
        problemBtn8 = findViewById(R.id.problemBtn8);
        problemBtn9 = findViewById(R.id.problemBtn9);
        problemBtn10 = findViewById(R.id.problemBtn10);
        problemBtn11 = findViewById(R.id.problemBtn11);
        resetBtn = findViewById(R.id.resetBtn);
        display1 = findViewById(R.id.display1);
        display2 = findViewById(R.id.display2);
        display3 = findViewById(R.id.display3);
        display4 = findViewById(R.id.display4);
        display5 = findViewById(R.id.display5);
        display6 = findViewById(R.id.display6);
        display7 = findViewById(R.id.display7);
        display8 = findViewById(R.id.display8);
        display9 = findViewById(R.id.display9);
        display10 = findViewById(R.id.display10);
        display11 = findViewById(R.id.display11);
        pdfView.fromAsset("problems.pdf")
                .show();




        problemBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField1.getText().toString();
                if (getData.length()>0){
                    int num,sum = 0;
                    num = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=10; i++){
                        sum = num*i;
                        stringBuilder.append(num+"*"+i+" = "+sum+"\n");
                    }
                    display1.setText("Multiplication : \n\n"+stringBuilder);
                }else{
                    display1.setText(null);
                    inputField1.setError("Empty");
                }
            }
        });


        problemBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField2.getText().toString();
                if (getData.length()>0){
                    int num,sum=0;
                    num = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num; i++){
                        stringBuilder.append((i*2)+" ");
                        sum = (sum + (i*2));
                    }
                    display2.setText("The Even Number are : \n"+stringBuilder + "\n\n" +"The sum of all this even number : \n" + sum);
                }else{
                    display2.setText(null);
                    inputField2.setError("Empty");
                }
            }
        });


        problemBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField3.getText().toString();
                if (getData.length()>0){
                    long sum = 0,x = 9;
                    int num;
                    num = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i =1; i<=num; i++){
                        stringBuilder.append(""+x+"+");
                        sum +=x;
                        x = x*10+9;
                    }
                    display3.setText("The Series : \n"+stringBuilder + "\n\nThe Sum of series: \n"+sum);
                }else{
                    display3.setText(null);
                    inputField3.setError("Empty");
                }
            }
        });

        problemBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField4.getText().toString();
                if (getData.length()>0){
                    int num,sum=0,x=0;
                    num = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num;i++){
                        x = i*i;
                        stringBuilder.append(x+" ");
                        sum = (sum + (i*i));
                    }
                    display4.setText("Square Series is : \n"+stringBuilder+"\n\nSquare Series Sum is :\n"+sum);
                }else{
                    display4.setText(null);
                    inputField4.setError("Empty");
                }
            }
        });


        problemBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField5.getText().toString();
                if (getData.length()>0){
                    int num,orginal,remainder,reverse=0;
                    num = Integer.parseInt(getData);
                    orginal = num;
                    // Any Number Reverce System......
                    while (num != 0){
                        remainder = num%10;
                        reverse = reverse * 10 + remainder;
                        num = num / 10;
                    }
                    if (orginal == reverse){
                        display5.setText(orginal+" : is a Palindrome Number. Cause This Reverse Number is Same : " + reverse);
                    }else{
                        display5.setText(orginal+" : is Not a Palindrome Number. Cause This Reverse Number is Not Same : " + reverse);
                    }

                }else{
                    display5.setText(null);
                    inputField5.setError("Empty");
                }
            }
        });


        problemBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getStr = inputField6.getText().toString();

                if (getStr.length()>0){
                    // String Reverse
                    String getData = getStr.toLowerCase();
                    String orginalData,reverceStr = "";
                    orginalData = getData;
                    char extractChar;
                    for (int i=0; i<getData.length(); i++){
                        extractChar = getData.charAt(i);
                        reverceStr = extractChar + reverceStr;
                    }

                    if (orginalData.equals(reverceStr)){
                        display6.setText(orginalData+" - This String is Palindrome. Cause This Reverse String is Same : - "+reverceStr);
                    }else {
                        display6.setText(orginalData+" - This String is not Palindrome. Cause This Reverse String is Not Same : - "+reverceStr);
                    }

                }else{
                    display6.setText(null);
                    inputField6.setError("Empty");
                }
            }
        });

        problemBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField7.getText().toString();
                if (getData.length()>0){
                    int num,sum = 0,temp,remainder;
                    num = Integer.parseInt(getData);
                    temp = num;
                    while (temp != 0){
                        remainder = temp%10;
                        sum = sum + remainder;
                        temp = temp / 10;
                    }
                    display7.setText(num+" : This integer number sum of digit is : "+sum);
                }else{
                    display7.setText(null);
                    inputField7.setError("Empty");
                }
            }
        });

        problemBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField8.getText().toString();
                if (getData.length()>0){
                    int num,sum=0,first,second=1,third=0;
                    num = Integer.parseInt(getData);
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int i=1; i<=num; i++){
                        stringBuilder.append(third+" ");
                        sum = sum + third;
                        first = second;
                        second = third;
                        third = first+second;
                    }
                    display8.setText(stringBuilder + "\n\n" +"Sum of Total Number is : "+ sum);
                }else {
                    inputField8.setError("Empty");
                    display8.setText(null);
                }
            }
        });


        problemBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField9.getText().toString();
                if (getData.length()>0){
                    float store,num;
                    num = Float.parseFloat(getData);
                    store = ((num - 32) * 5/9);
                    if (store==0){
                        display9.setText(num+" °F = "+store+" °C");
                    }else{
                        display9.setText(num+" °F = "+store+" °C" + " (almost)");
                    }
                }else {
                    inputField9.setError("Empty");
                    display9.setText(null);
                }
            }
        });

        problemBtn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getData = inputField10.getText().toString();
                if (getData.length()>0){
                    float store,num;
                    num = Float.parseFloat(getData);
                    store = (float) ((num * 1.8)+32);
                    if (store==0){
                        display10.setText(num+" °C = "+store+" °F");
                    }else{
                        display10.setText(num+" °C = "+store+" °F" + " (almost)");
                    }
                }else {
                    inputField10.setError("Empty");
                    display10.setText(null);
                }
            }
        });


        problemBtn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getFromYear = inputField11.getText().toString();
                String getToYear = inputField111.getText().toString();
                if (getFromYear.length()>0 && getToYear.length()>0){
                    int fromYearNum = Integer.parseInt(getFromYear);
                    int toYearNum = Integer.parseInt(getToYear);
                    if (fromYearNum<toYearNum || fromYearNum == toYearNum){
                        StringBuilder stringBuilder = new StringBuilder();
                        for (int i = fromYearNum; i<=toYearNum; i++){
                            if ( (i%400 == 0) || (i%4 == 0 && i%100 != 0) ){
                                stringBuilder.append(i+" ");
                            }
                        }
                        if (stringBuilder.length()>0){
                            display11.setText("From "+fromYearNum+" to "+toYearNum+" - Leap Year are : \n\n"+stringBuilder);
                        }else{
                            display11.setText("From "+fromYearNum+" to "+toYearNum+" - Leap Year are : \n\n"+"No Leap Year");
                        }
                    }else{
                        myToast("Must be 1st Input small than 2nd Input");
                        display11.setText(null);
                    }

                } else if (getFromYear.length()>0) {
                    inputField11.setError(null);
                    if (getToYear.length()>0){
                        inputField111.setError(null);
                    }else{
                        inputField111.setError("Empty");
                        display11.setText(null);
                    }
                } else if (getToYear.length()>0) {
                    inputField111.setError(null);
                    if (getFromYear.length()>0){
                        inputField11.setError(null);
                    }else{
                        inputField11.setError("Empty");
                        display11.setText(null);
                    }
                }else{
                    inputField111.setError("Empty");
                    inputField11.setError("Empty");
                    display11.setText(null);
                }
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display1.setText(null);
                display2.setText(null);
                display3.setText(null);
                display4.setText(null);
                display5.setText(null);
                display6.setText(null);
                display7.setText(null);
                display8.setText(null);
                display9.setText(null);
                display10.setText(null);
                display11.setText(null);
                inputField1.setText(null);
                inputField2.setText(null);
                inputField3.setText(null);
                inputField4.setText(null);
                inputField5.setText(null);
                inputField6.setText(null);
                inputField7.setText(null);
                inputField8.setText(null);
                inputField9.setText(null);
                inputField10.setText(null);
                inputField111.setText(null);
                inputField11.setText(null);
                inputField1.setError(null);
                inputField2.setError(null);
                inputField3.setError(null);
                inputField4.setError(null);
                inputField5.setError(null);
                inputField6.setError(null);
                inputField7.setError(null);
                inputField8.setError(null);
                inputField9.setError(null);
                inputField10.setError(null);
                inputField111.setError(null);
                inputField11.setError(null);
            }
        });
    }
    //===========================================================================================================================================

    public void myToast(String toastData){
        Toast.makeText(this, ""+toastData, Toast.LENGTH_SHORT).show();
    }


    /** @noinspection deprecation*/
    @Override
    public void onBackPressed() {
        if (isTaskRoot()){
            AlertDialog alertDialog = new AlertDialog.Builder(this)
                    .setTitle("Warning !!!")
                    .setMessage("Do you want to exit this app ?")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .show();
            alertDialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(getColor(R.color.sky));
            alertDialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(getColor(R.color.sky));
        }else {
            super.onBackPressed();
        }
    }
}