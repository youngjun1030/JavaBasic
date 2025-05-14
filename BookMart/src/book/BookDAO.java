package book;

import java.util.List;

public interface BookDAO {
	boolean insertBook(BookVO book);
	BookVO selectBook(int bookNo);
	List<BookVO> selectAllBooks();
	boolean updateBook(BookVO book);
	boolean deleteBook(int bookNo);
}
