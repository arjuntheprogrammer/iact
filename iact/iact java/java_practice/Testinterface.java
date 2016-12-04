interface Callback{
void callback(int param);

}
class Client implements Callback{
public void callback(int p)
{

System.out.println("callback called with:" +p);
}


}
class Testinterface{

public static void main(String ar[])
{
Callback c=new Client();
c.callback(42);

}

}