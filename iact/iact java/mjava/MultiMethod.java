/*substr(beginindex,endindex)
include beginindex
exclude endindex
charAt(int index)
*/
class MultiMethod
{public static void main(String ar[])
{String x="iact education";
System.out.println(x.substring(2,6));
System.out.println(x.substring(2));
System.out.println(x.charAt(3));
String k="iact";
k.concat("education");
System.out.println(k);
String p="     education    ";

String n="iact";
System.out.println(n.concat(p.trim()));
System.out.println(p.trim().toUpperCase());
}}

