package com.king.myapplication.ui.adapter;

import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.king.myapplication.R;
import com.king.myapplication.data.Bean.ShowBean;

import java.util.List;

/**
 * 作者：Administrator
 * on 2020/8/18
 * 17:38
 */
public class PopulaAdapter extends BaseQuickAdapter<ShowBean.ResultBean, BaseViewHolder> {
    public PopulaAdapter(int layoutResId, @Nullable List<ShowBean.ResultBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ShowBean.ResultBean item) {
        helper.setText(R.id.tv_text1, item.getName());
        helper.setText(R.id.tv_text2, item.getReleaseTime() + "");
        helper.setText(R.id.tv_text3, item.getWantSeeNum() + "");
        ImageView view = helper.getView(R.id.jjsy_imager);
        Glide.with(mContext).load(item.getImageUrl()).into(view);
    }
}
