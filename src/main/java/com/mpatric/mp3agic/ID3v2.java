package com.mpatric.mp3agic;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.com.mpatric.mp3agic.ID3v2Artwork;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ID3v2 extends ID3v1 {

	boolean getPadding();

	void setPadding(boolean padding);

	boolean hasFooter();

	void setFooter(boolean footer);

	boolean hasUnsynchronisation();

	void setUnsynchronisation(boolean unsynchronisation);

	int getBPM();

	void setBPM(int bpm);

	@Nullable
	String getGrouping();

	void setGrouping(String grouping);

	@Nullable
	String getKey();

	void setKey(String key);

	@Nullable
	String getDate();

	void setDate(String date);

	@Nullable
	String getComposer();

	void setComposer(String composer);

	@Nullable
	String getPublisher();

	void setPublisher(String publisher);

	@Nullable
	String getOriginalArtist();

	void setOriginalArtist(String originalArtist);

	@Nullable
	String getAlbumArtist();

	void setAlbumArtist(String albumArtist);

	@Nullable
	String getCopyright();

	void setCopyright(String copyright);

	String getArtistUrl();

	void setArtistUrl(String url);

	String getCommercialUrl();

	void setCommercialUrl(String url);

	String getCopyrightUrl();

	void setCopyrightUrl(String url);

	String getAudiofileUrl();

	void setAudiofileUrl(String url);

	String getAudioSourceUrl();

	void setAudioSourceUrl(String url);

	String getRadiostationUrl();

	void setRadiostationUrl(String url);

	String getPaymentUrl();

	void setPaymentUrl(String url);

	String getPublisherUrl();

	void setPublisherUrl(String url);

	@Nullable
	String getUrl();

	void setUrl(String url);

	String getPartOfSet();

	void setPartOfSet(String partOfSet);

	boolean isCompilation();

	void setCompilation(boolean compilation);

	ArrayList<ID3v2ChapterFrameData> getChapters();

	void setChapters(ArrayList<ID3v2ChapterFrameData> chapters);

	ArrayList<ID3v2ChapterTOCFrameData> getChapterTOC();

	void setChapterTOC(ArrayList<ID3v2ChapterTOCFrameData> ctoc);

	String getEncoder();

	void setEncoder(String encoder);

	byte[] getAlbumImage();

	/**
	 * Added
	 * @return List of artwork with mime types
	 */
	@NotNull
	List<ID3v2Artwork> getAlbumImageList();

	/**
	 * Added
	 * @return List of comments with descriptions
	 */
	@NotNull
	List<ID3v2Comment> getCommentList();

	void setAlbumImage(byte[] albumImage, String mimeType);

	void setAlbumImage(byte[] albumImage, String mimeType, byte imageType, String imageDescription);

	void clearAlbumImage();

	@Nullable
	String getAlbumImageMimeType();

	/**
	 * Added
	 * @return List of artists, split on null characters, forward compatible with ID3v2.4
	 */
	@NotNull
	List<String> getArtistList();

	/**
	 * Added
	 * @return List of genres, split on null characters, forward compatible with ID3v2.4
	 */
	@NotNull
	List<String> getGenreDescriptionList();

	int getWmpRating();

	void setWmpRating(int rating);

	String getItunesComment();

	void setItunesComment(String itunesComment);

	@Nullable
	String getLyrics();

	void setLyrics(String lyrics);

	/**
	 * Set genre from text.
	 * This method behaves different depending on the ID3 version.
	 * Prior to ID3v2.4, the provided text must match a id3v1 genre description.
	 * With ID3v2.4, the genre is written as free text.
	 *
	 * @param text genre string
	 */
	void setGenreDescription(String text);

	int getDataLength();

	int getLength();

	boolean getObseleteFormat();

	Map<String, ID3v2FrameSet> getFrameSets();

	void clearFrameSet(String id);
}
