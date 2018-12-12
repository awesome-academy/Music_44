package com.framgia.music_44.data.source.local;

import com.framgia.music_44.data.model.Songs;
import java.util.List;

public interface SongLocal {
    void onSuccess(List<Songs> data);
}
