package filmparadise.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="moviesdata")
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long movieId;
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(String movieYear) {
		this.movieYear = movieYear;
	}
	public String getMovieGenere() {
		return movieGenere;
	}
	public void setMovieGenere(String movieGenere) {
		this.movieGenere = movieGenere;
	}
	public String getMovieCast() {
		return movieCast;
	}
	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}
//	public String getMovieDirectorName() {
//		return movieDirectorName;
//	}
//	public void setMovieDirectorName(String movieDirectorName) {
//		this.movieDirectorName = movieDirectorName;
//	}
	public String getMovieSynopsis() {
		return movieSynopsis;
	}
	public void setMovieSynopsis(String movieSynopsis) {
		this.movieSynopsis = movieSynopsis;
	}
	public byte[] getMovieImage() {
		return movieImage;
	}
	public void setMovieImage(byte[] movieImage) {
		this.movieImage = movieImage;
	}
	private String movieName;
	private String movieYear;
	private String movieGenere;
	private String movieCast;
//	private String movieDirectorName;
	private String movieSynopsis;
	@Lob
	@Column(name = "movieImage",length = 30000000)
	private byte[] movieImage;
 }
