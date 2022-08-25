package com.example.demo;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.demo.entities.Book;
import com.example.demo.entities.User;
import com.example.demo.services.BookService;
import com.example.demo.services.NotificationService;
import com.example.demo.services.UserService;
import com.example.demo.utils.MidnightApplicationRefresh;

@SpringBootApplication
public class LibrayManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrayManagementApplication.class, args);
	}


@Autowired
BookService bookService;

@Autowired
UserService usService;

@Autowired
NotificationService notifService;

@Autowired
BCryptPasswordEncoder pwEncoder;

@Autowired
MidnightApplicationRefresh midAppRef;

@Bean
CommandLineRunner runner() {
	return args -> {
	
	//User user1 = new User("admin", pwEncoder.encode("test"), "sriramlakkireddy@gmail.com", "Sriram", "Reddy", "Vijjayawada", "8797979873", "india");
	//user1.setRole("ROLE_ADMIN");
		
		User user2 = new User("librarian", pwEncoder.encode("test"), "tonystark@gmail.com", "Tony", "Strak", "Chennai", "8499589393", "india");
		user2.setRole("ROLE_EMPLOYEE");
		
		User user3 = new User("user", pwEncoder.encode("test"), "Jhonny@gmail.com", "Johnny", "Deep", "vizag", "7737886878", "india");
		user3.setRole("ROLE_USER");	
		User user4 = new User("laxman", pwEncoder.encode("test"), "laxman@gmail.com", "laxman", "rathod", "Rajasthan", "8897979791", "india");
		User user5 = new User("Gowri", pwEncoder.encode("test"), "gowrishankar@gmail.com", "gowri", "Shankar", "Dallas", "06-13644621", "Usa");
		User user6 = new User("prudhvi", pwEncoder.encode("test"), "pc@gmail.com", "pc", "chowdary", "Madhira", "9987436633", "India");
		User user7 = new User("jack", pwEncoder.encode("test"), "jakie@gmail.com", "Jackie", "Jahn", "twintowers", "06-00492182", "china");
		User user8 = new User("tom", pwEncoder.encode("test"), "tomcruise@gmail.com", "tom", "cruise", "New york", "06-88720394", "USA");
		User user9 = new User("robert", pwEncoder.encode("test"), "robert@gmail.com", "robert", "downey", "texas", "06-18392031", "USA");
		User user10 = new User("superman123", pwEncoder.encode("test"), "edo.vandeijck@gmail.com", "Edo", "van Deijck", "Itersonstraat 195", "06-98374821", "Assen");
		
		//usService.save(user1);
		usService.save(user2);
		usService.save(user3);
		usService.save(user4);
		usService.save(user5);
		usService.save(user6);
		usService.save(user7);
		usService.save(user8);
		usService.save(user9);
		usService.save(user10);
		
		Book book1 = new Book("Avengers End Game", "David Thomas, Andrew Hunt", 2006, 1);
		Book book2 = new Book("Pirates of the carabian", "Robert C. Martin", 2020, 2);
		Book book3 = new Book("Harrypotter", "Steve McConnell", 2012, 1);
		Book book4 = new Book("John wick", "Martin Fowler", 2017, 4);
		Book book5 = new Book("Fight clud", "Eric Freeman, Bert Bates, Kathy Sierra, Elisabeth Robson", 2019, 5);
		Book book6 = new Book("The pursuit of happiness", "Frederick P. Brooks Jr", 1999, 1);
		Book book7 = new Book("Thor ragnorok", "Robert Martin", 2021, 3);
		Book book8 = new Book("The Godfather", "Micheal Feathers", 2015, 1);
		Book book9 = new Book("Wonder women", "Erich Gamma, Richard Helm. Ralph Johnson, John Vlissides", 2019, 2);
		Book book10 = new Book("Spider man", "Gayle Laakmann McDowell", 2018, 3);
		Book book11 = new Book("Rework", "Jason Fried, David Heinemeier Hansson", 2011, 1);
		Book book12 = new Book("Matrix", "Steve Krug", 2005, 1);
		Book book13 = new Book("Deadpool", "Charles Petzold", 2017, 1);
		Book book14 = new Book("The Batman", "Tom DeMarco, Tim Lister", 2013, 3);
		Book book15 = new Book("Dune", "Thomas H. Cormen", 2020, 2);
		Book book16 = new Book("Puspa", "Sukumar", 2020,4);
		Book book17 = new Book("No Time to die", "Martin Fowler", 2020, 2);
		Book book18 = new Book("Spider Man", "Harold Abelson, Gerald Jay Sussman, Julie Sussman", 2013, 1);
		Book book19 = new Book("Ant Man", "Donald E. Knuth", 2014, 4);
		Book book20 = new Book("Iron Man", "Eric Evans", 2010, 2);
		Book book21 = new Book("Captian America", "Peter Seibel", 2009, 1);
		Book book22 = new Book("Captian Marvel", "Steve McConnell", 1995, 6);
		Book book23 = new Book("Avengers Infinity wars", "Cory Althoff", 2021, 1);
		Book book24 = new Book("Black Mirror", "Robert Sedgewick, Kevin Wayne", 2000, 3);
		Book book25 = new Book("Forest Gump", "Jez Humble, David Farley", 2003, 3);
		
		bookService.save(book1);
		bookService.save(book2);
		bookService.save(book3);
		bookService.save(book4); 
		bookService.save(book5);
		bookService.save(book6);
		bookService.save(book7);
		bookService.save(book8);
		bookService.save(book9);
		bookService.save(book10);
		bookService.save(book11);
		bookService.save(book12);
		bookService.save(book13);
		bookService.save(book14);
		bookService.save(book15);
		bookService.save(book16);
		bookService.save(book17);
		bookService.save(book18);
		bookService.save(book19);
		bookService.save(book20);
		bookService.save(book21);
		bookService.save(book22);
		bookService.save(book23);
		bookService.save(book24);
		bookService.save(book25);
		
		book10.setTheUser(user3);
		book10.setReturnDate(LocalDate.of(2022, 8, 10));
		
		book1.setTheUser(user3);
		book1.setReturnDate(LocalDate.of(2022, 8, 05));
		
		user3.setBooks(Arrays.asList(book10, book1));
		
		bookService.save(book1);
		bookService.save(book10);
		usService.save(user3);
					
		midAppRef.midnightApplicationRefresher();	
	};
}
}
