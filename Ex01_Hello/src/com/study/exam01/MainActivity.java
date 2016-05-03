package com.study.exam01;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		// ��ư1 :
		// Ŭ�� �̺�Ʈ �߰�
		// �佺Ʈ ���� ,����
		Button button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v)
		{
				Toast.makeText(getApplicationContext(), "�� �佺Ʈ", Toast.LENGTH_LONG).show();
						
				Log.d("gikimi","aaaa");
		}
		});
		
		// ��ư2 :
		// ����Ʈ ����� �������� ����
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
				startActivity(intent);
			}
		});
		
		// ��ư3 :
				// ����Ʈ ����� ��ȭ �ɱ�
				Button button3 = (Button)findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v)
					{
						Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:01041637197"));//�Ͻ��� ȣ��(�˾Ƽ� ã�ư���)
						startActivity(intent);
					}
				});
				
		// ��ư4 :
		// EditText�� �Է��� ���� TextView�� ���� �ֱ�
		Button button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v)
			{
				EditText editText1 = (EditText)findViewById(R.id.editText1);
						
				String str = editText1.getText().toString();
						
				TextView textView1 = (TextView)findViewById(R.id.textView1);
				textView1.setText(str);

				Toast.makeText(getApplicationContext(), "EditText : " + str, Toast.LENGTH_SHORT).show();
			}
		});

		// ��ư5 :
		// ���� ������ ��Ƽ��Ƽ �����ϰ� ��� �޾ƿ���
		Button button5 = (Button)findViewById(R.id.button5);
		button5.setOnClickListener(new OnClickListener() {
					
			@Override
			public void onClick(View v)
			{
				Intent intent = new Intent(getApplicationContext(), NewActivity.class); //����� ȣ�� (���� ������ "NewActivity.class"�� �ҷ���)
				
				intent.putExtra("CustomerName", "ȫ�浿");	//Extra�� ���� intent�� �Ѱ��ش�.

				//startActivity(intent);
				
				//Intent�� tag �߰�(requestCode), �Ѿ Intent�� ���� ������ �ޱ� ���� ��� NewActivity.Java���� Result(resultCode)�� �ѱ�
				//onActivityResult �Լ��� ������
				startActivityForResult(intent, 1); 
			}
		});


	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);

		String sData = "";
		String str = "OnActivityResult() called : " + 
			             		requestCode + " : " + 
					     	resultCode;
		
		if (requestCode == 1)
		{
			sData = data.getStringExtra("BackData");
			str = str + " : " + sData;
		}
			
		Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
			
	}
	
	
}
