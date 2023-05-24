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

public class power_cal extends AppCompatActivity {

        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "watt";
        String toUnit = "kilowatt";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "watt",
                "milliWatt",
                "kiloWatt",
                "megaWatt",
                "microWatt"


        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_power_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.power_relativeLayout);

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
                                et_toUnit.setText(wattToKilowatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(wattToMilliwatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(wattToMicroWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(wattToMegaWatt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(milliWattToWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(milliwattToMegaWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(milliwattToKilowatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(millliwattToMicroWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(milliwattToMegaWatt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kwattToMegawatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(kwattToMicroWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kwattToMilliwatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kwattTowatt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(megawattToMilliwatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(megawattToWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(megawattToMegaWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(megawattToMicroWatt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(microwattToWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(microwattToKilowatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(microwattToMegaWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(microwattToMicroWatt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(microwattToMilliwatt(Double.parseDouble(tempInput)));
                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(power_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "watt",
                            "milliWatt",
                            "kiloWatt",
                            "megaWatt",
                            "microWatt"

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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(power_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "watt",
                            "milliWatt",
                            "kiloWatt",
                            "megaWatt",
                            "microWatt"

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
        private String wattToMilliwatt(double w) {
            double mw = 1000*w;
            return String.valueOf(mw);
        }

        private String wattToMicroWatt(double w) {
            double microw = w*(10^6);
            return String.valueOf(microw);
        }

        private String wattToKilowatt(double w) {
            double kw = w*0.001;
            return String.valueOf(kw);
        }

        private String wattToMegaWatt(double w) {
            double Megawatt = w*0.000001;
            return String.valueOf(Megawatt);
        }

        private String milliWattToWatt(double mw) {
            double w = mw*0.001 ;
            return String.valueOf(w);
        }



    private String millliwattToMicroWatt(double mw) {
        double microw = mw*(10^3);
        return String.valueOf(microw);
    }


    private String milliwattToKilowatt(double mw) {
        double kw = mw*0.000001;
        return String.valueOf(kw);
    }

    private String milliwattToMegaWatt(double mw) {
        double Megawatt = mw*(10^-9);
        return String.valueOf(Megawatt);
    }
    private String kwattToMilliwatt(double kw) {
        double miw = kw*(10^6);
        return String.valueOf(miw);
    }

    private String kwattToMicroWatt(double kw) {
        double microw = kw*(10^9);
        return String.valueOf(microw);
    }
    private String kwattTowatt(double kw) {
        double w = kw*1000;
        return String.valueOf(w);
    }
    private String kwattToMegawatt(double kw) {
        double megaw = kw*0.001;
        return String.valueOf(megaw);
    }

    private String  megawattToMegaWatt(double megaw) {
        double Megawatt =megaw;
        return String.valueOf(Megawatt);
    }
    private String megawattToMilliwatt(double megaw) {
        double mw = 1000*megaw*1000000;
        return String.valueOf(mw);
    }

    private String megawattToWatt(double megaw) {
        double w = megaw*(10^6);
        return String.valueOf(w);
    }
    private String megawattToMicroWatt(double megaw) {
        double microw = megaw*(10^9);
        return String.valueOf(microw);}

    private String megawattToKilowatt(double Kw) {
        double kw = Kw;
        return String.valueOf(kw);
    }

    private String microwattToMegaWatt(double microw) {
        double Megawatt = microw*(10^-12);
        return String.valueOf(Megawatt);
    }
    private String microwattToMilliwatt(double microw) {
        double mw = 0.001*microw;
        return String.valueOf(mw);
    }

    private String microwattToMicroWatt(double miw) {
        double microw = miw;
        return String.valueOf(microw);
    }

    private String microwattToKilowatt(double w) {
        double kw = w*(10^-9);
        return String.valueOf(kw);
    }

    private String microwattToWatt(double microw) {
        double watt = microw*0.000001;
        return String.valueOf(watt);
    }

    }

