package com.framgia.music_44.data.source;

import com.framgia.music_44.data.source.local.SongLocal;

public interface SongDataSource {
    interface LocalDataSource {
        void getData(SongLocal songLocal);
    }

    interface RemoteDataSource {
        void getData();
    }
}
