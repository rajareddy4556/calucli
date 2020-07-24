package com.rrcreatedworks.calucli;


	import android.app.*;
	import android.os.*;
	import android.widget.*;
	import android.widget.SimpleCursorTreeAdapter.*;
	import android.view.View.*;
	import android.view.*;

	public class MainActivity extends Activity 
	{private Button btnsub,btnadd,btnmd,btndiv,btnmul;
		private EditText et1,et2;
		private TextView tv;
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);


			btnsub=(Button)findViewById(R.id.subtract);
			btnadd=(Button)findViewById(R.id.add);
			btnmul=(Button)findViewById(R.id.multiply);
			btnmd=(Button)findViewById(R.id.modulodivision);
			btndiv=(Button)findViewById(R.id.divide);
			
			

			et1=(EditText)findViewById(R.id.mainEditText1);
			et2=(EditText)findViewById(R.id.mainEditText2);
		
			tv=(TextView)findViewById(R.id.mainTextView);




			btnsub.setOnClickListener(new View.OnClickListener(){

					@Override
					public void  onClick(View p1)
					{
						double a=Double.parseDouble(et1.getText().toString());
						double b=Double.parseDouble(et2.getText().toString());
						double result=a-b;
						tv.setText(String.valueOf(result));





						return ;
					}
				});
			btnmul.setOnClickListener(new View.OnClickListener(){

					@Override
					public void  onClick(View p1)
					{
						double a=Double.parseDouble(et1.getText().toString());
						double b=Double.parseDouble(et2.getText().toString());
						double result=a*b;
						tv.setText(String.valueOf(result));





						return ;
					}
				});
			btnmd.setOnClickListener(new View.OnClickListener(){

					@Override
					public void  onClick(View p1)
					{
						double a=Double.parseDouble(et1.getText().toString());
						double b=Double.parseDouble(et2.getText().toString());
						double result=a%b;
						tv.setText(String.valueOf(result));





						return ;
					}
				});
			btndiv.setOnClickListener(new View.OnClickListener(){

					@Override
					public void  onClick(View p1)
					{
						double a=Double.parseDouble(et1.getText().toString());
						double b=Double.parseDouble(et2.getText().toString());
						double result=a/b;
						tv.setText(String.valueOf(result));





						return ;
					}
				});
			btnadd.setOnClickListener(new View.OnClickListener(){

					@Override
					public void  onClick(View p1)
					{
						double a=Double.parseDouble(et1.getText().toString());
						double b=Double.parseDouble(et2.getText().toString());
						double result=a+b;
						tv.setText(String.valueOf(result));





						return ;
					}
				});
			
			return ;
		}
	}
