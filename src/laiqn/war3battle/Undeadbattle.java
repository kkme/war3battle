package laiqn.war3battle;


import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class Undeadbattle extends Activity {
	
	public static Undeadbattle instance = null;
	 
	private ViewPager mTabPager;	
	private ImageView mTabImg;// ����ͼƬ
	private ImageView mTab1,mTab2,mTab3,mTab4;
	private int zero = 0;// ����ͼƬƫ����
	private int currIndex = 0;// ��ǰҳ�����
	private int one;//����ˮƽ����λ��
	private int two;
	private int three;
	private LinearLayout mClose;
    private LinearLayout mCloseBtn;
    private View layout;	
	private boolean menu_display = false;
	private PopupWindow menuWindow;
	private LayoutInflater inflater;
	private TextView textView1;
	private Button mButton;
	//private Button mRightBtn;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_undeadbattle);

         //����activityʱ���Զ����������
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 
        instance = this;
        /*
        mRightBtn = (Button) findViewById(R.id.right_btn);
        mRightBtn.setOnClickListener(new Button.OnClickListener()
		{	@Override
			public void onClick(View v)
			{	showPopupWindow (MainWeixin.this,mRightBtn);
			}
		  });*/
        
        mTabPager = (ViewPager)findViewById(R.id.tabpager);
        mTabPager.setOnPageChangeListener(new MyOnPageChangeListener());

        mTab1 = (ImageView) findViewById(R.id.img_weixin);
        mTab2 = (ImageView) findViewById(R.id.img_address);
        mTab3 = (ImageView) findViewById(R.id.img_friends);
        mTab4 = (ImageView) findViewById(R.id.img_settings);
        mTabImg = (ImageView) findViewById(R.id.img_tab_now);
    	textView1 = (TextView) this.findViewById(R.id.textView1);
    	mButton = (Button) this.findViewById(R.id.button2);
        mTab1.setOnClickListener(new MyOnClickListener(0));
        mTab2.setOnClickListener(new MyOnClickListener(1));
        mTab3.setOnClickListener(new MyOnClickListener(2));
        mTab4.setOnClickListener(new MyOnClickListener(3));
        Display currDisplay = getWindowManager().getDefaultDisplay();//��ȡ��Ļ��ǰ�ֱ���
        int displayWidth = currDisplay.getWidth();
        int displayHeight = currDisplay.getHeight();
        one = displayWidth/4; //����ˮƽ����ƽ�ƴ�С
        two = one*2;
        three = one*3;
        //Log.i("info", "��ȡ����Ļ�ֱ���Ϊ" + one + two + three + "X" + displayHeight);
        
        //InitImageView();//ʹ�ö���
      //��Ҫ��ҳ��ʾ��Viewװ��������
        LayoutInflater mLi = LayoutInflater.from(this);
        View view1 = mLi.inflate(R.layout.activity_undeadv1, null);
        View view2 = mLi.inflate(R.layout.activity_undeadv2, null);
        View view3 = mLi.inflate(R.layout.activity_undeadv3, null);
        View view4 = mLi.inflate(R.layout.activity_undeadv4, null);
        
      //ÿ��ҳ���view���
        final ArrayList<View> views = new ArrayList<View>();
        views.add(view1);
        views.add(view2);
        views.add(view3);
        views.add(view4);
      //���ViewPager�����������
        PagerAdapter mPagerAdapter = new PagerAdapter() {
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public int getCount() {
				return views.size();
			}

			@Override
			public void destroyItem(View container, int position, Object object) {
				((ViewPager)container).removeView(views.get(position));
			}
			
			//@Override
			//public CharSequence getPageTitle(int position) {
				//return titles.get(position);
			//}
			
			@Override
			public Object instantiateItem(View container, int position) {
				((ViewPager)container).addView(views.get(position));
				return views.get(position);
			}
		};
		
		mTabPager.setAdapter(mPagerAdapter);
    }
    /**
	 * ͷ��������
	 */
	public class MyOnClickListener implements View.OnClickListener {
		private int index = 0;

		public MyOnClickListener(int i) {
			index = i;
		}
		@Override
		public void onClick(View v) {
			mTabPager.setCurrentItem(index);
		}
	};
    

	
	 /* ҳ���л�����(ԭ����:D.Winter)
	 */
	public class MyOnPageChangeListener implements OnPageChangeListener {
		@Override
		public void onPageSelected(int arg0) {
			Animation animation = null;
			switch (arg0) {
			case 0:
				mTab1.setImageDrawable(getResources().getDrawable(R.drawable.footman));
				if (currIndex == 1) {
					animation = new TranslateAnimation(one, 0, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.grunt_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, 0, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.archer_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, 0, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.ghoul_1));
				}
				break;
			case 1:
				mTab2.setImageDrawable(getResources().getDrawable(R.drawable.grunt));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, one, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.footman_1));
				} else if (currIndex == 2) {
					animation = new TranslateAnimation(two, one, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.archer_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, one, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.ghoul_1));
				}
				break;
			case 2:
				mTab3.setImageDrawable(getResources().getDrawable(R.drawable.archer));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, two, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.footman_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, two, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.grunt_1));
				}
				else if (currIndex == 3) {
					animation = new TranslateAnimation(three, two, 0, 0);
					mTab4.setImageDrawable(getResources().getDrawable(R.drawable.ghoul_1));
				}
				break;
			case 3:
				mTab4.setImageDrawable(getResources().getDrawable(R.drawable.ghoul));
				if (currIndex == 0) {
					animation = new TranslateAnimation(zero, three, 0, 0);
					mTab1.setImageDrawable(getResources().getDrawable(R.drawable.footman_1));
				} else if (currIndex == 1) {
					animation = new TranslateAnimation(one, three, 0, 0);
					mTab2.setImageDrawable(getResources().getDrawable(R.drawable.grunt_1));
				}
				else if (currIndex == 2) {
					animation = new TranslateAnimation(two, three, 0, 0);
					mTab3.setImageDrawable(getResources().getDrawable(R.drawable.archer_1));
				}
				break;
			}
			currIndex = arg0;
			animation.setFillAfter(true);// True:ͼƬͣ�ڶ�������λ��
			animation.setDuration(150);
			mTabImg.startAnimation(animation);
		}
		
		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
		}

		@Override
		public void onPageScrollStateChanged(int arg0) {
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	  if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
	       
	        this.finish();
	}
		return false;
	}
	
	
	   public void backv1(View view) {
			MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
			mediaPlayer2.start(); 
	        Intent intent = new Intent(this, Undead.class);
	        startActivity(intent);
	        this.finish();
	    }
		public void clickv1(View view) {
			MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
			mediaPlayer2.start(); 
			// TODO Auto-generated method stub
			int random = (int)Math.round(Math.random()*100);
			if(random % 8 ==0){
				displayToast("1本对开矿");
			}
			if(random % 8 ==1){
				displayToast("2本速天鬼骚扰");
			}
			if(random % 8 ==2){
				displayToast("2本强RUSH");
			}
			if(random % 8 ==3){
				displayToast("2本ZZ加绞肉车RUSH");
			}
			if(random % 8 ==4){
				displayToast("2本骷髅海");
			}
			if(random % 8 ==5){
				displayToast("3本毁灭一波");
			}
			if(random % 8 ==6){
				displayToast("混编部队");
			}
			if(random % 8 ==6){
				displayToast("女妖地面，占据流");
			}
			if(random % 8 ==7){
				displayToast("你人品太差了，什么战术都没随机到！");
			}
		}
		private void displayToast(String s){
			Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
		
		}
		
		  public void backv2(View view) {
				MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
				mediaPlayer2.start(); 
		        Intent intent = new Intent(this, Undead.class);
		        startActivity(intent);
		        this.finish();
		    }
			public void clickv2(View view) {
				MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
				mediaPlayer2.start(); 
				// TODO Auto-generated method stub
				int random = (int)Math.round(Math.random()*100);
				if(random % 13 ==0){
					displayToast("lich冰甲ZZ TR");
				}
				if(random % 13 ==1){
					displayToast("2本冰甲ZZ或配合女妖TR");
				}
				if(random % 13 ==2){
					displayToast("2本暴力ZZ压制");
				}
				if(random % 13 ==3){
					displayToast("3本常规战术");
				}
				if(random % 13 ==4){
					displayToast("狂狗ZZ对抗毒飞龙");
				}
				if(random % 13 ==5){
					displayToast("女妖占据");
				}
				if(random % 13 ==6){
					displayToast("混合部队");
				}
				if(random % 13 ==7){
					displayToast("天鬼拖肥流");
				}
				if(random % 13 ==8){
					displayToast("攀冰龙");
				}
				if(random % 13 ==9){
					displayToast("FL双BC爆狗");
				}
				if(random % 13 ==10){
					displayToast("常规ZZ流");
				}
				if(random % 13 ==11){
					displayToast("前期狗流开局");
				}
				if(random % 13 ==12){
					displayToast("你人品太差了，什么战术都没随机到！");
				}
			}
			
			   public void backv3(View view) {
					MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
					mediaPlayer2.start(); 
			        Intent intent = new Intent(this, Undead.class);
			        startActivity(intent);
			        this.finish();
			    }
				public void clickv3(View view) {
					MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
					mediaPlayer2.start(); 
					// TODO Auto-generated method stub
					int random = (int)Math.round(Math.random()*100);
					if(random % 6 ==0){
						displayToast("1本RUSHNE");
					}
					if(random % 6 ==1){
						displayToast("前期狗流开局");
					}
					if(random % 6 ==2){
						displayToast("2本TR");
					}
					if(random % 6 ==3){
						displayToast("对开矿");
					}
					if(random % 6 ==4){
						displayToast("骷髅海");
					}
					if(random % 6 ==5){
						displayToast("你人品太差了，什么战术都没随机到！");
					}
				}
				
				   public void backv4(View view) {
				        Intent intent = new Intent(this, Undead.class);
						MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b1);
						mediaPlayer2.start(); 
				        startActivity(intent);
				        this.finish();
				    }
					public void clickv4(View view) {
						MediaPlayer mediaPlayer2 = MediaPlayer.create(getBaseContext(), R.raw.b2);
						mediaPlayer2.start(); 
						// TODO Auto-generated method stub
						int random = (int)Math.round(Math.random()*100);
						if(random % 11 ==0){
							displayToast("常规ZZ流");
						}
						if(random % 11 ==1){
							displayToast("科技ZZ流");
						}
						if(random % 11 ==2){
							displayToast("狗流开局");
						}
						if(random % 11 ==3){
							displayToast("LICH拼天鬼");
						}
						if(random % 11 ==4){
							displayToast("速冰龙");
						}
						if(random % 11 ==5){
							displayToast("骷髅海");
						}
						if(random % 11 ==6){
							displayToast("2本RUSH");
						}
						if(random % 11 ==7){
							displayToast("小强RUSH流");
						}
						if(random % 11 ==8){
							displayToast("混合部队");
						}
						if(random % 11 ==9){
							displayToast("其他大招");
						}
						if(random % 11 ==10){
							displayToast("你人品太差了，什么战术都没随机到！");
						}
					}
}
    
    

