package com.example.driverlicense;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText address;
    EditText DoB;
    EditText sex;
    EditText HT;
    EditText WT;
    EditText nationality;
    EditText restriction;
    EditText condition;
    EditText agy;
    EditText expiration;
    EditText licenseNo;
    Button page2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        name=findViewById(R.id.txtName);

        address=findViewById(R.id.Address);
        DoB=findViewById(R.id.DnB);
        sex=findViewById(R.id.Sex);
        HT=findViewById(R.id.Height);
        WT=findViewById(R.id.Weight);
        nationality=findViewById(R.id.Nationality);
        restriction=findViewById(R.id.Restriction);
        agy=findViewById(R.id.AGY);
        condition=findViewById(R.id.Condition);
        expiration=findViewById(R.id.Expiration);
        licenseNo=findViewById(R.id.LicenseNo);
        page2=findViewById(R.id.btnGO);

        page2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pName = name.getText().toString();
                String pAddress = address.getText().toString();
                String pDoB = DoB.getText().toString();
                String pSex = sex.getText().toString();
                String pHT = HT.getText().toString();
                String pWT = WT.getText().toString();
                String pNationality = nationality.getText().toString();
                String pRestriction = restriction.getText().toString();
                String pAGY = agy.getText().toString();
                String pCondition = condition.getText().toString();
                String pExpiration = expiration.getText().toString();
                String pLicenseNo = licenseNo.getText().toString();
                if(TextUtils.isEmpty(name.getText().toString()))
                {
                    name.setError("Enter Name ");
                    name.requestFocus();
                }
                else if (TextUtils.isEmpty(address.getText().toString()))
                {
                    address.setError("Enter Address ");
                    address.requestFocus();

                }
                else if (TextUtils.isEmpty(DoB.getText().toString()))
                {
                    DoB.setError("Enter Date of Birth ");
                    DoB.requestFocus();
                }
                else if (TextUtils.isEmpty(sex.getText().toString()))
                {
                    sex.setError("Enter Sex ");
                    sex.requestFocus();
                }
                else if (TextUtils.isEmpty(HT.getText().toString()))
                {
                    HT.setError("Enter Height ");
                    HT.requestFocus();
                }
                else if (TextUtils.isEmpty(WT.getText().toString()))
                {
                    WT.setError("Enter Weight ");
                    WT.requestFocus();
                }
                else if (TextUtils.isEmpty(nationality.getText().toString()))
                {
                    nationality.setError("Enter Nationality ");
                    nationality.requestFocus();
                }
                else if (TextUtils.isEmpty(restriction.getText().toString()))
                {
                    restriction.setError("Enter Restrictions ");
                    restriction.requestFocus();
                }
                else if (TextUtils.isEmpty(agy.getText().toString()))
                {
                    agy.setError("Enter AGY ");
                    agy.requestFocus();
                }
                else if (TextUtils.isEmpty(condition.getText().toString()))
                {
                    condition.setError("Enter Condition ");
                    condition.requestFocus();
                }
                else if (TextUtils.isEmpty(expiration.getText().toString()))
                {
                    expiration.setError("Enter Expiration Date ");
                    expiration.requestFocus();
                }
                else if(TextUtils.isEmpty(licenseNo.getText().toString()))
                {
                    licenseNo.setError("Enter License Number ");
                    licenseNo.requestFocus();
                }else
                {
                    Intent p2 = new Intent(getApplicationContext(), License.class);
                    p2.putExtra("strName",pName);
                    p2.putExtra("strAddress",pAddress);
                    p2.putExtra("strDoB",pDoB);
                    p2.putExtra("strSex",pSex);
                    p2.putExtra("strHT",pHT);
                    p2.putExtra("strWT",pWT);
                    p2.putExtra("strNationality",pNationality);
                    p2.putExtra("strRestriction",pRestriction);
                    p2.putExtra("strCondition",pCondition);
                    p2.putExtra("strAGY",pAGY);
                    p2.putExtra("strExpiration",pExpiration);
                    p2.putExtra("strLicenseNo",pLicenseNo);
                    startActivity(p2);
                }
            }
        });
    }
}