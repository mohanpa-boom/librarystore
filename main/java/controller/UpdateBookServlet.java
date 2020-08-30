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

/**
 * Servlet implementation class UpdateBookServlet
 */
@WebServlet("/updateBook")
public class UpdateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		LibraryDao dao = new LibraryDao();
		
		/*Here, we can update the book list*/
	
		String nbId = request.getParameter("bId");
		String nBName = request.getParameter("bName");
		String nBauthr = request.getParameter("Authr");
		String nBpubshr = request.getParameter("Pubshr");
		
		Book book = dao.findBookID(nbId);

		Book upbook = dao.updateBookDetails(nbId,nBName,nBauthr,nBpubshr);
		 	
	  	out.println("After Updating");out.print("<br>");
		out.println("Book Name : " +upbook.getBookName());out.print("<br>");
		out.println("Book Author : "+upbook.getAuthor());out.print("<br>");
		out.println("Book Publisher Name : "+upbook.getPublisher());out.print("<br>");
			
	}

}
