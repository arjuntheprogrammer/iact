import java.io.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Enumeration;


public class TrimFilter implements Filter
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
Enumeration enum1=req.getParameterNames();
while(enum1.hasMoreElements())
{
String parameterName=(String) enum1.nextElement();
String parameterValue=req.getParameter(parameterName);
req.setAttribute(parameterName,parameterValue.trim());

//req.setAttribute(parameterName,parameterValue.toUpperCase());
}
chain.doFilter(req,res);
}
public void init(FilterConfig filterConfig)throws ServletException
{
System.out.println("Filter initialized");
this.filterConfig=filterConfig;
}}






