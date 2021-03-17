package com.mpatric.mp3agic;

import org.jetbrains.annotations.Nullable;

public interface ID3v1 {

	String getVersion();

	String getTrack();

	void setTrack(String track);

	@Nullable
	String getArtist();

	void setArtist(String artist);

	@Nullable
	String getTitle();

	void setTitle(String title);

	@Nullable
	String getAlbum();

	void setAlbum(String album);

	@Nullable
	String getYear();

	void setYear(String year);

	int getGenre();

	void setGenre(int genre);

	@Nullable
	String getGenreDescription();

	@Nullable
	String getComment();

	void setComment(String comment);

	byte[] toBytes() throws NotSupportedException;
}
