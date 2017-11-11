package myapplication.bluray.com.xoproject;

import android.app.ActionBar;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    private Button buttonFour;
    private Button buttonFive;
    private Button buttonSix;
    private Button buttonSeven;
    private Button buttonEight;
    private Button buttonNine;
    private boolean switcher = true;
    private TableLayout tableLayout;
   private TableRow tableRow;
    private TableRow tableRow2;
private TableRow tableRow3;
private WebView webView;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.exit){
            finish();
        }else if(item.getItemId()==R.id.menu_restart){
            Intent intent = getIntent();
            finish();
            startActivity(intent);
        }else if(item.getItemId()==R.id.about){
            AlertDialog.Builder adb;
            adb = new AlertDialog.Builder(this);
            adb.setTitle("About Xo Game");
            adb.setMessage("Xo Game For AmitLearning Course");
            adb.setPositiveButton("Visit My Page", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/louay.hesham"));
                    startActivity(intent);

                }
            });
            adb.setIcon(R.mipmap.xo);

            adb.show();

        }

return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
webView=(WebView)findViewById(R.id.gif);
        webView.loadUrl("file:///android_asset/firework.html");

       android.support.v7.app.ActionBar action = getSupportActionBar();
        @SuppressWarnings("deprecation")
        BitmapDrawable background = new BitmapDrawable (BitmapFactory.decodeResource(getResources(), R.drawable.bgaction));
        action.setBackgroundDrawable(background);
//actionBar.setIcon(android.R.color.transparent);
        action.setDisplayShowTitleEnabled(true);
        action.setTitle("Xo Game");
        action.setLogo(R.mipmap.xo);

        buttonOne = (Button) findViewById(R.id.one);
        buttonTwo = (Button) findViewById(R.id.two);
        buttonThree = (Button) findViewById(R.id.three);
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFive = (Button) findViewById(R.id.button5);
        buttonSix = (Button) findViewById(R.id.button6);
        buttonSeven = (Button) findViewById(R.id.button7);
        buttonEight = (Button) findViewById(R.id.button8);
        buttonNine = (Button) findViewById(R.id.button9);
        tableRow =(TableRow)findViewById(R.id.tbr1);
        tableRow2=(TableRow)findViewById(R.id.tbr2);
        tableRow3=(TableRow)findViewById(R.id.tbr3);
    }

    @Override
    public void onClick(View view) {
        if (switcher == true) {

            setT(view);
            view.setEnabled(false);
        } else {
            setf(view);
            view.setEnabled(false);

        }

    }


    void setT(View view) {
        if (switcher == true) {
            ((Button) view).setText("X");
            ((Button) view).setTextSize(24);
            ((Button) view).setTextColor(Color.BLACK);
            pressed(view.getRootView());
switcher=false;
        }
    }

    void setf(View view) {
        if (switcher == false) {

            ((Button) view).setText("O");
            ((Button) view).setTextColor(Color.RED);
            ((Button) view).setTextSize(24);
            pressed(view.getRootView());

            switcher = true;


        }

    }

    void pressed(View view) {
        Context context=this;
        String oWinner = "Player O Has Won The Game";
        String xWinnder ="Player X Has Won The Game";
        int shorts  = Toast.LENGTH_SHORT;
        Toast toast;
        if (buttonOne.getText() == "X" && buttonTwo.getText() == "X" && buttonThree.getText() == "X") {
 toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }
        if (buttonOne.getText() == "O" && buttonTwo.getText() == "O" && buttonThree.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
adb();
                }
            }, 3000);

        }
        if (buttonOne.getText() == "X" && buttonFour.getText() == "X" && buttonSeven.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);


        }
        if (buttonOne.getText() == "O" && buttonFour.getText() == "O" && buttonSeven.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }
        if (buttonOne.getText() == "X" && buttonFive.getText() == "X" && buttonNine.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);


        }
        if (buttonOne.getText() == "O" && buttonFive.getText() == "O" && buttonNine.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);


        }
        if (buttonTwo.getText() == "X" && buttonFive.getText() == "X" && buttonEight.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }
        if (buttonTwo.getText() == "O" && buttonFive.getText() == "O" && buttonEight.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

        }
        if (buttonThree.getText() == "X" && buttonSix.getText() == "X" && buttonNine.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }
        if (buttonThree.getText() == "O" && buttonSix.getText() == "O" && buttonNine.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);


        } if (buttonThree.getText() == "X" && buttonFive.getText() == "X" && buttonSeven.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }if (buttonThree.getText() == "O" && buttonFive.getText() == "O" && buttonSeven.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);
        }if (buttonFour.getText() == "X" && buttonFive.getText() == "X" && buttonSix.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }if (buttonFour.getText() == "O" && buttonFive.getText() == "O" && buttonSix.getText() == "O") {
            toast = Toast.makeText(context,oWinner,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);

        }if (buttonSeven.getText() == "X" && buttonEight.getText() == "X" && buttonNine.getText() == "X") {
            toast = Toast.makeText(context,xWinnder,shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);
        }if (buttonSeven.getText() == "O" && buttonEight.getText() == "O" && buttonNine.getText() == "O") {
            toast = Toast.makeText(context, oWinner, shorts);
            toast.show();
            loopFor(view);
            webView.setVisibility(View.VISIBLE);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);
        }if((buttonOne.getText()!="")&&(buttonTwo.getText()!="")&&(buttonThree.getText()!="")&&(buttonFour.getText()!="")&&(buttonFive.getText()!="")&&(buttonSix.getText()!="")&&(buttonSeven.getText()!="")&&(buttonEight.getText()!="")&&(buttonNine.getText()!="")){
            Toast.makeText(context,"Press Restart For Remake",shorts).show();
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run() {
                    adb();
                }
            }, 3000);
        }


    }
    void loopFor(View view){
        for(int i=0; i < tableRow.getChildCount(); i++){
            view=tableRow.getChildAt(i);
            view .setEnabled(false);
        }
        for(int i=0; i < tableRow2.getChildCount(); i++){
            view=tableRow2.getChildAt(i);
            view.setEnabled(false);
        }
        for(int i=0; i < tableRow3.getChildCount(); i++){
            view=tableRow3.getChildAt(i);
            view .setEnabled(false);
        }


    }
    void adb(){
        AlertDialog.Builder adb;
        adb = new AlertDialog.Builder(this);
        adb.setTitle("GameOver");
        adb.setMessage("Do you Want To Play Again?");
        adb.setPositiveButton("Yes...", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = getIntent();
                finish();
            startActivity(intent);
            }
        });
        adb.setIcon(R.mipmap.xo);
        adb.setNegativeButton("No!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent startMain = new Intent(Intent.ACTION_MAIN);
                startMain.addCategory(Intent.CATEGORY_HOME);
                startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(startMain);
                finish();
            }
        });

        adb.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        adb.show();
    }

}