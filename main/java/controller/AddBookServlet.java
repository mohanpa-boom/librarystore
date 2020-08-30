package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LibraryDao;
import model.Book;
import model.Library;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    LibraryDao dao=new LibraryDao();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Here, we can added the library list */
		
		String libraryId=request.getParameter("lib id");
    	String libraryName=request.getParameter("lib name");
    	String bookId=request.getParameter("book id");
		String bookName=request.getParameter("book name");
		String author=request.getParameter("author");
		String publisher=request.getParameter("publisher");
		
		String bookId2=request.getParameter("book id2");
		String bookName2=request.getParameter("book name2");
		String author2=request.getParameter("author2");
		String publisher2=request.getParameter("publisher2");
		
		PrintWriter out=response.getWriter();
		out.println(libraryId);
		out.println(libraryName);
		out.println(bookId);
		out.println(bookName);
		out.println(author);
		out.println(publisher);
		
		out.println(bookId2);
		out.println(bookName2);
		out.println(author2);
		out.println(publisher2);
		
		/* we can new instance class can be created */
		
		Library library=new Library();
	
		library.setLibraryId(libraryId);
		library.setLibraryName(libraryName);
		
		/* Here, we can add book */
		
		Book books=new Book();
		books.setBookId(bookId);
		books.setBookName(bookName);
		books.setAuthor(author);
		books.setPublisher(publisher);
		books.setLibrary(library);
		library.getBook().add(books);
		
		
		Book books2=new Book();
		books2.setBookId(bookId2);
		books2.setBookName(bookName2);
		books2.setAuthor(author2);
		books2.setPublisher(publisher2);
		books2.setLibrary(library);
		library.getBook().add(books2);
		
		dao.add(library);
		out.println("Book is added");	
		
	}

}
