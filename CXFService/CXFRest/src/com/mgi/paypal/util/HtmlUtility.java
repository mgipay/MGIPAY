package com.mgi.paypal.util;


/**
 * Utility methods for dealing with HTML
 * 
 * @author K05501
 */
public class HtmlUtility {
    private static final int HIGHEST_SPECIAL = '>';
    private static char[][] specialCharactersRepresentation = new char[HIGHEST_SPECIAL + 1][];
    static {
        specialCharactersRepresentation['&'] = "&amp;".toCharArray();
        specialCharactersRepresentation['<'] = "&lt;".toCharArray();
        specialCharactersRepresentation['>'] = "&gt;".toCharArray();
        specialCharactersRepresentation['"'] = "&quot;".toCharArray();
        specialCharactersRepresentation['%'] = "&#37;".toCharArray();
//        specialCharactersRepresentation['\''] = "&#039;".toCharArray();
    }

	/**
	 * Formats a String, replacing characters that may cause HTML
	 * problems with their HTML special code equivalents.
	 * <p>
	 * Handles &gt;, &lt;, &amp;, &quot;
	 * <p>
     * Optimized to create extra objects only if there are characters
     * to be escapced (and only minimal objects even then), and uses blocks
     * of escaped and unescaped characters.
     */
    public static String escapeHtml(String html) {
        StringBuffer buf = null;
        char[] htmlChars = null;
        int start = 0;
        int length = 0;
        if(html != null && html.length() > 0)
        {
	        length = html.length();
	
	        for (int i = 0; i < length; i++) {
	            char c = html.charAt(i);
	            if (c <= HIGHEST_SPECIAL) {                
	                char[] escaped = specialCharactersRepresentation[c];
	                if (escaped != null) {
	                    if(buf == null)
	                    {
	            	        // Include a little extra space in the StringBuffer to account for
	            	        // potential additional characters.
	                        buf = new StringBuffer(length + 20);
	                        htmlChars = html.toCharArray();
	                    }
	                    // add unescaped portion
	                    if (start < i) {
	                        buf.append(htmlChars,start,i-start);
	                    }
	                    // add escaped xml
	                    buf.append(escaped);
	                    start = i + 1;
	                }
	            }
	        }
        }
        
        String escapedHtml = null;
        // If there were no characters that needed to be converted, the
        // StringBuffer will not have been instantiated, and we can just return
        // the original html String.
        if(buf == null)
        {
            escapedHtml = html;
        }
        else
        {
	        // add rest of unescaped portion
	        if (start < length) {
	            buf.append(htmlChars,start,length-start);
	        }
	        escapedHtml = buf.toString();
        }
	        
        return escapedHtml; 
    }

}
