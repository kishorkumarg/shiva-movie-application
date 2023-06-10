package filmparadise.controller;
import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import filmparadise.service.MovieDataService;

@RestController
@RequestMapping("/moviedata")
public class MovieDataController {
	@Autowired
	private MovieDataService moviedataservice;
	@PostMapping("/save")
	public String saveMovieData(@RequestParam("file") MultipartFile file,
								@RequestParam("movieName") String movieName,
								@RequestParam("movieYear")String movieYear,
								@RequestParam("movieGenere")String movieGenere,
								@RequestParam("movieCast")String movieCast,
								@RequestParam("movieSynopsis") String movieSynopsis) throws IOException
	{
		return moviedataservice.saveImage(file,movieName,movieYear,movieGenere,movieCast,movieSynopsis);
	
	}
	
}
