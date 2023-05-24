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

public class volume_cal extends AppCompatActivity {

        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Meter^3";
        String toUnit = "Kilometer^3";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
               "Meter^3",
                "Kilometre^3",
                "Centimeter^3",
                "KiloLitres",
                "MilliMetre^3"
        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_volume_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.volume_relativeLayout);

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
                                et_toUnit.setText(meter3ToKilometre(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(meter3ToMeter3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(meter3ToCentiMeter3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(meter3Tomm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(metre3ToKiloliter(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kilometer3ToKilometer(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kilometer3ToMeter3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(km3Tocm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(km3Tokl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(km3Tomm3(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(cm3Tokl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(cm3Tom3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(cm3Tocm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(cm3ToKm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(cm3Tomm3(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(klTokm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(klToM3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(klTocm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(klTokl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(klTomm3(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mm3Tokm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mm3Tom3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(mm3Tocm3(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mm3Tokl(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(mm3Tomm3(Double.parseDouble(tempInput)));
                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Meter^3",
                            "Kilometre^3",
                            "Centimeter^3",
                            "KiloLitres",
                            "MilliMetre^3"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(volume_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Meter^3",
                            "Kilometre^3",
                            "Centimeter^3",
                            "KiloLitres",
                            "MilliMetre^3"
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
        private String meter3ToKilometre(double m3) {
            double km3 = m3*(10^-9);
            return String.valueOf(km3);
        }

        private String meter3ToMeter3(double m3) {
            double M3 = m3;
            return String.valueOf(M3);
        }

        private String meter3ToCentiMeter3(double m3) {
            double cm3 = m3*(10^6);
            return String.valueOf(cm3);
        }

        private String metre3ToKiloliter(double m3) {
            double kl = m3;
            return String.valueOf(kl);
        }

        private String meter3Tomm3(double m3) {
            double fahrenheit = m3*1000000000;
            return String.valueOf(fahrenheit);
        }

        //fahrenheit
        private String kilometer3ToKilometer(double km3) {
            double Km3 = km3;
            return String.valueOf(Km3);
        }

        private String kilometer3ToMeter3(double km3) {
            double m3 = km3*(10^9);
            return String.valueOf(m3);
        }

        private String km3Tocm3(double km3) {
            double cm3 = km3*(10^15);
            return String.valueOf(cm3);
        }

        private String km3Tokl(double km3) {
            double kl = km3*(10^9) ;
            return String.valueOf(kl);
        }

        private String km3Tomm3(double km3) {
            double mm3 = km3*(10^18);
            return String.valueOf(mm3);
        }

        //Kelvin
        private String cm3ToKm3(double cm3) {
            double km3 = cm3*(10^-15);
            return String.valueOf(km3);
        }

        private String cm3Tom3(double cm3) {
            double m3 = cm3*(10^-6);
            return String.valueOf(m3);
        }

        private String cm3Tocm3(double cm3) {
            double Cm3 = cm3;
            return String.valueOf(Cm3);
        }

        private String cm3Tokl(double cm3) {
            double kl = cm3*(10^-6);
            return String.valueOf(kl);
        }

        private String cm3Tomm3(double cm3) {
            double mm3 = cm3*1000;
                    return String.valueOf(mm3);
        }

        //Rankine
        private String klTokm3(double kl) {
            double km3 = kl*(10^-9);
            return String.valueOf(km3);
        }

        private String klToM3(double kl) {
            double m3=  kl;
            return String.valueOf(m3);
        }

        private String klTocm3(double kl) {
            double cm3 = kl*1000000;
            return String.valueOf(cm3);
        }

        private String klTokl(double kl) {
            double Kl = kl;
            return String.valueOf(Kl);
        }

        private String klTomm3(double kl) {
            double mm3 = kl*(10^9);
            return String.valueOf(mm3);
        }

        //Newton
        private String mm3Tokm3(double mm3) {
            double km3 = mm3*(10^-18);
            return String.valueOf(km3);
        }

        private String mm3Tom3(double mm3) {
            double m3 = mm3*(10^-9);
            return String.valueOf(m3);
        }

        private String mm3Tocm3(double mm3) {
            double cm3 = mm3*0.001;
            return String.valueOf(cm3);
        }

        private String mm3Tokl(double mm3) {
            double kl = mm3*(10^-9);
            return String.valueOf(kl);
        }

        private String mm3Tomm3(double mm3) {
            double Mm3 =mm3 ;
            return String.valueOf(Mm3);
        }


}