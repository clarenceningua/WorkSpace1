
public class Exact
{
  public boolean isValidSeq(int arr[], int arr2[])
  {
    System.out.println("CHECT IF VALID SEQUENCE");
    int x = 0 , y = 0;

    while(x != arr.length && y != arr2.length)
    {
      if(arr[x] == arr2[y])
        y++;
      x++;
    }
    return y == arr2.length;
  }

  public int Sum(int arr[])
  {
    System.out.println();
    System.out.println("SUM THE DATA");
    int sum = 0;
    for (int i = 0 ; i < arr.length ; ++i)
    {
      sum += arr[i];
    }
    return sum;
  }

  public int getMax(int arr[])
  {
    System.out.println();
    System.out.println("GET THE MIN VAL");
    int max = arr[0];
    for (int i = 0; i < arr.length ; ++i )
    {
        if(arr[i] > max)
        max = arr[i];
    }
    return max;
  }

  public int getMin(int arr[])
  {
    System.out.println();
    System.out.println("GET THE MIN VAL");
    int min = arr[0];
    for (int i = 0; i < arr.length ; ++i )
    {
        if(arr[i] < min)
        min = arr[i];
    }
    return min;
  }

  public String getCenterLetter(String letter)
  {
    System.out.println();
    System.out.println("GET THE CENTER LETTER OF A WORD");
    String center = null;

    if((letter.length() % 2) == 0)
      return "No center";
    else
      return letter.charAt(letter.length() / 2)+"";


  }

  public void arrange(int arr[])
  {
    System.out.println();
    System.out.println("ARRANGE DATA ACCENDING");
    int temp = 0;
    for(int i = 0 ; i < arr.length ; i++)
    {
      for (int j = i+1 ; j < arr.length ; ++j)
      {
          if(arr[i] > arr[j])
          {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
      }
    }
    for (int i = 0 ; i < arr.length ; ++i)
    {
        System.out.println(arr[i]);
    }
  }

  public void BoxBox(int size)
  {
    System.out.println();
    System.out.println("BOX CREATED BY BOX");
    String arr[][] = new String[size][size];
    for (int i = 0; i < arr.length ; i++ )
    {
        for (int j = 0; j < arr.length ;  ++j)
        {
             arr[i][j] = "  ";

        }
    }
    for (int i = 0; i < arr.length ; i++ )
    {
        for (int j = 0; j < arr.length ; j++ )
        {
          if(i == 0 )
            arr[i][j] = "[]";
          else if( i == arr.length -1)
            arr[i][j] = "[]";
          else
            arr[i][0] = "[]";
            arr[i][arr.length -1] = "[]";
        }
    }

    for (int i = 0; i < arr.length ; ++i)
    {
        for (int j = 0 ; j < arr.length; j++ )
        {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }

  }

  public Exact()
  {
    int arr[] = {1,5,77,3,-91,7,8,4,1};
    int arrt[] = {5,7,3,1,4};
    System.out.println(isValidSeq(arr,arrt));
    System.out.println(Sum(arr));
    System.out.println(getMax(arr));
    System.out.println(getMin(arr));
    arrange(arr);
    System.out.println(getCenterLetter("mariane"));
    BoxBox(5);
  }

  public static void main(String[] args)
  {
    new Exact();
  }
}
