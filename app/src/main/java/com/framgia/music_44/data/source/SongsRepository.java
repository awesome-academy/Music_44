package com.framgia.music_44.data.source;

import com.framgia.music_44.data.source.local.SongLocal;

public class SongsRepository {
    private SongDataSource.LocalDataSource mLocalDataSource;

    public SongsRepository(SongDataSource.LocalDataSource localDataSource) {
        mLocalDataSource = localDataSource;
    }

    public void getData(SongLocal songLocal) {
        mLocalDataSource.getData(songLocal);
    }
}
