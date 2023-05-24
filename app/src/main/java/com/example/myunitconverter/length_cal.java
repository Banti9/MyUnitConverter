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

public class length_cal extends AppCompatActivity {


        CardView cv_fromUnit, cv_toUnit, cv_convert;
        RelativeLayout mCLayout;
        String fromUnit = "Meter";
        String toUnit = "KiloMeter";
        TextView tv_fromUnit, tv_toUnit;
        EditText et_fromUnit, et_toUnit;
        final String[] values = new String[]{
                "Meter",
                "Kilometer",
                "Millimeter",
                "Centimeter",
                "Yard",
                "Feet",
                "Inches",
                "Miles",
                "Nanometer",
                "Micrometer",
                "Decimeter",
                "LightYear",
                "Perch",
                "Pole",
                "Fathom",
                "Ell",
                "Earth's distance",
                "Sun's radius",
                "Caliber",
                "ken",
                "Angstrom",
                "Chain"

        };

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_length_cal);


            cv_fromUnit = findViewById(R.id.fromUnit);
            cv_toUnit = findViewById(R.id.toUnit);
            cv_convert = findViewById(R.id.cv_convert);

            mCLayout = findViewById(R.id.temp_relativeLayout);

            tv_fromUnit = findViewById(R.id.tv_fromUnit);
            tv_toUnit = findViewById(R.id.tv_toUnit);

            tv_fromUnit.setText(values[0]);
            tv_toUnit.setText(values[0]);

            et_fromUnit = findViewById(R.id.et_fromUnit);
            et_toUnit = findViewById(R.id.et_toUnit);

            cv_convert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String lenInput = et_fromUnit.getText().toString();
                    if (lenInput.equals("") || lenInput == null) {
                        et_fromUnit.setError("Please enter some value");
                    } else {
                        if (tv_fromUnit.getText().toString().equals(values[0])) {
                            if (tv_toUnit.getText().toString().equals(values[0])) {
                                et_toUnit.setText(lenInput);
                            } else if (tv_toUnit.getText().toString().equals(values[1])) {
                                et_toUnit.setText(MeterToKilometer(Double.parseDouble(lenInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[2])) {
                                et_toUnit.setText(MeterTCentimeter(Double.parseDouble(lenInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[3])) {
                                et_toUnit.setText(MeterToFeet(Double.parseDouble(lenInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[4])) {
                                et_toUnit.setText(MeterToInches(Double.parseDouble(lenInput)));
                            } else if (tv_toUnit.getText().toString().equals(values[5])) {
                                et_toUnit.setText(MeterToMile(Double.parseDouble(lenInput)));
                            }
                        } else if (tv_toUnit.getText().toString().equals(values[6])) {
                            et_toUnit.setText(MeterToYard(Double.parseDouble(lenInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[7])) {
                            et_toUnit.setText(MeterToMillimeter(Double.parseDouble(lenInput)));
                        }

                    }  if(tv_fromUnit.getText().toString().equals(values[1])) {
                        if (tv_toUnit.getText().toString().equals(values[0])) {
                            et_toUnit.setText(InchesToCenti(Double.parseDouble(lenInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[1])) {
                            et_toUnit.setText(YardToCenti(Double.parseDouble(lenInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[2])) {
                            et_toUnit.setText(lenInput);
                        } else if (tv_toUnit.getText().toString().equals(values[3])) {
                            et_toUnit.setText(YardToFeet(Double.parseDouble(lenInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[4])) {
                            et_toUnit.setText(YardToMeter(Double.parseDouble(lenInput)));
                        } else if (tv_toUnit.getText().toString().equals(values[5])) {
                            et_toUnit.setText(YardToInches(Double.parseDouble(lenInput)));
                        }
                    }

                }

            });

            cv_toUnit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Meter",
                            "Kilometer",
                            "Millimeter",
                            "Centimeter",
                            "Yard",
                            "Feet",
                            "Inches",
                            "Miles",
                            "Nanometer",
                            "Micrometer",
                            "Decimeter",
                            "LightYear",
                            "Perch",
                            "Pole",
                            "Fathom",
                            "Ell",
                            "Earth's distance",
                            "Sun's radius",
                            "Caliber",
                            "ken",
                            "Angstrom",
                            "Chain"
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

                    final AlertDialog.Builder builder = new AlertDialog.Builder(length_cal.this);
                    builder.setTitle("choose Unit");

                    final String[] flowers = new String[]{
                            "Meter",
                            "Kilometer",
                            "Millimeter",
                            "Centimeter",
                            "Yard",
                            "Feet",
                            "Inches",
                            "Miles",
                            "Nanometer",
                            "Micrometer",
                            "Decimeter",
                            "LightYear",
                            "Perch",
                            "Pole",
                            "Fathom",
                            "Ell",
                            "Earth's distance",
                            "Sun's radius",
                            "Caliber",
                            "ken",
                            "Angstrom",
                            "Chain"
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
        private String MeterToKilometer ( double meter){
            double kilometer = 100*meter;
            return String.valueOf(kilometer);
        }

        private String MeterToMillimeter ( double meter){
            double millimeter = 1000*meter;
            return String.valueOf(millimeter);
        }

        private String MeterTCentimeter ( double meter){
            double centimeter = meter*0.01;
            return String.valueOf(centimeter);
        }

        private String MeterToFeet ( double meter){
            double feet = meter*3.28084;
            return String.valueOf(feet);
        }

        private String MeterToInches( double meter){
            double inches = meter*39.37008;
            return String.valueOf(inches);
        }
        private String MeterToYard( double meter){
        double yard = meter*1.09361;
        return String.valueOf(yard);
    }
    private String CentiToMilli( double centi){
        double milli =centi*10;
        return String.valueOf(milli);
    }
    private String MeterToMile( double meter){
        double mile = meter/1609;
        return String.valueOf(mile);
    }
    private String KiloToMeter( double kilo){
        double meter = kilo*1000;
        return String.valueOf(meter);
    }
    private String MilliToMeter( double milli){
        double meter = milli*100;
        return String.valueOf(meter);
    }
    private String MilliToInches( double milli){
        double inches = milli*0.03937;
        return String.valueOf(inches);
    }



        private String FootToInches ( double foot){
            double inches= foot*12;
            return String.valueOf(inches);
        }

        private String YardToFeet ( double yard){
            double feet = yard*3;
            return String.valueOf(feet);
        }

        private String YardToInches ( double yard){
            double inches = yard*36;
            return String.valueOf(inches);
        }

        private String  KiloTOYard( double kilo){
            double yard =kilo*1093.6133;
            return String.valueOf(yard);
        }

        private String KiloToMile ( double kilo){
            double mile = kilo*0.62137;
            return String.valueOf(mile);
        }

        //Kelvin
        private String InchesToCenti ( double inches){
            double centi= inches*2.54;
            return String.valueOf(centi);
        }

        private String FootToCenti ( double foot){
            double centi = foot*30.48;
            return String.valueOf(centi);
        }

        private String YardToCenti ( double yard){
            double centi = yard*91.44;
            return String.valueOf(centi);
        }

        private String MileToMeter  ( double mile){
            double meter = mile*1609.344;
            return String.valueOf(meter);
        }

        private String MileToKilo ( double mile){
            double kilo= mile*1.69344;
            return String.valueOf(kilo);
        }
        private String YardToMeter ( double yard){
            double meter = yard*0.9144;
            return String.valueOf(meter);
        }

        private String SunRadiusToMeter ( double sun){
            double meter =sun*696000000 ;
            return String.valueOf(meter);
        }

        private String EarthPolarRadiusToMeter ( double earth){
            double meter = earth*6356776.9999999;
            return String.valueOf(meter);
        }


}



