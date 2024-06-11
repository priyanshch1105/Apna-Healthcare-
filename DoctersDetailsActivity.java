package com.example.healthcare;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctersDetailsActivity extends AppCompatActivity {
    public String[][] docter_details1 =
            {
                    {"Doctor Name : Ajit ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Narendra ", "Hospital add:noida", "Exp:1yrs", "Mob no. : 3765874658", "300"},
                    {"Doctor Name : Sunil ", "Hospital add:noida", "Exp:7yrs", "Mob no. : 4765874658", "700"},
                    {"Doctor Name : Shristy ", "Hospital add:noida", "Exp:9yrs", "Mob no. : 9765874658", "800"},
                    {"Doctor Name : Divya ", "Hospital add:noida", "Exp:4yrs", "Mob no. : 7765874658", "400"}
            };
    public String[][] docter_details2 =
            {
                    {"Doctor Name : Vikas ", "Hospital add:noida", "Exp:1yrs", "Mob no. : 9765874658", "200"},
                    {"Doctor Name : Amit ", "Hospital add:noida", "Exp:9yrs", "Mob no. : 8765874658", "700"},
                    {"Doctor Name : Priya ", "Hospital add:noida", "Exp:4yrs", "Mob no. : 3765874658", "400"},
                    {"Doctor Name : Nilesh ", "Hospital add:noida", "Exp:6yrs", "Mob no. : 2765874658", "500"},
                    {"Doctor Name : Laxmi ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 9765874658", "300"}
            };
    public String[][] docter_details3 =
            {
                    {"Doctor Name : Pankaj ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Arpit ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Harsh ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Manisha ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Shrikant ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"}
            };
    public String[][] docter_details4 =
            {
                    {"Doctor Name : Ajit ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Gaurav ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Divya ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Shailendra ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"},
                    {"Doctor Name : Om ", "Hospital add:noida", "Exp:3yrs", "Mob no. : 23765874658", "400"}
            };
    public String[][] docter_details5 =
            {
                    {"Doctor Name : SD Mouraya ", "Hospital add:noida", "Exp:13yrs", "Mob no. : 765874658", "400"},
                    {"Doctor Name : Arun ", "Hospital add:noida", "Exp:10yrs", "Mob no. : 965874658", "400"},
                    {"Doctor Name : YP Singh ", "Hospital add:noida", "Exp:9yrs", "Mob no. : 865874658", "400"},
                    {"Doctor Name : Mittal ", "Hospital add:noida", "Exp:16yrs", "Mob no. : 665874658", "400"},
                    {"Doctor Name : JP Morgan ", "Hospital add:noida", "Exp:13yrs", "Mob no. : 635874658", "400"}
            };

    TextView tv;
    Button btn;
    String[][] docter_details = {};
    SimpleAdapter sa;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctersdetails);

        tv = findViewById(R.id.textView7);
        btn = findViewById(R.id.buttonDDBack);

        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);

        if (title.compareTo("Family Physicians") == 0) {
            docter_details = docter_details1;
        } else if (title.compareTo("Deitician") == 0) {
            docter_details = docter_details2;
        } else if (title.compareTo("Gastroenterologist") == 0) {
            docter_details = docter_details3;
        } else if (title.compareTo("Surgeon") == 0) {
            docter_details = docter_details4;
        } else {
            docter_details = docter_details5;
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctersDetailsActivity.this, FindDocterActivity.class));
            }
        });

        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        for (int i = 0; i < docter_details.length; i++) {
            HashMap<String, String> item = new HashMap<>();
            item.put("lines1", docter_details[i][0]);
            item.put("lines2", docter_details[i][1]);
            item.put("lines3", docter_details[i][2]);
            item.put("lines4", docter_details[i][3]);
            item.put("lines5", "Cons Fees " + docter_details[i][4] + "/-");
            list.add(item);
        }

        sa = new SimpleAdapter(this, list,
                R.layout.multi_lines,
                new String[]{"lines1", "lines2", "lines3", "lines4", "lines5"},
                new int[]{R.id.line_a, R.id.line_b, R.id.line_c, R.id.line_d, R.id.line_e}
        );

        @SuppressLint("WrongViewCast") ListView lst = findViewById(R.id.textviewDoctordetail);
        // Updated to correct ListView ID
        lst.setAdapter(sa);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent it = new Intent(DoctersDetailsActivity.this, BookAppointenmentActivity.class);
                it.putExtra("text1", title);
                it.putExtra("text2", docter_details[i][0]);
                it.putExtra("text3", docter_details[i][1]);
                it.putExtra("text4", docter_details[i][3]);
                it.putExtra("text5", docter_details[i][4]);
                startActivity(it);
            }
        });
    }
}