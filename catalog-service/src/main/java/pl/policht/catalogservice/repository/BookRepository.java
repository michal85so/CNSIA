package pl.policht.catalogservice.repository;

import java.util.Optional;
import pl.policht.catalogservice.domain.Book;

public interface BookRepository {

	Iterable<Book> findAll();
	Optional<Book> findByIsbn(String isbn);
	boolean existsByIsbn(String isbn);
	Book save(Book book);
	void deleteByIsbn(String isbn);

}
