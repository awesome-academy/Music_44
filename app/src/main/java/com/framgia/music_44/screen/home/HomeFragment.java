package com.framgia.music_44.screen.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.framgia.music_44.R;
import com.framgia.music_44.data.model.Songs;
import com.framgia.music_44.data.source.SongDataSource;
import com.framgia.music_44.data.source.SongsRepository;
import com.framgia.music_44.data.source.local.SongLocalDataSource;
import java.util.List;

public class HomeFragment extends Fragment implements HomeContract.View{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        initPresenter();
        return inflater.inflate(R.layout.fragment_screen_home, container, false);
    }

   void  initPresenter(){
       SongLocalDataSource songLocalDataSource = new SongLocalDataSource(getContext());
       SongsRepository songsRepository = new SongsRepository(songLocalDataSource);
       HomeContract.Presenter presenter = new HomePresenter(songsRepository,this);
       presenter.getSongs();
    }

    @Override
    public void getDataSuccess(List<Songs> songsList) {
    }
}