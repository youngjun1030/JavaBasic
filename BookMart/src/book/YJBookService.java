package book;

import java.util.List;

public class YJBookService implements BookService {

	BookDAO bookDAO;
	public YJBookService(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	@Override
	public boolean registBook(BookVO book) {
		return bookDAO.insertBook(book);
	}

	@Override
	public List<BookVO> listBooks() {
		return bookDAO.selectAllBooks();
	}

	@Override
	public BookVO detailBookInfo(int bookNo) {
		return bookDAO.selectBook(bookNo);
	}

	@Override
	public boolean updateBookPrice(int bookNo, int price) {
		BookVO book = bookDAO.selectBook(bookNo);
		if (book != null) {
			book.setPrice(price);
			bookDAO.updateBook(book);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateBookInstock(int bookNo, int instock) {
		BookVO book = bookDAO.selectBook(bookNo);
		
		if (book != null) {
			book.setInstock(instock);
			bookDAO.updateBook(book);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeBook(int bookNo) {
//		BookVO book = bookDAO.selectBook(bookNo);
//		if (book != null) {
//			bookDAO.deleteBook(bookNo);
//			return true;
//		}
		
		bookDAO.deleteBook(bookNo); // 잘 체크됬다는 가정 하
		return false;
	}

}
