package __my__test;
import java.util.* ;

class Node implements Comparable
{
    public int i ;
    public int value ;
 
    public Node(int pos , int value)
    {
        this.i = i ;
        this.value =  value ;
    }
 
    public int compareTo(Object node)
    {
        Node n = (Node) node ;
        if(n.value == this.value)
        {
            return 0 ;
        }
        else
            return (n.value > this.value) ? 1 : 0 ;
    }
}
 
public class Test
{
    //二分查找
    public static int binarySearch(Node[] a , int x)
    {
        int low = 0 ;
        int high = a.length-1;
        int mid = (low+high)/2 ;
 
        while(low <= high)
        {
            if(x<a[mid].value)
            {
                high = mid-1 ;
                mid = (low+mid)/2 ;
            }
            else if(x>a[mid].value)
            {
                low = mid + 1 ;
                mid = (mid+high)/2 ;
            }
            else
            {
                return mid ;
            }
        }
        return -1 ;
    }
    //黄金分割点查找
 
    public static int goldSearch(Node[] a , int x)
    {
        int low = 0 ;
        int high = a.length-1;
        int mid = (low+high)/2 ;
 
        while(low <= high)
        {
            if(x<a[mid].value)
            {
                high = mid-1 ;
                mid= (int)(low+0.618*(high-low))/1 ;
            }
            else if(x>a[mid].value)
            {
                low = mid + 1 ;
                mid= (int) (low+0.618*(high-low))/1 ;
            }
            else
            {
                return mid ;
            }
        }
        return -1 ;
    }
 
    public static Node[] randomNodeArray(int num)
    {
        Node[] nodeA = new Node[num] ;
        Random random = new Random() ;
        for(int i=0 ; i<nodeA.length ; i++)
        {
            nodeA[i] = new Node(i ,random.nextInt()) ;
        }
 
        return nodeA ;
    }
 
    public static long time(int num , int times , int x , int type)
    {
         
        Node[] nodeA = randomNodeArray(num) ;
     
        Arrays.sort(nodeA) ;
 
        long begin = System.currentTimeMillis() ;
 
        for(int i = 0 ; i<times ; i++)
        {
            if(type == 1)
                binarySearch(nodeA , x) ;
            else
                goldSearch(nodeA , x) ;
        }
 
        long end   = System.currentTimeMillis() ;
 
        return end-begin ;
    }
 
    public static void main(String args[])
    {
        Random random = new Random() ;
        int num = 100000 ;
        int times = random.nextInt(10000000) ;
        int x = random.nextInt(1000) ;
        System.out.printf("二分法: 数组长度为%d, 数组循环次数为%d, 需查找的数字为%d\n" , num , times , x) ;
        long time = BinarySearch.time(num , times , x , 1) ;
        System.out.printf("所用时长为" + time + "\n") ;
 
        System.out.printf("黄金分割法: 数组长度为%d, 数组循环次数为%d, 需查找的数字为%d\n" , num , times , x) ;
        time = BinarySearch.time(num , times , x , 2) ;
        System.out.printf("所用时长为" + time) ;
    }
}