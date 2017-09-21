package video.com.videoplayer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import video.com.videoplayer.view.VideoPlayerView;


/**
 * Created by zhangxiaoshuang on 2017/9/5.
 */

public class VideoActivity extends AppCompatActivity {
    private VideoPlayerView videoPlayerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_layout);
        initView();

    }

    private void initView() {
//        String url = "/sdcard/zxs/1504862289722.mp4";
        String url="android.resource://"+getPackageName()+"/"+R.raw.video;
//        String url1="https://pan.baidu.com/play/video#video/path=%2FVID_20170913_160922.mp4&t=-1";
        videoPlayerView = (VideoPlayerView) findViewById(R.id.mp_video);
        videoPlayerView.setVideo(url, true);
        videoPlayerView.setVideoPlayerListener(new VideoPlayerView.VideoPlayerListener() {

            @Override
            public void onPhotoAlbum() {
                //TODO 进入相册
            }
        });
    }

}
