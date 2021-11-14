package boomplay.models;

import java.util.Optional;

public class Songs {

    private Artists artistName;

    private String title;

    private String comment;

    private Optional<Favourite> favouriteOptional;

    private Optional<Playlist> addToPlayList;

    private String ringtone;

    private Optional<Downloads> optionalDownloads;

    private PlayNext playNext;
}
