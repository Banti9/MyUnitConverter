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

public class freq_cal extends AppCompatActivity {

        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Hertz";
        String toUnit = "Kilohertz";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
               "Hertz",
                "KiloHertz",
                "Megahertz",
                "Gigahertz"

         };


       @Override
       protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freq_cal);

            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.freq_relativeLayout);

            tv_fromUnit = findViewById(R.id.tv_fromUnit);
            tv_toUnit = findViewById(R.id.tv_toUnit);

            tv_fromUnit.setText(values[0]);
            tv_toUnit.setText(values[0]);

            et_fromUnit = findViewById(R.id.et_fromUnit);
            et_toUnit = findViewById(R.id.et_toUnit);

            cv_convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String freqInput = et_fromUnit.getText().toString();
                    if (freqInput.equals("") || freqInput == null) {
                        et_fromUnit.setError("Please enter some value");
                    } else {
                        if (tv_fromUnit.getText().toString().equals(values[0])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(freqInput);
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(hertzToKilohertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(hertzToMegahertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(hertzToGigahertz(Double.parseDouble(freqInput)));

                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kilohertzToHertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(freqInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kilohertzToMegahertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kiloToGigahertz(Double.parseDouble(freqInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(megahertzToHertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(MegaToKilohertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(freqInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(megahertzToGigahertz(Double.parseDouble(freqInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(gigahertzToHertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(gigahertzToKilohertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(gigahertzToMegahertz(Double.parseDouble(freqInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(freqInput);

                            }

                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(freq_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{

                            "Hertz",
                            "KiloHertz",
                            "Megahertz",
                            "Gigahertz"


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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(freq_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Hertz",
                            "KiloHertz",
                            "Megahertz",
                            "Gigahertz"
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

        //hertz
        private String hertzToMegahertz(double hertz) {
            double megahertz = hertz*1000000;
            return String.valueOf(megahertz);
        }

        private String hertzToKilohertz(double hertz) {
            double kilohertz = hertz*1000;
            return String.valueOf(kilohertz);
        }

        private String hertzToGigahertz(double hertz) {
            double gigahertz = 1000000000*hertz;
            return String.valueOf(gigahertz);
        }

        private String kilohertzToHertz(double kilohertz) {
            double hertz = kilohertz*0.0001;
            return String.valueOf(hertz);
        }

        private String kilohertzToMegahertz(double kilohertz) {
            double megahertz =kilohertz*1000 ;
            return String.valueOf(megahertz);
        }


        private String kiloToGigahertz(double kilohertz) {
            double gigahertz =kilohertz*1000000 ;
            return String.valueOf(gigahertz);
        }

        private String megahertzToHertz (double megahertz) {
            double hertz = megahertz*0.0000001;
            return String.valueOf(hertz);
        }

        private String MegaToKilohertz(double megahertz) {
            double kilohertz = megahertz*0.0001;
            return String.valueOf(kilohertz);
        }

        private String megahertzToGigahertz(double megahertz) {
            double gigahertz = megahertz*1000;
            return String.valueOf(gigahertz);
        }

        private String gigahertzToHertz(double gigahertz) {
            double hertz = gigahertz*0.0000000001;
            return String.valueOf(hertz);
        }

        //
        private String gigahertzToMegahertz(double gigahertz) {
            double megahertz = gigahertz*0.0001;
            return String.valueOf(megahertz);
        }

        private String gigahertzToKilohertz(double gigahertz) {
            double kilohertz =gigahertz*0.0000001 ;
            return String.valueOf(kilohertz);
        }




    }
