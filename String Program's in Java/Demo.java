
//Wihout using inbulit Function in jAva

/*
class Demo
{
  public static void main(String[] args)
  {
    String x = "ABC Tech";
    
    int i=0;
    
    int count=0;
    
    x = x.concat("\0");
    char y[] = x.toCharArray();

    while(y[i]!= '\0')
    {
      count++;
      i++;
    }
    System.out.printf("%d",count);
  }
}

*/



//with using inbulilt function

class Demo
{
   public static void main(String[] args) {
   
   String x = "ABC Tech";
   System.out.printf("%d",x.length()); 
  }
}