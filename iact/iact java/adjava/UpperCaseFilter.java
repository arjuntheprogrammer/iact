//Filter Chain


import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Enumeration;


public class UpperCaseFilter implements Filter
{

private FilterConfig filterConfig=null;
public void destroy()
{
System.out.println("Filter Destroyed");
this.filterConfig=null;
}

public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws IOException,ServletException
{
System.out.println("Filter");
Enumeration enum1=req.getAttributeNames();
while(enum1.hasMoreElements())
{
String attributeName=(String) enum1.nextElement();
String attributeValue=(String) req.getAttribute(attributeName);
req.setAttribute(attributeName,attributeValue.toUpperCase());

}
chain.doFilter(req,res);
}
public void init(FilterConfig filterConfig)throws ServletException
{
System.out.println("Filter initialized");
this.filterConfig=filterConfig;
}}






