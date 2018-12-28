package com.framgia.music_44.screen.home;

import com.framgia.music_44.data.model.Songs;
import com.framgia.music_44.data.source.SongsRepository;
import com.framgia.music_44.data.source.local.OnResultDataListener;
import com.framgia.music_44.data.source.remote.OnResultDataListenerRemote;
import java.util.List;

public class HomePresenter implements HomeContract.Presenter {
    private HomeContract.View mView;
    private SongsRepository mSongsRepository;

    public HomePresenter(SongsRepository songsRepository, HomeContract.View view) {
        mSongsRepository = songsRepository;
        mView = view;
    }

    @Override
    public void getSongsLocal() {
        mSongsRepository.getData(new OnResultDataListener() {
            @Override
            public void onSuccess(List<Songs> data) {
                mView.onGetSongsSuccess(data);
            }
        });
    }

    @Override
    public void getSongRemote(String genres) {
        mSongsRepository.getDataRemote(new OnResultDataListenerRemote() {
            @Override
            public void onSuccess(List<Songs> data) {
                mView.onGetSongsSuccess(data);
            }

            @Override
            public void onFail(Exception e) {
                mView.onGetSongsFail(e);
            }
        }, genres);
    }

    @Override
    public void getSongBySearch(String querySearch) {
        mSongsRepository.getDataBySearch(new OnResultDataListenerRemote() {
            @Override
            public void onSuccess(List<Songs> data) {
                mView.onGetSongsSuccess(data);
            }

            @Override
            public void onFail(Exception e) {
                mView.onGetSongsFail(e);
            }
        }, querySearch);
    }
}
