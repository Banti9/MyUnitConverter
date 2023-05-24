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

public class area_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "m^2";
        String toUnit = "cm^2";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "m^2",
                "cm^2",
                "in^2",
                "ft^2",
                "mi^2",
                "acre",
                "hectare",
                "mm^2",
                "km^2",
                "yard^2"
        };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_cal);


        cv_fromUnit = findViewById(R.id.fromUnit);
        cv_toUnit = findViewById(R.id.toUnit);
        cv_convert = findViewById(R.id.cv_convert);

        mCLayout = findViewById(R.id.area_relativeLayout);

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
                                et_toUnit.setText(m2Tom2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(MsToIns(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(msTokm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(msToFts(Double.parseDouble(tempInput)));
                            }  else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(msToha(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(msToCmS(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(msToac(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(msTomi2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(msToYds(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(msTomm2(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(cm2ToIns(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(cm2Tom2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(cmsToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(cmsTokm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(cmsToCmS(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(cmsToha(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(cmsToFts(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(cmsToYds(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(cmsTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(cmsTomi2(Double.parseDouble(tempInput)));
                                                    }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(insToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(insToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(insToFts(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(insToha(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(insToIns(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(insTomi2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(insTom2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(insTokm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(insTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(insToYds(Double.parseDouble(tempInput)));

                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(ftsToIns(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(ftsToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(ftsToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ftsTokm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ftsToha(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(ftsTom2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(ftsTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(ftsTomi2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(ftsToFts(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(ftsToYds(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mi2ToIns(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(misToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(misToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(misToFts(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(misToha(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(misTokm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(misTomi2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText( misTomm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(misToYds(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(misTom2(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(acToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(acToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(acToFts(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(acToIns(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(acToha(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(tempInput);
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(acTokm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(acTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(acTomi2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(acTom2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(acToYds(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[6])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(haToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(haToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(haTom2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(haTokm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(haTomi2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(haToIns(Double.parseDouble(tempInput)));
                            }
                            else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(tempInput);
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(haTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(haToha(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(haToYds(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(haToFts(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[7])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mm2Tom2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mmsToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(mmsToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mmsToFts(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(mmsToIns(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(mmsTokm2(Double.parseDouble(tempInput)));

                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(mmsToYds(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                            et_toUnit.setText(tempInput);
                            }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(mmsTomi2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(mmsTomm2(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(mmsToha(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[8])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kkmsTomm2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(kmsToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kmsToFts(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kmsToha(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kmsToCmS(Double.parseDouble(tempInput)));
                              }else if (tv_toUnit.getText().toString().equals(values[6])) {
                            et_toUnit.setText(kmsToYds(Double.parseDouble(tempInput)));
                        }else if (tv_toUnit.getText().toString().equals(values[7])) {
                            et_toUnit.setText(km2Tom2(Double.parseDouble(tempInput)));}

                            else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(kmsToIns(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(kmsTomi2(Double.parseDouble(tempInput)));
                            }

                        } else if (tv_fromUnit.getText().toString().equals(values[9])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(y2Tom2(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(ysToac(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(ysToCmS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(ysToha(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ysToFts(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(ysToIns(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(ysTomi2(Double.parseDouble(tempInput)));}
                            else if (tv_toUnit.getText().toString().equals(values[8])) {
                                et_toUnit.setText(ysToYds(Double.parseDouble(tempInput)));}
                            else if (tv_toUnit.getText().toString().equals(values[9])) {
                                et_toUnit.setText(tempInput);

                            }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                et_toUnit.setText(ysTomm2(Double.parseDouble(tempInput)));
                            }

                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "m^2",
                            "cm^2",
                            "in^2",
                            "ft^2",
                            "mi^2",
                            "acre",
                            "hectare",
                            "mm^2",
                            "km^2"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(area_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "m^2",
                            "cm^2",
                            "in^2",
                            "ft^2",
                            "mi^2",
                            "acre",
                            "hectare",
                            "mm^2",
                            "km^2"
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
        private String MsToIns(double m2) {
            double in2 = m2*0.00064516;
            return String.valueOf(in2);
        }

        private String msToCmS(double ms) {
            double cm2 = ms*0.0001;
            return String.valueOf(cm2);
        }

        private String msToFts(double ms) {
            double Fts = ms*0.09290304;
            return String.valueOf(Fts);
        }

        private String msToYds(double ms) {
            double yd2 = 0.83612736;
            return String.valueOf(yd2);
        }

        private String msTomi2(double ms) {
            double mi2 = ms*2589988.110336;
            return String.valueOf(mi2);
        }

        //fahrenheit
        private String msToac(double ms) {
            double ac = ms*4046.8564224;
            return String.valueOf(ac);
        }

        private String msToha(double ms) {
            double ha = ms*10000;
            return String.valueOf(ha);
        }

        private String msTomm2(double ms) {
            double mm2 = ms*0.000001;
            return String.valueOf(mm2);
        }

        private String m2Tom2(double ms) {
            double m2 = ms;
            return String.valueOf(m2);
        }

        private String msTokm2(double ms) {
            double km2 = ms*1000000;
            return String.valueOf(km2);
        }



        ////?????
    private String cm2ToIns(double cm2) {
        double in2 = cm2*0.15500;
        return String.valueOf(in2);
    }

    private String cmsToCmS(double cms) {
        double cm2 = cms;
        return String.valueOf(cm2);
    }

    private String cmsToFts(double cms) {
        double Fts = cms*929.0304;
        return String.valueOf(Fts);
    }

    private String cmsToYds(double cms) {
        double yd2 = cms*8361.2736;
        return String.valueOf(yd2);
    }

    private String cmsTomi2(double cms) {
        double mi2 = cms*25899881103.36;
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String cmsToac(double cms) {
        double ac = cms*40468564.224;
        return String.valueOf(ac);
    }

    private String cmsToha(double cms) {
        double ha = cms*100000000;
        return String.valueOf(ha);
    }

    private String cmsTomm2(double cms) {
        double mm2 = cms*0.01;
        return String.valueOf(mm2);
    }

    private String cm2Tom2(double cms) {
        double m2 = cms*10000;
        return String.valueOf(m2);
    }

    private String cmsTokm2(double cms) {
        double km2 = cms*(10^-10);
        return String.valueOf(km2);
    }
    private String kmsToIns(double km2) {
        double in2 = km2*1550003100.0062;
        return String.valueOf(in2);
    }

    private String kmsToCmS(double kms) {
        double cm2 = kms*(10^10);
        return String.valueOf(cm2);
    }

    private String kmsToFts(double kms) {
        double Fts = kms*10763910.41671;
        return String.valueOf(Fts);
    }

    private String kmsToYds(double kms) {
        double yd2 = kms*1195990.0463011;
        return String.valueOf(yd2);
    }

    private String kmsTomi2(double kms) {
        double mi2 = kms*0.38610215854245;
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String kmsToac(double kms) {
        double ac = kms*247.10538146717;
        return String.valueOf(ac);
    }

    private String kmsToha(double kms) {
        double ha = kms*10000;
        return String.valueOf(ha);
    }

    private String kkmsTomm2(double kms) {
        double mm2 = kms*(10^12);
        return String.valueOf(mm2);
    }

    private String km2Tom2(double kms) {
        double m2 = kms*(10^6);
        return String.valueOf(m2);
    }

    private String kmsTokm2(double kms) {
        double km2 = kms;
        return String.valueOf(km2);
    }
    private String mmsToIns(double mm2) {
        double in2 = mm2*0.0015500031000062;
        return String.valueOf(in2);
    }

    private String mmsToCmS(double mms) {
        double cm2 = mms*0.01;
        return String.valueOf(cm2);
    }

    private String mmsToFts(double mms) {
        double Fts = mms*1.076391041671*(10^5);
        return String.valueOf(Fts);
    }

    private String mmsToYds(double mms) {
        double yd2 = mms*1.1959900463011*(10^6);
        return String.valueOf(yd2);
    }

    private String mmsTomi2(double mms) {
        double mi2 = mms*3.8610215854245*(10^13);
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String mmsToac(double mms) {
        double ac = mms* 2.471053814671*(10^10);
        return String.valueOf(ac);
    }

    private String mmsToha(double mms) {
        double ha = mms*(10^10);
        return String.valueOf(ha);
    }

    private String mmsTomm2(double mms) {
        double Mm2 = mms*0.000001;
        return String.valueOf(Mm2);
    }

    private String mm2Tom2(double mms) {
        double m2 = mms*(10^6);
        return String.valueOf(m2);
    }

    private String mmsTokm2(double mms) {
        double km2 = mms*(10^12);
        return String.valueOf(km2);
    }
    private String ysToIns(double y2) {
        double in2 = y2*1296;
        return String.valueOf(in2);
    }

    private String ysToCmS(double ys) {
        double cm2 = ys*8361.2736;
        return String.valueOf(cm2);
    }

    private String ysToFts(double ys) {
        double Fts = ys*9;
        return String.valueOf(Fts);
    }

    private String ysToYds(double ys) {
        double yd2 = ys;
        return String.valueOf(yd2);
    }

    private String ysTomi2(double ys) {
        double mi2 = ys*3.228305785124*(10^7);
        return String.valueOf(mi2);
    }

    //
    private String ysToac(double ys) {
        double ac = ys* 0.00020661157024793;
        return String.valueOf(ac);
    }

    private String ysToha(double ys) {
        double ha = ys*8.3812736*(10^5);
        return String.valueOf(ha);
    }

    private String ysTomm2(double ys) {
        double Mm2 = ys*836127.36;
        return String.valueOf(Mm2);
    }

    private String y2Tom2(double ys) {
        double m2 = ys*0.83612736;
        return String.valueOf(m2);
    }

    private String ysTokm2(double ys) {
        double km2 = ys*8.3812736*(10^7);
        return String.valueOf(km2);}

    private String ftsToIns(double mm2) {
            double in2 = mm2*144;
            return String.valueOf(in2);
        }

        private String ftsToCmS(double fts) {
            double cm2 = fts*929.0304;
            return String.valueOf(cm2);
        }

        private String ftsToFts(double fts) {
            double Fts = fts;
            return String.valueOf(Fts);
        }

        private String ftsToYds(double fts) {
            double yd2 = fts*0.1111111111111;
            return String.valueOf(yd2);
        }

        private String ftsTomi2(double fts) {
            double mi2 = fts*3.8570064279155*(10^8);
            return String.valueOf(mi2);
        }

        //fahrenheit
        private String ftsToac(double fts) {
            double ac = fts* 2.2956841138659*(10^5);
            return String.valueOf(ac);
        }

        private String ftsToha(double fts) {
            double ha = fts*9.290304*(10^6);
            return String.valueOf(ha);
        }

        private String ftsTomm2(double fts) {
            double Mm2 = fts*92903.04;
            return String.valueOf(Mm2);
        }

        private String ftsTom2(double fts) {
            double m2 = fts*0.09290304;
            return String.valueOf(m2);
        }

        private String ftsTokm2(double fts) {
            double km2 = fts*9.290304*(10^8);
            return String.valueOf(km2);}
    private String insToIns(double in2) {
        double In2 = in2;
        return String.valueOf(In2);
    }

    private String insToCmS(double ins) {
        double cm2 = ins*6.4516*(10^10);
        return String.valueOf(cm2);
    }

    private String insToFts(double ins) {
        double Fts = ins*0.0069444444444444;
        return String.valueOf(Fts);
    }

    private String insToYds(double ins) {
        double yd2 = ins*0.00077160493827161;
        return String.valueOf(yd2);
    }

    private String insTomi2(double ins) {
        double mi2 = ins*2.4909766860524*(10^10);
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String insToac(double ins) {
        double ac = ins*1.5942250790736 *(10^7);
        return String.valueOf(ac);
    }

    private String insToha(double ins) {
        double ha = ins*6.4516*(10^8);
        return String.valueOf(ha);
    }

    private String insTomm2(double ins) {
        double Mm2 = ins*645.16;
        return String.valueOf(Mm2);
    }

    private String insTom2(double ins) {
        double m2 = ins*0.00064516;
        return String.valueOf(m2);
    }

    private String insTokm2(double ins) {
        double km2 = ins*6.4516*(10^10);
        return String.valueOf(km2);}

    private String haToIns(double ha) {
        double In2 = ha*15500031.000062;
        return String.valueOf(In2);
    }

    private String haToCmS(double ha) {
        double cm2 = ha*(10^8);
        return String.valueOf(cm2);
    }

    private String haToFts(double ha) {
        double Fts = ha*107639.1041671;
        return String.valueOf(Fts);
    }

    private String haToYds(double ha) {
        double yd2 = ha*11959.900463011;
        return String.valueOf(yd2);
    }

    private String haTomi2(double ha) {
        double mi2 = ha*0.0038610215854245;
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String haToac(double ha) {
        double ac = ha*2.4710538146717;
        return String.valueOf(ac);
    }

    private String haToha(double h) {
        double ha = h;
        return String.valueOf(ha);
    }

    private String haTomm2(double ha) {
        double Mm2 = ha*(10^10);
        return String.valueOf(Mm2);
    }

    private String haTom2(double ha) {
        double m2 = ha*10000;
        return String.valueOf(m2);
    }

    private String haTokm2(double ha) {
        double km2 = ha*0.01;
        return String.valueOf(km2);}

    private String mi2ToIns(double mi2) {
        double In2 = mi2*40144896*100;
        return String.valueOf(In2);
    }

    private String misToCmS(double mis) {
        double cm2 = mis*25899881103.36;
        return String.valueOf(cm2);
    }

    private String misToFts(double mis) {
        double Fts = mis*27878400;
        return String.valueOf(Fts);
    }

    private String misToYds(double mis) {
        double yd2 = mis*3097600;
        return String.valueOf(yd2);
    }

    private String misTomi2(double mis) {
        double Mis = mis;
        return String.valueOf(Mis);
    }

    //fahrenheit
    private String misToac(double mis) {
        double ac = mis*640;
        return String.valueOf(ac);
    }

    private String misToha(double mis) {
        double ha = mis*258.9988110336;
        return String.valueOf(ha);
    }

    private String misTomm2(double mis) {
        double Mm2 = mis*2589988110.336*1000;
        return String.valueOf(Mm2);
    }

    private String misTom2(double mis) {
        double m2 = mis*2589988.110336;
        return String.valueOf(m2);
    }

    private String misTokm2(double mis) {
        double km2 = mis*2.589988110336;
        return String.valueOf(km2);}

    private String acToIns(double ac) {
        double In2 = ac*6272640;
        return String.valueOf(In2);
    }

    private String acToCmS(double ac) {
        double cm2 = ac*40468564.224;
        return String.valueOf(cm2);
    }

    private String acToFts(double ac) {
        double Fts = ac*43560;
        return String.valueOf(Fts);
    }

    private String acToYds(double ac) {
        double yd2 = ac*4840;
        return String.valueOf(yd2);
    }

    private String acTomi2(double ac) {
        double mi2 = ac*0.0015625;
        return String.valueOf(mi2);
    }

    //fahrenheit
    private String acToac(double ac) {
        double a = ac;
        return String.valueOf(a);
    }

    private String acToha(double ac) {
        double ha = ac*0.40468564224;
        return String.valueOf(ha);
    }

    private String acTomm2(double ac) {
        double Mm2 = ac*4046856422.4;
        return String.valueOf(Mm2);
    }

    private String acTom2(double ac) {
        double m2 = ac*4046.8564224;
        return String.valueOf(m2);
    }

    private String acTokm2(double ac) {
        double km2 = ac*0.0040468564224;
        return String.valueOf(km2);}



}

