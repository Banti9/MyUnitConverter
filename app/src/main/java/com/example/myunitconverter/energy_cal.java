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

public class energy_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "joule";
        String toUnit = "kilojoule";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "joule",
                "kiloJoule",
                "calorie",
                "watt hour",
                "electron-volt"


        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_energy_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.energy_relativeLayout);

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
                                et_toUnit.setText(jouleTokilojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(jouleTocalorie(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(jouleToWatthour(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(jouleToElectrVolt(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(jouleTojoule(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kilojouleTojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kilojouleTocalorie(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kilojouleTokilojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kilojouleToWatthour(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(kilojouleToElectrVolt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(calTojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(calTokilojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(calTocalorie(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(caloWatthour(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(calToElectrVolt(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(whTojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(whTokilojoule(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(whTocalorie(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(whToWatthour(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(whToElectrVolt(Double.parseDouble(tempInput)));
                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(energy_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "joule",
                            "kiloJoule",
                            "calorie",
                            "watt hour",
                            "electron-volt"


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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(energy_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "joule",
                            "kiloJoule",
                            "calorie",
                            "watt hour",
                            "electron-volt"


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
        private String jouleTokilojoule(double joule) {
            double kj = joule*1000;
            return String.valueOf(kj);
        }

        private String jouleTocalorie(double joule) {
            double cal = 0.239006*joule;
            return String.valueOf(cal);
        }

        private String jouleToWatthour(double joule) {
            double wh = 0.000278*joule;
            return String.valueOf(wh);
        }

        private String jouleToElectrVolt(double joule) {
            double ev = 62415*(10^15)*joule;
            return String.valueOf(ev);
        }

        private String jouleTojoule(double joule) {
            double j = joule;
            return String.valueOf(j);
        }

        //fahrenheit
        private String whTokilojoule(double wh) {
            double kj = wh*3.6*10000;
            return String.valueOf(kj);
        }
///watthour
    private String whTocalorie(double wh) {
        double cal = 860.421*wh;
        return String.valueOf(cal);
    }

    private String whToWatthour(double wh) {
        double wth = wh;
        return String.valueOf(wth);
    }

    private String whToElectrVolt(double wh) {
        double ev = 2246000.000000000786432*(10^15)*wh;
        return String.valueOf(ev);
    }

    private String whTojoule(double wh) {
        double j = wh*3600;
        return String.valueOf(j);  }


    //kilojoule
    private String kilojouleTokilojoule(double kjoule) {
            double kj = kjoule;
            return String.valueOf(kj);
        }

        private String kilojouleTocalorie(double kjoule) {
            double cal = 239.005736*kjoule;
            return String.valueOf(cal);
        }

        private String kilojouleToWatthour(double joule) {
            double wh = 0.277778*joule;
            return String.valueOf(wh);
        }

        private String kilojouleToElectrVolt(double kjoule) {
            double ev = 6241499.999999999606784*(10^15)*kjoule;
            return String.valueOf(ev);
        }

        private String kilojouleTojoule(double kjoule) {
            double j = kjoule*1000;
            return String.valueOf(j); }


    //calorie
    private String calTokilojoule(double cal) {
                double kj = cal*0.004184;
                return String.valueOf(kj);
            }

            private String calTocalorie(double cal) {
                double calo = cal;
                return String.valueOf(calo);
            }

            private String caloWatthour(double cal) {
                double wh = 0.001162*cal;
                return String.valueOf(wh);
            }

            private String calToElectrVolt(double cal) {
                double ev = 26113999.999999999475712*(10^15)*cal;
                return String.valueOf(ev);
            }

            private String calTojoule(double cal) {
                double j = cal*4.184;
                return String.valueOf(j);
}}