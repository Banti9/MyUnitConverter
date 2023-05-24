package com.example.myunitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.DialogInterface;
//import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.Math;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Arrays;

public class torque_cal extends AppCompatActivity {

            CardView cv_fromUnit, cv_toUnit, cv_convert;
            RelativeLayout mCLayout;
            String fromUnit = "Newton Meter";
            String toUnit = " Newton Meter";
            TextView tv_fromUnit, tv_toUnit;
            EditText et_fromUnit, et_toUnit;
            final String[] values = new String[]{

                    "N.m",
                    "daN.m",
                    "kN.m",
                    "dN.m",
                    "cN.m",
                    "mN.m",
                    "MicoN.m",
                    "N.mm",
                    "kgf.m",
                    "kgf.cm",
                    "gf.m",
                    "gf.cm",
                    "dyn.cm",
                   "lbf.ft",
                    "lbf.in",
                    "ozf.in",
                    "pdl.ft",
                    "pdl.in",
                    "tonf.ft"
            };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_torque_cal);


                cv_fromUnit = findViewById(R.id.fromUnit);
                cv_toUnit = findViewById(R.id.toUnit);
                cv_convert = findViewById(R.id.cv_convert);

                mCLayout = findViewById(R.id.torque_relativeLayout);

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
                                    et_toUnit.setText(NewtonMeterToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(NewtonMeterToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(NewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(NewtonMeterToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(NewtonMeterToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                }
                                else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(NewtonMToMilli(Double.parseDouble(tempInput)));
                                }
                                else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(NewtonMTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(NewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(centiNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(NewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(NewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(NewtonMeterToDyneCM(Double.parseDouble(tempInput)));
                                }

                                 else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(NewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(NewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(NewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(NewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[16])) {
                                    et_toUnit.setText(NewtonMeterToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(NewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(NewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));
                                }
                            } else if (tv_fromUnit.getText().toString().equals(values[1])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(decaNewtonMeterToNewtonMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(decaNewtonMeterToDecaNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(decaNewtonMeterToKiloNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(decaNewtonMeterToDeciNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(decaNewtonMeterToCentiNm(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(decaNewtonMeterToMilliNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(decaNewtonMeterToMicroNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(decaNewtonMeterToMilliNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(decaNewtonMeterToKilogramFM(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(decaNewtonMeterToKGForceCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(decaNewtonMeterToGramForceMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(decaNewtonMeterTogFCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(decaNewtonMeterToDyne(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[16])) {
                                    et_toUnit.setText(decaNewtonMeterToPoundalInch(Double.parseDouble(tempInput)));

                                } else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(decaNewtonMeterToPoundalFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(decaNewtonMeterToIbfInch(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(decaNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[21])) {
                                    et_toUnit.setText(decaNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }
                            }
                            else if (tv_fromUnit.getText().toString().equals(values[2])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(deciNewtonMeterToNewtonMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(deciNewtonMeterToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(deciNewtonMeterToCentiNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(deciNewtonMeterToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(deciNewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(deciNewtonMeterToCentiNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(deciNewtonMeterToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(deciNewtonMTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(deciNewtonMToMilli(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(deciNewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(deciNewtonMeterToKGFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(deciNewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(deciNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(deciNewtonMeterToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(deciNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(deciNewtonMeterToPoundForceInch(Double.parseDouble(tempInput)));
                                }

                                else if (tv_toUnit.getText().toString().equals(values[21])) {
                                    et_toUnit.setText(deciNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(deciNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(decaNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));

                                }else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(deciNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(deciNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }
                            } else if (tv_fromUnit.getText().toString().equals(values[3])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(centiNewtonMeterToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(centiNewtonMeterToDecaNm (Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(centiNewtonMeterToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(centiNewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(centiNewtonMToCentiNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(centiNewtonMeterToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(centiNewtonMTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(centiNewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(centiNewtonMeterToKGFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(centiNewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(centiNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(tempInput);
                                } else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(centiNewtonMeterToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(centiNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[16])) {
                                    et_toUnit.setText(centiNewtonMeterToPoundForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(centiNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(centiNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(centiNewtonMeterToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(deciNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[21])) {
                                    et_toUnit.setText(centiNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));
                                }
                            } else if (tv_fromUnit.getText().toString().equals(values[4])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(kiloNmToNewtonMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(kiloNewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(KiloNewtonMeterToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(kiloNewtonMToMilli(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(kiloNewtonMTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(KiloNewtonMeterToCenti(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(kiloNewtonMeterToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(kiloNewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(kiloNewtonMeterToKGFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(kiloNewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[16])) {
                                    et_toUnit.setText(kiloNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(kiloNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(kiloNewtonMeterToPoundForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(kiloNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(kiloNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[21])) {
                                    et_toUnit.setText(kiloNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[22])) {
                                    et_toUnit.setText(kiloNewtonMeterToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[23])) {
                                    et_toUnit.setText(kiloNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[24])) {
                                    et_toUnit.setText(kiloNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[5])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(microNewtonMToNm (Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(microNewtonMeterToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(microNewtonMeterToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(microNewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(microNewtonMeterToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(microNewtonMeterToDyneCM(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(microNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(microNewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(microNewtonMeterToKGFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(microNewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(microNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(microNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(microNewtonMeterToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[16])) {
                                    et_toUnit.setText(microNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(microNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(microNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));

                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[5])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(milliNewtonMToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(milliNewtonMeterToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(milliNewtonMeterToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(milliNewtonMeterToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(milliNewtonMeterToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(milliNewtonMeterToDyneCM(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(milliNewtonMeterToGramFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(milliNewtonMeterToGramForceMetre(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(milliNewtonMeterToKilogramForce(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(milliNewtonMeterToKGFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(milliNewtonMeterToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(milliNewtonMeterToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(milliNewtonMeterToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(milliNewtonMeterToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(milliNewtonMeterToPoundForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(milliNewtonMeterToPoundForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(milliNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(milliNewtonMeterToUKToneForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(milliNewtonMTOMicro(Double.parseDouble(tempInput)));
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[6])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(kgFmToMilli(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(kgfMToDecaNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(kgFmToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(kgFmToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(kgFmTOMicroNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }else if (tv_toUnit.getText().toString().equals(values[6])) {
                                    et_toUnit.setText(kgForceMeterTONewtonMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[7])) {
                                    et_toUnit.setText(kgFmToMilli(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[8])) {
                                    et_toUnit.setText(kgFmToDyneCM(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[9])) {
                                    et_toUnit.setText(kgFmToGramFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[10])) {
                                    et_toUnit.setText(kgFmToKGFCentiMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[11])) {
                                    et_toUnit.setText(kgFmToOunceForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[12])) {
                                    et_toUnit.setText(kgFmToNewtonMilliMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[13])) {
                                    et_toUnit.setText(kgFmToUKToneForceFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[14])) {
                                    et_toUnit.setText(kiloNewtonMeterToPounddalInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[15])) {
                                    et_toUnit.setText(kgFmToOunceForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[17])) {
                                    et_toUnit.setText(kgFmToPoundForceInch(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[18])) {
                                    et_toUnit.setText(kgForceMeterTONewtonMeter(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[19])) {
                                    et_toUnit.setText(kgForceMeterTOMilliNM(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[20])) {
                                    et_toUnit.setText(kgFmToPounddalFoot(Double.parseDouble(tempInput)));
                                }else if (tv_toUnit.getText().toString().equals(values[21])) {
                                    et_toUnit.setText(kgFmToPounddalInch(Double.parseDouble(tempInput)));
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[7])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(  kgFcmToUKToneForceFoot(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(kgFcmToDyneCM(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(kgFcmToCenti(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(kgFcmToDeci(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(kgFcmToKGFCentiMeter(Double.parseDouble(tempInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(tempInput);
                            }
                              else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(kgFcmToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(kgFcmToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(kgFcmToPounddalInch(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(kgFcmToGramFCentiMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[8])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(gForceMeterTONewtonMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(gFcmToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(gFcmToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(gFcmToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(gFcmToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[9])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(gFcmToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(gFcmToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(gFcmToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(kgFcmToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(gFcmTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[10])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(dyneCmToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(dyneTOMicroNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(dyneCmTONewtonMeter(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(dyneCmToUKToneForceFoot(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(dyneCmToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[11])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(  lbfFToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(lbfFToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(lbfFToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(lbfFToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(lbfFTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[12])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(lbfInToDeca (Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(lbfInToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(lbfInToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(lbfInToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(lbfFTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[13])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(ozfInToDeci(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(ozfinToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(ozfInToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(ozfInToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(ozfInTOMicro(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[14])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(pdlFToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(pdlFToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(pdlFToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(pdlFToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(pdlFToCenti(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                    et_toUnit.setText(tempInput);
                                }
                            }else if (tv_fromUnit.getText().toString().equals(values[15])) {
                                if (tv_toUnit.getText().toString().equals(values[0])) {
                                    et_toUnit.setText(toneToDeca(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                    et_toUnit.setText(toneToDyneCM(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                    et_toUnit.setText(toneToNm(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                    et_toUnit.setText(toneToKilo(Double.parseDouble(tempInput)));
                                } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                    et_toUnit.setText(toneToMilli(Double.parseDouble(tempInput)));
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

                        final AlertDialog.Builder builder = new AlertDialog.Builder(torque_cal.this);
                        builder.setTitle("choose Unit");

                        final String[] flowers = new String[]{"N.m",
                                "daN.m",
                                "kN.m",
                                "dN.m",
                                "cN.m",
                                "mN.m",
                                "MicoN.m",
                                "N.mm",
                                "kgf.m",
                                "kgf.cm",
                                "gf.m",
                                "gf.cm",
                                "dyn.cm",
                                "Ibf.ft",
                                "Ibl.in",
                                "ozf.in",
                                "pdl.ft",
                                "pdl.in",
                                "tonf.ft"
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

                        final AlertDialog.Builder builder = new AlertDialog.Builder(torque_cal.this);
                        builder.setTitle("choose Unit");

                        final String[] flowers = new String[]{
                                "N.m",
                                "daN.m",
                                "kN.m",
                                "dN.m",
                                "cN.m",
                                "mN.m",
                                "MicoN.m",
                                "N.mm",
                                "kgf.m",
                                "kgf.cm",
                                "gf.m",
                                "gf.cm",
                                "dyn.cm",
                                "lbf.ft",
                                "lbf.in",
                                "ozf.in",
                                "pdl.ft",
                                "pdl.in",
                                "tone.ft"


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

            //
            private String NewtonMeterToDeca(double Nm) {
                double dNm = Nm*0.1;
                return String.valueOf(dNm);
            }

            private String NewtonMeterToKilo(double Nm) {
                double kNm = Nm*0.001;
                return String.valueOf(kNm);
            }

            private String NewtonMeterToDeci(double Nm) {
                double deNm = Nm*10;
                return String.valueOf(deNm);
            }

            private String NewtonMeterToCenti(double Nm) {
                double cNm = Nm*100;
                return String.valueOf(cNm);
            }

            private String NewtonMToMilli(double Nm) {
                double mNm = Nm*1000;
                return String.valueOf(mNm);
            }


            private String NewtonMTOMicro(double Nm) {
                double MicroNm= Nm*1000000;
                return String.valueOf(MicroNm);
            }

            private String NewtonMeterToNewtonMilliMeter(double Nm) {
                double Nmm = Nm*1000;
                return String.valueOf(Nmm);
            }
    private String NewtonMeterToKilogramForce(double Nm) {
        double kgFm = Nm*0.10197162;
        return String.valueOf(kgFm);
    }
    private String NewtonMeterToKGFCentiMeter(double Nm) {
        double kgFcm = Nm*1000;
        return String.valueOf(kgFcm);
    }
    private String NewtonMeterToGramForceMetre(double Nm) {
        double gfm = Nm*101.9716213;
        return String.valueOf(gfm);
    }
    private String NewtonMeterToGramFCentiMeter(double Nm) {
        double gfcm = Nm*10197.16213;
        return String.valueOf(gfcm);
    }
    private String NewtonMeterToDyneCM(double Nm) {
        double dynecm = Nm*10000000;
        return String.valueOf(dynecm);
    }
    private String NewtonMeterToPoundForceFoot(double Nm) {
        double ibfFt = Nm*0.73756215;
        return String.valueOf(ibfFt);
    }
    private String NewtonMeterToPoundForceInch(double Nm) {
        double ibfIn = Nm*8.85074579;
        return String.valueOf(ibfIn);
    }
    private String NewtonMeterToOunceForceFoot(double Nm) {
        double ozff = Nm*8.850748;
        return String.valueOf(ozff);
    }
    private String NewtonMeterToOunceForceInch(double Nm) {
        double ozfI  = Nm*141.611992894;
        return String.valueOf(ozfI);
    }
    private String NewtonMeterToPounddalFoot(double Nm) {
        double pdlFt = Nm*23.73036609;
        return String.valueOf(pdlFt);
    }
    private String NewtonMeterToPounddalInch(double Nm) {
        double pdlI= Nm*284.76439306;
        return String.valueOf(pdlI);
    }
    private String NewtonMeterToUKToneForceFoot(double Nm) {
        double toneFt= Nm*3.2927/10000;
        return String.valueOf(toneFt);
    }

///deca newton meter
            private String decaNewtonMeterToNewtonMeter(double daNm) {
                double Nm = daNm*10;
                return String.valueOf(Nm);
            }private String decaNewtonMeterToDecaNm(double daNm) {
        double dNm = daNm;
        return String.valueOf(dNm);}

            private String decaNewtonMeterToKiloNm (double daNm) {
                double kNm = daNm*0.01;
                return String.valueOf(kNm);
            }

            private String decaNewtonMeterToDeciNm (double DaNm) {
                double DNm= DaNm*100;
                return String.valueOf(DNm);
            }

            //Kelvin
            private String decaNewtonMeterToCentiNm(double daNm) {
                double CNm = daNm*1000;
                return String.valueOf(CNm);
            }

            private String decaNewtonMeterToMilliNm(double daNm) {
                double mNm= daNm*10000;
                return String.valueOf(mNm);
            }

            private String decaNewtonMeterToMicroNm(double daNm) {
                double MicroNm = daNm*10000000;
                return String.valueOf(MicroNm);
            }

            private String decaNewtonMeterToKilogramFM(double daNm) {
                double kgfm= daNm*1.0197162;
                return String.valueOf(kgfm);
            }

            private String decaNewtonMeterToKGForceCentiMeter(double daNm) {
                double kgFcm= daNm*101.9716213;
                return String.valueOf(kgFcm);
            }

            //Rankine
            private String decaNewtonMeterToGramForceMeter(double daNm) {
                double gFm = daNm*1019.716213;
                return String.valueOf(gFm);
            }

            private String decaNewtonMeterTogFCM(double daNm) {
                double gFcm= daNm*101971.6212978;
                return String.valueOf(gFcm);
            }

            private String decaNewtonMeterToDyne(double daNm) {
                double dycm = daNm*(10^7);
                return String.valueOf(dycm);
            }

            private String decaNewtonMeterToPoundForceFoot(double daNm) {
                double ibfFt = daNm*7.3756215;
                return String.valueOf(ibfFt);
            }

            private String decaNewtonMeterToIbfInch(double daNm) {
                double ibfIn= 88.5074579;
                return String.valueOf(ibfIn);
            }

            //Newton
            private String decaNewtonMeterToOunceForceFoot(double daNm) {
                double  ozft= daNm*88.50748;
                return String.valueOf(ozft);
            }

            private String decaNewtonMeterToOunceForceInch(double daNm) {
                double ozin = daNm*1416.1192894;
                return String.valueOf(ozin);
            }

            private String decaNewtonMeterToPoundalFoot(double daNm) {
                double pdlFt = daNm*237.3036609;
                return String.valueOf(pdlFt);
            }

            private String decaNewtonMeterToPoundalInch(double daNm) {
                double pdlIn = daNm*2847.6439306;
                return String.valueOf(pdlIn);
            }

            private String decaNewtonMeterToUKToneForceFoot(double daNm) {
                double ToneFt = daNm*(32.927/10000);
                return String.valueOf(ToneFt);
            }





            //kiloNewton meter
    private String KiloNewtonMeterToDeca(double kNm) {
        double dNm = kNm*100;
        return String.valueOf(dNm);
    }

    private String kiloNmToNewtonMeter(double kNm) {
        double Nm = kNm*1000;
        return String.valueOf(Nm);
    }

    private String kiloNewtonMeterToDeci(double kNm) {
        double deNm = kNm*10000;
        return String.valueOf(deNm);
    }

    private String KiloNewtonMeterToCenti(double kNm) {
        double cNm = kNm*100000;
        return String.valueOf(cNm);
    }

    private String kiloNewtonMToMilli(double kNm) {
        double mNm = kNm*1000000;
        return String.valueOf(mNm);
    }


    private String kiloNewtonMTOMicro(double kNm) {
        double MicroNm= kNm*1000000000;
        return String.valueOf(MicroNm);
    }

    private String kiloNewtonMeterToNewtonMilliMeter(double kNm) {
        double Nmm = kNm*1000000;
        return String.valueOf(Nmm);
    }
    private String kiloNewtonMeterToKilogramForce(double kNm) {
        double kgFm = kNm*101.97162;
        return String.valueOf(kgFm);
    }
    private String kiloNewtonMeterToKGFCentiMeter(double kNm) {
        double kgFcm = kNm*1000000;
        return String.valueOf(kgFcm);
    }
    private String kiloNewtonMeterToGramForceMetre(double kNm) {
        double gfm = kNm*101971.6213;
        return String.valueOf(gfm);
    }
    private String kiloNewtonMeterToGramFCentiMeter(double kNm) {
        double gfcm = kNm*10197162.13;
        return String.valueOf(gfcm);
    }
    private String kiloNewtonMeterToDyneCM(double kNm) {
        double dynecm = kNm*(10^10);
        return String.valueOf(dynecm);
    }
    private String kiloNewtonMeterToPoundForceFoot(double kNm) {
        double ibfFt = kNm*737.56215;
        return String.valueOf(ibfFt);
    }
    private String kiloNewtonMeterToPoundForceInch(double kNm) {
        double ibfIn = kNm*8850.74579;
        return String.valueOf(ibfIn);
    }
    private String kiloNewtonMeterToOunceForceFoot(double kNm) {
        double ozff = kNm*8850.748;
        return String.valueOf(ozff);
    }
    private String kiloNewtonMeterToOunceForceInch(double kNm) {
        double ozfI  = kNm*141611.992894;
        return String.valueOf(ozfI);
    }
    private String kiloNewtonMeterToPounddalFoot(double kNm) {
        double pdlFt = kNm*23730.36609;
        return String.valueOf(pdlFt);
    }
    private String kiloNewtonMeterToPounddalInch(double kNm) {
        double pdlI= kNm*284764.39306;
        return String.valueOf(pdlI);
    }
    private String kiloNewtonMeterToUKToneForceFoot(double kNm) {
        double toneFt= kNm*3292.7/10000;
        return String.valueOf(toneFt);
    }
    ///deciNewton meter
    private String deciNewtonMeterToNewtonMeter(double dNm) {
        double Nm = dNm*10;
        return String.valueOf(Nm);
    }
    private String deciNewtonMeterToDeca(double dNm) {
        double daNm = dNm*0.01;
        return String.valueOf(daNm);}

    private String deciNewtonMeterToKilo(double dNm) {
        double kNm = dNm*0.0001;
        return String.valueOf(kNm);
    }

    private String deciNewtonMeterToDeci(double dNm) {
        double deNm = dNm;
        return String.valueOf(deNm);}


    private String deciNewtonMeterToCentiNm(double dNm) {
        double cNm = dNm*10;
        return String.valueOf(cNm);
    }

    private String deciNewtonMToMilli(double dNm) {
        double mNm = dNm*100;
        return String.valueOf(mNm);
    }


    private String deciNewtonMTOMicro(double dNm) {
        double MicroNm= dNm*100000;
        return String.valueOf(MicroNm);
    }

    private String deciNewtonMeterToNewtonMilliMeter(double dNm) {
        double Nmm = dNm*100;
        return String.valueOf(Nmm);
    }
    private String deciNewtonMeterToKilogramForce(double dNm) {
        double kgFm = dNm*0.010197162;
        return String.valueOf(kgFm);
    }
    private String deciNewtonMeterToKGFCentiMeter(double dNm) {
        double kgFcm = dNm*100;
        return String.valueOf(kgFcm);
    }
    private String deciNewtonMeterToGramForceMetre(double dNm) {
        double gfm = dNm*10.19716213;
        return String.valueOf(gfm);
    }
    private String deciNewtonMeterToGramFCentiMeter(double dNm) {
        double gfcm = dNm*1019.716213;
        return String.valueOf(gfcm);
    }
    private String deciNewtonMeterToDyneCM(double dNm) {
        double dynecm = dNm*1000000;
        return String.valueOf(dynecm);
    }
    private String deciNewtonMeterToPoundForceFoot(double dNm) {
        double ibfFt = dNm*0.073756215;

        return String.valueOf(ibfFt);}

    private String deciNewtonMeterToPoundForceInch(double dNm) {
        double ibfIn = dNm*0.885074579;
        return String.valueOf(ibfIn);
    }
    private String deciNewtonMeterToOunceForceFoot(double dNm) {
        double ozff = dNm*0.8850748;
        return String.valueOf(ozff);
    }
    private String deciNewtonMeterToOunceForceInch(double dNm) {
        double ozfI  = dNm*14.1611992894;
        return String.valueOf(ozfI);
    }
    private String deciNewtonMeterToPounddalFoot(double dNm) {
        double pdlFt = dNm*2.373036609;
        return String.valueOf(pdlFt);
    }
    private String deciNewtonMeterToPounddalInch(double dNm) {
        double pdlI= dNm*28.476439306;
        return String.valueOf(pdlI);
    }
    private String deciNewtonMeterToUKToneForceFoot(double dNm) {
        double toneFt= dNm*0.32927/10000;
        return String.valueOf(toneFt);
    }
    private String centiNewtonMeterToDecaNm(double cNm) {
        double daNm = cNm*0.001;
        return String.valueOf(daNm);
    }

    private String centiNewtonMeterToKilo(double cNm) {
        double kNm = cNm*0.00001;
        return String.valueOf(kNm);
    }

    private String centiNewtonMeterToDeci(double cNm) {
        double dNm = cNm*0.1;
        return String.valueOf(dNm);
    }

    private String centiNewtonMeterToNm(double cNm) {
        double Nm = cNm*0.01;
        return String.valueOf(cNm);
    }

    private String centiNewtonMToMilli(double cNm) {
        double mNm = cNm*10;
        return String.valueOf(mNm);
    }

    private String centiNewtonMToCentiNm(double cNm) {
        double CNm = cNm;
        return String.valueOf(CNm);
    }

    private String centiNewtonMTOMicro(double cNm) {
        double MicroNm= cNm*10000;
        return String.valueOf(MicroNm);
    }

    private String centiNewtonMeterToNewtonMilliMeter(double cNm) {
        double Nmm = cNm*10;
        return String.valueOf(Nmm);
    }
    private String centiNewtonMeterToKilogramForce(double cNm) {
        double kgFm = cNm*0.0010197162;
        return String.valueOf(kgFm);
    }
    private String centiNewtonMeterToKGFCentiMeter(double cNm) {
        double kgFcm = cNm*10;
        return String.valueOf(kgFcm);
    }
    private String centiNewtonMeterToGramForceMetre(double cNm) {
        double gfm = cNm*1.019716213;
        return String.valueOf(gfm);
    }
    private String centiNewtonMeterToGramFCentiMeter(double cNm) {
        double gfcm = cNm*101.9716213;
        return String.valueOf(gfcm);
    }
    private String centiNewtonMeterToDyneCM(double cNm) {
        double dynecm = cNm*100000;
        return String.valueOf(dynecm);
    }
    private String centiNewtonMeterToPoundForceFoot(double cNm) {
        double ibfFt = cNm*0.0073756215;
        return String.valueOf(ibfFt);
    }
    private String centiNewtonMeterToPoundForceInch(double cNm) {
        double ibfIn = cNm*0.0885074579;
        return String.valueOf(ibfIn);
    }
    private String centiNewtonMeterToOunceForceFoot(double cNm) {
        double ozff = cNm*0.08850748;
        return String.valueOf(ozff);
    }
    private String centiNewtonMeterToOunceForceInch(double cNm) {
        double ozfI  = cNm*1.41611992894;
        return String.valueOf(ozfI);
    }
    private String centiNewtonMeterToPounddalFoot(double cNm) {
        double pdlFt = cNm*0.2373036609;
        return String.valueOf(pdlFt);
    }
    private String centiNewtonMeterToPounddalInch(double cNm) {
        double pdlI= cNm*2.8476439306;
        return String.valueOf(pdlI);
    }
    private String centiNewtonMeterToUKToneForceFoot(double cNm) {
        double toneFt= cNm*0.032927/10000;
        return String.valueOf(toneFt);
    }

   // mlli newton meter
    private String milliNewtonMeterToDeca(double mNm) {
        double dNm = mNm*0.0001;
        return String.valueOf(dNm);
    }

    private String milliNewtonMeterToKilo(double mNm) {
        double kNm = mNm*0.000001;
        return String.valueOf(kNm);
    }

    private String milliNewtonMeterToDeci(double mNm) {
        double deNm = mNm*0.01;
        return String.valueOf(deNm);
    }

    private String milliNewtonMeterToCenti(double mNm) {
        double cNm = mNm*0.1;
        return String.valueOf(cNm);
    }

    private String milliNewtonMToNm(double mNm) {
        double Nm = mNm*0.001;
        return String.valueOf(Nm);
    }


    private String milliNewtonMTOMicro(double mNm) {
        double MicroNm= mNm*1000;
        return String.valueOf(MicroNm);
    }

    private String milliNewtonMeterToNewtonMilliMeter(double mNm) {
        double Nmm = mNm*1;
        return String.valueOf(Nmm);
    }
    private String milliNewtonMeterToKilogramForce(double mNm) {
        double kgFm = (mNm*0.10197162)/1000;
        return String.valueOf(kgFm);
    }
    private String milliNewtonMeterToKGFCentiMeter(double mNm) {
        double kgFcm = mNm*1;
        return String.valueOf(kgFcm);
    }
    private String milliNewtonMeterToGramForceMetre(double mNm) {
        double gfm = (mNm*101.9716213)/1000;
        return String.valueOf(gfm);
    }
    private String milliNewtonMeterToGramFCentiMeter(double mNm) {
        double gfcm = (mNm*10197.16213)/1000;
        return String.valueOf(gfcm);
    }
    private String milliNewtonMeterToDyneCM(double mNm) {
        double dynecm = mNm*10000;
        return String.valueOf(dynecm);
    }
    private String milliNewtonMeterToPoundForceFoot(double mNm) {
        double ibfFt = (mNm*0.73756215)/1000;
        return String.valueOf(ibfFt);
    }
    private String milliNewtonMeterToPoundForceInch(double mNm) {
        double ibfIn = (mNm*8.85074579)/1000;
        return String.valueOf(ibfIn);
    }
    private String milliNewtonMeterToOunceForceFoot(double mNm) {
        double ozff = (mNm*8.850748)/1000;
        return String.valueOf(ozff);
    }
    private String milliNewtonMeterToOunceForceInch(double mNm) {
        double ozfI  = (mNm*141.611992894)/1000;
        return String.valueOf(ozfI);
    }
    private String milliNewtonMeterToPounddalFoot(double mNm) {
        double pdlFt = (mNm*23.73036609)/1000;
        return String.valueOf(pdlFt);
    }
    private String milliNewtonMeterToPounddalInch(double mNm) {
        double pdlI= (mNm*284.76439306)/1000;
        return String.valueOf(pdlI);
    }
    private String milliNewtonMeterToUKToneForceFoot(double mNm) {
        double toneFt= (mNm*3.2927/10000000);
        return String.valueOf(toneFt);
    }

    private String  microNewtonMeterToDeca(double microNm) {
        double daNm = microNm*0.1/1000000;
        return String.valueOf(daNm);
    }

    private String microNewtonMeterToKilo(double MNm) {
        double kNm = MNm*0.001/1000000;
        return String.valueOf(kNm);
    }

    private String microNewtonMeterToDeci(double MNm) {
        double dNm = MNm/100000;
        return String.valueOf(dNm);
    }

    private String microNewtonMeterToCenti(double MNm) {
        double cNm = MNm/10000;
        return String.valueOf(cNm);
    }

    private String microNewtonMToMilli(double MNm) {
        double mNm = MNm/1000;
        return String.valueOf(mNm);
    }


    private String microNewtonMToNm(double MNm) {
        double Nm= MNm/1000000;
        return String.valueOf(Nm);
    }

    private String microNewtonMeterToNewtonMilliMeter(double MNm) {
        double Nmm = MNm/1000;
        return String.valueOf(Nmm);
    }
    private String microNewtonMeterToKilogramForce(double MNm) {
        double kgFm = (MNm*0.10197162)/1000000;
        return String.valueOf(kgFm);
    }
    private String microNewtonMeterToKGFCentiMeter(double MNm) {
        double kgFcm = MNm/1000;
        return String.valueOf(kgFcm);
    }
    private String microNewtonMeterToGramForceMetre(double MNm) {
        double gfm = (MNm*101.9716213)/1000000;
        return String.valueOf(gfm);
    }
    private String microNewtonMeterToGramFCentiMeter(double MNm) {
        double gfcm = (MNm*10197.16213)/1000000;
        return String.valueOf(gfcm);
    }
    private String microNewtonMeterToDyneCM(double MNm) {
        double dynecm = MNm*10;
        return String.valueOf(dynecm);
    }
    private String microNewtonMeterToPoundForceFoot(double MNm) {
        double ibfFt = MNm*0.73756215*(10^-6);
        return String.valueOf(ibfFt);
    }
    private String microNewtonMeterToPoundForceInch(double MNm) {
        double ibfIn = MNm*8.85074579*(10^-6);
        return String.valueOf(ibfIn);
    }
    private String microNewtonMeterToOunceForceFoot(double MNm) {
        double ozff = MNm*8.850748*(10^-6);
        return String.valueOf(ozff);
    }
    private String microNewtonMeterToOunceForceInch(double MNm) {
        double ozfI  = MNm*141.611992894*(10^-6);
        return String.valueOf(ozfI);
    }
    private String microNewtonMeterToPounddalFoot(double MNm) {
        double pdlFt = MNm*23.73036609*(10^-6);
        return String.valueOf(pdlFt);
    }
    private String microNewtonMeterToPounddalInch(double MNm) {
        double pdlI= MNm*284.76439306*(10^-6);
        return String.valueOf(pdlI);
    }
    private String microNewtonMeterToUKToneForceFoot(double MNm) {
        double toneFt= MNm*3.2927*(10^-10);
        return String.valueOf(toneFt);
    }



    //Kilogram Force meter or kilo pound meter
    private String kgForceMeterTONewtonMeter(double kgFm) {
        double Nm = kgFm*1/0.10197162;
        return String.valueOf(Nm);
    }

    private String kgfMToDecaNm(double kgFm) {
        double daNm = kgFm*0.001/0.10197162;
        return String.valueOf(daNm);
    }

    private String kgFmToDeci(double kgFm) {
        double deNm = kgFm*10/0.10197162;
        return String.valueOf(deNm);
    }

    private String kgFmToCenti(double kgFm) {
        double cNm = kgFm*100/0.10197162;
        return String.valueOf(cNm);
    }

    private String kgForceMeterTOMilliNM(double kgFm) {
        double mNm = kgFm*1000/0.10197162;
        return String.valueOf(mNm);
    }


    private String kgFmTOMicroNm(double kgFm) {
        double MicroNm= kgFm*1000000/0.10197162;
        return String.valueOf(MicroNm);
    }

    private String kgFmToNewtonMilliMeter(double kgFm) {
        double Nmm = kgFm*1000/0.10197162;
        return String.valueOf(Nmm);

    }
    private String kgFmToKGFCentiMeter(double kgFm) {
        double kgFcm = kgFm*1000/0.10197162;
        return String.valueOf(kgFcm);
    }
    private String kgFmToGramForceMetre(double kgFm) {
        double gfm = kgFm*101.9716213/0.10197162;
        return String.valueOf(gfm);
    }
    private String kgFmToGramFCentiMeter(double kgFm) {
        double gfcm = kgFm*10197.16213/0.10197162;
        return String.valueOf(gfcm);
    }
    private String kgFmToDyneCM(double kgFm) {
        double dynecm = kgFm*(10^-6)/(0.10197162);
        return String.valueOf(dynecm);
    }
    private String kgFmToPoundForceFoot(double kgFm) {
        double ibfFt = kgFm*0.73756215/0.10197162;
        return String.valueOf(ibfFt);
    }
    private String kgFmToPoundForceInch(double kgFm) {
        double ibfIn = kgFm*8.85074579/0.10197162;
        return String.valueOf(ibfIn);
    }
    private String kgFmToOunceForceFoot(double kgFm) {
        double ozff = kgFm*8.850748/0.10197162;
        return String.valueOf(ozff);
    }
    private String kgFmToOunceForceInch(double kgFm) {
        double ozfI  = kgFm*141.611992894/0.10197162;
        return String.valueOf(ozfI);
    }
    private String kgFmToPounddalFoot(double kgFm) {
        double pdlFt = kgFm*23.73036609/0.10197162;
        return String.valueOf(pdlFt);
    }
    private String kgFmToPounddalInch(double kgFm) {
        double pdlI= kgFm*284.76439306/0.10197162;
        return String.valueOf(pdlI);
    }
    private String kgFmToUKToneForceFoot(double kgFm) {
        double toneFt= kgFm*3.2927/(0.10197162*10000);
        return String.valueOf(toneFt);
    }
    //kilogram force centimeter
    private String kgFcmToDeca(double kgFcm) {
        double dNm = kgFcm*0.1/10.19716213;
        return String.valueOf(dNm);
    }private String kgFcmToNm(double kgFcm) {
        double Nm = kgFcm*1/10.19716213;
        return String.valueOf(Nm);
    }

    private String kgFcmToKilo(double kgFcm) {
        double kNm = kgFcm*0.001/10.19716213;
        return String.valueOf(kNm);
    }

    private String kgFcmToDeci(double kgFcm) {
        double deNm = kgFcm*10/10.19716213;
        return String.valueOf(deNm);
    }

    private String kgFcmToCenti(double kgFcm) {
        double cNm = kgFcm*100/10.19716213;
        return String.valueOf(cNm);
    }

    private String kgFmToMilli(double kgFcm) {
        double mNm = kgFcm*1000/10.19716213;
        return String.valueOf(mNm);
    }


    private String kgFcmTOMicro(double kgFcm) {
        double MicroNm= kgFcm*(10^6)/10.19716213;
        return String.valueOf(MicroNm);
    }

    private String kgFcmToNewtonMilliMeter(double kgFcm) {
        double Nmm = kgFcm*1000/10.19716213;
        return String.valueOf(Nmm);
    }
    private String kgFcmToKilogramForceM(double kgFcm) {
        double kgFm = kgFcm*0.10197162/10.19716213;
        return String.valueOf(kgFm);
    }
    private String kgFcmToKGFCentiMeter(double kgfcm) {
        double kgFcm = kgfcm;
        return String.valueOf(kgFcm);
    }
    private String kgFcmToGramForceMetre(double kgFcm) {
        double gfm = kgFcm*101.9716213/10.19716213;
        return String.valueOf(gfm);
    }
    private String kgFcmToGramFCentiMeter(double kgFcm) {
        double gfcm = kgFcm*10197.16213/10.19716213;
        return String.valueOf(gfcm);
    }
    private String kgFcmToDyneCM(double kgFcm) {
        double dynecm = kgFcm*(10^-6)/10.19716213;
        return String.valueOf(dynecm);
    }
    private String kgFcmToPoundForceFoot(double kgFcm) {
        double ibfFt = kgFcm*0.73756215/10.19716213;
        return String.valueOf(ibfFt);
    }
    private String kgFcmToPoundForceInch(double kgFcm) {
        double ibfIn = kgFcm*8.85074579/10.19716213;
        return String.valueOf(ibfIn);
    }
    private String kgFcmToOunceForceFoot(double kgFcm) {
        double ozff = kgFcm*8.850748/10.19716213;
        return String.valueOf(ozff);
    }
    private String kgFcmToOunceForceInch(double kgFcm) {
        double ozfI  = kgFcm*141.611992894/10.19716213;
        return String.valueOf(ozfI);
    }
    private String kgFcmToPounddalFoot(double kgFcm) {
        double pdlFt = kgFcm*23.73036609/10.19716213;
        return String.valueOf(pdlFt);
    }
    private String kgFcmToPounddalInch(double kgFcm) {
        double pdlI= kgFcm*284.76439306/10.19716213;
        return String.valueOf(pdlI);
    }
    private String kgFcmToUKToneForceFoot(double kgFcm) {
        double toneFt= kgFcm*3.2927/10.19716213*(10^-4);
        return String.valueOf(toneFt);
    }


    //gram force meter
    private String gForceMeterTONewtonMeter(double gFm) {
        double Nm = gFm*1/101.9716213;
        return String.valueOf(Nm);
    }

    private String gfMToDecaNm(double gFm) {
        double daNm = gFm*0.001/101.9716213;
        return String.valueOf(daNm);
    }

    private String gFmToDeci(double gFm) {
        double deNm = gFm*10/101.9716213;
        return String.valueOf(deNm);
    }

    private String gFmToCenti(double gFm) {
        double cNm = gFm*100/101.9716213;
        return String.valueOf(cNm);
    }

    private String gFmToMilliNm(double gFm) {
        double mNm = gFm*1000/101.9716213;
        return String.valueOf(mNm);
    }


    private String gFmTOMicroNm(double gFm) {
        double MicroNm= (gFm*(10^6)/101.9716213);
        return String.valueOf(MicroNm);
    }

    private String gFmToNewtonMilliMeter(double gFm) {
        double Nmm = gFm*1000/101.9716213;
        return String.valueOf(Nmm);

    }
    private String gFmToKGFCentiMeter(double gFm) {
        double kgFcm = gFm*1000/101.9716213;
        return String.valueOf(kgFcm);
    }
    private String gFmToGramForceMetre(double gFm) {
        double gfm = gFm;
        return String.valueOf(gfm);
    }
    private String gFmToGramFCentiMeter(double gFm) {
        double gfcm = gFm*10197.16213/101.9716213;
        return String.valueOf(gfcm);
    }
    private String gFmToDyneCM(double gFm) {
        double dynecm = gFm*(10^-6)/(101.9716213);
        return String.valueOf(dynecm);
    }
    private String gFmToPoundForceFoot(double gFm) {
        double ibfFt = gFm*0.73756215/101.9716213;
        return String.valueOf(ibfFt);
    }
    private String gFmToPoundForceInch(double gFm) {
        double ibfIn = gFm*8.85074579/101.9716213;
        return String.valueOf(ibfIn);
    }
    private String gFmToOunceForceFoot(double gFm) {
        double ozff = gFm*8.850748/101.97162;
        return String.valueOf(ozff);
    }
    private String gFmToOunceForceInch(double gFm) {
        double ozfI  = gFm*141.611992894/101.9716213;
        return String.valueOf(ozfI);
    }
    private String gFmToPounddalFoot(double gFm) {
        double pdlFt = gFm*23.73036609/101.9716213;
        return String.valueOf(pdlFt);
    }
    private String gFmToPounddalInch(double gFm) {
        double pdlI= gFm*284.76439306/101.9716213;
        return String.valueOf(pdlI);
    }
    private String gFmToUKToneForceFoot(double gFm) {
        double toneFt=gFm*3.2927*(10^-4)/(0.101971621);
        return String.valueOf(toneFt);
    }

    //gram force centimeter
    private String gFcmToDeca(double gFcm) {
        double dNm = gFcm*0.1/10197.16212978;
        return String.valueOf(dNm);
    }

    private String gFcmToKilo(double gFcm) {
        double kNm =gFcm*0.001/10197.16212978;
        return String.valueOf(kNm);
    }

    private String gFcmToDeci(double gFcm) {
        double deNm = gFcm*10/10197.16213;
        return String.valueOf(deNm);
    }

    private String gFcmToCenti(double gFcm) {
        double cNm = gFcm*100/10197.16212978;
        return String.valueOf(cNm);
    }

    private String gFmToMilli(double gFcm) {
        double mNm = gFcm*1000/10197.16212978;
        return String.valueOf(mNm);
    }


    private String gFcmTOMicro(double gFcm) {
        double MicroNm= gFcm*(10^6)/10197.16212978;
        return String.valueOf(MicroNm);
    }

    private String gFcmToNewtonMilliMeter(double gFcm) {
        double Nmm = gFcm*1000/10197.16212978;
        return String.valueOf(Nmm);
    }
    private String gFcmToKilogramForceM(double gFcm) {
        double kgFm = gFcm*0.10197162/10197.16212978;
        return String.valueOf(kgFm);
    }
    private String gFcmToKGFCentiMeter(double gfcm) {
        double kgFcm = gfcm*10.19716213/10197.16212978;
        return String.valueOf(kgFcm);
    }
    private String gFcmToGramForceMetre(double gFcm) {
        double gfm = gFcm*101.9716213/10197.16213;
        return String.valueOf(gfm);
    }
    private String gFcmToGramFCentiMeter(double gFcm) {
        double gfcm = gFcm;
        return String.valueOf(gfcm);
    }
    private String gFcmToDyneCM(double gFcm) {
        double dynecm = gFcm*(10^7)/10197.16212978;
        return String.valueOf(dynecm);
    }
    private String gFcmToPoundForceFoot(double gFcm) {
        double ibfFt = gFcm*0.73756215/10197.16213;
        return String.valueOf(ibfFt);
    }
    private String gFcmToPoundForceInch(double gFcm) {
        double ibfIn = gFcm*8.85074579/10197.16213;
        return String.valueOf(ibfIn);
    }
    private String gFcmToOunceForceFoot(double gFcm) {
        double ozff = gFcm*8.850748/10197.16212978;
        return String.valueOf(ozff);
    }
    private String gFcmToOunceForceInch(double gFcm) {
        double ozfI  = gFcm*141.611992894/10197.16212978;
        return String.valueOf(ozfI);
    }
    private String gFcmToPounddalFoot(double gFcm) {
        double pdlFt = gFcm*23.73036609/10197.16212978;
        return String.valueOf(pdlFt);
    }
    private String gFcmToPounddalInch(double gFcm) {
        double pdlI= gFcm*284.76439306/10197.16212978;
        return String.valueOf(pdlI);
    }
    private String gFcmToUKToneForceFoot(double gFcm) {
        double toneFt= gFcm*3.2927/10197.16212978*(10^-4);
        return String.valueOf(toneFt);
    }
//dyne centimeter

    private String dyneCmTONewtonMeter(double dynCm) {
        double Nm = dynCm*1*(10^-7);
        return String.valueOf(Nm);
    }

    private String dyneCmToDecaNm(double dynCm) {
        double daNm = dynCm*0.001*(10^-7);
        return String.valueOf(daNm);
    }

    private String dyneCmToDeci(double dynCm) {
        double deNm = dynCm*10*(10^-7);
        return String.valueOf(deNm);
    }

    private String dyneCmToCenti(double dynCm) {
        double cNm = dynCm*100*(10^-7);
        return String.valueOf(cNm);
    }

    private String dyneCmToMilliNm(double dynCm) {
        double mNm = dynCm*(10^-4);
        return String.valueOf(mNm);
    }


    private String dyneTOMicroNm(double dynCm) {
        double MicroNm= dynCm*10;
        return String.valueOf(MicroNm);
    }

    private String dyneCmToNewtonMilliMeter(double dynCm) {
        double Nmm = dynCm*(10^-4);
        return String.valueOf(Nmm);

    }
    private String dyneCmToKGFCentiMeter(double dynCm) {
        double kgFcm = dynCm*(10^-4);
        return String.valueOf(kgFcm);
    }
    private String dyneCmToGramForceMetre(double dynCm) {
        double gfm = dynCm*101.9716213*(10^-7);
        return String.valueOf(gfm);
    }
    private String dyneCmToGramFCentiMeter(double dynCm) {
        double gfcm = dynCm*10197.16213*(10^-7);
        return String.valueOf(gfcm);
    }
    private String dyneCmToDyneCM(double DynCm) {
        double dynecm = DynCm;
        return String.valueOf(dynecm);
    }
    private String dyneCmToPoundForceFoot(double dynCm) {
        double ibfFt = dynCm*0.73756215*(10^-7);
        return String.valueOf(ibfFt);
    }
    private String dyneCmToPoundForceInch(double dynCm) {
        double ibfIn = dynCm*8.85074579*(10^-7);
        return String.valueOf(ibfIn);
    }
    private String dyneCmToOunceForceFoot(double dynCm) {
        double ozff = dynCm*8.850748*(10^-7);
        return String.valueOf(ozff);
    }
    private String dyneCmToOunceForceInch(double dynCm) {
        double ozfI  = dynCm*141.611992894*(10^-7);
        return String.valueOf(ozfI);
    }
    private String dyneCmToPounddalFoot(double dynCm) {
        double pdlFt = dynCm*23.73036609*(10^-7);
        return String.valueOf(pdlFt);
    }
    private String dyneCmToPounddalInch(double dynCm) {
        double pdlI= dynCm*284.76439306*(10^-7);
        return String.valueOf(pdlI);
    }
    private String dyneCmToUKToneForceFoot(double dynCm) {
        double toneFt= dynCm*3.2927*(10^-11);
        return String.valueOf(toneFt);
    }
    //pound force foot(lbf.ft)
    private String lbfFToDeca(double ibff) {
        double daNm = ibff*0.1/0.73756215;
        return String.valueOf(daNm);
    }

    private String lbfFToKilo(double ibff) {
        double kNm = ibff*0.001/0.73756215;;
        return String.valueOf(kNm);
    }

    private String lbfFToDeci(double ibff) {
        double deNm = ibff*10/0.73756215;;
        return String.valueOf(deNm);
    }

    private String lbfFToCenti(double ibff) {
        double cNm = ibff*100/0.73756215;
        return String.valueOf(cNm);
    }

    private String lbfFToMilli(double ibff) {
        double mNm = ibff*1000/0.73756215;
        return String.valueOf(mNm);
    }
    private String lbfFToNm(double ibff) {
        double mNm = ibff*1/0.73756215;
        return String.valueOf(mNm);
    }


    private String lbfFTOMicro(double ibff) {
        double MicroNm= ibff*(10^6)/0.73756215;
        return String.valueOf(MicroNm);
    }

    private String lbfFToNewtonMilliMeter(double ibff) {
        double Nmm =ibff*1000/0.73756215;
        return String.valueOf(Nmm);
    }
    private String lbfFToKilogramForceM(double ibff) {
        double kgFm = ibff*0.10197162/0.73756215;
        return String.valueOf(kgFm);
    }
    private String lbfFToKGFCentiMeter(double ibff) {
        double kgFcm = ibff*10.1971623;
        return String.valueOf(kgFcm);
    }
    private String lbfFToGramForceMetre(double ibff) {
        double gfm = ibff*101.9716213/0.73756215;
        return String.valueOf(gfm);
    }
    private String lbfFToGramFCentiMeter(double ibff) {
        double gfcm = ibff*10197.16213/0.73756215;
        return String.valueOf(gfcm);
    }
    private String lbfFToDyneCM(double ibff) {
        double dynecm = ibff*(10^-6)/0.73756215;
        return String.valueOf(dynecm);
    }
    private String lbfFToPoundForceFoot(double ibff) {
        double ibfFt = ibff*0.73756215/0.73756215;
        return String.valueOf(ibfFt);
    }
    private String lbfFToPoundForceInch(double ibff) {
        double ibfIn = ibff*8.85074579/0.73756215;
        return String.valueOf(ibfIn);
    }
    private String lbfFToOunceForceFoot(double ibff) {
        double ozff = ibff*8.850748/0.73756215;
        return String.valueOf(ozff);
    }
    private String lbfFToOunceForceInch(double ibff) {
        double ozfI  = ibff*141.611992894/0.73756215;
        return String.valueOf(ozfI);
    }
    private String lbfFToPounddalFoot(double ibff) {
        double pdlFt = ibff*23.73036609/0.73756215;
        return String.valueOf(pdlFt);
    }
    private String lbfFToPounddalInch(double ibff) {
        double pdlI= ibff*284.76439306/0.73756215;
        return String.valueOf(pdlI);
    }
    private String lbfFToUKToneForceFoot(double ibff) {
        double toneFt= ibff*3.2927*(10^-4)/0.73756215;
        return String.valueOf(toneFt);
    }

    //pound force inch(lbf.in)or(in.ib)
    private String lbfInToDeca(double lbfin) {
        double daNm = lbfin*0.1/8.85074579;
        return String.valueOf(daNm);
    }

    private String lbfInToKilo(double lbfin) {
        double kNm = lbfin*0.001/8.85074579;;
        return String.valueOf(kNm);
    }

    private String lbfInToDeci(double lbfin) {
        double deNm = lbfin*10/8.85074579;
        return String.valueOf(deNm);
    }
    private String lbfInToNm(double lbfin) {
        double Nm = lbfin*1/8.85074579;
        return String.valueOf(Nm);
    }

    private String ibfInToCenti(double lbfin) {
        double cNm = lbfin*100/8.85074579;
        return String.valueOf(cNm);
    }

    private String lbfInToMilli(double lbfin) {
        double mNm = lbfin*1000/8.85074579;
        return String.valueOf(mNm);
    }


    private String lbfInTOMicro(double lbfin) {
        double MicroNm= lbfin*(10^6)/8.85074579;
        return String.valueOf(MicroNm);
    }

    private String lbfInToNewtonMilliMeter(double lbfin) {
        double Nmm =lbfin*1000/8.85074579;
        return String.valueOf(Nmm);
    }
    private String lbfInToKilogramForceM(double lbfin) {
        double kgFm = lbfin*0.10197162/8.85074579;
        return String.valueOf(kgFm);
    }
    private String lbfInToKGFCentiMeter(double lbfin) {
        double kgFcm = lbfin*10.1971623/8.85074579;
        return String.valueOf(kgFcm);
    }
    private String lbfInToGramForceMetre(double lbfin) {
        double gfm = lbfin*101.9716213/8.85074579;
        return String.valueOf(gfm);
    }
    private String lbfInToGramFCentiMeter(double lbfin) {
        double gfcm = lbfin*10197.16213/8.85074579;
        return String.valueOf(gfcm);
    }
    private String lbfInToDyneCM(double lbfin) {
        double dynecm = lbfin*(10^7)/8.85074579;
        return String.valueOf(dynecm);
    }
    private String lbfInToPoundForceFoot(double lbfin) {
        double ibfFt = lbfin*0.73756215/8.85074579;
        return String.valueOf(ibfFt);
    }
    private String lbfInToPoundForceInch(double lbfin) {
        double lbfIn = lbfin*8.85074579/8.85074579;
        return String.valueOf(lbfIn);
    }
    private String lbfInToOunceForceFoot(double lbfin) {
        double ozff = lbfin*8.850748/8.85074579;
        return String.valueOf(ozff);
    }
    private String lbfInToOunceForceInch(double lbfin) {
        double ozfI  = lbfin*141.611992894/8.85074579;
        return String.valueOf(ozfI);
    }
    private String lbfInToPounddalFoot(double lbfin) {
        double pdlFt = lbfin*23.73036609/8.85074579;
        return String.valueOf(pdlFt);
    }
    private String lbfInToPounddalInch(double lbfin) {
        double pdlI= lbfin*284.76439306/8.85074579;
        return String.valueOf(pdlI);
    }
    private String lbfInToUKToneForceFoot(double lbfin) {
        double toneFt= lbfin*3.2927*(10^-4)/8.85074579;
        return String.valueOf(toneFt);
    }

//ounce force inch(in.oz)
    private String ozfinToDeca(double ozfin) {
        double daNm = ozfin*0.1/141.61192894;
        return String.valueOf(daNm);
    }
    private String ozfinToNm(double ozfin) {
        double Nm = ozfin*1/141.61192894;
        return String.valueOf(Nm);
    }

    private String ozfInToKilo(double ozfin) {
        double kNm = ozfin*0.001/141.611928;
        return String.valueOf(kNm);
    }

    private String ozfInToDeci(double ozfin) {
        double deNm = ozfin*10/141.611928;
        return String.valueOf(deNm);
    }

    private String ozfInToCenti(double ozfin) {
        double cNm = ozfin*100/141.611928;
        return String.valueOf(cNm);
    }

    private String ozfInToMilli(double ozfin) {
        double mNm = ozfin*1000/141.611928;
        return String.valueOf(mNm);
    }


    private String ozfInTOMicro(double ozfin) {
        double MicroNm= ozfin*(10^6)/141.611928;
        return String.valueOf(MicroNm);
    }

    private String ozfInToNewtonMilliMeter(double ozfin) {
        double Nmm= ozfin*1000/141.611928;
        return String.valueOf(Nmm);
    }
    private String ozfInToKilogramForceM(double ozfin ){
        double kgFm = ozfin*0.10197162/141.611928;
        return String.valueOf(kgFm);
    }
    private String ozfInToKGFCentiMeter(double ozfin) {
        double kgFcm = ozfin*10.1971623/141.611928;
        return String.valueOf(kgFcm);
    }
    private String ozfInToGramForceMetre(double ozfin) {
        double gfm = ozfin*101.9716213/141.611928;
        return String.valueOf(gfm);
    }
    private String ozfInToGramFCentiMeter(double ozfin) {
        double gfcm = ozfin*10197.16213/141.611928;
        return String.valueOf(gfcm);
    }
    private String ozfInToDyneCM(double ozfin) {
        double dynecm = ozfin*(10^7)/141.611928;
        return String.valueOf(dynecm);
    }
    private String ozfInToPoundForceFoot(double ozfin) {
        double ibfFt = ozfin*0.73756215/141.61192894;
        return String.valueOf(ibfFt);
    }
    private String ozfInToPoundForceInch(double ozfin) {
        double ibfIn = ozfin*8.85074579/141.61192894;
        return String.valueOf(ibfIn);
    }
    private String ozfInToOunceForceFoot(double ozfin) {
        double ozff = ozfin*8.850748/141.61192894;
        return String.valueOf(ozff);
    }
    private String ozfInToOunceForceInch(double ozfin) {
        double ozfI  = ozfin*141.611992894/141.61192894;
        return String.valueOf(ozfI);
    }
    private String ozfInToPounddalFoot(double ozfin) {
        double pdlFt = ozfin*23.73036609/141.61192894;
        return String.valueOf(pdlFt);
    }
    private String ozfInToPounddalInch(double ozfin) {
        double pdlI= ozfin*284.76439306/141.61192894;
        return String.valueOf(pdlI);
    }
    private String ozfInToUKToneForceFoot(double ozfin) {
        double toneFt= ozfin*3.2927*(10^-4)/141.61192894;
        return String.valueOf(toneFt);
    }
    //poundal foot (pdl.ft)
    private String pdlFToNm(double pdlf) {
        double Nm = pdlf*1/23.73036609;
        return String.valueOf(Nm);
    }

    private String pdlFToDeca(double pdlf) {
        double daNm = pdlf*0.1/23.73036609;
        return String.valueOf(daNm);
    }

    private String pdlFToKilo(double pdlf) {
        double kNm = pdlf*0.001/23.73036609;
        return String.valueOf(kNm);
    }

    private String pdlFToDeci(double pdlf) {
        double deNm = pdlf*10/23.73036609;
        return String.valueOf(deNm);
    }

    private String pdlFToCenti(double pdlf) {
        double cNm = pdlf*100/23.73036609;
        return String.valueOf(cNm);
    }

    private String pdlFToMilli(double pdlf) {
        double mNm = pdlf*1000/23.73036609;
        return String.valueOf(mNm);
    }


    private String pdlFTOMicro(double pdlf) {
        double MicroNm= pdlf*(10^6)/23.73036609;
        return String.valueOf(MicroNm);
    }

    private String pdlFToNewtonMilliMeter(double pdlf) {
        double Nmm =pdlf*1000/23.73036609;
        return String.valueOf(Nmm);
    }
    private String pdlFToKilogramForceM(double pdlf) {
        double kgFm = pdlf*0.10197162/23.73036609;
        return String.valueOf(kgFm);
    }
    private String pdlFToKGFCentiMeter(double pdlf) {
        double kgFcm = pdlf*10.1971623/23.73036609;
        return String.valueOf(kgFcm);
    }
    private String pdlFToGramForceMetre(double pdlf) {
        double gfm = pdlf*101.9716213/23.73036609;
        return String.valueOf(gfm);
    }
    private String pdlFToGramFCentiMeter(double pdlf) {
        double gfcm = pdlf*10197.16213/23.73036609;
        return String.valueOf(gfcm);
    }
    private String pdlFToDyneCM(double pdlf) {
        double dynecm = pdlf*(10^7)/23.73036609;
        return String.valueOf(dynecm);
    }
    private String pdlFToPoundForceFoot(double pdlf) {
        double ibfFt = pdlf*0.73756215/23.73036609;
        return String.valueOf(ibfFt);
    }
    private String pdlFToPoundForceInch(double pdlf) {
        double ibfIn = pdlf*8.85074579/23.73036609;
        return String.valueOf(ibfIn);
    }
    private String pdlFToOunceForceFoot(double pdlf) {
        double ozff = pdlf*8.850748/23.73036609;
        return String.valueOf(ozff);
    }
    private String pdlFToOunceForceInch(double pdlf) {
        double ozfI  = pdlf*141.611992894/23.73036609;
        return String.valueOf(ozfI);
    }
    private String pdlFToPounddalFoot(double pdlf) {
        double pdlFt = pdlf*23.73036609/23.73036609;
        return String.valueOf(pdlFt);
    }
    private String pdlFToPoundalInch(double pdlf) {
        double pdlI= pdlf*284.76439306/23.73036609;
        return String.valueOf(pdlI);
    }
    private String pdlFToUKToneForceFoot(double pdlf) {
        double toneFt= pdlf*3.2927*(10^-4)/23.73036609;
        return String.valueOf(toneFt);
    }
    ///
    ///poundal inch (pdl.in)

    private String pdlInToNm(double pdlin) {
        double Nm = pdlin*1/284.76439306;
        return String.valueOf(Nm);
    }

    private String pdlInToDeca(double pdlin) {
        double daNm = pdlin*0.1/284.76439306;
        return String.valueOf(daNm);
    }

    private String pdlInToKilo(double pdlin) {
        double kNm = pdlin*0.001/284.76439306;
        return String.valueOf(kNm);
    }

    private String pdlInToDeci(double pdlin) {
        double deNm = pdlin*10/284.76439306;
        return String.valueOf(deNm);
    }

    private String pdlInToCenti(double pdlin) {
        double cNm = pdlin*100/284.76439306;
        return String.valueOf(cNm);
    }

    private String pdlInToMilli(double pdlin) {
        double mNm = pdlin*1000/284.76439306;
        return String.valueOf(mNm);
    }


    private String pdlInTOMicro(double pdlin) {
        double MicroNm= pdlin*(10^6)/284.76439306;
        return String.valueOf(MicroNm);
    }

    private String pdlInToNewtonMilliMeter(double pdlin) {
        double Nmm =pdlin*1000/284.76439306;
        return String.valueOf(Nmm);
    }
    private String pdlInToKilogramForceM(double pdlin) {
        double kgFm = pdlin*0.10197162/284.76439306;
        return String.valueOf(kgFm);
    }
    private String pdlInToKGFCentiMeter(double pdlin) {
        double kgFcm = pdlin*10.1971623/284.76439306;
        return String.valueOf(kgFcm);
    }
    private String pdlInToGramForceMetre(double pdlin) {
        double gfm = pdlin*101.9716213/284.76439306;
        return String.valueOf(gfm);
    }
    private String pdlInToGramFCentiMeter(double pdlin) {
        double gfcm = pdlin*10197.16213/284.76439306;
        return String.valueOf(gfcm);
    }
    private String pdlInToDyneCM(double pdlin) {
        double dynecm = pdlin*(10^7)/284.76439306;
        return String.valueOf(dynecm);
    }
    private String pdlInToPoundForceFoot(double pdlin) {
        double ibfFt = pdlin*0.73756215/284.76439306;
        return String.valueOf(ibfFt);
    }
    private String pdlInToPoundForceInch(double pdlin) {
        double ibfIn = pdlin*8.85074579/284.76439306;
        return String.valueOf(ibfIn);
    }
    private String pdlInToOunceForceFoot(double pdlin) {
        double ozff = pdlin*8.850748/284.76439306;
        return String.valueOf(ozff);
    }
    private String pdlInToOunceForceInch(double pdlin) {
        double ozfI  = pdlin*141.611992894/284.76439306;
        return String.valueOf(ozfI);
    }
    private String pdlInToPounddalFoot(double pdlin) {
        double pdlFt = pdlin*23.73036609/284.76439306;
        return String.valueOf(pdlFt);
    }
    private String pdlInToPoundalInch(double pdlin) {
        double pdlI= pdlin*284.76439306/284.76439306;
        return String.valueOf(pdlI);
    }
    private String pdlInToUKToneForceFoot(double pdlin) {
        double toneFt= pdlin*3.2927*(10^-4)/284.76439306;
        return String.valueOf(toneFt);
    }

    ////Uk tone force foot
    private String toneToNm(double tone) {
        double Nm = tone*1*(10^4)/3.2927;
        return String.valueOf(Nm);
    }

    private String toneToDeca(double tone) {
        double daNm = tone*0.1*(10^4)/3.2927;
        return String.valueOf(daNm);
    }

    private String toneToKilo(double tone) {
        double kNm = tone*0.001*(10^4)/3.2927;
        return String.valueOf(kNm);
    }

    private String toneToDeci(double tone) {
        double deNm = tone*10/(10^4)/3.2927;
        return String.valueOf(deNm);
    }

    private String toneToCenti(double tone) {
        double cNm = tone*100*(10^4)/3.2927;
        return String.valueOf(cNm);
    }

    private String toneToMilli(double tone) {
        double mNm = tone*1000*(10^4)/3.2927;
        return String.valueOf(mNm);
    }


    private String toneTOMicro(double tone) {
        double MicroNm= tone*(10^6)*(10^4)/3.2927;
        return String.valueOf(MicroNm);
    }

    private String toneToNewtonMilliMeter(double tone) {
        double Nmm =tone*1000*(10^4)/3.2927;
        return String.valueOf(Nmm);
    }
    private String toneToKilogramForceM(double tone) {
        double kgFm = tone*0.10197162*(10^4)/3.2927;
        return String.valueOf(kgFm);
    }
    private String toneToKGFCentiMeter(double tone) {
        double kgFcm = tone*10.1971623*(10^4)/3.2927;
        return String.valueOf(kgFcm);
    }
    private String toneToGramForceMetre(double tone) {
        double gfm = tone*101.9716213*(10^4)/3.2927;
        return String.valueOf(gfm);
    }
    private String toneToGramFCentiMeter(double tone) {
        double gfcm = tone*10197.16213*(10^4)/3.2927;
        return String.valueOf(gfcm);
    }
    private String toneToDyneCM(double tone) {
        double dynecm = tone*(10^11)/3.2927;
        return String.valueOf(dynecm);
    }
    private String toneToPoundForceFoot(double tone) {
        double ibfFt = tone*0.73756215*(10^4)/3.2927;
        return String.valueOf(ibfFt);
    }
    private String  toneToPoundForceInch(double tone) {
        double ibfIn = tone*8.85074579*(10^4)/3.2927;
        return String.valueOf(ibfIn);
    }
    private String toneToOunceForceFoot(double tone) {
        double ozff = tone*8.850748*(10^4)/3.2927;
        return String.valueOf(ozff);
    }
    private String toneToOunceForceInch(double tone ) {
        double ozfI  = tone*141.611992894*(10^4)/3.2927;
        return String.valueOf(ozfI);
    }
    private String toneToPounddalFoot(double tone) {
        double pdlFt = tone*23.73036609*(10^4)/3.2927;
        return String.valueOf(pdlFt);
    }
    private String toneToPoundalInch(double tone) {
        double pdlI= tone*284.76439306*(10^4)/3.2927;
        return String.valueOf(pdlI);
    }
    private String toneToUKToneForceFoot(double tone) {
        double toneFt= tone;
        return String.valueOf(toneFt);
    }





}

