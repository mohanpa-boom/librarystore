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
 * Servlet implementation class SearchBookServlet
 */
@WebServlet("/searchBook")
public class SearchBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    LibraryDao dao = new LibraryDao();
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
        Library l = dao.findBook(request.getParameter("search id"));
		
		if(l!=null)
		{
			out.println("Library Id:"+l.getLibraryId());out.print("<br>");
			out.println("Library Name:"+l.getLibraryName());
			
		}
/* we can search common details*/
		
		Book b = dao.findBookID(request.getParameter("search id"));
		
		  out.print("<br>");
		  if(b!=null) { out.println("Book Id : "+b.getBookId());out.print("<br>");
		  out.println("Book Name : "+b.getBookName());out.print("<br>");
		  out.println("Author of Book : "+b.getAuthor());out.print("<br>");
		  out.println("Publisher of Book : "+b.getPublisher()); }else {
		  out.println("Enter the correct BookId"); 
		}
	}

}
