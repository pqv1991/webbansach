package pqv.webbansach.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pqv.webbansach.entity.Book;
import pqv.webbansach.entity.FavoriteBook;
import pqv.webbansach.entity.User;

import java.util.List;

@RepositoryRestResource(path = "favorite-books")
public interface FavoriteBookRepository extends JpaRepository<FavoriteBook, Integer> {
    public FavoriteBook findFavoriteBookByBookAndUser(Book book, User user);
    public List<FavoriteBook> findFavoriteBooksByUser(User user);
}
