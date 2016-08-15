
package upload;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

//import model.LeadScore;

//import LeadScore




import model.LeadScore;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;
//import org.codehaus.jackson.map.ObjectMapper;



import utils.ADFConstants;
import wsserver.ScoreLeadWSProxy;

public class UploadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		//System.out.println("INSIDE UPLOAD FILE SERVLET ...");
		// process only if its multipart content
		if (isMultipart) {
			ClassLoader classLoader = this.getClass().getClassLoader();

			// Create a factory for disk-based file items
			FileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				// Parse the request
				List<FileItem> multiparts = upload.parseRequest(request);

				for (FileItem item : multiparts) {
					if (!item.isFormField()) {

						String name = item.getName();
						String path = getServletContext().getRealPath("")
								+ File.separator + ADFConstants.FILE_UPLOAD_LOC;
						//System.out.println("ITEM PATH >" + path);
						File adfFile = new File(path + File.separator + name);
						FileInputStream fis = new FileInputStream(adfFile);
						//if (!adfFile.exists())
							//adfFile.createNewFile();
						item.write(adfFile);
						BufferedInputStream inputStream = new BufferedInputStream(fis);
			            byte[] fileBytes = new byte[(int) adfFile.length()];
			            inputStream.read(fileBytes);
			            inputStream.close();
						new ws_server.ScoreLeadWS().scoreLead(path, fileBytes);
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
*/

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);

		// process only if its multipart content
		if (isMultipart) {
			ClassLoader classLoader = this.getClass().getClassLoader();

			// Create a factory for disk-based file items
			FileItemFactory factory = new DiskFileItemFactory();

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				// Parse the request
				List<FileItem> multiparts = upload.parseRequest(request);

				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						String name = item.getName();
						String path = getServletContext().getRealPath("")
								+ File.separator + ADFConstants.FILE_UPLOAD_LOC+File.separator+name;
						byte[] fileBytes = IOUtils.toByteArray(item.getInputStream());
			            
						/*LeadScore score = new ws_server.ScoreLeadWS().scoreLead(path, fileBytes);
			            ObjectMapper objectMapper = new ObjectMapper();
				        String jsonString = objectMapper.writeValueAsString(score);
				        System.out.println("JSON >"+jsonString);*/
						
						LeadScore score = new ScoreLeadWSProxy().scoreLead(path, fileBytes);
				        response.getWriter().write(this.convertScoreToHTML(score));
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	private String convertScoreToHTML(LeadScore score){
		String htmlStr = "<table id = \"scores\">";
			   htmlStr += "<tr><th>ADF Criteria</th><th>Score</th></tr>";
			   htmlStr += "<tr><td>First Name </td><td class=\"rit\">"+score.getFirstNameScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>Last Name </td><td class=\"rit\">"+score.getLastNameScore()+"</td></tr>";
			   htmlStr += "<tr><td>Email </td><td class=\"rit\">"+score.getEmailScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>Zipcode </td><td class=\"rit\">"+score.getZipCodeScore()+"</td></tr>";
			   htmlStr += "<tr><td>City </td><td class=\"rit\">"+score.getCityScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>State </td><td class=\"rit\">"+score.getStateScore()+"</td></tr>";
			   htmlStr += "<tr><td>City State Zip </td><td class=\"rit\">"+score.getZipCityStateScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>Phone No </td><td class=\"rit\">"+score.getPhoneNoScore()+"</td></tr>";
			   htmlStr += "<tr><td>Timeframe </td><td class=\"rit\">"+score.getTimeFrameScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>Purchase Type </td><td class=\"rit\">"+score.getPurchaseTypeScore()+"</td></tr>";
			   htmlStr += "<tr><td>Contact Type </td><td class=\"rit\">"+score.getContactTypeScore()+"</td></tr>";
			   htmlStr += "<tr class=\"alt\"><td>Contact Time </td><td class=\"rit\">"+score.getContactTimeScore()+"</td></tr>";
			   htmlStr += "<tr><td><b>Total </b></td><td class=\"rit\"><b>"+score.getScore()+"</b></td></tr>";
			   htmlStr += "</table>";
		return htmlStr;
	}
}
