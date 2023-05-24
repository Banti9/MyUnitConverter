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

public class force_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "newton";
        String toUnit = "micronewton";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "newton",
                "microneton",
                "millinewto",
                "kilonewton",
                "dynes",
                "gram-force"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_force_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.force_relativeLayout);

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
                                et_toUnit.setText(newtonTomicroneton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(newtonTomillinewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(newTokilonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(newtonToDyne(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(newTogramforce(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(micronewtonToNewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(micronetonTomillinewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(micronewtonTokilonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(micronetoTodyne(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(micronetonTogramforce(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(millinewtonTonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(millinewtonTmicronewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(millinewtonTokilonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(millinewtonTodyne(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(millinewtonTogramforce(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kilonewtonTonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(kilonewtonTomicronewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kilonewtonTomillinewto(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kilonewtonTodyne(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(kilonewtonTogramforce(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(dyneTonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(dyneTomicronewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(dyneTomillinewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(dynetokilonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(dyneTogramforce(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(gramforceTonewto(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(gramforceTomicronewto(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(gramforceTomillinewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(gramforceTokilonewton(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(grmaforceTodyne(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(tempInput);
                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(force_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "newton",
                            "microneton",
                            "kilonewton",
                            "dynes"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(force_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "newton",
                            "microneton",
                            "kilonewton",
                            "dynes"
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
        private String newtonTomicroneton(double n) {
            double mn = n*1000000;
            return String.valueOf(mn);
        }

        private String newtonTomillinewton(double celsius) {
            double rankine = celsius *1000;
            return String.valueOf(rankine);
        }

        private String newtonToDyne(double celsius) {
            double newton = celsius *100000;
            return String.valueOf(newton);
        }

        private String newTokilonewton(double n) {
            double delisle = n*0.001;
            return String.valueOf(delisle);
        }

        private String newTogramforce(double celsius) {
            double fahrenheit = (celsius *1011.97162);
            return String.valueOf(fahrenheit);
        }

        //fahrenheit
        private String micronewtonToNewton(double fahrenheit) {
            double kelvin = fahrenheit *0.000001;
            return String.valueOf(kelvin);
        }

        private String micronetonTomillinewton(double fahrenheit) {
            double rankine = fahrenheit *0.001;
            return String.valueOf(rankine);
        }

        private String micronewtonTokilonewton(double fahrenheit) {
            double newton = fahrenheit *(10^-9);
            return String.valueOf(newton);
        }

        private String micronetoTodyne(double fahrenheit) {
            double delisle = fahrenheit*0.1;
            return String.valueOf(delisle);
        }

        private String micronetonTogramforce(double fahrenheit) {
            double celcius = fahrenheit*0.000102;
            return String.valueOf(celcius);
        }

        //Kelvin
        private String millinewtonTonewton(double kelvin) {
            double rankine = kelvin*0.001;
            return String.valueOf(rankine);
        }

        private String millinewtonTmicronewton(double kelvin) {
            double newton = kelvin *1000;
            return String.valueOf(newton);
        }

        private String millinewtonTokilonewton(double kelvin) {
            double delisle =  kelvin*(10^-6);
            return String.valueOf(delisle);
        }

        private String millinewtonTodyne(double kelvin) {
            double celcius = kelvin*100;
            return String.valueOf(celcius);
        }

        private String millinewtonTogramforce(double kelvin) {
            double fahrenheit = (kelvin *0.10972);
            return String.valueOf(fahrenheit);
        }

        //Rankine
        private String kilonewtonTonewton(double rankine) {
            double newton = (rankine *1000);
            return String.valueOf(newton);
        }

        private String kilonewtonTomicronewton(double rankine) {
            double delisle = (rankine) *(10^9);
            return String.valueOf(delisle);
        }

        private String kilonewtonTomillinewto(double rankine) {
            double celcius = (rankine ) *1000000;
            return String.valueOf(celcius);
        }

        private String kilonewtonTodyne(double rankine) {
            double fahrenheit = rankine*(10^8);
            return String.valueOf(fahrenheit);
        }

        private String kilonewtonTogramforce(double rankine) {
            double kelvin = rankine *101972;
            return String.valueOf(kelvin);
        }

        //Newton
        private String dyneTonewton(double newton) {
            double delisle = ( newton) *0.00001;
            return String.valueOf(delisle);
        }

        private String dyneTomicronewton(double newton) {
            double celcius = newton * 10;
            return String.valueOf(celcius);
        }

        private String dyneTomillinewton(double newton) {
            double fahrenheit = newton * 0.01;
            return String.valueOf(fahrenheit);
        }

        private String dynetokilonewton(double newton) {
            double kelvin = newton * (10^-11);
            return String.valueOf(kelvin);
        }

        private String dyneTogramforce(double newton) {
            double rankine = newton * 0.00102;
            return String.valueOf(rankine);
        }

        //Delisle
        private String gramforceTonewto(double delisle) {
            double celcius = delisle *0.009807;
            return String.valueOf(celcius);
        }

        private String gramforceTomicronewto(double delisle) {
            double fahrenheit = delisle *9807;
            return String.valueOf(fahrenheit);
        }

        private String gramforceTomillinewton(double delisle) {
            double kelvin = delisle * 9.80665;
            return String.valueOf(kelvin);
        }

        private String gramforceTokilonewton(double delisle) {
            double rankine = delisle *0.0000098067;
            return String.valueOf(rankine);
        }

        private String grmaforceTodyne(double delisle) {
            double newton =  delisle * 980.665012;
            return String.valueOf(newton);
        }

    }


