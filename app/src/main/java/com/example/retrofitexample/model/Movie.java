package com.example.retrofitexample.model;

import android.util.Log;
import android.widget.ImageView;

import java.util.List;

import com.bumptech.glide.Glide;
import com.example.retrofitexample.BR;
import com.example.retrofitexample.R;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

public class Movie extends BaseObservable{

    @SerializedName("id")
    @Expose
    private Integer id;

    @SerializedName("overview")
    @Expose
    private String overview;

    @SerializedName("poster_path")
    @Expose
    private String posterPath;

    @SerializedName("release_date")
    @Expose
    private String releaseDate;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;


    @BindingAdapter({"posterPath"})
    public static void loadImage(ImageView imageView, String imageUrl){
        // we use @BindingAdapter to provide custom binding logic because
        // we want use glide to load image from the internet and
        // glide don't defined in android databinding library
        // Base Url: "https://image/tmdb.org/t/p/w500"
        String imagePath = "https://image.tmdb.org/t/p/w500"+imageUrl;
        Glide.with(imageView.getContext())
                .load(imagePath)
                .into(imageView);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Bindable
    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
        notifyPropertyChanged(BR.posterPath);
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }

    @Bindable
    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
        notifyPropertyChanged(BR.voteAverage);
    }

}
