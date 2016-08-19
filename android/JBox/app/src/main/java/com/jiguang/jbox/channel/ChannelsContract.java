package com.jiguang.jbox.channel;

import android.support.annotation.NonNull;

import com.jiguang.jbox.BasePresenter;
import com.jiguang.jbox.BaseView;
import com.jiguang.jbox.data.Channel;

import java.util.List;

public interface ChannelsContract {

    interface Presenter extends BasePresenter {

        void result(int requestCode, int resultCode);

        void loadChannels(boolean forceUpdate);

        void subscribe();   // 订阅

        void openChannelMessages(@NonNull Channel channel);
    }

    interface View extends BaseView<Presenter> {

        void showChannels(List<Channel> channels);

    }

}