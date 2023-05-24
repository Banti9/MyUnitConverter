
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

public class resistance_cal extends AppCompatActivity {

        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "ohm";
        String toUnit = "milliohm";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "ohm",
                "microohm",
                "milliohm",
                "kiloohm",
                "megaOhm",
                "gigaohm"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_resistance_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.resistance_relativeLayout);

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
                                et_toUnit.setText(ohmToMicroohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(ohmToMilloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(ohmTokiloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ohmTomegaohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ohmTogigaohm(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText( microohmToohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(microohmTomilliohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(microohmTokiloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(microohmTomegaohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(microohmTogigaohm(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(milliohmToohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(milliohmTomicroohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(milliohmTokiloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(milliohmTomegaohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(milliohmTogigaohm(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kiloohmToohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(kiloohmTomicroohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kiloohmTomilliohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kiloohmTomegaohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(kiloohmTogigaohm(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(megaohmToohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(megaohmTomicroohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(megaohmTomilliohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(megaohmTokiloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(megaohmTogigaohm(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(gigaohmToohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(gigaohmTomicroohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(gigaohmTomilliohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(gigaohmTokiloohm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(gigaohmTomegaohm(Double.parseDouble(tempInput)));
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(resistance_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "ohm",
                            "microohm",
                            "milliohm",
                            "kiloohm",
                            "megaOhm",
                            "gigaohm"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(resistance_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "ohm",
                            "microohm",
                            "milliohm",
                            "kiloohm",
                            "megaOhm",
                            "gigaohm"
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
        private String ohmToMicroohm(double celsius) {
            double kelvin = celsius* 1000000;
            return String.valueOf(kelvin);
        }

        private String ohmTokiloohm(double celsius) {
            double rankine = celsius *0.001;
            return String.valueOf(rankine);
        }

        private String ohmToMilloohm(double celsius) {
            double newton = celsius *1000;
            return String.valueOf(newton);
        }

        private String ohmTomegaohm(double celsius) {
            double delisle = celsius *0.000001;
            return String.valueOf(delisle);
        }

        private String ohmTogigaohm(double celsius) {
            double fahrenheit = (celsius * 0.000000001);
            return String.valueOf(fahrenheit);
        }

        //fahrenheit
        private String microohmToohm(double fahrenheit) {
            double kelvin = fahrenheit *1000;
            return String.valueOf(kelvin);
        }

        private String microohmTomilliohm(double fahrenheit) {
            double rankine = fahrenheit*0.001;
            return String.valueOf(rankine);
        }

        private String microohmTokiloohm(double fahrenheit) {
            double newton = (fahrenheit*0.000000001);
            return String.valueOf(newton);
        }

        private String microohmTomegaohm(double fahrenheit) {
            double delisle = (fahrenheit) * (10^-12);
            return String.valueOf(delisle);
        }

        private String microohmTogigaohm(double fahrenheit) {
            double celcius = (fahrenheit )*(10^-15);
            return String.valueOf(celcius);
        }

        //Kelvin
        private String milliohmToohm(double kelvin) {
            double rankine = kelvin *0.0001;
            return String.valueOf(rankine);
        }

        private String milliohmTomicroohm(double kelvin) {
            double newton = (kelvin *1000);
            return String.valueOf(newton);
        }

        private String milliohmTokiloohm(double kelvin) {
            double delisle = ( kelvin) * 0.000001;
            return String.valueOf(delisle);
        }

        private String milliohmTomegaohm(double kelvin) {
            double celcius = kelvin *(10^-9);
            return String.valueOf(celcius);
        }

        private String milliohmTogigaohm(double kelvin) {
            double fahrenheit = (kelvin) *(10^-15);
            return String.valueOf(fahrenheit);
        }

        //Rankine
        private String megaohmToohm(double rankine) {
            double newton = (rankine ) * (10^6);
            return String.valueOf(newton);
        }

        private String megaohmTomicroohm(double rankine) {
            double delisle = ( rankine) * (10^15);
            return String.valueOf(delisle);
        }

        private String megaohmTomilliohm(double rankine) {
            double celcius = (rankine  *(10^9));
            return String.valueOf(celcius);
        }

        private String megaohmTokiloohm(double rankine) {
            double fahrenheit = rankine *1000;
            return String.valueOf(fahrenheit);
        }

        private String megaohmTogigaohm(double rankine) {
            double kelvin = rankine * 0.001;
            return String.valueOf(kelvin);
        }

        //Newton
        private String gigaohmToohm(double newton) {
            double delisle = ( newton) *(10^9);
            return String.valueOf(delisle);
        }

        private String gigaohmTomicroohm(double newton) {
            double celcius = newton *(10^15);
            return String.valueOf(celcius);
        }

        private String gigaohmTomilliohm(double newton) {
            double fahrenheit = newton * (10^12);
            return String.valueOf(fahrenheit);
        }

        private String gigaohmTokiloohm(double newton) {
            double kelvin = newton * 1000000;
            return String.valueOf(kelvin);
        }

        private String gigaohmTomegaohm(double newton) {
            double rankine = newton * 1000;
            return String.valueOf(rankine);
        }

        //Delisle
        private String kiloohmToohm(double delisle) {
            double celcius = delisle * 1000;
            return String.valueOf(celcius);
        }

        private String kiloohmTomicroohm(double delisle) {
            double fahrenheit =  delisle *(10^9);
            return String.valueOf(fahrenheit);
        }

        private String kiloohmTomilliohm(double delisle) {
            double kelvin = delisle * (10^6);
            return String.valueOf(kelvin);
        }

        private String kiloohmTomegaohm(double delisle) {
            double rankine =delisle * (0.001);
            return String.valueOf(rankine);
        }

        private String kiloohmTogigaohm(double delisle) {
            double newton = delisle * 0.000001;
            return String.valueOf(newton);

    }
}