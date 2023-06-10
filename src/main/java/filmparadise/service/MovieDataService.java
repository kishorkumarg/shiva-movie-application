package filmparadise.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import filmparadise.entity.MovieData;
import filmparadise.repository.MovieDataRepository;

@Service
public class MovieDataService {
	@SuppressWarnings("unused")
	@Autowired
	private MovieDataRepository moviedatarepository;
	
	public String saveImage(MultipartFile file,String movieName,String movieYear, String movieGenere,String movieCast, String movieSynopsis) throws IOException {
		MovieData md= new MovieData();
		md.setMovieName(movieName);
		md.setMovieYear(movieYear);
		md.setMovieGenere(movieGenere);
		md.setMovieCast(movieCast);
		md.setMovieSynopsis(movieSynopsis);
		md.setMovieImage(file.getBytes());
		moviedatarepository.save(md);
		return "Data got Saved";
	}
}
