package com.example.myunitconverter;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Arrays;

public class fuel_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Celcius";
        String toUnit = "Farenheit";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
               "km/l",
                "l/100km",
                "mpg(us)",
                "mpg(UK)"

        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fuel_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.fuel_relativeLayout);

            tv_fromUnit = findViewById(R.id.tv_fromUnit);
            tv_toUnit = findViewById(R.id.tv_toUnit);

            tv_fromUnit.setText(values[0]);
            tv_toUnit.setText(values[0]);

            et_fromUnit = findViewById(R.id.et_fromUnit);
            et_toUnit = findViewById(R.id.et_toUnit);

            cv_convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String tempInput = et_fromUnit.getText().toString();
                    if (tempInput.equals("") || tempInput == null) {
                        et_fromUnit.setError("Please enter some value");
                    } else {
                        if (tv_fromUnit.getText().toString().equals(values[0])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(KmplToL100km(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kmplTompgus(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kmplTompgUK(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(lp100kmTokmpl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(lp100kmTompgus(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(lp100kmTompguk(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mpgusTokpl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mpgusTolp100km(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mpgusTompguk(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mpgukTokmpl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mpgukTolp100km(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(mpgukTompgus(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);

                            } }

                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(fuel_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "km/l",
                            "l/100km",
                            "mpg(us)",
                            "mpg(UK)"

                    };

                    builder.setSingleChoiceItems(
                            flowers, // Items list
                            -1, // Index of checked item (-1 = no selection)
                            new DialogInterface.OnClickListener() // Item click listener
                            {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
// Get the alert dialog selected item's text
                                    String selectedItem = Arrays.asList(flowers).get(i);
                                    toUnit = selectedItem;
                                    tv_toUnit.setText(toUnit);

                                }
                            });

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
// Just dismiss the alert dialog after selection
// Or do something now
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog dialog = builder.create();

// Finally, display the alert dialog
                    dialog.show();

                }
            });

            cv_fromUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(fuel_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "km/l",
                            "l/100km",
                            "mpg(us)",
                            "mpg(UK)"

                    };

                    builder.setSingleChoiceItems(
                            flowers, // Items list
                            -1, // Index of checked item (-1 = no selection)
                            new DialogInterface.OnClickListener() // Item click listener
                            {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {


// Get the alert dialog selected item's text
                                    String selectedItem = Arrays.asList(flowers).get(i);
                                    fromUnit = selectedItem;
                                    tv_fromUnit.setText(fromUnit);

                                }
                            });

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
// Just dismiss the alert dialog after selection
// Or do something now
                            dialogInterface.dismiss();
                        }
                    });

                    AlertDialog dialog = builder.create();

// Finally, display the alert dialog
                    dialog.show();

                }
            });

        }

        //celcius
        private String lp100kmTokmpl(double celsius) {
            double kelvin = celsius *100;
            return String.valueOf(kelvin);
        }

        private String lp100kmTompgus(double celsius) {
            double rankine = celsius * 235.2145;
            return String.valueOf(rankine);
        }

        private String lp100kmTompguk(double celsius) {
            double newton = celsius *282.481;
            return String.valueOf(newton);
        }

        private String kmplTompgus(double celsius) {
            double delisle = celsius * 2.352145;
            return String.valueOf(delisle);
        }

        private String kmplTompgUK(double celsius) {
            double fahrenheit = (celsius *2.82481);
            return String.valueOf(fahrenheit);
        }



        private String KmplToL100km(double fahrenheit) {
            double rankine = fahrenheit *100;
            return String.valueOf(rankine);
        }

        private String mpgusTokpl(double fahrenheit) {
            double newton = (fahrenheit *0.425144);
            return String.valueOf(newton);
        }

        private String mpgusTolp100km(double fahrenheit) {
            double delisle = (fahrenheit) * 235.2145;
            return String.valueOf(delisle);
        }

        private String mpgukTompgus(double fahrenheit) {
            double celcius = (fahrenheit ) * 0.832674;
            return String.valueOf(celcius);
        }

        //Kelvin
        private String mpgusTompguk(double kelvin) {
            double rankine = kelvin * 1.200951;
            return String.valueOf(rankine);
        }

        private String mpgukTokmpl(double kelvin) {
            double newton = (kelvin*0.354006);
            return String.valueOf(newton);
        }

        private String mpgukTolp100km(double kelvin) {
            double delisle = ( kelvin) *282.481;
            return String.valueOf(delisle);
        }




    }
