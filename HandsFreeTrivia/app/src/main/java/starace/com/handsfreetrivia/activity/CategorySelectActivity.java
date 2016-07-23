package starace.com.handsfreetrivia.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import starace.com.handsfreetrivia.R;

/**
 * Created by mstarace on 7/22/16.
 */
public class CategorySelectActivity extends AppCompatActivity {
    private TextView categoryOne;
    private TextView categoryTwo;
    private TextView categoryThree;
    private TextView categoryFour;
    private TextView categoryFive;
    private TextView categorySix;
    private TextView categorySeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_select);

        initViews();


    }

    public void initViews(){
        categoryOne = (TextView) findViewById(R.id.category_one);
        categoryTwo = (TextView) findViewById(R.id.category_two);
        categoryThree = (TextView) findViewById(R.id.category_three);
        categoryFour = (TextView) findViewById(R.id.category_four);
        categoryOne = (TextView) findViewById(R.id.category_five);
        categoryOne = (TextView) findViewById(R.id.category_six);
        categoryOne = (TextView) findViewById(R.id.category_seven);

        String[] categories = getResources().getStringArray(R.array.categories);

        categoryOne.setText(categories[0]);
        categoryTwo.setText(categories[1]);
        categoryThree.setText(categories[2]);
        categoryFour.setText(categories[3]);
        categoryFive.setText(categories[4]);
        categorySix.setText(categories[5]);
        categorySeven.setText(categories[6]);

    }





}
