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

public class speed_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Meter/Second";
        String toUnit = "Meter/Second";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "m/s",
                "km/h",
                "cm/s",
                "m/Min"

        };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_speed_cal);
            //setContentView(R.layout.);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.speed_relativeLayout);

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
                                et_toUnit.setText(meterpersecondTometerpersecond(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(mpsTokpH(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mpsToftpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(mpsToftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(mpsToyardpMin(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(mpsTomph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(mpsToknots(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(kmphToMps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kmphTokmph(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kmphToFtpMin(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kmphToFtps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(kmphToYardpMin(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(kmphTomph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(kmphTKnots(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[2])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(ftpmTomps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(ftpmTokmph(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(ftpmToftpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ftpmToftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ftpmToYpM(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ftpmToMph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ftpmToknots(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(ftpsToMps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(ftpsToKmph(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(ftpsToftpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(ftpsToftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(ftpsToYpM(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(ftpsToMpH(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(ftpsToknots(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(yPmTOMpS(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(yPmToKmpH(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(yPmTOFtpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(yPmTOftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(tempInput);
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(yPmTOypm(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(yPmTOmph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(yPmTOKnots(Double.parseDouble(tempInput)));
                            }
                        } else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(mphTomps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(mphTokmph(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(mphToftpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(mphToftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(mphTOypm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(tempInput);
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(mphTomph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(mphToknots(Double.parseDouble(tempInput)));
                            }
                        }else if (tv_fromUnit.getText().toString().equals(values[5])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(knotsTomps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(knotsTokmph(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(knotsToftpm(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(knotsToftps(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(knotsTOypm(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(knotsTomph(Double.parseDouble(tempInput)));
                            }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                et_toUnit.setText(tempInput);}
                            else if (tv_toUnit.getText().toString().equals(values[7])) {
                                et_toUnit.setText(knotsToknots(Double.parseDouble(tempInput)));
                            }
                        }
                    }
                }
            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Celcius",
                            "Fahrenheit",
                            "Kelvin",
                            "Rankine",
                            "Newton", "Delisle"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(speed_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Celcius",
                            "Fahrenheit",
                            "Kelvin",
                            "Rankine",
                            "Newton", "Delisle"
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
        private String meterpersecondTometerpersecond(double mps) {
            double Mps= mps;
            return String.valueOf(Mps);
        }

        private String mpsTokpH(double mps) {
            double kph = (5/18)*mps;
            return String.valueOf(kph);
        }
    private String mpsToftpm(double mps) {
        double ftps = 5.08*(10^-3)*mps;
        return String.valueOf(ftps);
    }

        private String mpsToftps(double mps) {
            double ftps = 0.305*mps;
            return String.valueOf(ftps);
        }

        private String mpsTomph(double mps) {
            double mph = 0.45*mps;
            return String.valueOf(mph);
        }

        private String mpsToknots(double mps) {
            double knots = mps*0.51;
            return String.valueOf(knots);
        }

        //fahrenheit
        private String mpsToyardpMin(double mps) {
            double kelvin = mps*1.52*(10^-2);
            return String.valueOf(kelvin);
        }

        private String kmphToMps(double kmps) {
            double mps = kmps*3.6;
            return String.valueOf(mps);
        }

        private String kmphTokmph(double kmph) {
            double Kmph= kmph;
            return String.valueOf(Kmph);
        }

        private String kmphTomph(double kmph) {
            double mph = kmph*1.609;
            return String.valueOf(mph);
        }

        private String kmphTKnots(double kmph) {
            double knots = kmph*1.85;
            return String.valueOf(knots);
        }

        //Kelvin
        private String kmphToFtpMin(double kmph) {
            double ftpmin = kmph*1.83*(10^-2);
            return String.valueOf(ftpmin);
        }

        private String kmphToFtps(double kmph) {
            double ftps = kmph*1.097;
            return String.valueOf(ftps);
        }

        private String kmphToYardpMin(double kmph) {
            double ypm = kmph*5.49*(10^-2);
            return String.valueOf(ypm);
        }

        private String ftpmTomps(double ftpm) {
            double mps = ftpm *196.9;
            return String.valueOf(mps);
        }

        private String ftpmTokmph(double ftpm) {
            double kmph = ftpm*54.68;
            return String.valueOf(kmph);
        }

        //Rankine
        private String ftpmToftpm(double ftpm) {
            double Ftpm = ftpm;
            return String.valueOf(Ftpm);
        }

        private String ftpmToftps(double ftpm) {
            double fts = ftpm*60;
            return String.valueOf(fts);
        }

        private String ftpmToYpM(double ftpm) {
            double ypm = ftpm*3;
            return String.valueOf(ypm);
        }

        private String ftpmToMph(double ftpm) {
            double mph = ftpm*88;
            return String.valueOf(mph);
        }

        private String ftpmToknots(double ftpm) {
            double knots = ftpm*101.3;
            return String.valueOf(knots);
        }

        private String ftpsToMps(double ftps) {
            double mps = ftps*3.28;
            return String.valueOf(mps);
        }

        private String ftpsToKmph (double ftps) {
            double kmph = ftps*0.91;
            return String.valueOf(kmph);
        }

        private String ftpsToftpm (double ftps) {
            double ftpm = ftps*1.67*(10^-2);
            return String.valueOf(ftpm);
        }

        private String ftpsToftps(double newton) {
            double rankine = newton ;
            return String.valueOf(rankine);
        }

        //Delisle
        private String ftpsToYpM(double ftps) {
            double ypm = ftps*0.05;
            return String.valueOf(ypm);
        }

        private String ftpsToMpH(double ftps) {
            double mph = ftps*1.47;
            return String.valueOf(mph);
        }

        private String ftpsToknots(double ftps ) {
            double  knots=  ftps*1.69;
            return String.valueOf(knots);
        }

        private String yPmTOMpS(double ypm) {
            double mps =ypm*65.6;
            return String.valueOf(mps);
        }

        private String yPmToKmpH(double ypm) {
            double kmph = ypm*18.23;
            return String.valueOf(kmph);
        }
    private String yPmTOFtpm(double ypm) {
        double  ftph= ypm*0.33 ;
        return String.valueOf(ftph);

    }private String yPmTOftps(double ypm) {
        double  ftps= ypm*20 ;
        return String.valueOf(ftps);

    }private String yPmTOypm(double ypm) {
        double Ypm = ypm ;
        return String.valueOf(Ypm);
    }private String yPmTOmph(double ypm ) {
        double mph =  ypm*29.33;
        return String.valueOf(mph);
    }private  String yPmTOKnots (double ypm) {
        double  knots= ypm*33.76 ;
        return String.valueOf(knots);
    }


    private String mphTomps(double mph) {
        double mps = mph*2.24 ;
        return String.valueOf(mps);
    }

    private String mphTokmph (double mph) {
        double kmph = mph*0.62 ;
        return String.valueOf(kmph);
    }
    private String mphToftpm(double mph) {
        double ftph = mph*1.14*(10^-2) ;
        return String.valueOf(ftph);
    }
    private String mphToftps(double mph) {
        double ftps = mph* 0.682;
        return String.valueOf(ftps);
    }
    private String mphTOypm(double mph) {
        double Ypm = mph*3.41*(10^-2) ;
        return String.valueOf(Ypm);
    }
    private String mphTomph(double mph) {
        double Mph = mph ;
        return String.valueOf(Mph);
    }
    private String mphToknots(double mph) {
        double knots = mph*1.15 ;
        return String.valueOf(knots);
    }
    private String knotsTomps(double knots) {
        double mps = knots*1.94 ;
        return String.valueOf(mps);
    }
    private String knotsTokmph(double k) {
        double kmph = k*0.54 ;
        return String.valueOf(kmph);
    }

    private String knotsToftpm(double k) {
        double ftph = k*9.87*(10^-3) ;
        return String.valueOf(ftph);
    }
    private String knotsToftps(double k) {
        double ftps = k* 0.592;
        return String.valueOf(ftps);
    }
    private String knotsTOypm(double k) {
        double Ypm = k*2.96*(10^-2) ;
        return String.valueOf(Ypm);
    }
    private String knotsTomph(double k) {
        double Mph = k*0.869 ;
        return String.valueOf(Mph);
    }
    private String knotsToknots(double k) {
        double    knots = k ;
        return String.valueOf(knots);
    }

    }

