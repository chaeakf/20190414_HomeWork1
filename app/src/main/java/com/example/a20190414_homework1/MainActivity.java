package com.example.a20190414_homework1;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String titleTxt = "카카오 계정으로 회원가입 하시면 지상파 포함 50여개 LIVE 채널을 무료로 즐길 수 있어요.";
        TextView titleText = (TextView)findViewById(R.id.titleText);
        SpannableStringBuilder text = new SpannableStringBuilder(titleTxt);
        text.setSpan(new StyleSpan(Typeface.BOLD),0,13, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE );
        titleText.setText(text);
        text.setSpan(new StyleSpan(Typeface.BOLD),39,41, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE );
        titleText.setText(text);
//        text.setSpan(new ForegroundColorSpan(Color.parseColor("#8154D8")),52,54,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE );
//        titleText.setText(text);

        String serviceCheckMsg = "서비스 이용약관(필수)";
        TextView CheckSeviceMsg = (TextView)findViewById(R.id.text_service);
        SpannableStringBuilder CSM = new SpannableStringBuilder(serviceCheckMsg);
        CSM.setSpan(new ForegroundColorSpan(Color.parseColor("#9E7CDE")),8,12,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        CheckSeviceMsg.setText(CSM);

        String persnalCheckMsg = "개인정보처리방침(필수)";
        TextView CheckPersvalMsg = (TextView)findViewById(R.id.text_persnal);
        SpannableStringBuilder PSM = new SpannableStringBuilder(persnalCheckMsg);
        PSM.setSpan(new ForegroundColorSpan(Color.parseColor("#9E7CDE")),8,12,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        CheckPersvalMsg.setText(PSM);

        String payCheckMsg = "유료상품이용약관(필수)";
        TextView CheckPayMsg = (TextView)findViewById(R.id.text_pay);
        SpannableStringBuilder PaySM = new SpannableStringBuilder(payCheckMsg);
        PaySM.setSpan(new ForegroundColorSpan(Color.parseColor("#9E7CDE")),8,12,Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        CheckPayMsg.setText(PaySM);

        String eventTxt = "이벤트마케팅 수신동의(선택)";
        TextView evnetText = (TextView)findViewById(R.id.text_event);
        SpannableStringBuilder eventMSG = new SpannableStringBuilder(eventTxt);
        eventMSG.setSpan(new StyleSpan(Typeface.ITALIC),11,15, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE );
        evnetText.setText(eventMSG);


    }
}
