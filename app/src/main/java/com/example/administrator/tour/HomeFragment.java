package com.example.administrator.tour;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class HomeFragment extends Fragment implements OnClickListener{
//    /**
//     * ViewPager中ImageView的容器
//     */
//    private List<ImageView> imageViewContainer = null;
//    /**
//     * 上一个被选中的小圆点的索引，默认值为0
//     */
//    private int preDotPosition = 0;
//    /**
//     * Banner文字描述数组
//     */
//    private String[] bannerTextDescArray = {
//            "巩俐不低俗，我就不能低俗",
//            "朴树又回来了，再唱经典老歌引万人大合唱",
//            "揭秘北京电影如何升级",
//            "乐视网TV版大派送", "热血屌丝的反杀"
//    };
//    /**
//     * Banner滚动线程是否销毁的标志，默认不销毁
//     */
//    private boolean isStop = false;
//    /**
//     * Banner的切换下一个page的间隔时间
//     */
//    private long scrollTimeOffset = 3000;
//    private ViewPager viewPager;
//    /**
//     * Banner的文字描述显示控件
//     */
//    private TextView tvBannerTextDesc;
//    /**
//     * 小圆点的父控件
//     */
//    private LinearLayout llDotGroup;
//    private Context context;
//    public HomeFragment(Context context){
//        this.context = context;
//    }
    //寻找对应的布局
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homefragment, container, false);

//        viewPager = (ViewPager)view.findViewById(R.id.viewpager);
//        llDotGroup = (LinearLayout)view.findViewById(R.id.points);
//        tvBannerTextDesc = (TextView)view.findViewById(R.id.tv_banner_text_desc);

//        initView();
//        startBannerScrollThread();
        return view;
    }
//    /**
//     * 开启Banner滚动线程
//     */
//    public void startBannerScrollThread() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (!isStop) {
//                    //每ge两秒钟发一条消息到主线程，更新viewpager界面
//                    SystemClock.sleep(scrollTimeOffset);
//
//                    getActivity().runOnUiThread(new Runnable() {
//                        public void run() {
//                            int newindex = viewPager.getCurrentItem() + 1;
//                            viewPager.setCurrentItem(newindex);
//                        }
//                    });
//                }
//            }
//        }).start();
//    }
//    @Override
//    public void onDestroy() {
//        // 销毁线程
//        isStop = true;
//        super.onDestroy();
//    }
//    private void initView() {
//
//
//        imageViewContainer = new ArrayList<ImageView>();
//        int[] imageIDs = new int[]{
//                R.mipmap.a,
//                R.mipmap.b,
//                R.mipmap.c,
//                R.mipmap.d,
//        };
//
//        ImageView imageView = null;
//        View dot = null;
//        LinearLayout.LayoutParams params = null;
//        for (int id : imageIDs) {
//            imageView = new ImageView(this);
//            imageView.setBackgroundResource(id);
//            imageViewContainer.add(imageView);
//
//            // 每循环一次添加一个点到线行布局中
//            dot = new View(this);
//            dot.setBackgroundResource(R.drawable.dot_bg_selector);
//            params = new LinearLayout.LayoutParams(25, 25);
//            params.leftMargin = 10;
//            dot.setEnabled(false);
//            dot.setLayoutParams(params);
//            llDotGroup.addView(dot); // 向线性布局中添加"点"
//        }
//        viewPager.setAdapter(new BannerAdapter());
//        viewPager.setOnPageChangeListener(new BannerPageChangeListener());
//
//        // 选中第一个图片、文字描述
//        tvBannerTextDesc.setText(bannerTextDescArray[0]);
//        llDotGroup.getChildAt(0).setEnabled(true);
//        viewPager.setCurrentItem(0);
//    }
//
    @Override
    public void onClick(View v) {

    }
//
//    /**
//     * ViewPager的适配器
//     */
//    private class BannerAdapter extends PagerAdapter {
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            container.removeView(imageViewContainer.get(position % imageViewContainer.size()));
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//            View view = imageViewContainer.get(position % imageViewContainer.size());
//
//            // 为每一个page添加点击事件
//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
////                    Toast.makeText(HomeFragment.this, "Baby 被点击了", Toast.LENGTH_SHORT).show();
//                }
//            });
//            container.addView(view);
//            return view;
//        }
//        @Override
//        public int getCount() {
//            return Integer.MAX_VALUE;
//        }
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//            return view == object;
//        }
//    }
//    /**
//     * Banner的Page切换监听器
//     */
//    /**
//     * Banner的Page切换监听器
//     */
//    private class BannerPageChangeListener implements ViewPager.OnPageChangeListener {
//        @Override
//        public void onPageScrollStateChanged(int arg0) {
//            // Nothing to do
//        }
//        @Override
//        public void onPageScrolled(int arg0, float arg1, int arg2) {
//            // Nothing to do
//        }
//        @Override
//        public void onPageSelected(int position) {
//            // 取余后的索引，得到新的page的索引
//            int newPositon = position % imageViewContainer.size();
//            // 根据索引设置图片的描述
//            tvBannerTextDesc.setText(bannerTextDescArray[newPositon]);
//            // 把上一个点设置为被选中
//            llDotGroup.getChildAt(preDotPosition).setEnabled(false);
//            // 根据索引设置那个点被选中
//            llDotGroup.getChildAt(newPositon).setEnabled(true);
//            // 新索引赋值给上一个索引的位置
//            preDotPosition = newPositon;
//        }
//    }

}
