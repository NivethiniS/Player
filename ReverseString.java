class ReverseString
{
public static void main(String arg[])
{
String name="Nivethini";
Syatem.out.println("String name: "+name);
byte[] Strbyte=name.getBytes();
byte[] Reverse=new byte[Strbyte.length];
for(i=0; i<Strbyte.length i++)
{
Reverse[i]=Strbyte[Strbyte-i-1];
}
System.out.println("Reverse Oreder: "+Reverse);
}
}
