import sun.plugin.javascript.navig.Array;

import java.util.Currency;

public class BinarySerch {

    public static void main(String argd[])
    {

        int Arry[] = new int[8];
        Arry[0]=3;
        Arry[1]=5;
        Arry[2]=2;
        Arry[3]=1;
        Arry[4]=4;
        Arry[5]=6;
        Arry[6]=2;
        Arry[7]=2;

        for(int i=0; i<Arry.length; i++)
        {
            System.out.println(Arry[i]);
        }

        int x ; //LastUnshortedIndex
        int y ; //CurrantIndex
        for(x = Arry.length-1; x>0; x--)
        {
            for (y=0; y<x; y++)
            {
                if(Arry[y]>Arry[x])
                {
                    int temp;
                    temp = Arry[y];
                    Arry[y]=Arry[x];
                    Arry[x]=temp;
                }
            }
        }
        System.out.println("=======================================================");
        for(int i=0; i<Arry.length; i++)
        {
            System.out.println(Arry[i]);
        }
        System.out.println("=======================================================");
        int stes=bserch(Arry,2);
        System.out.println("INDEX "+stes);

    }

    public static int bserch(int inArry[], int serchVal)
    {
        int StartIndex=0;
        int LastIndex=inArry.length+1;
        while (StartIndex<LastIndex)
        {
            int midIndex=(StartIndex+LastIndex)/2;
            if(inArry[midIndex]==serchVal)
            {
                return midIndex;
            }
            else if(inArry[midIndex]<serchVal)
            {
                StartIndex=midIndex+1;
            }
            else
            {
                LastIndex=midIndex-1;
            }
        }
        return -1;
    }
}
