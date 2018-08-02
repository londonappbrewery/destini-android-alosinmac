package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    // TODO: Steps 3 & 7 - Declare member variables here:
    public TextView mStory;
    public Button mTopAnswer;
    public Button mBottomAnswer;

    public int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 4 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mTopAnswer = findViewById(R.id.buttonTop);
        mBottomAnswer = findViewById(R.id.buttonBottom);


        // TODO: Steps 5, 6, & 8 - Set a listener on the top button:
        mTopAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "Top Button tapped");

                //go through the flow of the story
                if (mStoryIndex == 1 || mStoryIndex == 3){
                    mStory.setText(R.string.T3_Story);
                    mTopAnswer.setText(R.string.T3_Ans1);
                    mBottomAnswer.setText(R.string.T3_Ans2);
                    mStoryIndex = mStoryIndex + 1;
                } else if (mStoryIndex == 2){
                    mStory.setText(R.string.T6_End);
                    mTopAnswer.setVisibility(View.GONE);
                    mBottomAnswer.setVisibility(View.GONE);
                } else {
                    mStory.setText(R.string.T6_End);
                    mTopAnswer.setVisibility(View.GONE);
                    mBottomAnswer.setVisibility(View.GONE);
                }

            }
        });


        // TODO: Steps 5, 6, & 8 - Set a listener on the bottom button:
        mBottomAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Destini", "Bottom Button tapped");

                //go through the flow of the story
                //if bottom button selected once - story 2
                if (mStoryIndex == 1){
                    mStory.setText(R.string.T2_Story);
                    mTopAnswer.setText(R.string.T2_Ans1);
                    mBottomAnswer.setText(R.string.T2_Ans2);
                    mStoryIndex = mStoryIndex + 2;
                } else if (mStoryIndex == 3){
                    mStory.setText(R.string.T4_End);
                    mTopAnswer.setVisibility(view.GONE);
                    mBottomAnswer.setVisibility(view.GONE);
                } else {
                    mStory.setText(R.string.T5_End);
                    mTopAnswer.setVisibility(view.GONE);
                    mBottomAnswer.setVisibility(view.GONE);
                }

            }
        });
    }


}
