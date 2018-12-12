package com.framgia.music_44.screen.home;

import com.framgia.music_44.data.model.Songs;
import java.util.List;

public interface HomeContract {
    interface View {
        void getDataSuccess(List<Songs> songsList);
    }

    interface Presenter {
        void getSongs();
    }
}
