package br.com.zup.projetoModulo05.catalogo;

import java.util.Date;
import java.util.List;

/* Essa é a Model Filme, basicamente o JSON do filme que vem da API tem muita coisa. Com essa Model eu limito
o que eu quero receber desse Json. As informações que eu quero receber são os atributos que a model tem
(O nome ta em inglês porque precisa ser identico ao do Json que tá vindo da api externa)
 */
public class Filme {
    private int id;
    private String title;
    private List<Integer> genre_ids;
    private String overview;
    private String poster_path;
    private Date release_date;
    private boolean adult;
    private String media_type;
    private double popularity;
    private double voteAverage;


    public Filme() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(List<Integer> genre_ids) {
        this.genre_ids = genre_ids;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }
}