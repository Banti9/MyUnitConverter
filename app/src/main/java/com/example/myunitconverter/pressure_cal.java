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

public class pressure_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "pascal";
        String toUnit = "atmosphere";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
               "pascal",
                "atmosphere",
                "bar",
                "kgf/cm2",
                "torr"

        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pressure_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.pressure_relativeLayout);

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
                                et_toUnit.setText(pascalToatm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(pascalTobar(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(pascalTokpscm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(pascalTotorr(Double.parseDouble(tempInput)));

                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(atmTopascal(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(atmTobar(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(atmTokgpscm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(atmTotorr(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(barTopascal(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(barToatm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(barTokgpscm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(barTotorr(Double.parseDouble(tempInput)));

                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(torrTopascal(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(torrToatm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(torrTobar(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(torrTokgpscm(Double.parseDouble(tempInput)));

                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(pressure_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "pascal",
                            "atmosphere",
                            "bar",
                            "kgf/cm2",
                            "torr"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(pressure_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "pascal",
                            "atmosphere",
                            "bar",
                            "kgf/cm2",
                            "torr"
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
        private String pascalToatm(double celsius) {
            double kelvin = celsius *0.0000098692;
            return String.valueOf(kelvin);
        }

        private String pascalTobar(double celsius) {
            double rankine = celsius * 0.00001;
            return String.valueOf(rankine);
        }

        private String pascalTokpscm(double celsius) {
            double newton = celsius * 0.000010197;
            return String.valueOf(newton);
        }

        private String pascalTotorr(double celsius) {
            double delisle = celsius * 0.007501;
            return String.valueOf(delisle);
        }

        private String atmTopascal(double celsius) {
            double fahrenheit = (celsius * 101325);
            return String.valueOf(fahrenheit);
        }

        //fahrenheit
        private String atmTobar(double fahrenheit) {
            double kelvin = (fahrenheit *1.01325);
            return String.valueOf(kelvin);
        }

        private String atmTokgpscm(double fahrenheit) {
            double rankine = fahrenheit *1.033227;
            return String.valueOf(rankine);
        }

        private String atmTotorr(double fahrenheit) {
            double newton = (fahrenheit *760);
            return String.valueOf(newton);
        }

        private String barTopascal(double fahrenheit) {
            double delisle = (fahrenheit) * 100000;
            return String.valueOf(delisle);
        }

        private String barToatm(double fahrenheit) {
            double celcius = (fahrenheit ) *0.98623;
            return String.valueOf(celcius);
        }

        //Kelvin
        private String barTokgpscm(double kelvin) {
            double rankine = kelvin *1.019716;
            return String.valueOf(rankine);
        }

        private String barTotorr(double kelvin) {
            double newton = (kelvin*750.061683);
            return String.valueOf(newton);
        }

        private String torrTopascal(double kelvin) {
            double delisle = (kelvin) *133.322368;
            return String.valueOf(delisle);
        }

        private String torrToatm(double kelvin) {
            double celcius = kelvin *0.001316;
            return String.valueOf(celcius);
        }

        private String torrTobar(double kelvin) {
            double fahrenheit = (kelvin *0.001333);
            return String.valueOf(fahrenheit);
        }

        //Rankine
        private String torrTokgpscm(double rankine) {
            double newton = (rankine *0.00136);
            return String.valueOf(newton);
        }



}