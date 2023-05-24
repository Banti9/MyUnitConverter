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

public class current_cal extends AppCompatActivity {

        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Amperes";
        String toUnit = "Milliampers";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "Ampere",
                "Milliampers",
                "Kiloampers",
                "Megaamper",
                "Biot",
                "Coulomb per second",
                "abamper",
                "statampere"

        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_current_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.current_relativeLayout);

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
                                et_toUnit.setText(ampToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(ampToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(ampToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ampToMegaamp(Double.parseDouble(tempInput)));}
                                else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(ampTOAbamper(Double.parseDouble(tempInput)));

                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(ampToBiot(Double.parseDouble(tempInput)));}
                            else if (tv_toUnit.getText().toString().equals(values[7])) {
                                        et_toUnit.setText(ampToStatamperes(Double.parseDouble(tempInput)));
                                    }


                            } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kampToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kampToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kampToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kampToMegaamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(kampToBiot(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(kampTOAbamper(Double.parseDouble(tempInput)));

                        }else if (tv_toUnit.getText().toString().equals(values[7])) {
                            et_toUnit.setText(kampToStatamperes(Double.parseDouble(tempInput)));

                    }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mampToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mampToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mampToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kampToMegaamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(mampToBiot(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(mampTOAbamper(Double.parseDouble(tempInput)));
                            }
                            else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(mampToStatamperes(Double.parseDouble(tempInput)));
                            }

                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(megaampToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(megaampToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(megaampToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(mampToMegaamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(mampToBiot(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(megaampTOAbamper(Double.parseDouble(tempInput)));
                            }
                            else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(megaampToStatamperes(Double.parseDouble(tempInput)));
                            }

                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(BiotToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(BiotToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(BiotToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(BiotToMegaamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(BiotToBiot(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(BiotTOAbamper(Double.parseDouble(tempInput)));
                            }
                            else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(BiotToStatamperes(Double.parseDouble(tempInput)));
                            }

                        } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(abampToAmp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(abampToKiloamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(abampToMilliamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(abampToMegaamp(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(abampToBiot(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(tempInput);
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(abampTOAbamper(Double.parseDouble(tempInput)));
                            }
                            else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(abampToStatamperes(Double.parseDouble(tempInput)));
                            }

                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(current_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Ampere",
                            "Milliampers",
                            "Kiloampers",
                            "Megaamper",
                            "Biot",
                            "Coulomb per second",
                            "abamper",
                            "statampere"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(current_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Ampere",
                            "Milliampers",
                            "Kiloampers",
                            "Megaamper",
                            "Biot",
                            "Coulomb per second",
                            "abamper",
                            "statampere"
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



        private String ampToAmp(double amp) {
            double Amp = amp;
            return String.valueOf(Amp);
        }

        private String ampToMilliamp(double amp) {
            double mAmp = amp*1000;
            return String.valueOf(mAmp);
        }

        private String ampToKiloamp(double amp) {
            double delisle = amp*0.001;
            return String.valueOf(delisle);
        }

        private String ampToMegaamp(double amp) {
            double Mamp = amp*(10^-6);
            return String.valueOf(Mamp);
        }

        //fahrenheit
        private String ampToBiot(double amp) {
            double biot = amp*0.1;
            return String.valueOf(biot);
        }

        private String ampTOAbamper(double amp) {
            double Abamp = amp*0.1;
            return String.valueOf(Abamp);
        }

        private String ampToStatamperes(double amp) {
            double statamp = amp*299792454;
            return String.valueOf(statamp);
        }
    private String mampToAmp(double mamp) {
        double Amp = mamp*0.001;
        return String.valueOf(Amp);
    }

    private String mampToMilliamp(double mamp) {
        double MAmp = mamp;
        return String.valueOf(MAmp);
    }

    private String mampToKiloamp(double mamp) {
        double klamp = mamp*0.000001;
        return String.valueOf(klamp);
    }

    private String mampToMegaamp(double mamp) {
        double Megaamp = mamp*(10^-8);
        return String.valueOf(Megaamp);
    }

    //fahrenheit
    private String mampToBiot(double mamp) {
        double biot = mamp*0.0001;
        return String.valueOf(biot);
    }

    private String mampTOAbamper(double mamp) {
        double Abamp = mamp*0.0001;
        return String.valueOf(Abamp);
    }

    private String mampToStatamperes(double mamp) {
        double statamp = mamp*299792;
        return String.valueOf(statamp);
    }
    private String kampToAmp(double kamp) {
        double Amp = kamp*1000;
        return String.valueOf(Amp);
    }

    private String kampToMilliamp(double kamp) {
        double mAmp = kamp*1000000;
        return String.valueOf(mAmp);
    }

    private String kampToKiloamp(double kamp) {
        double delisle = kamp;
        return String.valueOf(delisle);
    }

    private String kampToMegaamp(double kamp) {
        double Mamp = kamp*(10^-3);
        return String.valueOf(Mamp);
    }

    //fahrenheit
    private String kampToBiot(double kamp) {
        double biot = kamp*100;
        return String.valueOf(biot);
    }

    private String kampTOAbamper(double kamp) {
        double Abamp = kamp*100;
        return String.valueOf(Abamp);
    }

    private String kampToStatamperes(double kamp) {
        double statamp = kamp*299792454.684*1000;
        return String.valueOf(statamp);
    }
    private String megaampToAmp(double megaamp) {
        double Amp = megaamp*(10^6);
        return String.valueOf(Amp);
    }

    private String megaampToMilliamp(double megaamp) {
        double mAmp = megaamp*(10^9);
        return String.valueOf(mAmp);
    }

    private String megaampToKiloamp(double megaamp) {
        double delisle = megaamp*1000;
        return String.valueOf(delisle);
    }

    private String megaampToMegaamp(double megaamp) {
        double Mamp = megaamp;
        return String.valueOf(Mamp);
    }

    //fahrenheit
    private String megaampToBiot(double megaamp) {
        double biot = megaamp*100000;
        return String.valueOf(biot);
    }

    private String megaampTOAbamper(double megaamp) {
        double Abamp = megaamp*100000;
        return String.valueOf(Abamp);
    }

    private String megaampToStatamperes(double megaamp) {
        double statamp = megaamp*29979*(10^10);
        return String.valueOf(statamp);
    }
    private String BiotToAmp(double  Biot) {
        double Amp =  Biot*10;
        return String.valueOf(Amp);
    }

    private String  BiotToMilliamp(double  Biot) {
        double mAmp =  Biot*100000;
        return String.valueOf(mAmp);
    }

    private String  BiotToKiloamp(double  Biot) {
        double delisle =  Biot*0.01;
        return String.valueOf(delisle);
    }

    private String  BiotToMegaamp(double  Biot) {
        double Mamp =  Biot*(10^-5);
        return String.valueOf(Mamp);
    }

    //fahrenheit
    private String  BiotToBiot(double  Biot) {
        double biot =  Biot;
        return String.valueOf(biot);
    }

    private String  BiotTOAbamper(double  Biot) {
        double Abamp =  Biot;
        return String.valueOf(Abamp);
    }

    private String  BiotToStatamperes(double  Biot) {
        double statamp =  Biot*2997924537.00;
        return String.valueOf(statamp);
    }
    private String abampToAmp(double abamp) {
        double Amp = abamp*10;
        return String.valueOf(Amp);
    }

    private String abampToMilliamp(double abamp) {
        double mAmp = abamp*100000;
        return String.valueOf(mAmp);
    }

    private String abampToKiloamp(double abamp) {
        double delisle = abamp*0.01;
        return String.valueOf(delisle);
    }

    private String abampToMegaamp(double abamp) {
        double Mamp = abamp*(10^-5);
        return String.valueOf(Mamp);
    }
    private String abampToCperS(double abamp) {
        double cps = abamp*10;
        return String.valueOf(cps);
    }


    //fahrenheit
    private String abampToBiot(double abamp) {
        double biot = abamp;
        return String.valueOf(biot);
    }

    private String abampTOAbamper(double abamp) {
        double Abamp = abamp;
        return String.valueOf(Abamp);
    }

    private String abampToStatamperes(double abamp) {
        double statamp =abamp*299792454;
        return String.valueOf(statamp);
    }




}