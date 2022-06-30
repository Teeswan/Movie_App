package com.movie.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Movie {
private String name;
private String des;
private String link720;
private String link1080;
private String youtubelink;
private int episode;
private List<String> genres;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDes() {
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public String getLink720() {
	return link720;
}
public void setLink720(String link720) {
	this.link720 = link720;
}
public String getLink1080() {
	return link1080;
}
public void setLink1080(String link1080) {
	this.link1080 = link1080;
}
public String getYoutubelink() {
	return youtubelink;
}
public void setYoutubelink(String youtubelink) {
	this.youtubelink = youtubelink;
}
public List<String> getGenres() {
	return genres;
}
public void setGenres(List<String> genres) {
	this.genres = genres;
}
public int getEpisode() {
	return episode;
}
public void setEpisode(int episode) {
	this.episode = episode;
}
}
