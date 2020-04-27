package nod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NodeValueDate implements INodeValue
{
	Date value;
	String date;
	String format;
	
	public Date evaluateNode() throws ParseException {
		SimpleDateFormat sdformat = new SimpleDateFormat(this.format);
	    Date d1 = sdformat.parse(this.date);
	    return d1;
	}
	
	/* When Comparing...
	 * 
	 * if(d1.compareTo(d2) > 0) {
         System.out.println("Date 1 occurs after Date 2"); Date 1 is Greater.
      } else if(d1.compareTo(d2) < 0) {
         System.out.println("Date 1 occurs before Date 2"); Date 2 is Greater.
      } else if(d1.compareTo(d2) == 0) {
         System.out.println("Both dates are equal");
      }
	 */
}
